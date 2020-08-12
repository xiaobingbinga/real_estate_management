<template>

    <div :class="rootClass">
        <div class="row">
            <div :class="itemRootClass"
                 v-for="houseInfo in houseList"
                 :key="houseInfo.id">
                <house-inner :houseInfo="houseInfo">
                    <template #houseDescription="{description}">
                        <div class="desc">
                            <p>{{description}}</p>
                        </div>
                        <a href="single-properties.html" class="read-more">View Property</a>
                    </template>
                </house-inner>
            </div>

        </div>

        <div class="row mt-20">
            <div class="col">
                <b-pagination class="page-pagination"
                              v-model="currentPage"
                              :total-rows="rows"
                              :per-page="perPage"
                              align="center"
                              size="lg"
                              aria-control s="my-table"
                              pills
                              :hide-goto-end-buttons="true"
                              :hide-goto-start-buttons="true"
                              prev-text='< Prev'
                              next-text='Next >'>
                </b-pagination>
            </div>
        </div>
    </div>
</template>

<script>
    import HouseInner from "@/components/components-z/house/HouseInner";

    export default {
        components:{HouseInner},
        props:{
            rootClass:String,
            itemRootClass:String,
            houseList:{
                type:Array,
                default(){
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
                            rentType:2,
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
                        },
                        {
                            id:4,
                            pictureUrl:"assets/images/property/property-4.jpg",
                            square:550,
                            roomNumber:6,
                            bathroomNumber:4,
                            garageNumber:3,
                            title:'龙城一号别墅',
                            address:'龙泉驿区南山大道333号附12号',
                            rentType:1,
                            price:550,
                            leaseType:1,
                            isHot:1,
                            isSpecial:0
                        },
                        {
                            id:5,
                            pictureUrl:"assets/images/property/property-5.jpg",
                            square:550,
                            roomNumber:6,
                            bathroomNumber:4,
                            garageNumber:3,
                            title:'春天花园别墅',
                            address:'金牛区琴台西路668号',
                            rentType:2,
                            price:2550,
                            leaseType:1,
                            isHot:1,
                            isSpecial:0
                        },
                        {
                            id:6,
                            pictureUrl:"assets/images/property/property-6.jpg",
                            square:550,
                            roomNumber:6,
                            bathroomNumber:4,
                            garageNumber:3,
                            title:'万科西山别墅',
                            address:'高新区蜀都大道12号',
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
        computed:{
            rows(){
                return this.houseList.length
            }
        },
        data:()=>({
            currentPage:1,
            perPage:5
        })
    }
</script>

<style scoped>
    ::v-deep .b-pagination-pills .page-item .page-link {
        margin-left: 0;
    }
    ::v-deep .page-pagination li [role='menuitem'] {
        width: auto;
        padding: 10px 20px;
    }
    ::v-deep .page-item.active .page-link {
        background-color: #004395;
        border-color: #004395;
    }
    ::v-deep .page-link:not([aria-checked='true']){
        color: #000000;
        background-color: #f8f8f8;
        border-color: #f8f8f8;
    }
    ::v-deep button.page-link[role='menuitem']:hover,
    ::v-deep button.page-link[aria-checked='false']:hover {
        background-color: #ffc107;
        border-color: #ffc107;
    }

    ::v-deep .page-pagination li span,
    ::v-deep .page-pagination li button {
        padding: 10px;
        width: 44px;
        height: 44px;
    }
</style>