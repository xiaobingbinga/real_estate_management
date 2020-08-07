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
    component: () => import('../views/Home/Home1/Index.vue')
  },
  {
      path: '/index2',
      name: 'Home',
      component: Home
  },
  {
    path: '/index3',
    name: 'Index3',
    component: () => import('views/Home/Home3')
  }
];

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
});

export default router
