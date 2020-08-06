<template>
    <div :class="rootClass">
        <div class="container">

            <!--Section Title start-->
            <div class="row">
                <div class="col-md-12 mb-60 mb-xs-30">
                    <div class="section-title center">
                        <h1>{{title}}</h1>
                    </div>
                </div>
            </div>
            <!--Section Title end-->

            <div class="row">

                <!--Property Slider start-->
                <div :class="itemRootClass">

                    <!--Property start-->
                    <swiper class="swiper" :options="swiperOption">
                        <swiper-slide v-for="itemData in list" :key="itemData.id">
                            <slot name="item" :itemData="itemData"></slot>

                        </swiper-slide>
                        <div v-show="showPageDot" class="swiper-pagination" slot="pagination"></div>
                        <button class="slick-next slick-arrow" slot="button-next" style="margin-right: 25px">
                            <i class="fa fa-angle-right"></i>
                        </button>
                        <button class="slick-prev slick-arrow" slot="button-prev" style="margin-left: 25px">
                            <i class="fa fa-angle-left"></i>
                        </button>
<!--                        <div class="swiper-button-prev" slot="button-prev"></div>-->
<!--                        <div class="swiper-button-next" slot="button-next"></div>-->
                    </swiper>

                </div>
                <!--Property Slider end-->

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
                        slidesPerView: 3,
                        // 每个模块之间的间隔
                        spaceBetween: 30,
                        // 是否循环显示
                        loop: true,
                        // 是否有底部，可以点
                        pagination: {
                            el: '.swiper-pagination',
                            clickable: true
                        },
                        // 左右按钮样式
                        navigation: {
                            nextEl: '.slick-next',
                            prevEl: '.slick-prev'
                        }
                    }
                }
            },
            props:{
                rootClass:{
                  type:String,
                },
                itemRootClass:{
                  type:String
                },
                title:{
                    type:String,
                    require: true
                },
                list: {
                    type: Array,
                    require: true
                },
                num:{
                    type:Number
                },
                showPageDot:{
                    type:Boolean,
                    default:false
                }
            },
            methods:{
                setSlidesPerView(){
                    if(this.num){
                       this. swiperOption.slidesPerView = this.num
                    }
                }
            },
            created(){
                this.setSlidesPerView()
                console.log(this.swiperOption)
            }
            
    
        }
    </script>

    <style>
        .swiper {
            height: 100%;
            width: 100%;
        }
        .swiper-slide {
            /*height: 500px !important;*/
            display: flex;
            justify-content: center;
            align-items: center;
            text-align: center;
            font-weight: bold;
            background-color: white;
        }

    </style>
<style>
    .swiper-pagination-bullet {
        width: 12px !important;
        height: 12px !important;
        background-color: #d8d8d8 !important;
        opacity: 1;
    }

    .swiper-pagination-bullet-active {
        background-color: #004395 !important;
    }
</style>