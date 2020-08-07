<template>
  <div class="feature-section feature-section-border-top section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-60 pb-lg-40 pb-md-30 pb-sm-20 pb-xs-10">
    <div class="container">
      <div class="row row-25 align-items-center">

        <!--Feature Image start-->
        <div class="col-lg-5 col-12 order-1 order-lg-2 mb-40">
          <div class="feature-image"><img :src="`${publicPath}${img}`" alt=""></div>
        </div>
        <!--Feature Image end-->

        <div class="col-lg-7 col-12 order-2 order-lg-1 mb-40">
          <div class="feature-wrap row row-25">

            <!--Feature start-->
            <div class="col-sm-6 col-12 mb-50" v-for="(f, i) in feature">
              <div class="feature">
                <div class="icon"><i class="pe-7s-piggy"></i></div>
                <div class="content">
                  <h4>{{ f.title }}</h4>
                  <p>{{ f.content }}</p>
                </div>
              </div>
            </div>
            <!--Feature end-->

          </div>
        </div>

      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "index",
    data () {
      return {
        publicPath: process.env.BASE_URL
      }
    },
    props: {
      img: {
        type: String,
        default: 'assets/images/others/feature.png'
      },
      feature: {
        type: Array,
        default: () => {
          return [
            { title: '低价房', content: '便宜无好货，好货不便宜。。。请消费者自律呢' },
            { title: '优质房源', content: '便宜无好货，好货不便宜。。。请消费者自律呢' },
            { title: '最容易查找房源', content: '便宜无好货，好货不便宜。。。请消费者自律呢' },
            { title: '最可靠房源', content: '便宜无好货，好货不便宜。。。请消费者自律呢' }
          ]
        }
      }
    }
  }
</script>

<style scoped>

</style>