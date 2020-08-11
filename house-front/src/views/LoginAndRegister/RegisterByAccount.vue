<template>
  <form @submit.prevent="submit">
    <div class="row">
      <div class="col-12 mb-30" :class="{ 'input-error': $v.registerByAccountForm.account.$error }">
        <input type="text" name="username" v-model.trim="$v.registerByAccountForm.account.$model" placeholder="输入用户名">
        <div :class="{ error : !$v.registerByAccountForm.account.required }" class="zone-height">用户名必填</div>
        <div :class="{ error : !$v.registerByAccountForm.account.minLength }" class="zone-height">用户名不得小于 5 个字符</div>
        <div :class="{ error : !$v.registerByAccountForm.account.maxLength }" class="zone-height">用户名不得超过 20  个字符</div>
      </div>
      <div class="col-12 mb-30" :class="{ 'input-error': $v.registerByAccountForm.name.$error }">
        <input type="text" name="username" v-model.trim="$v.registerByAccountForm.name.$model" placeholder="输入真实姓名">
        <div :class="{ error : !$v.registerByAccountForm.name.required }" class="zone-height">姓名必填</div>
      </div>
      <div class="col-12 mb-30" :class="{ 'input-error': $v.registerByAccountForm.nickName.$error }">
        <input type="text" name="username" v-model.trim="$v.registerByAccountForm.nickName.$model" placeholder="输入昵称">
        <div :class="{ error : !$v.registerByAccountForm.nickName.required }" class="zone-height">昵称必填</div>
        <div :class="{ error : !$v.registerByAccountForm.nickName.minLength }" class="zone-height">昵称长度不得小于 5 个字符</div>
        <div :class="{ error : !$v.registerByAccountForm.nickName.maxLength }" class="zone-height">昵称长度不得超过 20 个字符</div>
      </div>
      <div class="col-12 mb-30" :class="{ 'input-error': $v.registerByAccountForm.password.$error }">
        <input type="text" name="username" v-model.trim="$v.registerByAccountForm.password.$model" placeholder="输入密码">
        <div :class="{ error : !$v.registerByAccountForm.password.required }" class="zone-height">密码必填</div>
        <div :class="{ error : !$v.registerByAccountForm.password.minLength }" class="zone-height">密码长度不得小于 6 个字符</div>
        <div :class="{ error : !$v.registerByAccountForm.password.maxLength }" class="zone-height">密码长度不得超过 20 个字符</div>
      </div>
      <div class="col-12 mb-30" :class="{ 'input-error': $v.registerByAccountForm.confirmPassword.$error }">
        <input type="text" name="username" v-model.trim="$v.registerByAccountForm.confirmPassword.$model" placeholder="请确认密码">
        <div :class="{ error : !$v.registerByAccountForm.confirmPassword.required }" class="zone-height">请确认密码</div>
        <div :class="{ error : !$v.registerByAccountForm.confirmPassword.sameAsPassword }" class="zone-height">两次输入密码不一致</div>
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

  export default {
    name: "RegisterByAccount",
    data: () => ({
      registerByAccountForm: {
        account: '',
        name: '',
        nickName: '',
        password: '',
        confirmPassword: ''
      }
    }),
    validations: {
      registerByAccountForm: {
        account: {
          required,
          minLength: minLength(5),
          maxLength: maxLength(20)
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
      }
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
</style>