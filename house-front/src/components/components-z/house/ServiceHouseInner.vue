<template>
    <div class="property-2">
        <div class="property-inner">
            <router-link :to="{path:'/house/single-properties-left-sidebar',query:{id:houseInfo.id}}"><img :src="houseInfo.pictureUrl" alt=""></router-link>
            <div class="content">
                <h4 class="title">
                    <router-link :to="{path:'/house/single-properties-left-sidebar',query:{id:houseInfo.id}}">{{houseInfo.title}}</router-link>
                </h4>
                <span class="location">{{houseInfo.address}}</span>
                <h4 class="type">
                    <span v-if="houseInfo.rentType === 1">出租</span>
                    <span v-if="houseInfo.rentType === 2">出售</span>
                    <span>￥{{houseInfo.price}} <span v-if="houseInfo.rentType === 1">{{leaseType[houseInfo.leaseType]}}</span></span></h4>
                <ul>
                    <li>6卧</li>
                    <li>4卫</li>
                    <li>3车位</li>
                </ul>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        data:()=>({
            leaseType:['','天','周','月','季','年']
        }),
        props:{
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
