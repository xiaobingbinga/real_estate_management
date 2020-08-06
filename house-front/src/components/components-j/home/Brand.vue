<template>
  <div class="brand-section section pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50">
    <div class="container">
      
      <div class="row">
        <div class="col-md-12 mb-60 mb-xs-30">
          <div class="section-title center">
            <h1>合作伙伴</h1>
          </div>
        </div>
      </div>
      <div class="row">
        <swiper class="swiper" :options="swiperOption">
          <swiper-slide v-for="(item,index) in  brands" :key="index">
            <div class="brand col"><img :src="item.imgUrl" alt=""></div>
          </swiper-slide>
        </swiper>
      </div>
    </div>
  </div>
</template>

<script>
    import {Swiper, SwiperSlide} from 'vue-awesome-swiper'
    import 'swiper/css/swiper.css'

    export default {
        components: {Swiper, SwiperSlide},
        name: "Brand",
        data() {
            return {
                swiperOption: {
                    slidesPerView: 5,
                    spaceBetween: 0,
                    loop: true,
                },
                brands:[
                    {imgUrl:'assets/images/brands/brand-2.png'},
                    {imgUrl:'assets/images/brands/brand-3.png'},
                    {imgUrl:'assets/images/brands/brand-4.png'},
                    {imgUrl:'assets/images/brands/brand-5.png'},
                    {imgUrl:'assets/images/brands/brand-6.png'},
                    
                ]
            }
        }
    }
</script>

<style scoped>

</style>