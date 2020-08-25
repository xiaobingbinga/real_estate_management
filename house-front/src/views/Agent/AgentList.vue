<template>
  <div>
    <!--标题-->
    <agent-title title="代理人" breadcrumb-title="代理人列表"></agent-title>
    
    <!--代理人列表信息-->
    <div
      class="agent-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50">
      <div class="container">
        
        <div class="row">
          <!--Agent satrt-->
          <div class="col-lg-3 col-sm-6 col-12 mb-30" v-for="(item,index) in this.pageInfo.list" :key="index">
            <my-agent :agent="item" :col="false"></my-agent>
          </div>
          <!--Agent end-->
        </div>
        
        <agent-pagination :currentPage="pageInfo.pageNum"
                          :rows="pageInfo.total"
                          :perPage="pageInfo.pageSize"
                          @update:currentPage="updatePageNum"></agent-pagination>
      </div>
    </div>
  
  
  </div>

</template>

<script>
    import AgentTitle from "@/components/components-w/Title"
    import MyAgent from "@/components/components-j/agent/MyAgent";
    import AgentPagination from "@/components/components-w/Pagination"

    export default {
        components: {
            AgentTitle,
            MyAgent,
            AgentPagination
        },
        data() {
            return {
                // 分页数据
                pageInfo: {
                    pageSize:4,
                    pageNum:1
                },

            }
        },
        methods: {
            //  分页查询代理人列表
            selectAgentListByPage() {
                // 进行数据封装
                this.axios.post("/ag/agent/list", {pageSize:this.pageInfo.pageSize, pageNum:this.pageInfo.pageNum})
                    .then(res => {
                        if (res.data.code == 200) {
                            this.pageInfo = res.data.data
                        } else {
                            console.log(res.data.data.message)
                        }
                    })
                    .catch(res => {
                    })
            },
            updatePageNum(newCurrentPage) {
                this.pageInfo.pageNum = newCurrentPage
                this.selectAgentListByPage()
            }
        },
        created() {
            this.selectAgentListByPage()
        }


    }
</script>

<style scoped>


</style>