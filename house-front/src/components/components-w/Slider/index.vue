<template>
  <swiper class="swiper" :options="swiperOption">
    <swiper-slide v-for="(item, i) in items" :key="i">
      <slot name="item" :item="item"></slot>
    </swiper-slide>
    <div v-show="showDot" class="swiper-pagination" slot="pagination"></div>
    <template v-if="showArrow">
      <div class="swiper-button-prev" slot="button-prev"></div>
      <div class="swiper-button-next" slot="button-next"></div>
    </template>
  </swiper>
</template>

<script>
  import { Swiper, SwiperSlide } from 'vue-awesome-swiper'
  import 'swiper/css/swiper.css'
  export default {
    name: "index",
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
            nextEl: '.swiper-button-next',
            prevEl: '.swiper-button-prev'
          }
        }
      }
    },
    created() {
      this.swiperOption.slidesPerView = this.num;
      if (!this.showArrow){
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
  .swiper-slide {
      display: flex;
      justify-content: center;
      align-items: center;
      text-align: center;
      /*font-weight: bold;*/
      /*font-size: 50px;*/
      /*background-color: #fff;*/
  }
</style>