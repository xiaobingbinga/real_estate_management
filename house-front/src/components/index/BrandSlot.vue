<template>
    <div class="brand-section section pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50">
        <div class="container">

            <!--Section Title start-->
            <div class="row">
                <div class="col-md-12 mb-60 mb-xs-30">
                    <div class="section-title center">
                        <h1>合作伙伴</h1>
                    </div>
                </div>
            </div>
            <!--Section Title end-->

            <div class="row">

                <!--Brand Slider start-->
                <div class="brand-carousel section">
                    <swiper class="swiper" :options="swiperOption">
                        <swiper-slide v-for="itemData in list" :key="itemData.id">
                            <slot name="item" :itemData="itemData"></slot>

                        </swiper-slide>
<!--                        <div v-show="showPageDot" class="swiper-pagination" slot="pagination"></div>-->
<!--                        <button class="slick-next slick-arrow" slot="button-next" style="margin-right: 25px">-->
<!--                            <i class="fa fa-angle-right"></i>-->
<!--                        </button>-->
<!--                        <button class="slick-prev slick-arrow" slot="button-prev" style="margin-left: 25px">-->
<!--                            <i class="fa fa-angle-left"></i>-->
<!--                        </button>-->
                        <!--                        <div class="swiper-button-prev" slot="button-prev"></div>-->
                        <!--                        <div class="swiper-button-next" slot="button-next"></div>-->
                    </swiper>
                </div>
                <!--Brand Slider end-->

            </div>

        </div>
    </div>
</template>

<script>
    import {Swiper, SwiperSlide} from 'vue-awesome-swiper'
    import 'swiper/css/swiper.css'
    export default {
        components:{Swiper,SwiperSlide},
        data(){
            return{
                swiperOption: {
                    // 预览模块个数
                    slidesPerView: 5,
                    // 每个模块之间的间隔
                    spaceBetween: 30,
                    // 是否循环显示
                    loop: true
                }
            }
        },
        props:{
            list:{
                type:Array,
                require: true
            }
        }
    }
</script>

<style scoped>

</style>