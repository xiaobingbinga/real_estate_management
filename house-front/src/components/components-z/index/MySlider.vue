<template>
    <div :class="rootClass">
        <div class="container">
            <div class="row">
                <div class="col-md-12 mb-60 mb-xs-30">
                    <div class="section-title center">
                        <h1>{{title}}</h1>
                    </div>
                </div>
            </div>
            <div class="row">
                <div :class="itemRootClass">
                    <swiper class="swiper" :options="swiperOption">
                        <swiper-slide v-for="itemData in list" :key="itemData.id">
                            <slot name="item" :itemData="itemData"></slot>
                        </swiper-slide>
                        <div v-show="showPageDot" class="swiper-pagination" slot="pagination"></div>
                        <template v-if="showArrowButton">
                            <button class="slick-prev slick-arrow" style="margin-left: 25px" slot="button-prev">
                                <i class="fa fa-angle-left"></i>
                            </button>
                            <button class="slick-next slick-arrow" style="margin-right: 25px" slot="button-next">
                                <i class="fa fa-angle-right"></i>
                            </button>
                        </template>
                    </swiper>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import {Swiper,SwiperSlide} from 'vue-awesome-swiper'
    import 'swiper/css/swiper.css'
    export default {
        components:{
            Swiper,
            SwiperSlide
        },
        props:{
            showArrowButton:{
                type:Boolean,
                default: true
            },
            rootClass:String,
            itemRootClass:String,
            title:{
                type:String,
                require:true
            },
            list:{
                type: Array,
                require:true
            },
            showPageDot:{
                type:Boolean,
                default:false
            },
            swiperOption:{
                type:Object,
                default(){
                    return {
                        slidesPerView:3,
                        spaceBetween:0,
                        pagination: {
                            el: '.swiper-pagination',
                            clickable: true,
                        },
                        navigation:{
                            nextEl:'.slick-next',
                            prevEl:'.slick-prev'
                        }
                    }
                }
            }
        },
        data:()=>({
        })
    }
</script>

<style scoped>
    .swiper {
        height: 100%;
        width: 100%;
    }

    .swiper-slide {
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