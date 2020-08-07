export default {
    namespaced:true,
    state:{
        serviceHouseList:[
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
            }
        ]
    },
    getters:{
        serviceHouseList: state => state.serviceHouseList
    },
    mutations:{},
    actions:{},
    modules:{}
}