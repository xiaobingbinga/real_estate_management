export default {
    namespaced:true,
    state:{
        featureList: [
            {
                id: 1,
                pictureUrl: 'assets/images/property/property-1.jpg',
                square: 550,
                roomNumber: 5,
                bathroomNumber: 1,
                garageNumber: 2,
                title: '江南宅院',
                address: '锦江区东大街下东大街568号',
                rentType: 1,
                price: 550,
                leaseType: 1,
                isHot: 1,
                isSpecial: 0
            }, {
                id: 2,
                pictureUrl: 'assets/images/property/property-2.jpg',
                square: 550,
                roomNumber: 5,
                bathroomNumber: 1,
                garageNumber: 2,
                title: '木马山别墅',
                address: '城北大道450附22号',
                rentType: 2,
                price: 550,
                leaseType: 1,
                isHot: 1,
                isSpecial: 1
            }, {
                id: 3,
                pictureUrl: 'assets/images/property/property-3.jpg',
                square: 550,
                roomNumber: 5,
                bathroomNumber: 1,
                garageNumber: 2,
                title: '皇家一号公寓',
                address: '锦江区福字街215号',
                rentType: 1,
                price: 550,
                leaseType: 1,
                isHot: 1,
                isSpecial: 0
            }, {
                id: 4,
                pictureUrl: 'assets/images/property/property-4.jpg',
                square: 550,
                roomNumber: 5,
                bathroomNumber: 1,
                garageNumber: 2,
                title: '江南宅院',
                address: '锦江区东大街下东大街568号',
                rentType: 1,
                price: 550,
                leaseType: 1,
                isHot: 1,
                isSpecial: 0
            }, {
                id: 5,
                pictureUrl: 'assets/images/property/property-5.jpg',
                square: 550,
                roomNumber: 5,
                bathroomNumber: 1,
                garageNumber: 2,
                title: '江南宅院',
                address: '锦江区东大街下东大街568号',
                rentType: 1,
                price: 550,
                leaseType: 1,
                isHot: 1,
                isSpecial: 0
            }
        ],
        sidebarFeatureList: [
            {
                id: 1,
                sidebarPictureUrl: 'assets/images/property/sidebar-property-1.jpg',
                square: 550,
                roomNumber: 5,
                bathroomNumber: 1,
                garageNumber: 2,
                title: '江南宅院',
                address: '锦江区东大街下东大街568号',
                rentType: 1,
                price: 550,
                leaseType: 1,
                isHot: 1,
                isSpecial: 0
            }, {
                id: 2,
                sidebarPictureUrl: 'assets/images/property/sidebar-property-2.jpg',
                square: 550,
                roomNumber: 5,
                bathroomNumber: 1,
                garageNumber: 2,
                title: '木马山别墅',
                address: '城北大道450附22号',
                rentType: 2,
                price: 550,
                leaseType: 1,
                isHot: 1,
                isSpecial: 1
            }, {
                id: 3,
                sidebarPictureUrl: 'assets/images/property/sidebar-property-3.jpg',
                square: 550,
                roomNumber: 5,
                bathroomNumber: 1,
                garageNumber: 2,
                title: '皇家一号公寓',
                address: '锦江区福字街215号',
                rentType: 1,
                price: 550,
                leaseType: 1,
                isHot: 1,
                isSpecial: 0
            }
        ]
    },
    getters:{
        featureList: state => state.featureList,
        sidebarFeatureList: state => state.sidebarFeatureList
    },
    mutations:{},
    actions:{},
    modules:{}
}