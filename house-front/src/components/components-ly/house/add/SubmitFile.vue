<template>
    <div class="row">
                    <div class="col-12 mb-30">
                        <label>上传房屋图片</label>
                        <vue-dropzone ref="dropzone" id="dropzone" class="dropzone" :options="dropzoneOptions"></vue-dropzone>
                    </div>

                    <div class="col-12 mb-30">
                        <label for="property_video">视频呈现链接</label>
                        <input type="text" id="property_video">
                    </div>

                    <div class="nav d-flex justify-content-end col-12 mb-30 pl-15 pr-15">
                        <a href="#" data-toggle="tab" class="btn" @click="uploadFile">下一页</a>
                    </div>
                </div>
</template>

<script>
    import vueDropzone from 'vue2-dropzone'
    import 'vue2-dropzone/dist/vue2Dropzone.min.css'
    export default {
        name: "SubmitFile",
        components:{
            vueDropzone
        },
        data:()=>{
            return{
                dropzoneOptions: {
                    //图片上传路径
                    url:"https://httpbin.org/post",
                    //禁止自动提交
                    autoProcessQueue: false,
                    //添加移除连接
                    addRemoveLinks: true,
                    //最大文件数量
                    maxFiles: 1,
                    dictDefaultMessage: "<i class='pe-7s-cloud-upload'></i>点击或拖拽上传文件"
                }
            }
        },
        methods:{
            uploadFile(){
                let files =this.$refs.dropzone.getQueuedFiles()
                console.log(files)
                this.axios.post("api/upload/image",files)
            }
        }
    }
</script>

<style scoped>

</style>