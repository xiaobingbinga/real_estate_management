<template>
    <div class="property-inner">
        <div class="image">
            <span class="label" v-if="houseInfo.isHot">热门</span>
            <span class="label" v-if="houseInfo.isSpecial">特色</span>
            <a href="single-properties.html"><img :src="houseInfo.pictureUrl" alt=""></a>
            <ul class="property-feature">
                <li>
                    <span class="area"><img src="assets/images/icons/area.png" alt="">{{houseInfo.square}} 平米</span>
                </li>
                <li>
                    <span class="bed"><img src="assets/images/icons/bed.png" alt="">{{houseInfo.roomNumber}}</span>
                </li>
                <li>
                    <span class="bath"><img src="assets/images/icons/bath.png" alt="">{{houseInfo.bathroomNumber}}</span>
                </li>
                <li>
                    <span class="parking"><img src="assets/images/icons/parking.png" alt="">{{houseInfo.garageNumber}}</span>
                </li>
            </ul>
        </div>
        <div class="content">
            <div class="left">
                <h3 class="title"><a href="single-properties.html">{{houseInfo.title}}</a></h3>
                <span class="location"><img src="assets/images/icons/marker.png" alt="">{{houseInfo.address}}</span>
            </div>
            <div class="right">
                <div class="type-wrap">
                    <span class="price">
                        ￥{{houseInfo.price}}
                        <span v-if="houseInfo.rentType === 1">{{lessType[houseInfo.lessType]}}</span>
                    </span>
                    <span class="type" v-if="houseInfo.rentType === 1">出租</span>
                    <span class="type" v-if="houseInfo.rentType === 2">出售</span>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        data:()=>({
            lessType:['','天','周','月','季','年']
        }),
        props:{
            msg:String,
            houseInfo:{
                type:Object,
                default(){
                    return {
                        id:1,
                        pictureUrl:'assets/images/property/property-1.jpg',
                        square:550,
                        roomNumber:5,
                        bathroomNumber:1,
                        garageNumber:2,
                        title:'江南宅院',
                        address:'锦江区东大街下东大街568号',
                        rentType:1,
                        price:550,
                        leaseType:1,
                        isHot:1,
                        isSpecial:0
                    }
                }
            }
        }
    }
</script>

<style scoped>

</style>