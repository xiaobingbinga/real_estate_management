import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import '@/components/components-w'

import BaiduMap from 'vue-baidu-map'
Vue.use(BaiduMap, { ak: 'OvUmjogasSSR2GwbG2n8coZzbWgFhuyo'})

import Vuelidate from 'vuelidate'
Vue.use(Vuelidate)

import { BootstrapVue, IconsPlugin } from 'bootstrap-vue'
Vue.use(BootstrapVue)
Vue.use(IconsPlugin)

Vue.config.productionTip = false

new Vue({
  router,
  store,
  BaiduMap,
  render: h => h(App)
}).$mount('#app')