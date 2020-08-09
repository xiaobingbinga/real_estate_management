<template>
  <swiper class="swiper" :options="swiperOption">
    <swiper-slide v-for="(item, i) in items" :key="i">
      <slot name="item" :item="item"></slot>
    </swiper-slide>
    <div v-show="showDot" class="swiper-pagination" slot="pagination"></div>
    <template v-if="showArrow">
      <div class="slick-prev" slot="button-prev">
        <button class="slick-prev slick-arrow" style="display: block;"><i class="fa fa-angle-left"></i></button>
      </div>
      <div class="slick-next" slot="button-next">
        <button class="slick-next slick-arrow" style="display: block;"><i class="fa fa-angle-right"></i></button>
      </div>
    </template>
    <template v-if="showArrowBottom">
      <button class="slick-prev slick-arrow-bottom" style="margin-left: 23px" slot="button-prev">
        <i class="fa fa-angle-left"></i>
      </button>
      <button  class="slick-next slick-arrow-bottom" style="margin-right: 367px" slot="button-next">
        <i class="fa fa-angle-right"></i>
      </button>
    </template>
  </swiper>
</template>

<script>
  import { Swiper, SwiperSlide } from 'vue-awesome-swiper'
  import 'swiper/css/swiper.css'
  export default {
    name: "HouseSlider",
    components: {
      Swiper,
      SwiperSlide
    },
    props: {
      items: {
        type: Array,
        require: true
      },
      num: {
        type: Number,
        require: true
      },
      showDot: {
        type: Boolean,
        default: true
      },
      showArrow: {
        type: Boolean,
        default: true
      },
      showArrowBottom: {
        type: Boolean,
        default: false
      }
    },
    data() {
      return {
        swiperOption: {
          slidesPerView: 3,
          spaceBetween: 0,
          loop: true,
          pagination: {
            el: '.swiper-pagination',
            clickable: true
          },
          navigation: {
            nextEl: '.slick-next',
            prevEl: '.slick-prev'
          }
        }
      }
    },
    created() {
      this.swiperOption.slidesPerView = this.num;
      if (!this.showArrow && !this.showArrowBottom){
        this.swiperOption.navigation.nextEl = '';
        this.swiperOption.navigation.prevEl = '';
      }
    }
  }
</script>

<style scoped>
  .swiper {
    height: 100%;
    width: 100%;
  }
  .swiper .slick-prev{
    left: 5px;
  }
  .swiper .slick-next{
    right: 5px;
  }
  .slick-arrow-bottom{
    width: 30px;
    height: 30px;
    border: none;
    position: absolute;
    margin-top: -60px;
    z-index: 9;
    background-color: #004395;
    color: #ffffff;
  }
  .swiper-slide {
    display: flex;
    justify-content: center;
    align-items: center;
    text-align: center;
  }
</style>