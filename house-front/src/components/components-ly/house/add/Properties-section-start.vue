<template>
    <!--Add Properties section start-->
    <div class="add-properties-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50">
        <div class="container">
            <div class="row">
                <div id="showHouse" class="add-property-wrap col">
                    <ul class="add-property-tab-list nav mb-50">
                        <li class="working"><a  @click="basicInfo"  data-toggle="tab">1. 基本信息</a></li>
                        <li><a  @click="galleryVideo"  data-toggle="tab">2. 图片 & 视频信息</a></li>
                        <li><a  @click="detailedInfo"  data-toggle="tab">3. 详细信息</a></li>
                    </ul>

                    <div class="add-property-form tab-content">
<!--                        基本信息-->
                        <div v-if="house1" class="tab-pane show active" id="basic_info">
                            <div class="tab-body">
                                <form action="#">
                                    <house-datails></house-datails>
                                </form>
                            </div>

                        </div>
<!--                            文件上传-->
                        <div v-if="house2" class="tab-pane show active"  id="gallery_video">
                            <div class="tab-body ">
                                <form action="#">
                                    <submit-file></submit-file>
                                </form>
                            </div>

                        </div>
<!--                                详细信息-->
                        <div v-if="house3" class="tab-pane show active" id="detailed_info">
                            <div class="tab-body">
                                <form action="#">
                                    <detailed-details></detailed-details>
                                </form>
                            </div>

                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>

</template>

<script>
    import houseDatails from '@/components/components-ly/house/add/house-datails'
    import submitFile from '@/components/components-ly/house/add/SubmitFile'
    import detailedDetails from '@/components/components-ly/house/add/detailed-details'
    export default {
        name: "Properties-section-start",
        components:{
            houseDatails,submitFile,detailedDetails
        },
        data:()=>{
            return{
            house1:true,
            house2:false,
            house3:false,
        }

        },
        methods:{
            basicInfo(){
                this.house1=true
                this.house2=false
                this.house3 = false
            },
            galleryVideo(){
                this.house1=false
                this.house2=true
                this.house3 = false
            },
            detailedInfo(){
                this.house1=false
                this.house2=false
                this.house3 = true
            }
        }
    }
</script>
<style scoped>

</style>