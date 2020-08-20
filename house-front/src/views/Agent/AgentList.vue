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
          <div class="col-lg-3 col-sm-6 col-12 mb-30" v-for="(item,index) in this.agentList" :key="index">
              <my-agent :agent="item" :col="false"></my-agent>
          </div>
          <!--Agent end-->
        </div>
        
        <agent-pagination></agent-pagination>
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
        data(){
            return {
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
                        count:1,
                        email:'info@example.com',
                        photo:"assets/images/agent/agent-5.jpg"
                    },
                    
                //   =======================================================
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
                        phone:'(756) 447 5779',
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
                        count:1,
                        email:'info@example.com',
                        photo:"assets/images/agent/agent-5.jpg"
                    },
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
                        count:1,
                        email:'info@example.com',
                        photo:"assets/images/agent/agent-5.jpg"
                    },
                    {
                        id:1,
                        name:"唐纳德.菲尔",
                        mobile:'(756) 447 5779',
                        email:'info@example.com',
                        count:5,
                        photo:"assets/images/agent/agent-1.jpg"
                    },
                
                ],
            }
        }

    }
</script>

<style scoped>


</style>