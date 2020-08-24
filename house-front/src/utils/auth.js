"use strict";

const tokenKey = 'Authorization';

export function getToken(){
  localStorage.getItem(tokenKey);
}

export function setToken(token) {
  localStorage.setItem(tokenKey, `Bearer ${token}`);
}

export function removeToken() {
  localStorage.remove(tokenKey);
}