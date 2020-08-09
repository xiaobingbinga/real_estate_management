<template>
    <div class="sidebar-property">
        <div class="image">
            <span class="type" v-if="houseInfo.rentType === 1">出租</span>
            <span class="type" v-if="houseInfo.rentType === 2">出售</span>
            <a href="single-properties.html"><img :src="`${publicPath}${houseInfo.sidebarPictureUrl}`" alt=""></a>
        </div>
        <div class="content">
            <h5 class="title"><a href="single-properties.html">{{houseInfo.title}}</a></h5>
            <span class="location"><img :src="`${publicPath}assets/images/icons/marker.png`" alt="">{{houseInfo.address}}</span>
            <span class="price">
                ￥{{houseInfo.price}}
                <span v-if="houseInfo.rentType === 1">{{leaseType[houseInfo.leaseType]}}</span>
            </span>
        </div>
    </div>
</template>

<script>
    export default {
        props:{
            houseInfo:{
                type:Object,
                default(){
                    return {
                        id:1,
                        sidebarPictureUrl: 'assets/images/property/sidebar-property-1.jpg',
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
        },
        data:()=>({
            leaseType:['','天','周','月','季','年'],
            publicPath:process.env.BASE_URL
        })
    }
</script>

<style scoped>

</style>