import Vue from 'vue'
import Vuex from 'vuex'
import menus from "./menus";

// index静态数据
import search from "./index/search";
import agentList from "./index/agentList";
import brandList from "./index/brandList";
import featureList from "./index/featureList";
import houseList from "./index/houseList";
import newsList from "./index/newsList";
import serviceHouseList from "./index/serviceHouseList";

Vue.use(Vuex)

export default new Vuex.Store({
  // 属性
  state: {
    city: [
      {value: 1, tip: "北京"},
      {value: 2, tip: "上海"},
      {value: 3, tip: "广州"},
      {value: 4, tip: "深圳"},
      {value: 5, tip: "成都"},
      {value: 6, tip: "重庆"},
      {value: 7, tip: "武汉"},
      {value: 8, tip: "沈阳"},
      {value: 9, tip: "福州"},
      {value: 10, tip: "厦门"},
      {value: 11, tip: "银川"},
    ]
  },
  // 读取属性方法
  getters:{
    city: state => {
      return state.city;
    }
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
    serviceHouseList
  }
})
