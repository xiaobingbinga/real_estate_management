<template>
  <div class="col">
    <div class="news">
      <div class="image">
        <a href="news-details.html"><img :src="newsInfo.imageUrl" alt=""></a>
        <div class="meta-wrap">
          <ul class="meta">
            <li>由 <a href="#">{{newsInfo.name}}</a></li>
            <li>{{newsInfo.issuingTime}}</li>
          </ul>
          <ul class="meta back">
            <li>由 <a href="#" style="color : white">{{newsInfo.name}}</a></li>
            <li>{{newsInfo.issuingTime}}</li>
          </ul>
        </div>
      </div>
      <div class="content">
        <h4 class="title"><a href="news-details.html">{{newsInfo.title}}</a></h4>
        <div class="desc">
          <p>{{newsInfo.summary}}</p>
        </div>
        <a href="news-details.html" class="readmore">继续浏览</a>
      </div>
    </div>
  </div>
</template>

<script>
    export default {
        name: "EstateNews",
        props:{
            newsInfo:{
                type:Object,
                default(){
                    return{
                        id:1,//新闻唯一标识
                        imageUrl:"assets/images/news/news-1.jpg",//新闻图片
                        name:"唐纳德",//发表的用户名
                        issuingTime:"2018年12月30日",//发表时间
                        title:"豪华公寓楼",//标题
                        summary:"房产交易平台 the best theme for  elit, sed do to eiumod tempor dolor sit amet."//简介
                    }
                }
            }
        }
    }
</script>

<style scoped>

  
  
</style>