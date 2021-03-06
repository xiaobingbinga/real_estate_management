import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from "../views/Home/Home2/Home.vue";
import store from "../store"
import paths from "../store/module/dynamicRoutes"
import form from "bootstrap-vue/esm/mixins/form";

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    redirect: '/index'
  },
  {
    path: '/index',
    name: 'Index',
    component: () => import('../views/Home/Home1/Index.vue'),
    meta: {
      title: 'house-front'
    }
  },
  {
      path: '/index2',
      name: 'Home',
      component: Home
  },
  {
    path: '/index3',
    name: 'Index3',
    component: () => import('@/views/Home/Home3'),
    meta: {
      title: 'house-front'
    }
  },
  {
    path:'/house/properties-left-sidebar',
    name:'propertiesLeftSidebar',
    component:() => import('@/views/House/PropertiesLeftSidebar')
  },
  {
    path:'/house',
    name:'Properties',
    component:() => import('@/views/House')
  },
  {
    path:'/house/properties-list-left-sidebar',
    name:'propertiesListLeftSidebar',
    component:() => import('@/views/House/PropertiesListLeftSidebar')
  },
  {
    path:'/house/properties-list-right-sidebar',
    name:'propertiesListRightSidebar',
    component:() => import('@/views/House/PropertiesListRightSidebar')
  },

  {
    path:'/house/single-properties-left-sidebar',
    name:'PropertiesOne',
    component:() => import('@/views/House/Single/SinglePropertiesLeftSidebar')
  },
  {
    path: '/login',
    redirect: '/login/login-form',
    component: () => import('@/views/LoginAndRegister'),
    children: [
      {
        path: '/login/login-form',
        name: 'Login',
        component: () => import('@/views/LoginAndRegister/Login')
      },
      {
        path: '/register',
        redirect: '/register/register-by-phone',
        component: () => import('@/views/LoginAndRegister/Register'),
        children: [
          {
            path: '/register/register-by-account',
            name: 'RegisterByAccount',
            component: () => import('@/views/LoginAndRegister/RegisterByAccount')
          },
          {
            path: '/register/register-by-phone',
            name: 'RegisterByPhone',
            component: () => import('@/views/LoginAndRegister/RegisterByPhone')
          }
        ]
      }
    ]
  },

    // 代理人列表
  {
    path: '/agent/list',
    name: "AgentList",
    component: ()=>import('@/views/Agent/AgentList')
  },
   // 代理人详细信息
  {
    path: '/agent/info',
    name: "AgentInfo",
    props:true,
    component: ()=>import('@/views/Agent/AgentInfo')
  },
  // 代理商列表
  {
    path: '/agency/list',
    name: "AgencyList",
    component: ()=>import('@/views/Agent/AgencyList')
  },
  // 代理商详情
  {
    path: '/agency/info',
    name: "AgencyInfo",
    props:true,
    component:()=>import('@/views/Agent/AgencyInfo')
  }
];

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
});

import {getToken} from "../utils/auth"
router.beforeEach(async (to,form,next) => {
  if (to.path === '/display/add-properties'){
    let $store = router.app.$store || store;
    console.log(getToken())
    if (getToken() !== null){
      if (!$store.getters['dynamicRoutes/getLoaded']){
        console.log($store);
        console.log($store.getters['dynamicRoutes/getPaths']);
        router.addRoutes($store.getters['dynamicRoutes/getPaths']);
        console.log(router);
        $store.commit('dynamicRoutes/setLoaded', true);
        await router.push(to);
      }else {
        next();
      }

    }else {
      next({path:'/login'});
    }

  }else {
    next();
  }
});

export default router
