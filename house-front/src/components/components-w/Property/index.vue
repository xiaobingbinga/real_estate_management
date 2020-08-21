<template>
  <div :class="propertyClass">
    <div :class="propertyInnerClass">
      <div class="image">
        <span v-if="property.hot" class="label">热门</span>
<!--        <span v-else-if="property.news" class="label">新增</span>-->
<!--        <span v-else-if="property.isAd" class="label">广告</span>-->
        <span v-else-if="property.special" class="label">特色</span>
        <span v-else class="label"></span>
        <a :href="propertyUrl" @click="propertyClick"><img :src="`${publicPath}${property.pictureUrl}`" alt=""></a>
        <ul class="property-feature">
          <li>
            <span class="area"><img :src="`${publicPath}assets/images/icons/area.png`" alt="">{{ property.square }} 平米</span>
          </li>
          <li>
            <span class="bed"><img :src="`${publicPath}assets/images/icons/bed.png`" alt="">{{ property.roomNumber }}</span>
          </li>
          <li>
            <span class="bath"><img :src="`${publicPath}assets/images/icons/bath.png`" alt="">{{ property.bathroomNumber }}</span>
          </li>
          <li>
            <span class="parking"><img :src="`${publicPath}assets/images/icons/parking.png`" alt="">{{ property.garageNumber }}</span>
          </li>
        </ul>
      </div>
      <div class="content">
        <div class="left">
          <h3 class="title"><a :href="propertyUrl" @click="propertyClick">{{ property.title }}</a></h3>
          <span class="location"><img :src="`${publicPath}assets/images/icons/marker.png`" alt="">{{ property.address }}</span>
        </div>
        <div class="right">
          <div class="type-wrap">
            <span class="price">￥{{ property.price }}<span v-if="property.typeName === '出租'" >月</span></span>
            <span class="type">{{ property.typeName }}</span>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "HouseProperty",
    data () {
      return {
        publicPath: process.env.BASE_URL
      }
    },
    props: {
      propertyClass: {
        type: String,
        default: "property-item col-lg col-md col-12 mb-40"
      },
      propertyInnerClass: {
        type: String,
        default: "property-inner"
      },
      property: {
        type: Object,
        default: () => {
          return {
            id: 1,
            isHot: false,
            isNew: false,
            isAd: false,
            isSpecial: false,
            pictureUrl: 'assets/images/property/property-1.jpg',
            square: 5,
            roomNumber: 6,
            bathroomNumber: 6,
            garageNumber: 6,
            title: '江南宅院',
            address: '锦江区东大街下东大街568号',
            price: '550',
            typeName: '出售'
          }
        }
      },
      propertyUrl: {
        type: String,
        default: 'javascript:;'
      }
    },
    methods: {
      propertyClick(){
        this.$emit('propertyClick');
      }
    }
  }
</script>

<style scoped>

</style>