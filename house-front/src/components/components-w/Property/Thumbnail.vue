<template>
  <div :class="rootClass">
    <div class="image">
      <span v-if="property.rentType === '出租'" class="type">出租</span>
      <span v-else class="type">出售</span>
      <a href="javascript:;" @click="getDetails"><img :src="pictureUrl" alt=""></a>
    </div>
    <div class="content">
      <h5 class="title"><a href="javascript:;" @click="getDetails">{{ property.title }}</a></h5>
      <span class="location"><img :src="`${publicPath}assets/images/icons/marker.png`" alt="">{{ property.address }}</span>
      <span class="price">${{ property.price }} <span v-show="property.rentType === '出租'">Month</span></span>
    </div>
  </div>
</template>

<script>
  export default {
    name: "HousePropertyThumbnail",
    data: () => ({
      publicPath: process.env.BASE_URL
    }),
    props: {
      rootClass: {
        type: String,
        default: 'sidebar-property'
      },
      property: {
        type: Object,
        default: () => {
          return {
            id: 1,
            rentType: '出租',
            title: '江南宅院',
            pictureUrl: 'assets/images/property/sidebar-property-1.jpg',
            address: '锦江区东大街下东大街568号',
            price: 550
          }
        }
      }
    },
    computed: {
      pictureUrl: function() {
        if (!this.property.pictureUrl){
          return '';
        }else {
          if(this.property.pictureUrl.indexOf('http') != -1){
            return this.property.pictureUrl;
          }else {
            return `${this.publicPath}${this.property.pictureUrl}`;
          }
        }
      }
    },
    methods: {
      getDetails() {
        this.$emit('getDetails', this.property.id);
      }
    }
  }
</script>

<style scoped>

</style>