<template>
  <div class="review col">
    <div class="review-inner">
      <div class="image"><img :src="`${publicPath}assets/images/review/review-1.jpg`" alt=""></div>
      <div class="content">
        <p>房产交易平台the best theme for elit, sed do eiusmod tempor dolor sit amet, conse ctetur adipiscing elit.</p>
        <h6>John Carlson - <span>CEO</span></h6>
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
    }
  }
</script>

<style scoped>

</style>