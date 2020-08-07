<template>
  <div>
    <!--滑块组件-->
    <!--<slider title="蜗牛租房"></slider>-->
    <hero-carousel :list="houseList"></hero-carousel>
    <!--搜索条件-->
    <my-search/>
    <!--特色房产-->
    <my-carousel
      rootClass="property-section bg-gray section pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
      itemRootClass="property-carousel section"
      title="特色房产"
      :showPageDot="true"
      :list="houseList"
      :swiperOption="estateSwiperOption">
      <template  #item="{itemData}">
      <div class="property-item col">
        <estate-sketch :info="itemData"></estate-sketch>
      </div>
    </template>
    </my-carousel>
    <!--欢迎标语-->
    <div class="feature-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50">
      <div class="container">
      
        <div class="feature-wrap row row-25">
        
          <!--Feature start-->
          <div class="col-lg-4 col-sm-6 col-12 mb-50">
            <div class="feature">
              <div class="icon"><i class="pe-7s-piggy"></i></div>
              <div class="content">
                <h4>低价房</h4>
                <p>便宜无好货，好货不便宜。。。请消费者自律呢</p>
              </div>
            </div>
          </div>
          <!--Feature end-->
        
          <!--Feature start-->
          <div class="col-lg-4 col-sm-6 col-12 mb-50">
            <div class="feature">
              <div class="icon"><i class="pe-7s-science"></i></div>
              <div class="content">
                <h4>现代设计</h4>
                <p>便宜无好货，好货不便宜。。。请消费者自律呢</p>
              </div>
            </div>
          </div>
          <!--Feature end-->
        
          <!--Feature start-->
          <div class="col-lg-4 col-sm-6 col-12 mb-50">
            <div class="feature">
              <div class="icon"><i class="pe-7s-display1"></i></div>
              <div class="content">
                <h4>优质房源</h4>
                <p>便宜无好货，好货不便宜。。。请消费者自律呢</p>
              </div>
            </div>
          </div>
          <!--Feature end-->
        
          <!--Feature start-->
          <div class="col-lg-4 col-sm-6 col-12 mb-50">
            <div class="feature">
              <div class="icon"><i class="pe-7s-signal"></i></div>
              <div class="content">
                <h4>免费Wifi</h4>
                <p>便宜无好货，好货不便宜。。。请消费者自律呢</p>
              </div>
            </div>
          </div>
          <!--Feature end-->
        
          <!--Feature start-->
          <div class="col-lg-4 col-sm-6 col-12 mb-50">
            <div class="feature">
              <div class="icon"><i class="pe-7s-map"></i></div>
              <div class="content">
                <h4>最容易查找房源</h4>
                <p>便宜无好货，好货不便宜。。。请消费者自律呢</p>
              </div>
            </div>
          </div>
          <!--Feature end-->
        
          <!--Feature start-->
          <div class="col-lg-4 col-sm-6 col-12 mb-50">
            <div class="feature">
              <div class="icon"><i class="pe-7s-shield"></i></div>
              <div class="content">
                <h4>最可靠房源</h4>
                <p>便宜无好货，好货不便宜。。。请消费者自律呢</p>
              </div>
            </div>
          </div>
          <!--Feature end-->
      
        </div>
    
      </div>
    </div>
    <!--App下载-->
    <down title="蜗牛租房"/>
    <!--我们的服务-->
    <service/>
    <!--新增的房产信息-->
    <estate-list title="新增的房产" :downurl="downUrls"></estate-list>
    <!--统计-->
    <fun-fact/>
    <!--我的代理-->
    <my-carousel
      root-class="agent-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
      itemRootClass="property-carousel section"
      title="我的代理"
      :showPageDot="false"
      :list="agentList"
      :swiperOption="agentSwiperOption">
      <template  #item="{itemData}">
        <my-agent :agent="itemData"></my-agent>
      </template>
    </my-carousel>
    <!--最近新闻-->
    <my-carousel
      root-class="news-section section pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
      itemRootClass="property-carousel section"
      title="房产最近新闻"
      :showPageDot="false"
      :list="newsList"
      :swiperOption="estateSwiperOption">
      <template #item="{itemData}">
        <estate-news :news-info="itemData"></estate-news>
      </template>
    </my-carousel>
  
    <!--合作伙伴-->
    <brand/>
    
  </div>
