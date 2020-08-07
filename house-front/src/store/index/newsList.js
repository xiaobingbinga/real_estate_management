export default {
    namespaced:true,
    state:{
        newsList:[
            {
                id:1,
                pictureUrl:'assets/images/news/news-1.jpg',
                author:'唐纳德',
                newsDate:'2018年12月30日',
                title:'豪华公寓楼',
                description:'房产交易平台 the best theme for  elit, sed do to eiumod tempor dolor sit amet.'
            },{
                id:2,
                pictureUrl:'assets/images/news/news-2.jpg',
                author:'唐纳德',
                newsDate:'2018年12月30日',
                title:'豪华公寓楼',
                description:'房产交易平台 the best theme for  elit, sed do to eiumod tempor dolor sit amet.'
            },{
                id:3,
                pictureUrl:'assets/images/news/news-3.jpg',
                author:'唐纳德',
                newsDate:'2018年12月30日',
                title:'豪华公寓楼',
                description:'房产交易平台 the best theme for  elit, sed do to eiumod tempor dolor sit amet.'
            },{
                id:4,
                pictureUrl:'assets/images/news/news-4.jpg',
                author:'唐纳德',
                newsDate:'2018年12月30日',
                title:'豪华公寓楼',
                description:'房产交易平台 the best theme for  elit, sed do to eiumod tempor dolor sit amet.'
            },{
                id:5,
                pictureUrl:'assets/images/news/news-5.jpg',
                author:'唐纳德',
                newsDate:'2018年12月30日',
                title:'豪华公寓楼',
                description:'房产交易平台 the best theme for  elit, sed do to eiumod tempor dolor sit amet.'
            }
        ]
    },
    getters:{
        newsList: state => state.newsList
    },
    mutations:{},
    actions:{},
    modules:{}
}