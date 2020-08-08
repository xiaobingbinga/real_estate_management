<template>
  <footer class="footer-section section">

    <!--Footer Top start-->
    <div class="footer-top section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-60 pb-lg-40 pb-md-30 pb-sm-20 pb-xs-10">
      <div class="container">
        <div class="row row-25">

          <!--Footer Widget start-->
          <div class="footer-widget col-lg-3 col-md-6 col-12 mb-40">
            <img src="@/assets/images/logo-footer.png" alt="">
            <p>房产交易平台the best theme for elit, sed do to eiumod tempor dolor sit amet, ctetur adipiscing elit seddo dolor sit amet.</p>
          </div>
          <!--Footer Widget end-->

          <!--Footer Widget start-->
          <div class="footer-widget col-lg-3 col-md-6 col-12 mb-40">
            <h4 class="title"><span class="text">联系我们</span><span class="shape"></span></h4>
            <ul>
              <li><i class="fa fa-map-o"></i><span>{{ address }}</span></li>
              <li><i class="fa fa-phone"></i><span><a v-for="(phone, index) in phones" :key="index" :href="phone.url">{{ phone.num }}</a></span></li>
              <li><i class="fa fa-envelope-o"></i><span><a v-for="(email, index) in emails" :key="index" :href="email.url">{{ email.email }}</a></span></li>
            </ul>
          </div>
          <!--Footer Widget end-->

          <!--Footer Widget start-->
          <div class="footer-widget col-lg-3 col-md-6 col-12 mb-40">
            <h4 class="title"><span class="text">友情链接</span><span class="shape"></span></h4>
            <ul>
              <li v-for="(link, index) in links" :key="index"><a :href="link.url">{{ link.title }}</a></li>
            </ul>
          </div>
          <!--Footer Widget end-->

          <!--Footer Widget start-->
          <div class="footer-widget col-lg-3 col-md-6 col-12 mb-40">
            <h4 class="title"><span class="text">通讯录</span><span class="shape"></span></h4>

            <p>添加我们的最新的通讯录，您会得到最新房产信息，并且得到最低折扣</p>

            <form id="mc-form" class="mc-form footer-newsletter" >
              <input id="mc-email" type="email" autocomplete="off" placeholder="输入邮箱地址.." />
              <button id="mc-submit"><i class="fa fa-paper-plane-o"></i></button>
            </form>
            <!-- mailchimp-alerts Start -->
            <div class="mailchimp-alerts text-centre">
              <div class="mailchimp-submitting"></div><!-- mailchimp-submitting end -->
              <div class="mailchimp-success"></div><!-- mailchimp-success end -->
              <div class="mailchimp-error"></div><!-- mailchimp-error end -->
            </div><!-- mailchimp-alerts end -->

          </div>
          <!--Footer Widget end-->

        </div>
      </div>
    </div>
    <!--Footer Top end-->

    <!--Footer bottom start-->
    <div class="footer-bottom section">
      <div class="container">
        <div class="row">
          <div class="col-12">
            <div class="copyright text-center">
              <p>Copyright &copy;2018 <a  href="http://www.xuetang9.com">老九学堂</a>. 版权所有.</p>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!--Footer bottom end-->

  </footer>
</template>

<script>
  import {mapGetters} from "vuex";

  export default {
    name: "HouseFooter",
    data(){
      return {
      }
    },
    computed:{
      ...mapGetters('view',['links', 'phones', 'emails', 'address'])
    }
  }
</script>

<style scoped>

</style>