<template>
  <div>
    <agency-title title="代理商详情" breadcrumb-title="代理商名称"></agency-title>
    
    <!--代理商详情 start-->
    <div class="agency-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50">
      <div class="container">
        <div class="row row-25">
          <!--Agency Image-->
          <div class="col-lg-5 col-12 mb-sm-30 mb-xs-30">
            <div class="agency-image">
              <img :src="`${publicPath}${agencyInfo.icon}`" alt="">
            </div>
          </div>
          <!--Agency Content-->
          <div class="col-lg-7 col-12">
            <div class="agency-content">
              <h3 class="title">Royao Estates</h3>
              <p>{{agencyInfo.brief}}</p>
              <ul>
                <li><i class="pe-7s-map"></i>{{agencyInfo.address}}</li>
                <li><i class="pe-7s-phone"></i><a href="#">{{agencyInfo.phone}}</a></li>
                <li><i class="pe-7s-mail-open"></i><a href="#">{{agencyInfo.email}}</a></li>
                <!--公司网站-->
                <!--<li><i class="pe-7s-global"></i><a href="#">{{agencyInfo.license}}</a></li>-->
                <li><i class="pe-7s-credit"></i>{{agencyInfo.license}}</li>
                <li><i class="pe-7s-users"></i>{{agencyInfo.agentCount}} Agents</li>
                <li><i class="pe-7s-photo"></i>{{agencyInfo.propertiesCount}} Properties</li>
              </ul>
              <div class="social">
                <a href="#" class="facebook"><i class="fa fa-facebook"></i></a>
                <a href="#" class="twitter"><i class="fa fa-twitter"></i></a>
                <a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a>
                <a href="#" class="google"><i class="fa fa-google-plus"></i></a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!--代理商详情 end-->
  
    <!--代理人 start-->
    <my-carousel rootClass="agent-section section pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
                  itemRootClass="agent-carousel section"
                  title="Royao Estates Agents"
                  :showPageDot="false"
                  :list="agentList"
                  :swiperOption="swiperOption">
      <template #item="{itemData}">
        <div class="property-item col">
          <my-agent :col="true" :agent="itemData"></my-agent>
        </div>
      </template>
    </my-carousel>
    <!--代理人 end-->
    
  <!-- 代理房产 start -->
  <!--  <my-carousel rootClass="property-section section pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"-->
  <!--               itemRootClass="agent-carousel section"-->
  <!--               title="Royao Estates Properties"-->
  <!--               :showPageDot="true"-->
  <!--               :list="houseList">-->
  <!--    <template #item="{itemData}">-->
  <!--      <div class="property-item col">-->
  <!--        <estate-sketch :item="itemData"></estate-sketch>-->
  <!--      </div>-->
  <!--    </template>-->
  <!--  </my-carousel>-->
    <my-carousel
      rootClass="property-section section pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
      itemRootClass="property-carousel section"
      title="Royao Estates Properties"
      :showPageDot="true"
      :list="houseList">
      <template  #item="{itemData}">
        <div class="property-item col">
          <estate-sketch :info="itemData"></estate-sketch>
        </div>
      </template>
    </my-carousel>
    <!-- 代理房产 end -->
  </div>
</template>

<script>
    import AgencyTitle from "@/components/components-w/Title"
    import MyCarousel from "@/components/components-j/until/MyCarousel";
    import MyAgent from "@/components/components-j/agent/MyAgent";
    import EstateSketch from "@/components/components-j/estate/EstateSketch";
    export default {
        components:{
            AgencyTitle,
            MyCarousel,
            MyAgent,
            EstateSketch
        },
        data(){
            return {
                publicPath:process.env.BASE_URL,
                agencyInfo: {
                    id:1,
                    name:'Royao Estates',
                    icon:"assets/images/agencies/agency-1.jpg",
                    email:"info@example.com",
                    brief:"Lorem ipsum dolor sit amet, consectetur adipisicing elit. Magni, fugit. Quibusdam eveniet voluptate minima, est veritatis ea quod expedita facere harum tempore sapiente maxime recusandae quisquam cupiditate beatae nihil deserunt eum incidunt, porro rerum doloribus cum. Magnam quia voluptates quae?",
                    license:"AB7876A6",
                    phone:"(756) 447 5744",
                    address:"246, 2st AVE, Manchester 126 , Noth England",
                    agentCount:4,
                    propertiesCount:10
                },
                // 轮播配置
                swiperOption:{
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
                        id:1,
                        name:"唐纳德.菲尔",
                        mobile:'(756) 447 5779',
                        email:'info@example.com',
                        count:5,
                        photo:"assets/images/agent/agent-1.jpg"
                    },
                    {
                        id:2,
                        name:"朱.汉密尔顿",
                        mobile:'(756) 447 5779',
                        email:'info@example.com',
                        count:2,
                        photo:"assets/images/agent/agent-2.jpg"
                    },
                    {
                        id:3,
                        name:"克莉期丁.吉尔波特",
                        mobile:'(756) 447 5779',
                        email:'info@example.com',
                        count:4,
                        photo:"assets/images/agent/agent-3.jpg"
                    },
                    {
                        id:4,
                        name:"杰森.帕特",
                        mobile:'(756) 447 5779',
                        email:'info@example.com',
                        count:3,
                        photo:"assets/images/agent/agent-4.jpg"
                    },
                    {
                        id:5,
                        name:"德布拉.依尔斯",
                        mobile:'(756) 447 5779',
                        email:'info@example.com',
                        count:1,
                        photo:"assets/images/agent/agent-5.jpg"
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
            }
        }
    }
</script>

<style scoped>

</style>