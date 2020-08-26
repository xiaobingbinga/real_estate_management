<template>
  <div id="login-tab" class="tab-pane show active">
    <form @submit.prevent="submit">
      <div class="row">
        <div  class="col-12 mb-30" :class="{ 'input-error': $v.loginForm.username.$error }">
          <input type="text" name="username" v-model.trim="$v.loginForm.username.$model" placeholder="输入用户名">
          <div :class="{ error : !$v.loginForm.username.required }" class="zone-height">用户名必填</div>
        </div>
        <div class="col-12 mb-30" :class="{ 'input-error': $v.loginForm.password.$error }">
          <input type="password" name="password" v-model.trim="$v.loginForm.password.$model" placeholder="输入密码">
          <div :class="{ error : !$v.loginForm.password.required }" class="zone-height">密码必填</div>
        </div>
        <!-- 验证码 -->
        <div ref="captcha" id="captcha"></div>
        <!-- 验证结果 -->
        <div id="msg"></div>
        <div class="col-12 mb-30">
          <ul>
            <li><input type="checkbox" id="login_remember"> <label for="login_remember" class="cursor_label">记住用户和密码</label></li>
          </ul>
        </div>
        <!--<div class="col-12 mb-30"><button class="btn btn3" type="submit">登录</button></div>-->
        <div class="col-12 d-flex justify-content-between">
          <span>新用户需要到老九学堂 &nbsp; <a class="register-toggle ml-0" href="#register-tab">注册!</a></span>
          <span><a href="forgot-password.html">忘记密码?</a></span>
        </div>
      </div>
    </form>
  </div>
</template>

<script>
  import '@/utils/slideBlock'
  // import Login from '@/apis/login'
  import { mapActions } from 'vuex'
  import { required } from 'vuelidate/lib/validators'
  export default {
    name: "Login",
    data: () => ({
      loginForm: {
        username: '',
        password: ''
      },
      submitStatus: null
    }),
    validations: {
      loginForm: {
        username: {
          required
        },
        password: {
          required
        }
      }
    },
    methods: {
      ...mapActions('user', ['loginByUsername']),
      submit() {
        this.$v.$touch();
        if (this.$v.$invalid) {
          this.submitStatus = 'ERROR';
          console.log('失败')
        } else {
          this.submitStatus = 'PENDING';
          console.log('成功');
        }
      },
      getCaptcha() {
        window.jigsaw.init({
          el: this.$refs.captcha,
          onSuccess: this.onSuccess,
          onFail: this.onFail,
          onRefresh: this.cleanMsg
        });
      },
      onSuccess() {
        this.$v.$touch();
        if (this.$v.$invalid) {
          this.submitStatus = 'ERROR';
          console.log('失败');
          window.jigsaw.reset();
        } else {
          this.submitStatus = 'PENDING';
          console.log('成功');
          console.log(this.loginByUsername);
          this.loginByUsername(this.loginForm).then(() => {
            console.log(11111111111111111111111111111)
            this.$router.push("/");
          });
        }
      },
      onFail() {
        console.log("失败");
      },
      cleanMsg() {
        console.log("刷新");
      }
    },
    mounted() {
      this.getCaptcha();
    }
  }
</script>

<style scoped>
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
  #msg {
    width: 100%;
    line-height: 40px;
    font-size: 14px;
    text-align: center;
    margin-bottom: 25px;
  }
  a:link,
  a:visited,
  a:hover,
  a:active {
    margin-left: 100px;
    color: #0366d6;
  }
</style>