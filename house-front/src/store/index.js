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
import user from "./module/user";
import search1 from "./index/search1";


Vue.use(Vuex)

export default new Vuex.Store({
  getters:{
    city: state => {
      return state.city;
    }
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
    search1,
    address,
    user
  }
})
