<template>
  
  <header class="header header-sticky">
    <div class="header-bottom menu-center">
      <div class="container">
        <div class="row justify-content-between">
          
          <!--Logo start-->
          <div class="col mt-10 mb-10">
            <div class="logo">
              <a href="index.html"><img src="assets/images/logo.png" alt=""></a>
            </div>
          </div>
   
          
          <!--Menu start-->
          <div class="col d-none d-lg-flex">
            <nav class="main-menu">
              <ul>
                <li v-for="(one,index1) in this.menus" class="has-dropdown" :key="index1">
                  <a :href="one.url">
                    {{one.title}}
                  </a>
                  <ul  :class="one.subMenu?'sub-menu':''">
                    <li v-for="(two,index2) in one.subMenu" :key="index2">
                      <a :href="one.url">{{two.title}}</a>
                    </li>
                  </ul>
                </li>
              </ul>
            </nav>
          </div>
          
          <!--User start-->
          <div class="col mr-sm-50 mr-xs-50">
            <div class="header-user">
              <a href="/" class="user-toggle">
                <i class="pe-7s-user"></i>
                <span>登录或注册</span>
              </a>
            </div>
          </div>
          
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
    import {mapGetters} from 'vuex'
    import {mapMutations} from 'vuex'

    export default {
        name: "Header",
        data() {
          return{}
        },
        computed: {
            ...mapGetters(['menus'])
        },
        methods: {
            ...mapMutations(['addMenus'])
        },
        created() {
            console.log(this.$store)
        },
        
    }
</script>

<style scoped>

</style>