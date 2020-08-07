<template>
  <div class="hero-section section position-relative">
    
    <!--Hero Slider start-->
    <div class="hero-slider section">
      
      
      <swiper class="swiper" :options="swiperOption">
        <swiper-slide v-for="(item,index) in list" :key="index">
          <div class="hero-item" v-bind:style="{ 'background-image' : 'url( ' + item.pictureUrl + ')'} ">
            <div class="container">
              <div class="row">
                <div class="col-12">
                  <!--Hero Content start-->
                  <div class="hero-property-content text-center">
                    <h1 class="title"><a href="#">{{item.title}}</a></h1>
                    <span class="location"><img src="assets/images/icons/hero-marker.png"
                                                alt=""> {{item.address}}</span>
                    <div class="type-wrap">
                      <span v-if="item.rentType === 1" class="type">出租</span>
                      <span v-if="item.rentType === 2" class="type">出售</span>
                      <span class="price">${{item.price}} <span>{{lessType[item.leaseType]}}</span></span>
                    </div>
                    <ul class="property-feature">
                      <li>
                        <img src="assets/images/icons/hero-area.png" alt=""><span>{{item.square}} SqFt</span>
                      </li>
                      <li>
                        <img src="assets/images/icons/hero-bed.png" alt=""><span>{{item.roomNumber}} Bed</span>
                      </li>
                      <li>
                        <img src="assets/images/icons/hero-bath.png" alt=""><span>{{item.bathroomNumber}} Bath</span>
                      </li>
                      <li>
                        <img src="assets/images/icons/hero-parking.png" alt=""><span>{{item.garageNumber}} Garage</span>
                      </li>
                    </ul>
                  
                  
                  </div>
                  <!--Hero Content end-->
                
                </div>
              </div>
            </div>
          </div>
        </swiper-slide>
        <button class="slick-prev slick-arrow" style="margin-left: 10px" slot="button-prev">
          <i class="fa fa-angle-left"></i>
        </button>
        <button class="slick-next slick-arrow" style="margin-right: 10px" slot="button-next">
          <i class="fa fa-angle-right"></i>
        </button>
      </swiper>
    
    
    </div>
    <!--Hero Slider end-->
  
  </div>
</template>

<script>
    import {Swiper, SwiperSlide} from 'vue-awesome-swiper'
    import 'swiper/css/swiper.css'

    export default {
        name: "HeroCarousel",
        components: {Swiper, SwiperSlide},
        data() {
            return {
                swiperOption: {
                    slidesPerView: 1,
                    spaceBetween: 0,
                    loop:true,
                    pagination: {
                        el: '#agentPage',
                        clickable: true
                    },
                    navigation: {
                        nextEl: '.slick-next',
                        prevEl: '.slick-prev'
                    }
                },
                lessType: ["", "DAY", "WEEK", "MONTH", "QUARTER", "YEAR"]
            }
        },
        props: {
            list: {
                type: Array,
                default() {
                    return [{
                            id: 1,
                            pictureUrl: "assets/images/property/property-1.jpg",
                            square: 550,
                            roomNumber: 5,
                            bathroomNumber: 1,
                            garageNumber: 2,
                            title: "江南宅院",
                            address: "锦江区东大街下东大街568号",
                            rentType: 1,
                            price: 550,
                            leaseType:2,
                            isHot: 1,
                            isSpecial: 0
                        },
                        {
                            id: 2,
                            pictureUrl: "assets/images/property/property-1.jpg",
                            square: 550,
                            roomNumber: 5,
                            bathroomNumber: 1,
                            garageNumber: 2,
                            title: "江南宅院1",
                            address: "锦江区东大街下东大街568号",
                            rentType: 1,
                            price: 550,
                            leaseType: 3,
                            isHot: 1,
                            isSpecial: 0
                        }
                    ]


                }
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
    font-weight: bold;
    font-size: 50px;
    background-color: white;
  }
</style>