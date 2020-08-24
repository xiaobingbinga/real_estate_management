<template>
  <!--:class="rootClass?'rootClass':''"-->
  <div :class="showClass? 'property-item  col-lg-4 col-md-6 col-12 mb-40':''">
    <div class="property-inner ">
      <div class="image ">
        <span class="label" v-if="info.hot === 1">热门</span>
        <span class="label" v-else-if="info.special === 1">特色</span>

        <router-link :to="{name:'PropertiesOne',params:{id:info.id}}">
          <img :src="`${info.pictureUrl}`" alt=""></router-link>
        <ul class="property-feature" style="margin-bottom: 0">
          <li>
            <span class="area"><img :src="`${publicPath}assets/images/icons/area.png`" alt="">{{info.square}} 平米</span>
          </li>
          <li>
            <span class="bed"><img :src="`${publicPath}assets/images/icons/bed.png`" alt="">{{info.roomNumber}}</span>
          </li>
          <li>
            <span class="bath"><img :src="`${publicPath}assets/images/icons/bath.png`" alt="">{{info.bathroomNumber}}</span>
          </li>
          <li>
            <span class="parking"><img :src="`${publicPath}assets/images/icons/parking.png`" alt="">{{info.garageNumber}}</span>
          </li>
        </ul>
      </div>
      <div class="content">
        <div class="left">
          <h3 class="title">
            <router-link :to="{name:'PropertiesOne',params:{id:info.id}}">
              {{info.title}}</router-link></h3>
          <span class="location"><img src="assets/images/icons/marker.png" alt="">{{info.address}}</span>
        </div>
        <div class="right">
          <div class="type-wrap">
            <span class="price">￥{{info.price}}
              <span v-if="info.timeType">{{info.timeType}}</span>
            </span>
            <span class="type" v-if="info.rentType === 1">出租</span>
            <span class="type" v-if="info.rentType === 2">出售</span>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
    export default {
        name: "EstateSketch",
        data() {
            return {
                leaseType: ["", "天", "周", "月", "季", "年"],
                publicPath: process.env.BASE_URL
            }
        },
        props: {
            info: {
                type: Object,
                default() {
                    return {
                        id:1,
                        pictureUrl: 'assets/images/property/property-1.jpg',
                        square: 550,
                        roomNumber: 6,
                        bathroomNumber: 4,
                        garageNumber: 3,
                        title: '江南宅院',
                        address: '锦江区东大街下东大街568号',
                        price: 550,
                        leaseType: 2,
                        rentType: 1,
                    }
                }
            },
            showClass: {
                type: Boolean,
                default: false
            }
        }
    }
</script>

<style scoped>

</style>