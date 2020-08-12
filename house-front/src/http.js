import axios from 'axios'
import qs from 'qs'
import state from './store'
//axios发送的地址
axios.defaults.baseURL='http://127.0.0.1:83/api';
axios.defaults.timeout=10000;

//请求拦截处理
axios.interceptors.request.use()
//响应拦截处理
axios.interceptors.response.use()