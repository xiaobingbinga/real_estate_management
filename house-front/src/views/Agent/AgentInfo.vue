<template>
  <div>
    <agent-title title="代理人详情" :breadcrumb-title="agentInfo.userName"></agent-title>
    
    <!--Agent Section start-->
    <div
      class="agent-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-70 pb-lg-50 pb-md-40 pb-sm-30 pb-xs-20">
      <div class="container">
        <div class="row row-25">
          <!--Agent Image-->
          <div class="col-lg-5 col-12 mb-30">
            <div class="agent-image">
              <img :src="agentInfo.photo != null ? agentInfo.photo: publicPath+'assets/images/agent/default.jpg'"
                   alt="">
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
    <my-carousel v-if="this.agentHouseList.length > 3"
                 rootClass="property-section section pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
                 itemRootClass="property-carousel section"
                 title="Donald Palmer Properties"
                 :showPageDot="false"
                 :list="agentHouseList">
      <template #item="{itemData}">
        <div class="property-item col">
          <estate-sketch :info="itemData"></estate-sketch>
        </div>
      </template>
      <div></div>
    </my-carousel>
    <estate-list v-else-if="this.agentHouseList.length <= 3 && this.agentHouseList.length > 0"
                 title="代理的房产" :estateInfo="this.agentHouseList"/>
  
  </div>

</template>

<script>
    import AgentTitle from "@/components/components-w/Title"
    import MyCarousel from "@/components/components-j/until/MyCarousel";
    import EstateSketch from "@/components/components-j/estate/EstateSketch";
    import EstateList from "@/components/components-j/estate/EstateList";


    export default {
        components: {
            AgentTitle,
            MyCarousel,
            EstateSketch,
            EstateList
        },
        data() {
            return {
                // 公共路径
                publicPath: process.env.BASE_URL,
                // 代理人详细信息
                agentInfo: {},
                // 代理房产列表信息
                agentHouseList: [],
                condition: {
                    id: null,
                    ownerId: null,
                    statusId: null,
                    type: null,
                    city: null,
                    roomNumber: null,
                    bathroomNumber: null,
                    startPrice: null,
                    endPrice: null,
                    pageNum: 0,
                    pageSize: 0
                },
                userId: this.$route.query.id,

            }
        },
        methods: {
            //根据用户ID查找代理人信息
            selectAgentInfoByUserId() {
                this.axios.post("/ag/agent/agent-info", {id: 0, userId: this.userId})
                    .then(res => {
                        if (res.data.code == 200) {
                            this.agentInfo = res.data.data
                            if(res.data.data.ownerIds && res.data.data.ownerIds.length > 0){
                                this.selectHouseByOwnerId(this.agentInfo.ownerIds)
                            }
                        }
                    })
            },
            // 根据代理人用户Id查询的房产信息
            selectHouseByOwnerId(ownerIds) {
                this.axios.post("/p/properties/condition-owner", ownerIds)
                    .then(res => {
                        if(res.data.code === 200){
                            this.agentHouseList = res.data.data
                        }
                    })
            
                
            }
        },
        mounted() {
            this.selectAgentInfoByUserId()
        }
    }
</script>

<style scoped>

</style>