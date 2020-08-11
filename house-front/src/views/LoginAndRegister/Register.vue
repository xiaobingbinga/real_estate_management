<template>
  <div id="register-tab" v-else class="tab-pane show active">
    <!--注册方式选择栏-->
    <ul class="register-type-tab-list nav">
      <li><router-link to="/register/register-by-phone" active-class="active" data-toggle="tab">手机号注册(推荐)</router-link></li>
      <li>|</li>
      <li><router-link to="/register/register-by-account" active-class="active" data-toggle="tab">账号注册</router-link></li>
    </ul>
    <!--注册表单面板-->
    <router-view/>
  </div>
</template>

<script>
  export default {
    name: "Register"
  }
</script>

<style scoped>

</style>