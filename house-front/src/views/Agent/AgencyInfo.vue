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
              <h3 class="title">{{agencyInfo.name}}</h3>
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
    <my-carousel v-if="this.agentList.length > 4"
                 rootClass="agent-section section pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
                 itemRootClass="agent-carousel section"
                 :title="this.agencyInfo.name+代理人"
                 :showPageDot="false"
                 :list="agentList"
                 :swiperOption="swiperOption">
      <template #item="{itemData}">
        <div class="property-item col">
          <my-agent :col="true" :agent="itemData"></my-agent>
        </div>
      </template>
    </my-carousel>
    
    <div class="container" v-else-if="this.agentList.length > 0 && this.agentList.length <= 4">
      <!--Section Title start-->
      <div class="row">
        <div class="col-md-12 mb-60 mb-xs-30">
          <div class="section-title center">
            <h1>{{this.agencyInfo.name}}代理人</h1>
          </div>
        </div>
      </div>
      <!--Section Title end-->
      <div class="agent-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50">
        <div class="container">
          <div class="row"  >
            <!--Agent satrt-->
            <div style="margin: auto" class=" col-lg-3 col-sm-6 col-12 mb-30" v-for="(item,index) in this.agentList" :key="index">
              <my-agent :agent="item" :col="false"></my-agent>
            </div>
            <!--Agent end-->
          </div>
        </div>
      </div>
    </div>
    
    <!--代理人 end-->
    
    <!-- 代理房产 start -->
    <my-carousel
      rootClass="property-section section pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
      itemRootClass="property-carousel section"
      :title="this.houseList.length > 0? this.agencyInfo.name+'代理房产列表':'' "
      :showPageDot="false"
      :list="houseList">
      <template #item="{itemData}">
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
        components: {
            AgencyTitle,
            MyCarousel,
            MyAgent,
            EstateSketch
        },
        data() {
            return {
                publicPath: process.env.BASE_URL,
                // 代理商信息
                agencyInfo: {},
                // 轮播配置
                swiperOption: {
                    slidesPerView: 4,
                    spaceBetween: 0,
                    loop: true,
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
                agentList: [],
                // 房产列表
                houseList: [],
                // 代理商ID
                agencyId: this.$route.query.id,
            }
        },
        methods: {
            // 根据其他路由组件获取的代理商ID查询详细信息
            selectAgencyInfo() {
                this.axios.post("/ag/agency/agency-info", {id:this.agencyId,userId:0} )
                    .then(res => {
                        if(res.data.code === 200){
                            this.agencyInfo = res.data.data
                            this.selectAgencyHouse(this.agencyInfo.ownerIds)
                        }else{
                            console.log(res)
                        }
                    })
                    .catch(res => {
                        console.log(res.data.data.message)
                    })
            },
            // 查询代理商名下代理人信息
            selectAgenct(){
              this.axios.post("/ag/agent/condition", {id:this.agencyId,userId:0})
                  .then(res=>{
                      if(res.data.code === 200){
                          this.agentList = res.data.data
                          
                      }else{
                          console.log(res)
                      }
                  })
                  .catch(res=>{
                      console.log(res.data.data.message)
                  })
            },
            // 查询代理商的房产信息
            selectAgencyHouse(ownerIds){
                this.axios.post("/p/properties/condition-owner", ownerIds)
                    .then(res => {
                        if(res.data.code === 200){
                            this.houseList = res.data.data
                        }
                    })
                    
            }
        },
        mounted() {
            this.selectAgencyInfo()
            this.selectAgenct()
        }
    }
</script>

<style scoped>

</style>