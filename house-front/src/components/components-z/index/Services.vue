<template>
    <!--Services section start-->
    <div class="service-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-70 pb-lg-50 pb-md-40 pb-sm-30 pb-xs-20">
        <div class="container">

            <!--Section Title start-->
            <div class="row">
                <div class="col-md-12 mb-60 mb-xs-30">
                    <div class="section-title center">
                        <h1>我们的服务</h1>
                    </div>
                </div>
            </div>
            <!--Section Title end-->

            <div class="row row-30 align-items-center">
                <div class="col-lg-5 col-12 mb-30">
                    <div class="property-slider-2">
                        <swiper class="swiper" :options="swiperOption">
                            <swiper-slide v-for="serviceHouse in serviceHouseList" :key="serviceHouse.id">
                                <service-house-inner :house-info="serviceHouse"/>
                            </swiper-slide>
                            <button class="slick-prev slick-arrow" slot="button-prev">
                                <i class="fa fa-angle-left"></i>
                            </button>
                            <button class="slick-next slick-arrow" slot="button-next">
                                <i class="fa fa-angle-right"></i>
                            </button>
                        </swiper>
                    </div>
                </div>
                <div class="col-lg-7 col-12">
                    <div class="row row-20">

                        <!--Service start-->
                        <div class="col-md-6 col-12 mb-30">
                            <div class="service">
                                <div class="service-inner">
                                    <div class="head">
                                        <div class="icon"><img src="assets/images/service/service-1.png" alt=""></div>
                                        <h4>房产购买</h4>
                                    </div>
                                    <div class="content">
                                        <p>房产交易属于大宗资产交易，市场准入有风险呢，请买卖双方自律。</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--Service end-->

                        <!--Service start-->
                        <div class="col-md-6 col-12 mb-30">
                            <div class="service">
                                <div class="service-inner">
                                    <div class="head">
                                        <div class="icon"><img src="assets/images/service/service-2.png" alt=""></div>
                                        <h4>售卖房产</h4>
                                    </div>
                                    <div class="content">
                                        <p>房产交易属于大宗资产交易，市场准入有风险呢，请买卖双方自律。</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--Service end-->

                        <!--Service start-->
                        <div class="col-md-6 col-12 mb-30">
                            <div class="service">
                                <div class="service-inner">
                                    <div class="head">
                                        <div class="icon"><img src="assets/images/service/service-3.png" alt=""></div>
                                        <h4>房产租赁</h4>
                                    </div>
                                    <div class="content">
                                        <p>房产交易属于大宗资产交易，市场准入有风险呢，请买卖双方自律。</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--Service end-->

                        <!--Service start-->
                        <div class="col-md-6 col-12 mb-30">
                            <div class="service">
                                <div class="service-inner">
                                    <div class="head">
                                        <div class="icon"><img src="assets/images/service/service-4.png" alt=""></div>
                                        <h4>房产抵押</h4>
                                    </div>
                                    <div class="content">
                                        <p>房产交易属于大宗资产交易，市场准入有风险呢，请买卖双方自律。</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--Service end-->

                    </div>
                </div>
            </div>

        </div>
    </div>
    <!--Services section end-->
</template>

<script>
    import {Swiper,SwiperSlide} from 'vue-awesome-swiper'
    import 'swiper/css/swiper.css'
    import ServiceHouseInner from "@/components/components-z/house/ServiceHouseInner";
    export default {
        components: {ServiceHouseInner, Swiper,SwiperSlide},
        props:{
            serviceHouseList:{
                type:Array,
                default(){
                    return [
                        {
                            id:1,
                            pictureUrl:"assets/images/property/property-1.jpg",
                            square:550,
                            roomNumber:6,
                            bathroomNumber:4,
                            garageNumber:3,
                            title:'江南宅院',
                            address:'锦江区东大街下东大街568号',
                            rentType:1,
                            price:550,
                            leaseType:1,
                            isHot:1,
                            isSpecial:0
                        },
                        {
                            id:2,
                            pictureUrl:"assets/images/property/property-2.jpg",
                            square:550,
                            roomNumber:6,
                            bathroomNumber:4,
                            garageNumber:3,
                            title:'木马山别墅',
                            address:'城北大道450附22号',
                            rentType:1,
                            price:2550,
                            leaseType:1,
                            isHot:1,
                            isSpecial:0
                        },
                    ]
                }
            },
            swiperOption:{
                type:Object,
                default(){
                    return {
                        slidesPerView:1,
                        spaceBetween:0,
                        loop:true,
                        navigation:{
                            nextEl:'.slick-next',
                            prevEl:'.slick-prev'
                        }
                    }
                }
            }
        }
    }
</script>

<style scoped>

</style>