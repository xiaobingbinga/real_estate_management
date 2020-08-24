"use strict";

import service from "@/utils/request";

function login(data) {
  return service({
    url: '/house/user/login',
    method: 'post',
    data: data
  });
}

const Login = {
  login
};

export default Login;