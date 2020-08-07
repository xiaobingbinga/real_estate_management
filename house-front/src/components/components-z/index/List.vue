<template>
    <div class="property-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-60 pb-lg-40 pb-md-30 pb-sm-20 pb-xs-10">
        <div class="container">
            <div class="row">
                <div class="col-md-12 mb-60 mb-xs-30">
                    <div class="section-title center">
                        <h1>{{title}}</h1>
                    </div>
                </div>
            </div>
            <div class="row">
                <div v-for="(item,idx) in list" :key="idx" class="property-item col-lg-4 col-md-6 col-12 mb-40">
                    <house-inner :houseInfo="item"/>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import HouseInner from "@/components/components-z/house/HouseInner.vue"

    export default {
        components: {HouseInner},
        props: {
            title: {
                type:String,
                default:'房产列表'
            },
            list:{
                type: Array,
                default: function(){
                    return [
                        {
                            id:1,
                            pictureUrl:"assets/images/property/property-1.jpg",
                            square:550,
                            roomNumber:6,
                            bathroomNumber:4,
                            garageNumber:3,
                            title:'江南宅院',
                            address:'锦江区东大街下东大街568号',
                            rentType:1,
                            price:550,
                            leaseType:1,
                            isHot:1,
                            isSpecial:0
                        },
                        {
                            id:2,
                            pictureUrl:"assets/images/property/property-2.jpg",
                            square:550,
                            roomNumber:6,
                            bathroomNumber:4,
                            garageNumber:3,
                            title:'木马山别墅',
                            address:'城北大道450附22号',
                            rentType:1,
                            price:2550,
                            leaseType:1,
                            isHot:1,
                            isSpecial:0
                        },
                        {
                            id:3,
                            pictureUrl:"assets/images/property/property-3.jpg",
                            square:550,
                            roomNumber:6,
                            bathroomNumber:4,
                            garageNumber:3,
                            title:'皇家一号公寓',
                            address:'锦江区福字街215号',
                            rentType:1,
                            price:550,
                            leaseType:1,
                            isHot:1,
                            isSpecial:0
                        }
                    ]
                }
            }
        },
        computed: {
            // ...mapGetters('properties', ['properties']),
        }
    }
</script>

<style scoped>

</style>