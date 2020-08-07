<template>
  <div class="download-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50"
       style="background-image: url(assets/images/bg/download-bg.jpg)">
    <div class="container">
      <div class="row">
        <div class="col-12">
          <!--Download Content start-->
          <div class="download-content">
            <h1>下载<span>{{title}}</span>App<br>获取最新最优质房源信息</h1>
            <div class="buttons">
              
                <a :href="down.url" v-for="(down,index) in this.downUrl" :key="index">
                  <i :class="down.icon"></i>
                  <span class="text">{{down.title}}</span>
                </a>
              
              
            </div>
            <div class="image"><img src="assets/images/others/app.png" alt=""></div>
          </div>
          <!--Download Content end-->
        
        </div>
      </div>
    </div>
  </div>

</template>

<script>
    export default {
        name: "Down",
        props:{
            title:{
                type:String,
                default:"老九租房"
            },
            downUrl:{
                type:Array,
                default:function () {
                    return [
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
                    ]
                }
            }
        }
    }
</script>

<style scoped>

</style>