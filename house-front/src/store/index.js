import Vue from 'vue'
import Vuex from 'vuex'
import menus from "./module/menus";

// index静态数据
import view from "./module/view"
import search from "./index/search";
import agentList from "./index/agentList";
import brandList from "./index/brandList";
import featureList from "./index/featureList";
import houseList from "./index/houseList";
import newsList from "./index/newsList";
import serviceHouseList from "./index/serviceHouseList";
import address from "./index/address";

Vue.use(Vuex)

export default new Vuex.Store({
  // 属性
  state: {
  },
  // 读取属性方法
  getters:{
  },
  // 写入属性方法
  mutations: {
  },
  // 异步，读取属性，并可通过mutations修改属性
  actions: {
  },
  // 分模块操作
  modules: {
    menus,
    search,
    agentList,
    brandList,
    featureList,
    houseList,
    newsList,
    view,
    serviceHouseList,
    address
  }
})
