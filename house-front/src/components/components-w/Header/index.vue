<template>
  <header class="header header-sticky">
    <div class="header-bottom menu-center">
      <div class="container">
        <div class="row justify-content-between">

          <!--Logo start-->
          <div class="col mt-10 mb-10">
            <div class="logo">
              <a href="index.html"><img src="@/assets/images/logo.png" alt=""></a>
            </div>
          </div>
          <!--Logo end-->

          <!--Menu start-->
          <div class="col d-none d-lg-flex">
            <nav class="main-menu">
              <ul>
                <li v-for="(menu, index) in navMenus" :key="index" class="has-dropdown"><a :href="menu.url">{{ menu.title }}</a>
                  <ul class="sub-menu">
                    <li v-for="(subMenu, i) in menu.subMenus" :key="i" :class="subMenu.subMenus ? 'has-dropdown' : ''"><a :href="subMenu.url">{{ subMenu.title }}</a>
                      <template v-if="subMenu.subMenus">
                        <ul class="sub-menu">
                          <li v-for="(subSubMenu, is) in subMenu.subMenus"><a :href="subMenu.url">{{ subMenu.title }}</a></li>
                        </ul>
                      </template>
                    </li>
                  </ul>
                </li>
              </ul>
            </nav>
          </div>
          <!--Menu end-->

          <!--User start-->
          <div class="col mr-sm-50 mr-xs-50">
            <div class="header-user">
              <a href="login-register.html" class="user-toggle"><i class="pe-7s-user"></i><span>登录或注册</span></a>
            </div>
          </div>
          <!--User end-->
        </div>

        <!--Mobile Menu start-->
        <div class="row">
          <div class="col-12 d-flex d-lg-none">
            <div class="mobile-menu"></div>
          </div>
        </div>
        <!--Mobile Menu end-->

      </div>
    </div>
  </header>
</template>

<script>
  import { mapGetters } from "vuex";

  export default {
    name: "Header",
    data(){
      return {
        navMenus: []
      }
    },
    computed:{
      ...mapGetters('view',['menus'])
    },
    created() {
      if(this.menus)
        this.navMenus = this.menus;
    }
  }
</script>

<style scoped>

</style>