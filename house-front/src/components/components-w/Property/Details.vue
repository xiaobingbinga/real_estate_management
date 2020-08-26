<template>
  <div class="single-property col-12 mb-50">
    <div class="property-inner">
      <div class="head">
        <div class="left">
          <h1 class="title">{{ property.title }}</h1>
          <span class="location"><img :src="`${publicPath}assets/images/icons/marker.png`" alt="">{{ property.address }}</span>
        </div>
        <div class="right">
          <div class="type-wrap">
            <span class="price">￥{{ property.price }}<span v-show="property.rentType === '出租'">Month</span></span>
            <span class="type">出租</span>
          </div>
        </div>
      </div>

      <div class="image mb-30">
        <img :src="pictureUrl" alt="">
      </div>

      <div class="content">

        <h3>Description</h3>

        <p>{{ property.discription }}</p>
        <!--Condition 和 Amenities-->
        <div class="row mt-30 mb-30">

          <div class="col-md-5 col-12 mb-xs-30">
            <h3>Condition</h3>
            <ul class="feature-list">
              <li><div class="image"><img :src="`${publicPath}assets/images/icons/area.png`" alt=""></div>{{ property.square }} 平米</li>
              <li><div class="image"><img :src="`${publicPath}assets/images/icons/bed.png`" alt=""></div>卧室：{{ property.roomNumber }}</li>
              <li><div class="image"><img :src="`${publicPath}assets/images/icons/bath.png`" alt=""></div>浴室：{{ property.bathroomNumber }}</li>
              <li><div class="image"><img :src="`${publicPath}assets/images/icons/parking.png`" alt=""></div>车库：{{ property.garageNumber }}</li>
              <li><div class="image"><img :src="`${publicPath}assets/images/icons/kitchen.png`" alt=""></div>厨房：{{ property.kitchenNumber }}</li>
            </ul>
          </div>

          <div class="col-md-7 col-12">
            <h3>Amenities</h3>
            <ul class="amenities-list">
              <li v-show="property.realtyManagement">物管</li>
              <li v-show="property.electric">通电</li>
              <li v-show="property.naturalGas">天然气</li>
              <li v-show="property.water">通水</li>
              <li v-show="property.airConditioning">空调</li>
              <li v-show="property.furniture">家具</li>
              <li v-show="property.balcony">阳台</li>
              <li v-show="property.cableTV">有线电话</li>
              <li v-show="property.parking">车库</li>
              <li v-show="property.lift">电梯</li>
              <li v-show="property.pool">游泳池</li>
              <li v-show="property.dishwater">洗衣机</li>
              <li v-show="property.ferigerator">冰箱</li>
              <li v-show="property.kitchenUtensils">厨房用品</li>
            </ul>
          </div>

        </div>
        <!--Video 和 Location-->
        <div class="row">
          <div class="col-12 mb-30">
            <h3>Video</h3>
            <div class="embed-responsive embed-responsive-16by9">
              <iframe class="embed-responsive-item" :src="property.videoUrl"></iframe>
            </div>
          </div>
          <div class="col-12">
            <h3>Location</h3>
            <div class="embed-responsive embed-responsive-16by9">
              <div id="single-property-map" class="embed-responsive-item google-map">
                <template>
                  <baidu-map
                    class="bm-view"
                    :center="property.city"
                    :zoom="15">
                    <bm-scale anchor="BMAP_ANCHOR_TOP_RIGHT"></bm-scale>
                    <bm-navigation anchor="BMAP_ANCHOR_TOP_RIGHT"></bm-navigation>
                  </baidu-map>
                </template>
              </div>
              <!--<div id="single-property-map" class="embed-responsive-item google-map" data-lat="40.740178" data-Long="-74.190194"></div>-->
            </div>
          </div>
        </div>

      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "HousePropertyDetails",
    data () {
      return {
        publicPath: process.env.BASE_URL
      }
    },
    props: {
      rootClass: {
        type: String,
        default: 'single-property col-12 mb-50'
      },
      innerClass: {
        type: String,
        default: 'property-inner'
      },
      property: {
        type: Object,
        default: () => {
          return {
            id: 1,
            title: 'Friuli-Venezia Giulia',
            city: '成都',
            address: '锦江区东大街下东大街568号',
            rentType: '出租',
            price: '666',
            pictureUrl: 'assets/images/property/single-property-1.jpg',
            videoUrl: 'https://www.youtube.com/embed/8CbvItGX7Vk',
            discription: '房产交易平台ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et lore magna iqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut quipx ea codo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolo.',
            square: '550',
            roomNumber: '6',
            bathroomNumber: '6',
            garageNumber: '6',
            kitchenNumber: '6',
            isRealtyManagement: true,
            isElectric: true,
            isNaturalGas: true,
            isWater: true,
            isAirConditioning: true,
            isFurniture: true,
            isBalcony: true,
            isCableTV: true,
            isParking: true,
            isLift: true,
            isPool: true,
            isDishwater: true,
            isFerigerator: true,
            isKitchenUtensils: true
          }
        }
      }
    },
    computed: {
      pictureUrl: function() {
        if (!this.property.pictureUrl){
          return '';
        }else {
          if(this.property.pictureUrl.indexOf('http') !== -1){
            return this.property.pictureUrl;
          }else {
            return `${this.publicPath}${this.property.pictureUrl}`;
          }
        }
      }
    }
  }
</script>

<style scoped>
  .bm-view {
    width: 100%;
    height: calc(100vh - 90px);
  }
</style>