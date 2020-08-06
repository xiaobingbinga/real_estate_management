import Vue from 'vue'
import Vuex from 'vuex'
import menus from "./menus";

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
    menus
  }
})
