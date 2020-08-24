<template>
    <div>
        <house-page-banner title="Properties List Left Sidebar"/>

        <div class="property-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50">
            <div class="container">
                <div class="row">
                    <house-list rootClass="col-lg-8 col-12 order-1 order-lg-2 mb-sm-50 mb-xs-50"
                                itemRootClass="property-item list col-md-6 col-12 mb-40"
                                :pageInfo="pageInfo"
                                @changePage="changePage"/>
                    <house-sidebar rootClass="col-lg-4 col-12 order-2 order-lg-1 pr-30 pr-sm-15 pr-xs-15"
                                   @getCondition="searchProperties"/>
                </div>
            </div>
        </div>
    </div>
</template>

<script>

    import HousePageBanner from "@/components/components-z/house/PageBanner.vue"
    import HouseList from "@/components/components-z/house/HouseList.vue"
    import HouseSidebar from "@/components/components-z/house/Sidebar.vue"

    import {mapGetters} from 'vuex'

    export default {
        components:{
            HousePageBanner,
            HouseList,
            HouseSidebar
        },
        props:{
        },
        data:()=>({
            pageInfo:{},
            param:{}
        }),
        computed:{
            // ...mapGetters('houseList',['houseList'])
        },
        methods:{
            initPageInfo(){
                this.axios.get(process.env.VUE_APP_PROPERTIES + '/list',{
                    params:{
                        pageNum: this.pageInfo.pageNum,
                        pageSize: this.pageInfo.pageSize
                    }
                }).then(res => {
                    this.pageInfo = res.data.data
                })
            },
            searchProperties(param){
                this.param = param
                this.axios.post(process.env.VUE_APP_PROPERTIES + "/condition",param).then(res => {
                    console.log(res)
                    this.pageInfo = res.data.data
                })
            },
            changePage(pageNum){
                this.param.pageNum = pageNum
                this.axios.post(process.env.VUE_APP_PROPERTIES + "/condition",this.param).then(res => {
                    console.log(res)
                    this.pageInfo = res.data.data
                })
            }
        },
        created() {
            this.initPageInfo()
        }
    }
</script>

<style scoped>

</style>
