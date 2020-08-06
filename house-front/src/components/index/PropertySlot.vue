<template>
    <div class="property-slider-2">

        <swiper class="swiper" :options="swiperOption">
            <swiper-slide v-for="itemData in list" :key="itemData.id">
                <slot name="item" :itemData="itemData"></slot>

            </swiper-slide>

            <button class="slick-prev slick-arrow" slot="button-next" style="display: block;">
                <i class="fa fa-angle-left"></i>
            </button>

            <button class="slick-next slick-arrow" slot="button-prev" style="display: block;">
                <i class="fa fa-angle-right"></i>
            </button>

            <!--                        <div class="swiper-button-prev" slot="button-prev"></div>-->
            <!--                        <div class="swiper-button-next" slot="button-next"></div>-->
        </swiper>
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
                    slidesPerView: 1,
                    // 每个模块之间的间隔
                    spaceBetween: 0,
                    // 是否循环显示
                    loop: true,
                    // 左右按钮样式
                    navigation: {
                        nextEl: '.slick-next',
                        prevEl: '.slick-prev'
                    }
                }
            }
        },
        props:{
            list:{
              type: Array,
                require: true
        }
    }
    }
</script>

<style scoped>

</style>