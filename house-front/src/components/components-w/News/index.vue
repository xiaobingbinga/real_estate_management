<template>
  <div :class="newsClass">
    <div :class="newsInnerClass">
      <div class="image">
        <a :href="newsUrl"><img :src="`${publicPath}${news.imageUrl}`" alt=""></a>
        <div class="meta-wrap">
          <ul class="meta">
            <li>由 <a href="javascript:;" @click="userClick">{{news.name}}</a></li>
            <li>{{news.issuingTime}}</li>
          </ul>
          <ul class="meta back">
            <li>由 <a href="javascript:;" @click="userClick">{{news.name}}</a></li>
            <li>{{news.issuingTime}}</li>
          </ul>
        </div>
      </div>
      <div class="content">
        <h4 class="title"><a :href="newsUrl">{{news.title}}</a></h4>
        <div class="desc">
          <p>{{news.content}}</p>
        </div>
        <a :href="newsUrl" class="readmore">继续浏览</a>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "HouseNews",
    data () {
      return {
        publicPath: process.env.BASE_URL
      }
    },
    props: {
      newsClass: {
        type: String,
        default: "col"
      },
      newsInnerClass: {
        type: String,
        default: "news"
      },
      news: {
        type: Object,
        default: () => {
          return {
            id: 1,
            userId: 1,
            imageUrl: 'assets/images/news/news-1.jpg',
            name: '唐纳德',
            issuingTime: '2018年12月30日',
            title: '豪华公寓楼',
            content: '房产交易平台 the best theme for  elit, sed do to eiumod tempor dolor sit amet.',
          }
        }
      },
      newsUrl: {
        type: String,
        default: 'javascript:;'
      }
    },
    methods: {
      userClick(){
        this.$emit('userClick', this.news.userId);
      }
    }
  }
</script>

<style scoped>
.content{
  text-align: left;
}
</style>