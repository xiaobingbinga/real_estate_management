<template>
  <div
    class="service-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-70 pb-lg-50 pb-md-40 pb-sm-30 pb-xs-20">
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
          <swiper class="swiper" :options="swiperOption">
            <swiper-slide v-for="(item,index) in estateInfos" :key="index">
              <div class="property-slider-2">
                <div class="property-2">
                  <service-info :info="item"></service-info>
                </div>
              </div>
            </swiper-slide>
          </swiper>
          <button class="slick-prev slick-arrow" style="margin-left: 10px" slot="button-prev">
            <i class="fa fa-angle-left"></i>
          </button>
          <button  class="slick-next slick-arrow" style="margin-right: 10px" slot="button-next">
            <i class="fa fa-angle-right"></i>
          </button>
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

</template>

<script>
    import {Swiper, SwiperSlide} from 'vue-awesome-swiper'
    import 'swiper/css/swiper.css'
    import ServiceInfo from "./ServiceInfo";

    export default {
        components: {Swiper, SwiperSlide,ServiceInfo},
        name: "Service",
        data() {
            return {
                swiperOption: {
                    slidesPerView: 1,
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
                },
                estateInfos: [
                    {
                        pictureUrl:"assets/images/property/property-13.jpg",
                        title:"江南宅院",
                        address:"成都双流机场大道568",
                        price:"550",
                        roomNumber:6,
                        bathroomNumber:4,
                        garageNumber:3,
                        leaseType:2,
                        rentType:1,
                    },
                    {
                        pictureUrl:"assets/images/property/property-14.jpg",
                        title:"江南宅院",
                        address:"成都双流机场大道568",
                        price:"550",
                        roomNumber:4,
                        bathroomNumber:4,
                        garageNumber:3,
                        leaseType:2,
                        rentType:1,
                    }
                ]
            }
        },
        
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
    font-size: 50px;
    background-color: white;
  }
  
  .slick-arrow{
    width: 30px;
    height: 30px;
    border: none;
    /*bottom: 30px;*/
    /*position: absolute;*/
    margin-left: 10px;
    margin-top: -20px;
    left: 30px;
    z-index: 9;
    background-color: #004395;
    color: #ffffff;
  }
  .slick-arrow:hover{
    background-color: rgb(249,195,34);
    color: rgb(241,169,104);
  }
  

 

</style>