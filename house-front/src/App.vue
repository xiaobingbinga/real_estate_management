<template>
  <div id="main-wrapper">
<!--    <div id="nav">-->
<!--      <router-link to="/">Home</router-link> |-->
<!--      <router-link to="/about">About</router-link>-->
<!--    </div>-->
<!--    <router-view/>-->

<!--    头部-->
    <house-header/>
<!--    中间内容-->
    <router-view/>
<!--    尾部-->
    <house-footer sysDesc="老九房产交易系统"/>
  </div>
</template>
<script>
  import houseHeader from '@/components/Header.vue'
  import houseFooter from '@/components/Footer.vue'
  export default {
    components:{
      houseHeader,
      houseFooter
    }
  }
</script>

<style>

</style>
