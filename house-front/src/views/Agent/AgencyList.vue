<template>
  <div>
    <agency-title title="代理商" breadcrumb-title="代理商列表"></agency-title>
    
    <div
      class="agency-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50">
      <div class="container">
        
        <div class="row">
          <!--Agencies satrt-->
          <div class="col-lg-4 col-sm-6 col-12 mb-30" v-for="(item,index) in this.pageInfo.list" :key="index">
            <div class="agency">
              <div class="image">
                <a class="img" @click.stop="gotoAgencyInfo(item.id)"><img :src="`${publicPath}${item.icon}`" alt=""></a>
              </div>
              <div class="content">
                <h4 class="title"><a @click.stop="gotoAgencyInfo(item.id)">{{item.name}}</a></h4>
                <span>{{item.agentCount}} Agents</span>
                <span>{{item.propertiesCount}} Properties</span>
              </div>
            </div>
          </div>
          <!--Agencies end-->
        
        </div>
        
        <agency-pagination :currentPage="pageInfo.pageNum"
                           :rows="pageInfo.total"
                           :perPage="pageInfo.pageSize"
                           @update:currentPage="updatePageNum"></agency-pagination>
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
                pageInfo: {
                    pageNum: 1,
                    pageSize: 3,
                }
            }
        },
        methods: {
            // 查询代理商列表信息
            selectAgencyListByPage() {
                let pageTo = {pageSize: this.pageInfo.pageSize, pageNum: this.pageInfo.pageNum}
                this.axios.post('/ag/agency/agency-list', pageTo)
                    .then(res => {
                        if (res.data.code === 200) {
                            this.pageInfo = res.data.data
                        } else {
                            console.log(res.data)
                        }
                    })
                    .catch(res => {
                        console.log(res)
                    })
            },
            // 跟新页码
            updatePageNum(newCurrentPage) {
                this.pageInfo.pageNum = newCurrentPage
                this.selectAgencyListByPage()
            },
            gotoAgencyInfo(id) {
                // 跳转路由
                this.$router.push({
                    path: "/agency/info",
                    query: {
                        id: id
                    }
                })
            }
        },
        mounted() {
            this.selectAgencyListByPage();
        }
    }
</script>

<style scoped>

</style>