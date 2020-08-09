<template>
    <div>
        <house-page-banner title="Properties List Right Sidebar"/>

        <div class="property-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50">
            <div class="container">
                <div class="row">
                    <house-list rootClass="col-lg-8 col-12 order-1 mb-sm-50 mb-xs-50"
                                itemRootClass="property-item list col-md-6 col-12 mb-40"
                                :houseList="houseList"/>
                    <house-sidebar rootClass="col-lg-4 col-12 order-2 pl-30 pl-sm-15 pl-xs-15"/>
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
        computed:{
            ...mapGetters('houseList',['houseList'])
        }
    }
</script>

<style scoped>

</style>