<template>
  <div class="funfact-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-70 pb-lg-50 pb-md-40 pb-sm-30 pb-xs-20" style="background-image: url(assets/images/bg/cta-bg.jpg)">
    <div class="container">
      <div class="row">
        
        <!--Funfact start-->
        <div v-for="(item,index) in totalItem" :key="index" class="single-fact col-lg-3 col-6 mb-30">
          <div class="inner">
            <div class="head">
              <i :class="item.icon? item.icon : 'pe-7s-home' "></i>
              <h3 class="counter">{{item.count}}</h3>
            </div>
            <p>{{item.title}}</p>
          </div>
        </div>
        <!--Funfact end-->
        
      </div>
    </div>
  </div>

</template>

<script>
    export default {
        name: "FunFact",
       data(){
            return {
                totalItem:[
                    {
                        title:"完整项目",
                        count:854,
                        icon:'pe-7s-home'
                    },
                    {
                        title:"已售房产",
                        count:1902,
                        icon:'pe-7s-graph3'
                    },
                    {
                        title:"幸运客户",
                        count:356,
                        icon:'pe-7s-users'
                    },
                    {
                        title:"幸运抽奖",
                        count:642,
                        icon:'pe-7s-medal'
                    }
                ]
            }
       }
    }
</script>

<style scoped>

</style>