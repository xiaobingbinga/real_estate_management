import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from "../views/Home";

Vue.use(VueRouter)

  const routes = [
  {
    path: '/',
    redirect: '/index'
  },
  {
      path: '/index2',
      name: 'Home',
      component: Home
  },
  {
    path: '/index',
    name: 'Index',
    component: ()=> import('../views/Index.vue')
  },
  {
    path: '/about',
    name: 'About',
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  }
    // {
    //   path:'/index2',
    //   name:'Index2',
    //   component: () => import('../views/Index2.vue')
    // }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
