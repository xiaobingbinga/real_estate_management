<template>
    <div class="news">
        <div class="image">
            <a href="news-details.html"><img :src="newsInfo.pictureUrl" alt=""></a>
            <div class="meta-wrap">
                <ul class="meta">
                    <li>By <a href="#">{{newsInfo.author}}</a></li>
                    <li>{{newsInfo.newsDate}}</li>
                </ul>
                <ul class="meta back">
                    <li>By <a href="#">{{newsInfo.author}}</a></li>
                    <li>{{newsInfo.newsDate}}</li>
                </ul>
            </div>
        </div>
        <div class="content">
            <h4 class="title"><a href="news-details.html">{{newsInfo.title}}</a></h4>
            <div class="desc">
                <p>{{newsInfo.description}}</p>
            </div>
            <a href="news-details.html" class="readmore">继续浏览</a>
        </div>
    </div>
</template>

<script>
    export default {
        props:{
            newsInfo:{
                type:Object,
                default(){
                    return {
                        pictureUrl:'assets/images/news/news-1.jpg',
                        author:'唐纳德',
                        newsDate:'2018年12月30日',
                        title:'豪华公寓楼',
                        description:'房产交易平台 the best theme for  elit, sed do to eiumod tempor dolor sit amet.'
                    }
                }
            }
        }
    }
</script>

<style scoped>

</style>