export default {
    namespaced:true,
    state:{
        brandList:[
            {id:1,pictureUrl:'assets/images/brands/brand-1.png'},
            {id:2,pictureUrl:'assets/images/brands/brand-2.png'},
            {id:3,pictureUrl:'assets/images/brands/brand-3.png'},
            {id:4,pictureUrl:'assets/images/brands/brand-4.png'},
            {id:5,pictureUrl:'assets/images/brands/brand-5.png'},
            {id:6,pictureUrl:'assets/images/brands/brand-6.png'}
        ]
    },
    getters:{
        brandList: state => state.brandList
    },
    mutations:{},
    actions:{},
    modules:{}
}