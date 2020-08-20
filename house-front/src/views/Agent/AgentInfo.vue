<template>
  <div>
    <agent-title title="代理人详情" :breadcrumb-title="agentInfo.userName"></agent-title>
    
    <!--Agent Section start-->
    <div class="agent-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-70 pb-lg-50 pb-md-40 pb-sm-30 pb-xs-20">
      <div class="container">
        <div class="row row-25">
          <!--Agent Image-->
          <div class="col-lg-5 col-12 mb-30">
            <div class="agent-image">
              <img :src="`${publicPath}${agentInfo.photo}`" alt="">
            </div>
          </div>
          <!--Agent Content-->
          <div class="col-lg-7 col-12">
            <div class="agent-content">
              <h3 class="title">{{agentInfo.userName}}</h3>
              <p>{{agentInfo.brief}}</p>
              <div class="row">
                <div class="col-md-6 col-12 mb-30">
                  <h4>代理人信息</h4>
                  <ul>
                    <li><i class="pe-7s-map"></i>{{agentInfo.userAddress}}</li>
                    <li><i class="pe-7s-phone"></i><a href="#">{{agentInfo.mobile}}</a></li>
                    <li><i class="pe-7s-mail-open"></i><a href="#">{{agentInfo.email}}</a></li>
                    <li><i class="pe-7s-global"></i><a href="#">{{agentInfo.webSite}}</a></li>
                    <li><i class="pe-7s-photo"></i>{{agentInfo.propertiesCount}} Properties</li>
                  </ul>
                  <div class="social">
                    <a href="#" class="facebook"><i class="fa fa-facebook"></i></a>
                    <a href="#" class="twitter"><i class="fa fa-twitter"></i></a>
                    <a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a>
                    <a href="#" class="google"><i class="fa fa-google-plus"></i></a>
                  </div>
                </div>
                <div class="col-md-6 col-12 mb-30">
                  <h4>代理商信息</h4>
                  <ul>
                    <li><span>Agency:</span> <span><a href="#">{{agentInfo.agencyName}}</a> </span></li>
                    <li><span>Licenses:</span> <span>{{agentInfo.license}}</span></li>
                    <li><span>Number:</span> <span><a href="#">{{agentInfo.agencyPhone}}</a></span></li>
                    <li><span>Address:</span> <span>{{agentInfo.agencyAddress}}</span></li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
    
      </div>
    </div>
    <!--Agent Section end-->
    
    <!--代理房产列表-->
    <my-carousel rootClass="property-section section pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
                 itemRootClass="property-carousel section"
                  title="Donald Palmer Properties"
                 :showPageDot="true"
                 :list="agentHouseList"
              >
      <template #item="{itemData}">
        <div class="property-item col">
          <estate-sketch :info="itemData"></estate-sketch>
        </div>
      </template>
      <div></div>
    </my-carousel>
    
  </div>

</template>

<script>
    import AgentTitle from "@/components/components-w/Title"
    import MyCarousel from "@/components/components-j/until/MyCarousel";
    import EstateSketch from "@/components/components-j/estate/EstateSketch";


    export default {
        components:{
            AgentTitle,
            MyCarousel,
            EstateSketch
        },
        data(){
            return {
                // 公共路径
                publicPath:process.env.BASE_URL,
                // 代理人详细信息
                agentInfo:{
                    id:1,
                    photo:"assets/images/agent/agent-1.jpg",
                    userName:"Donald Palmer",
                    brief:"Donald Palmer is a Specialist Real Estate Agent with 8 years of   Experience in Real Estate field. He achive success with his honesty,determination, hardwork and commetment. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Et, totam?",
                    userAddress:"256, 1st AVE, Manchester 125 , Noth England",
                    mobile:"(756) 447 5779",
                    email:"info@example.com",
                    webSite:"www.example.com",
                    propertiesCount:5,
                    agencyId:"1",
                    agencyName:"Royao Estates",
                    license:"AB7876A6",
                    agencyPhone:"(756) 447 5779",
                    agencyAddress:"246, 2st AVE, Manchester 126 , Noth England"
                },
                // 代理房产
                agentHouseList: [
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