import '@babel/polyfill'
import 'mutationobserver-shim'
import Vue from 'vue'

// 导入全局样式
import '@/assets/css/style.css'
import '@/assets/css/helper.css'
// import '@/assets/css/pulgins.css'

// 导入字体
// import './plugins/fontawesome'
import '@fortawesome/fontawesome-svg-core/styles.css'
import 'font-awesome/css/font-awesome.css'

//导入bootstrap
// import './plugins/bootstrap-vue'
import { BootstrapVue, IconsPlugin } from "bootstrap-vue";
import 'bootstrap/dist/css/bootstrap.css'
Vue.use(BootstrapVue);
Vue.use(IconsPlugin);

import App from './App.vue'
import router from './router'
import store from './store'

Vue.config.productionTip = false;

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app');
