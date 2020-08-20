<template>
<!--  房产缩略展示列表-->
  <div class="property-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-60 pb-lg-40 pb-md-30 pb-sm-20 pb-xs-10">
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
          <estate-sketch :showClass="true"
                         v-for="(estateInfoOne,index) in estateInfo"
                         :key="index" :info="estateInfoOne" ></estate-sketch>
      </div>
    
    </div>
  </div>
</template>

<script>
  import EstateSketch from "./EstateSketch";
  
  // import { Swiper, SwiperSlide } from 'vue-awesome-swiper'
  // import 'swiper/css/swiper.css'

  export default {
        name: "EstateList",
        components:{
            EstateSketch
        },
        props:{
            title:{
                type:String,
                require:true
            },
            estateInfo:{
              type: Array,
              default(){
                return [
                  {
                    pictureUrl:'assets/images/property/property-1.jpg',
                    square:550,
                    roomNumber:6,
                    bathroomNumber:4,
                    garageNumber:3,
                    title:'江南宅院',
                    address:'锦江区东大街下东大街568号',
                    price:550,
                    timeType:'月',
                    rentType:1,
                  },
                  {
                    tag:"特色",
                    pictureUrl:'assets/images/property/property-2.jpg',
                    square:550,
                    roomNumber:6,
                    bathroomNumber:4,
                    garageNumber:3,
                    title:'木马山别墅',
                    address:'城北大道450附22号',
                    price:2550,
                    rentType:2,
                  },
                  {
                    tag:'出售',
                    pictureUrl:'assets/images/property/property-3.jpg',
                    square:550,
                    roomNumber:6,
                    bathroomNumber:4,
                    garageNumber:3,
                    title:'皇家一号公寓',
                    address:'锦江区福字街215号',
                    price:550,
                    timeType:'月',
                    rentType:1,
                  },
                  {
                    pictureUrl:'assets/images/property/property-4.jpg',
                    square:550,
                    roomNumber:6,
                    bathroomNumber:4,
                    garageNumber:3,
                    title:'龙城一号别墅',
                    address:'龙泉驿区南山大道333号附12号',
                    price:550,
                    timeType:'月',
                    rentType:1,
                  },
                  {
                    pictureUrl:'assets/images/property/property-5.jpg',
                    square:550,
                    roomNumber:6,
                    bathroomNumber:4,
                    garageNumber:3,
                    title:'春天花园别墅',
                    address:'金牛区琴台西路668号',
                    price:2550,
                    rentType:2,
                  },
                  {
                    pictureUrl:'assets/images/property/property-6.jpg',
                    square:550,
                    roomNumber:6,
                    bathroomNumber:4,
                    garageNumber:3,
                    title:'万科西山别墅',
                    address:'高新区蜀都大道12号',
                    price:550,
                    timeType:"月",
                    rentType:1,
                  }


                ]
              }
            }
        },
        data(){
            return {
            }
        }
    }
</script>

<style scoped>
</style>