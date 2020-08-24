import axios from "axios"

import { getToken } from "../utils/auth";
import store from "../store/module/user";

const baseURL = process.env.VUE_APP_BASE_API;

const service = axios.create({
  baseURL,
  timeout: 5000
});

service.interceptors.request.use(
  config => {
    if (store.getters.token) {
      config.headers['Authorization'] = getToken()
    }
    return config
  },
  error => {
    console.log(error);
    Promise.reject(error);
  }
);

service.interceptors.response.use(
  response => {
    const res = response.data;
    if (res.errno === 501) {
      return Promise.reject('error');
    }else if (res.errno === 601){
      return Promise.reject('error');
    }else {
      return response;
    }
  }
);

export default service