<template>
    <footer class="footer-section section" style="background-image: url(assets/images/bg/footer-bg.jpg)">

        <!--Footer Top start-->
        <div class="footer-top section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-60 pb-lg-40 pb-md-30 pb-sm-20 pb-xs-10">
            <div class="container">
                <div class="row row-25">

                    <!--Footer Widget start-->
                    <div class="footer-widget col-lg-3 col-md-6 col-12 mb-40">
                        <img src="assets/images/logo-footer.png" alt="">
                        <p>{{sysDesc}}</p>
                        <div class="footer-social">
                        <a href="#" class="facebook"><i class="fa fa-facebook"></i></a>
                        <a href="#" class="twitter"><i class="fa fa-twitter"></i></a>
                        <a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a>
                        <a href="#" class="google"><i class="fa fa-google-plus"></i></a>
                        <a href="#" class="pinterest"><i class="fa fa-pinterest-p"></i></a>
                        </div>
                    </div>
                    <!--Footer Widget end-->

                    <!--Footer Widget start-->
                    <div class="footer-widget col-lg-3 col-md-6 col-12 mb-40">
                        <h4 class="title"><span class="text">联系我们</span><span class="shape"></span></h4>
                        <ul>
                            <li><i class="fa fa-map-o"></i><span>{{address}}</span></li>
                            <li><i class="fa fa-phone"></i><span>
                                <a href="#" v-for="phone in phones" :key="phone">{{phone}}</a>
                                </span></li>
                            <li><i class="fa fa-envelope-o"></i><span>
                                <a href="#" v-for="mail in mails" :key="mail">{{mail}}</a>
                            </span></li>
                        </ul>
                    </div>
                    <!--Footer Widget end-->

                    <!--Footer Widget start-->
                    <div class="footer-widget col-lg-3 col-md-6 col-12 mb-40">
                        <h4 class="title"><span class="text">友情链接</span><span class="shape"></span></h4>
                        <ul>
                            <li v-for="link in links" :key="link"><a href="#">{{link}}</a></li>
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
    export default {
        props:{
            sysDesc:{
                type:String,
                default:'房产交易平台'
            },
            address: {
                type: String,
                default: "成都市双流区D15 3楼"
            },
            phones: {
                type: Array,
                default() {
                    return ['028-1234567', '028-1234568'];
                }
            },
            mails: {
                type: Array,
                default() {
                    return ['xuetang9@mail.com', 'xuetang9@qq.com'];
                }
            },
            links: {
                type: Array,
                default() {
                    return ['www.xuetang9.com', 'bbs.xuetang9.com', 'bolgs.xuetang9.com', 'localhost.xuetang9.com'];
                }
            }
        }
    }
</script>

<style scoped>

</style>