</template>

<script>
  import HeroCarousel from "../../../components/components-j/until/HeroCarousel";
  import EstateList from "../../../components/components-j/estate/EstateList";
  import Down from "../../../components/components-j/home/Down";
  import Service from "../../../components/components-j/home/Service";
  import MyCarousel from "../../../components/components-j/until/MyCarousel";
  import EstateSketch from "../../../components/components-j/estate/EstateSketch";
  import FunFact from "../../../components/components-j/home/FunFact";
  import MyAgent from "../../../components/components-j/agent/MyAgent";
  import EstateNews from "../../../components/components-j/news/EstateNews";
  import Brand from "../../../components/components-j/home/Brand";
  import MySearch from "../../../components/components-j/home/MySearch";
    export default {
        name: "Home",
        components:{
            EstateList,
            Down,
            Service,
            MyCarousel,
            EstateSketch,
            HeroCarousel,
            FunFact,
            MyAgent,
            EstateNews,
            Brand,
            MySearch
        },
        data(){
            return{
                // 搜索条件
                conditions:[
                    {
                        title:"状态",
                        options:[
                            '租房','卖房'
                        ],
                        type:'select'
                    },
                    {
                        title:'类型',
                        options: [
                            "公寓","咖啡馆","住宅","餐馆","商店","别墅"
                        ],
                        type:'select'
                    },
                    {
                        title:'地理位置',
                        options: [
                            "成都","北京","上海","广州","深圳","重庆","武汉","沈阳","福州","厦门"
                            ,"银川","拉萨","绵阳","遂宁","攀枝花","简阳","德阳","金堂","泸州","内江"
                            ,"阆中"
                        ],
                    },
                    {
                        title:'房间数',
                        options: [
                            1,2,3,4,5,6
                        ],
                    },
                    {
                        title:'卫生间数量',
                        options: [
                            1,2,3,4,5,6
                        ],
                    },
                ],
                 // 下来连接
                downUrls:[
                    {
                        icon:"fa fa-apple",
                        title:"Apple store",
                        url:"#"
                    },
                    {
                        icon:"fa fa-android",
                        title:"Google play",
                        url:"#"
                    }
                ],
                // 房产列表
                houseList: [
                    {
                        id: 1,
                        pictureUrl: "assets/images/property/property-1.jpg",
                        square: 550,
                        roomNumber: 5,
                        bathroomNumber: 1,
                        garageNumber: 2,
                        title: "江南宅院",
                        address: "锦江区东大街下东大街568号",
                        rentType: 1,
                        price: 550,
                        leaseType: 1,
                        isHot: 1,
                        isSpecial: 0
                    },
                    {
                        id: 2,
                        pictureUrl: "assets/images/property/property-2.jpg",
                        square: 550,
                        roomNumber: 5,
                        bathroomNumber: 1,
                        garageNumber: 2,
                        title: "江南宅院",
                        address: "锦江区东大街下东大街568号",
                        rentType: 2,
                        price: 550,
                        leaseType: 1,
                        isHot: 1,
                        isSpecial: 1
                    },
                    {
                        id: 3,
                        pictureUrl: "assets/images/property/property-3.jpg",
                        square: 550,
                        roomNumber: 5,
                        bathroomNumber: 1,
                        garageNumber: 2,
                        title: "江南宅院",
                        address: "锦江区东大街下东大街568号",
                        rentType: 1,
                        price: 550,
                        leaseType: 1,
                        isHot: 1,
                        isSpecial: 0
                    },
                    {
                        id: 4,
                        pictureUrl: "assets/images/property/property-4.jpg",
                        square: 550,
                        roomNumber: 5,
                        bathroomNumber: 1,
                        garageNumber: 2,
                        title: "江南宅院",
                        address: "锦江区东大街下东大街568号",
                        rentType: 1,
                        price: 550,
                        leaseType: 1,
                        isHot: 1,
                        isSpecial: 0
                    },
                    {
                        id: 5,
                        pictureUrl: "assets/images/property/property-5.jpg",
                        square: 550,
                        roomNumber: 5,
                        bathroomNumber: 1,
                        garageNumber: 2,
                        title: "江南宅院",
                        address: "锦江区东大街下东大街568号",
                        rentType: 1,
                        price: 550,
                        leaseType: 1,
                        isHot: 1,
                        isSpecial: 0
                    }
                ],
                // 房产轮播配置
                estateSwiperOption: {
                    slidesPerView: 3,
                    spaceBetween: 0,
                    loop:true,
                    pagination: {
                        el: '.swiper-pagination',
                        clickable: true
                    },
                    navigation: {
                        nextEl: '.slick-next',
                        prevEl: '.slick-prev'
                    }
                },
                // 代理人轮播配置
                agentSwiperOption: {
                    slidesPerView: 4,
                    spaceBetween: 0,
                    loop:true,
                    pagination: {
                        el: '.swiper-pagination',
                        clickable: true
                    },
                    navigation: {
                        nextEl: '.slick-next',
                        prevEl: '.slick-prev'
                    }
                },
                // 代理人列表
                agentList:[
                    {
                        name:"唐纳德.菲尔",
                        mobile:'(756) 447 5779',
                        email:'info@example.com',
                        houseCount:5,
                        pictureUrl:"assets/images/agent/agent-1.jpg"
                    },
                    {
                        name:"朱.汉密尔顿",
                        mobile:'(756) 447 5779',
                        email:'info@example.com',
                        houseCount:2,
                        pictureUrl:"assets/images/agent/agent-2.jpg"
                    },
                    {
                        name:"克莉期丁.吉尔波特",
                        mobile:'(756) 447 5779',
                        email:'info@example.com',
                        houseCount:4,
                        pictureUrl:"assets/images/agent/agent-3.jpg"
                    },
                    {
                        name:"杰森.帕特",
                        mobile:'(756) 447 5779',
                        email:'info@example.com',
                        houseCount:3,
                        pictureUrl:"assets/images/agent/agent-4.jpg"
                    },
                    {
                        name:"德布拉.依尔斯",
                        mobile:'(756) 447 5779',
                        email:'info@example.com',
                        houseCount:1,
                        pictureUrl:"assets/images/agent/agent-5.jpg"
                    }
                ],
                //房产新闻列表
                newsList:[
                    {
                        id:1,
                        imageUrl:"assets/images/news/news-1.jpg",
                        name:"唐纳德",
                        issuingTime:"2018年12月30日",
                        title:"豪华公寓楼",
                        summary:"房产交易平台 the best theme for  elit, sed do to eiumod tempor dolor sit amet."
                    },
                    {
                        id:2,
                        imageUrl:"assets/images/news/news-2.jpg",
                        name:"唐纳德",
                        issuingTime:"2018年12月30日",
                        title:"豪华公寓楼",
                        summary:"房产交易平台 the best theme for  elit, sed do to eiumod tempor dolor sit amet."
                    },
                    {
                        id:3,
                        imageUrl:"assets/images/news/news-3.jpg",
                        name:"唐纳德",
                        issuingTime:"2018年12月30日",
                        title:"豪华公寓楼",
                        summary:"房产交易平台 the best theme for  elit, sed do to eiumod tempor dolor sit amet."
                    },
                    {
                        id:4,
                        imageUrl:"assets/images/news/news-4.jpg",
                        name:"唐纳德",
                        issuingTime:"2018年12月30日",
                        title:"豪华公寓楼",
                        summary:"房产交易平台 the best theme for  elit, sed do to eiumod tempor dolor sit amet."
                    },
                ]
            }
        }
    }
    
    


</script>

<style scoped>

</style>