<template>
  <div class="property-inner">
    <a href="" class="image"><img :src="info.pictureUrl"
                                  alt=""></a>
    <div class="content" style="text-align: left">
      <h4 class="title"><a href="single-properties.html">{{info.title}}</a></h4>
      <span class="location">{{info.address}}</span>
      
      <h4 v-if="info.rentType === 1" class="type">出租
        <span>￥{{info.price}}
          <span>{{leaseType[info.leaseType]}}</span>
        </span>
      </h4>
      <h4 v-if="info.rentType === 2" class="type">出售
        <span>￥{{info.price}}</span>
      </h4>
      
      <ul>
        <li>{{info.roomNumber}}卧</li>
        <li>{{info.bathroomNumber}}卫</li>
        <li>{{info.garageNumber}}车位</li>
      </ul>
    </div>
  </div>
</template>

<script>
    export default {
        name: "ServiceInfo",
        data(){
          return {
              leaseType:['','日','月','季','年']
          }
        },
        props:{
            info:{
                type:Object,
                default(){
                    return {
                        pictureUrl:"assets/images/property/property-13.jpg",
                        title:"江南宅院",
                        address:"成都双流机场大道568",
                        price:"550",
                        roomNumber:6,
                        bathroomNumber:4,
                        garageNumber:3,
                        leaseType:2,
                        rentType:1,
                    }
                }
            }
        }
    }
</script>

<style scoped>

</style>