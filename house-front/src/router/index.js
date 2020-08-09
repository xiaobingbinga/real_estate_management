import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from "../views/Home/Home2/Home.vue";

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
    component:() => import('../views/House/PropertiesLeftSidebar')
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
  }
];

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
});

export default router
