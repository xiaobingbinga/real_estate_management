<template>
  <div>
    <house-title title="登录或注册" breadcrumbTitle="主页"></house-title>
    <div class="login-register-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50">
      <div class="container">
        <div class="row">
          <div class="col-lg-6 col-md-8 col-12 ml-auto mr-auto">
            <!--操作方式选择栏-->
            <ul class="login-register-tab-list nav">
              <li><router-link to="/login" active-class="active" data-toggle="tab">登录</router-link></li>
              <li>or</li>
              <li><router-link to="/register" active-class="active" data-toggle="tab">注册</router-link></li>
            </ul>
            <div class="tab-content">
              <!--登录和注册面板-->
              <router-view/>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "index"
  }
</script>

<style scoped>

</style>