import {setToken,getToken} from "../../utils/auth";
import Login from "../../apis/login";

const state = {
  token: getToken(),
  nickName: '',
  utId: ''
};

const getters = {
  token: state => state.token,
  nickName: state => state.nickName,
  utId: state => state.utId
};

const mutations = {
  SET_TOKEN: (state, token) => {
    state.token = token
  },
  SET_NICK_NAME: (state, nickName) => {
    state.nickName = nickName
  },
  SET_UT_ID: (state, utId) => {
    state.utId = utId
  }
};

const actions = {
  // 用户名登录
  loginByUsername({ commit }, userInfo) {
    const username = userInfo.username.trim();
    const password = userInfo.password;
    console.log(username,password)
    return new Promise((resolve, reject) => {
      Login.login({account: username, password}).then(response => {
        console.log(response);
        const token = response.data.token;
        const nickName = response.data.data.nickName;
        const utId = response.data.data.utId;
        commit('SET_TOKEN', token);
        commit('SET_NICK_NAME', nickName);
        commit('SET_UT_ID', utId);
        setToken(token);
        resolve()
      }).catch(error => {
        reject(error)
      })
    })
  }
};

const user = {
  namespaced: true,
  state,
  getters,
  actions,
  mutations
};

export default user;