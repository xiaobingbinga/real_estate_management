<template>
  <div>
    <agency-title title="代理商" breadcrumb-title="代理商列表"></agency-title>
    
    <div class="agency-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50">
      <div class="container">
        
        <div class="row">
          <!--Agencies satrt-->
          <div class="col-lg-4 col-sm-6 col-12 mb-30" v-for="(item,index) in this.agencyListInfo" :key="index">
            <div class="agency">
              <div class="image">
                <a class="img" href="agency-details.html"><img :src="`${publicPath}${item.icon}`" alt=""></a>
              </div>
              <div class="content">
                <h4 class="title"><a href="agency-details.html">{{item.name}}</a></h4>
                <span>{{item.agentCount}} Agents</span>
                <span>{{item.propertiesCount}} Properties</span>
              </div>
            </div>
          </div>
          <!--Agencies end-->
        
        </div>
        
        <agency-pagination></agency-pagination>
      </div>
    </div>
    <!--Agency Section end-->
  </div>
</template>

<script>
    import AgencyTitle from "@/components/components-w/Title"
    import AgencyPagination from "@/components/components-w/Pagination"
    export default {
        components: {
            AgencyTitle,
            AgencyPagination
        },
        data() {
            return {
                publicPath: process.env.BASE_URL,
                agencyListInfo: [
                    {
                        id: 1,
                        name: 'Royao Estates',
                        icon: "assets/images/agencies/agency-1.jpg",
                        agentCount: 4,
                        propertiesCount: 6
                    },
                    {
                        id: 2,
                        name: 'Luzury Homes',
                        icon: "assets/images/agencies/agency-2.jpg",
                        agentCount: 5,
                        propertiesCount: 5
                    },
                    {
                        id: 3,
                        name: 'Duplex Estates',
                        icon: "assets/images/agencies/agency-3.jpg",
                        agentCount: 3,
                        propertiesCount: 6
                    },
                    {
                        id: 4,
                        name: 'Global Homes',
                        icon: "assets/images/agencies/agency-4.jpg",
                        agentCount: 4,
                        propertiesCount: 6
                    },
                    {
                        id: 5,
                        name: 'Green House Homes',
                        icon: "assets/images/agencies/agency-5.jpg",
                        agentCount: 5,
                        propertiesCount: 5
                    },
                    {
                        id: 6,
                        name: 'Landscape Estates',
                        icon: "assets/images/agencies/agency-6.jpg",
                        agentCount: 4,
                        propertiesCount: 6
                    }]
            }
        }
    }
</script>

<style scoped>

</style>