<template>
    <header class="header header-sticky">
        <div class="header-bottom menu-center">
            <div class="container">
                <div class="row justify-content-between">

                    <!--Logo start-->
                    <div class="col mt-10 mb-10">
                        <div class="logo">
                            <a href="/"><img src="assets/images/logo.png" alt=""></a>
                        </div>
                    </div>
                    <!--Logo end-->

                    <!--Menu start-->
                    <div class="col d-none d-lg-flex">
                        <nav class="main-menu">
                            <ul>
                                <li v-for="(one,idx1) in menus" :class="one.subMenu ? 'has-dropdown' : ''" :key="idx1">
                                    <a :href="one.url">{{one.title}}</a>
                                    <ul v-if="one.subMenu" class="sub-menu">
                                        <li v-for="(two,idx2) in one.subMenu"
                                            :class="two.subMenu ? 'has-dropdown' : ''"
                                            :key="idx2">
                                            <a :href="two.url">{{two.title}}</a>
                                            <ul v-if="two.subMenu" class="sub-menu">
                                                <li v-for="(three,idx3) in two.subMenu"
                                                    :class="three.subMenu ? 'has-dropdown' : ''"
                                                    :key="idx3">
                                                    <a :href="three.url">{{three.title}}</a>
                                                </li>
                                            </ul>
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
                            {{ nickName }}
                            <router-link to="/login" class="user-toggle" v-show="!nickName">
                                <i class="pe-7s-user"></i><span>登录或注册</span>
                            </router-link>
                            <router-link to="/" @click="logout" class="user-toggle" v-show="nickName">
                                <i class="pe-7s-user"></i><span>注销</span>
                            </router-link>
                            <img v-show="nickName" id="avator" src="assets/images/logo.png" alt="">
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
    import {mapGetters,mapMutations} from 'vuex'
    import {removeToken} from "../utils/auth";
    export default {
        data(){
            return {
            }
        },
        computed:{
            ...mapGetters('menus',['menus']),
            ...mapGetters('user',['nickName'])
        },
        methods:{
            ...mapMutations('menus',['addMenu']),
            logout(){
                removeToken();
            }
        },
        created() {

        }
    }
</script>

<style scoped>
    #avator{
        border-radius: 50%;
    }
</style>