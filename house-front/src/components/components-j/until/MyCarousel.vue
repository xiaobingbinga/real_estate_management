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
        <div class="property-carousel section">
          <!--Property start-->
          <div :class="itemRootClass">
            <swiper class="swiper" :options="swiperOption">
              <swiper-slide v-for="itemData in list" :key='itemData.id'>
                <slot name="item" :itemData="itemData"></slot>
              </swiper-slide>
              <div v-show="showPageDot"  class="swiper-pagination " slot="pagination"></div>
              <button class="slick-prev slick-arrow" style="margin-left: 10px" slot="button-prev">
                <i class="fa fa-angle-left"></i>
              </button>
              <button  class="slick-next slick-arrow" style="margin-right: 10px" slot="button-next">
                <i class="fa fa-angle-right"></i>
              </button>
            </swiper>
          </div>
        </div>
        <!--Property end-->
      </div>
      <!--Property Slider end-->
    </div>
  </div>
</template>
<script>

    import {Swiper, SwiperSlide} from 'vue-awesome-swiper'
    import 'swiper/css/swiper.css'

    export default {
        components: {Swiper, SwiperSlide},
        props: {
            title: {
                type: String,
                require: true
            },
            rootClass: String,
            itemRootClass: String,
            list: {
                type: Array,
                require: true
            },
            showPageDot: {
                type: Boolean,
                default: true
            },
            swiperOption: {
                type: Object,
                default() {
                    return {
                        slidesPerView: 3,
                        spaceBetween: 0,
                        loop:true,
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
        },
       
        
    }
</script>

<style scoped>
  .swiper {
    height: 100%;
    width: 100%;
  }
  .swiper-slide {
    height: 500px !important;
    display: flex;
    justify-content: center;
    align-items: center;
    /*text-align: center;*/
    /*font-weight: bold;*/
    /*font-size: 50px;*/
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