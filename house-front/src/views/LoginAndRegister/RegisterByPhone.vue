<template>
  <form @submit.prevent="submit">
    <div class="row">
      <div class="col-12 mb-30" :class="{ 'input-error': $v.registerByPhoneForm.mobile.$error }">
        <input type="text" name="username" v-model.trim="$v.registerByPhoneForm.mobile.$model" placeholder="输入手机号">
        <div :class="{ error : !$v.registerByPhoneForm.mobile.required }" class="zone-height">手机号必填</div>
        <div :class="{ error : !$v.registerByPhoneForm.mobile.phoneCheck }" class="zone-height">请输入正确手机号</div>
      </div>
      <div class="col-6 mb-30" :class="{ 'input-error': $v.registerByPhoneForm.authCode.$error }">
        <input type="text" name="username" v-model.trim="$v.registerByPhoneForm.authCode.$model" placeholder="输入验证码">
        <div :class="{ error : !$v.registerByPhoneForm.authCode.required }" class="zone-height">验证码必填</div>
      </div>
      <button class="col-5 btn btn2" :class="{ 'disable-button' : isSend }" type="button" style="height: 50px" @click="sendAuthCode" :disabled="isSend">{{ sendAuthCodeButton }}</button>
      <div class="col-12 mb-30" :class="{ 'input-error': $v.registerByPhoneForm.name.$error }">
        <input type="text" name="username" v-model.trim="$v.registerByPhoneForm.name.$model" placeholder="输入真实姓名">
        <div :class="{ error : !$v.registerByPhoneForm.name.required }" class="zone-height">姓名必填</div>
      </div>
      <div class="col-12 mb-30" :class="{ 'input-error': $v.registerByPhoneForm.nickName.$error }">
        <input type="text" name="username" v-model.trim="$v.registerByPhoneForm.nickName.$model" placeholder="输入昵称">
        <div :class="{ error : !$v.registerByPhoneForm.nickName.required }" class="zone-height">昵称必填</div>
        <div :class="{ error : !$v.registerByPhoneForm.nickName.minLength }" class="zone-height">昵称长度不得小于 5 个字符</div>
        <div :class="{ error : !$v.registerByPhoneForm.nickName.maxLength }" class="zone-height">昵称长度不得超过 20 个字符</div>
      </div>
      <div class="col-12 mb-30" :class="{ 'input-error': $v.registerByPhoneForm.password.$error }">
        <input type="text" name="username" v-model.trim="$v.registerByPhoneForm.password.$model" placeholder="输入密码">
        <div :class="{ error : !$v.registerByPhoneForm.password.required }" class="zone-height">密码必填</div>
        <div :class="{ error : !$v.registerByPhoneForm.password.minLength }" class="zone-height">密码长度不得小于 6 个字符</div>
        <div :class="{ error : !$v.registerByPhoneForm.password.maxLength }" class="zone-height">密码长度不得超过 20 个字符</div>
      </div>
      <div class="col-12 mb-30" :class="{ 'input-error': $v.registerByPhoneForm.confirmPassword.$error }">
        <input type="text" name="username" v-model.trim="$v.registerByPhoneForm.confirmPassword.$model" placeholder="请确认密码">
        <div :class="{ error : !$v.registerByPhoneForm.confirmPassword.required }" class="zone-height">请确认密码</div>
        <div :class="{ error : !$v.registerByPhoneForm.confirmPassword.sameAsPassword }" class="zone-height">两次输入密码不一致</div>
      </div>
      <div class="col-12 mb-30">
        <ul>
          <li><input type="checkbox" id="register_agree"><label for="register_agree" class="cursor_label">我同意相关<a href="#">定义 & 条款</a></label></li>
        </ul>
      </div>
      <div class="col-12 mb-30">
        <ul>
          <li><input type="radio" name="account_type" id="register_normal" checked><label for="register_normal" class="cursor_label">普通用户</label></li>
          <li><input type="radio" name="account_type" id="register_agent"><label for="register_agent" class="cursor_label">代理人</label></li>
          <li><input type="radio" name="account_type" id="register_agency"><label for="register_agency" class="cursor_label">代理商</label></li>
        </ul>
      </div>
      <div class="col-12"><button class="btn btn3" type="submit">注册</button></div>
    </div>
  </form >
</template>

<script>
  import { required, minLength, maxLength, sameAs } from "vuelidate/lib/validators";
  import { regex } from 'vuelidate/lib/validators/common'
  // import Login from "apis/login";
  let phoneCheck = regex('phoneNumber', /^1(3|4|5|7|8)\d{9}$/);
  export default {
    name: "RegisterByPhone",
    data: () => ({
      sendAuthCodeButton: '发送验证',
      isSend: false,
      authCode: '',
      registerByPhoneForm: {
        mobile: '',
        authCode: '',
        name: '',
        nickName: '',
        password: '',
        confirmPassword: ''
      }
    }),
    validations: {
      registerByPhoneForm: {
        mobile: {
          required,
          phoneCheck
        },
        authCode: {
          required
        },
        name: {
          required
        },
        nickName: {
          required,
          minLength: minLength(5),
          maxLength: maxLength(20)
        },
        password: {
          required,
          minLength: minLength(6),
          maxLength: maxLength(20)
        },
        confirmPassword: {
          required,
          sameAsPassword: sameAs('password')
        }
      }
    },
    methods: {
      submit() {
        this.$v.$touch();
        if (this.$v.$invalid) {
          this.submitStatus = 'ERROR';
          console.log('失败')
        } else {
          this.submitStatus = 'PENDING';
          console.log('成功')
        }
      },
      sendAuthCode(){
        if (!this.$v.registerByPhoneForm.mobile.required && !this.$v.registerByPhoneForm.mobile.required){
          this.$v.registerByPhoneForm.mobile.$touch();
          return;
        }
        if (this.isSend) return;
        // Login.sendAuthCode(this.registerByPhoneForm.phone).then(res => {
        //   console.log(res.data);
        //   this.authCode = res.data;
        // });
        this.isSend = true;
        this.sendAuthCodeButton = '45 s';
        let sec = setInterval(() => {
          let second = Number.parseInt(this.sendAuthCodeButton);
          this.sendAuthCodeButton = second - 1 + ' s';
          !second && (this.sendAuthCodeButton = '发送验证') && !(this.isSend = false) && clearInterval(sec);
        }, 1000);
      }
    }
  }
</script>

<style scoped>
  .disable-button:hover{
    background-color: #004395;
    color: #fff;
  }
  .zone-height{
    height: 0px;
    transition: 0.3s;
    overflow: hidden;
  }
  .error{
    height: 0px;
    overflow: hidden;
    font-size: 12px;
    transition: 0.3s;
    color: #CC3333;
    transform: translate(-50%, -50%);
  }
  .input-error > input {
    color: #CC3333;
  }
  .input-error > .error{
    height: 20px;
    transform: translate(20px, 50%);
  }
  .input-error input, .input-error input:focus, .input-error input:hover, .input-error textarea {
    border-color: #CC3333;
  }
</style>