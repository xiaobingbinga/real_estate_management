<template>
  <div>
    <!--Hero Section start-->
    <div class="hero-section section position-relative">
      <!--Hero Map-->
      <div id="hero-map">
          <template>
              <div>
                  <baidu-map
                          class="bm-view"
                          :center="city"
                          :zoom="zoom">
                    <bm-scale anchor="BMAP_ANCHOR_TOP_RIGHT"></bm-scale>
                    <bm-navigation anchor="BMAP_ANCHOR_TOP_RIGHT"></bm-navigation>
                  </baidu-map>
              </div>
          </template>
      </div>
      <!--Hero Map Property Controler-->
      <div class="map-property-controls"></div>
    </div>
    <!--Hero Section end-->

    <!--搜索 start-->
    <house-search @getCity="setCity"></house-search>
    <!--搜索 end-->

    <!--特色房产 start-->
    <house-module
      title="特色房产"
      rootClass="property-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-60 pb-lg-40 pb-md-30 pb-sm-20 pb-xs-10"
      contentClass="property-carousel section"
      rowClass="row"
      num="3">
      <template #content>
        <house-slider
          :items="featureProperties"
          :num="3">
          <template #item="{item}">
            <house-property :property="item"></house-property>
          </template>
        </house-slider>
      </template>
    </house-module>
    <!--特色房产 end-->

    <!--欢迎模块 start-->
    <house-welcome></house-welcome>
    <!--欢迎模块 end-->

    <!--下载 start-->
    <house-download></house-download>
    <!--下载 end-->

    <!--服务 start-->
    <house-module
      title="我们的服务"
      rootClass="property-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-60 pb-lg-40 pb-md-30 pb-sm-20 pb-xs-10"
      rowClass="row row-30 align-items-center"
      leftClass="col-lg-5 col-12 mb-30"
      rightClass="col-lg-7 col-12">
      <template #left>
        <house-slider
          :items="[1,2]"
          :showDot="false"
          :num="1"
          :showArrow="false"
          :showArrowBottom="true">
          <template #item>
            <div class="property-2">
                <div class="property-inner">
                  <a href="single-properties.html" class="image"><img src="assets/images/property/property-13.jpg" alt=""></a>
                  <div class="content">
                    <h4 class="title"><a href="single-properties.html">江南宅院</a></h4>
                    <span class="location">成都双流机场大道568</span>
                    <h4 class="type">出租 <span>￥550 <span>月</span></span></h4>
                    <ul>
                      <li>6卧</li>
                      <li>4卫</li>
                      <li>3车位</li>
                    </ul>
                  </div>
                </div>
              </div>
          </template>
        </house-slider>
      </template>
      <template #right>
        <div class="row row-20">

          <!--Service start-->
          <div class="col-md-6 col-12 mb-30">
            <div class="service">
              <div class="service-inner">
                <div class="head">
                  <div class="icon"><img src="assets/images/service/service-1.png" alt=""></div>
                  <h4>房产购买</h4>
                </div>
                <div class="content">
                  <p>房产交易属于大宗资产交易，市场准入有风险呢，请买卖双方自律。</p>
                </div>
              </div>
            </div>
          </div>
          <!--Service end-->

          <!--Service start-->
          <div class="col-md-6 col-12 mb-30">
            <div class="service">
              <div class="service-inner">
                <div class="head">
                  <div class="icon"><img src="assets/images/service/service-2.png" alt=""></div>
                  <h4>售卖房产</h4>
                </div>
                <div class="content">
                  <p>房产交易属于大宗资产交易，市场准入有风险呢，请买卖双方自律。</p>
                </div>
              </div>
            </div>
          </div>
          <!--Service end-->

          <!--Service start-->
          <div class="col-md-6 col-12 mb-30">
            <div class="service">
              <div class="service-inner">
                <div class="head">
                  <div class="icon"><img src="assets/images/service/service-3.png" alt=""></div>
                  <h4>房产租赁</h4>
                </div>
                <div class="content">
                  <p>房产交易属于大宗资产交易，市场准入有风险呢，请买卖双方自律。</p>
                </div>
              </div>
            </div>
          </div>
          <!--Service end-->

          <!--Service start-->
          <div class="col-md-6 col-12 mb-30">
            <div class="service">
              <div class="service-inner">
                <div class="head">
                  <div class="icon"><img src="assets/images/service/service-4.png" alt=""></div>
                  <h4>房产抵押</h4>
                </div>
                <div class="content">
                  <p>房产交易属于大宗资产交易，市场准入有风险呢，请买卖双方自律。</p>
                </div>
              </div>
            </div>
          </div>
          <!--Service end-->

        </div>
      </template>
    </house-module>
    <!--服务 end-->

    <!--新增房产 start-->
    <house-module
      title="新增加的房产"
      rootClass="news-section section pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
      rowClass="row"
      contentClass="news-carousel section row">
      <template #content>
        <house-property v-for="(newProperty,i) in newProperties"
                        :property="newProperty"
                        :key="i"
                        propertyClass="property-item col-lg-4 col-md-6 col-12 mb-40">

        </house-property>
      </template>
      <template #right>
        <div class="row row-20">

          <!--Service start-->
          <div class="col-md-6 col-12 mb-30">
            <div class="service">
              <div class="service-inner">
                <div class="head">
                  <div class="icon"><img src="assets/images/service/service-1.png" alt=""></div>
                  <h4>房产购买</h4>
                </div>
                <div class="content">
                  <p>房产交易属于大宗资产交易，市场准入有风险呢，请买卖双方自律。</p>
                </div>
              </div>
            </div>
          </div>
          <!--Service end-->

          <!--Service start-->
          <div class="col-md-6 col-12 mb-30">
            <div class="service">
              <div class="service-inner">
                <div class="head">
                  <div class="icon"><img src="assets/images/service/service-2.png" alt=""></div>
                  <h4>售卖房产</h4>
                </div>
                <div class="content">
                  <p>房产交易属于大宗资产交易，市场准入有风险呢，请买卖双方自律。</p>
                </div>
              </div>
            </div>
          </div>
          <!--Service end-->

          <!--Service start-->
          <div class="col-md-6 col-12 mb-30">
            <div class="service">
              <div class="service-inner">
                <div class="head">
                  <div class="icon"><img src="assets/images/service/service-3.png" alt=""></div>
                  <h4>房产租赁</h4>
                </div>
                <div class="content">
                  <p>房产交易属于大宗资产交易，市场准入有风险呢，请买卖双方自律。</p>
                </div>
              </div>
            </div>
          </div>
          <!--Service end-->

          <!--Service start-->
          <div class="col-md-6 col-12 mb-30">
            <div class="service">
              <div class="service-inner">
                <div class="head">
                  <div class="icon"><img src="assets/images/service/service-4.png" alt=""></div>
                  <h4>房产抵押</h4>
                </div>
                <div class="content">
                  <p>房产交易属于大宗资产交易，市场准入有风险呢，请买卖双方自律。</p>
                </div>
              </div>
            </div>
          </div>
          <!--Service end-->

        </div>
      </template>
    </house-module>
    <!--新增房产 end-->

    <!--数据模块 start-->
    <div class="funfact-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-70 pb-lg-50 pb-md-40 pb-sm-30 pb-xs-20" style="background-image: url(assets/images/bg/cta-bg.jpg)">
      <div class="container">
        <div class="row">

          <!--Funfact start-->
          <div class="single-fact col-lg-3 col-6 mb-30">
            <div class="inner">
              <div class="head">
                <i class="pe-7s-home"></i>
                <h3 class="counter">854</h3>
              </div>
              <p>完整项目</p>
            </div>
          </div>
          <!--Funfact end-->

          <!--Funfact start-->
          <div class="single-fact col-lg-3 col-6 mb-30">
            <div class="inner">
              <div class="head">
                <i class="pe-7s-graph3"></i>
                <h3 class="counter">854</h3>
              </div>
              <p>已售房产</p>
            </div>
          </div>
          <!--Funfact end-->

          <!--Funfact start-->
          <div class="single-fact col-lg-3 col-6 mb-30">
            <div class="inner">
              <div class="head">
                <i class="pe-7s-users"></i>
                <h3 class="counter">854</h3>
              </div>
              <p>幸运客户</p>
            </div>
          </div>
          <!--Funfact end-->

          <!--Funfact start-->
          <div class="single-fact col-lg-3 col-6 mb-30">
            <div class="inner">
              <div class="head">
                <i class="pe-7s-medal"></i>
                <h3 class="counter">854</h3>
              </div>
              <p>幸运抽奖</p>
            </div>
          </div>
          <!--Funfact end-->

        </div>
      </div>
    </div>
    <!--数据模块 end-->

    <!--我的代理 start-->
    <house-module
      title="我的代理"
      rootClass="agent-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
      contentClass="agent-carousel section"
      rowClass="row">
      <template #content>
        <house-slider
          :items="agents"
          :num="4"
          :showDot="false">
          <template #item="{item}">
            <house-agent :agent="item"></house-agent>
          </template>
        </house-slider>
      </template>
    </house-module>
    <!--我的代理 end-->

    <!--客户留言 start-->
    <house-module
      title="客户留言"
      rootClass="testimonial-section section bg-gray pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
      contentClass="review-slider section"
      rowClass="row">
      <template #content>
        <house-slider
          :items="agents"
          :num="3"
          :showDot="false">
          <template #item>
            <house-review></house-review>
          </template>
        </house-slider>
      </template>
    </house-module>
    <!--客户留言 end-->

    <!--新闻 start-->
    <house-module
      title="房产最近新闻"
      rootClass="news-section section pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
      contentClass="news-carousel section"
      rowClass="row">
      <template #content>
        <house-slider
          :items="news"
          :num="3"
          :showDot="false">
          <template #item="{item}">
            <house-news :news="item"></house-news>
          </template>
        </house-slider>
      </template>
    </house-module>
    <!--新闻 end-->

    <!--合作伙伴 start-->
    <house-module
      title="合作伙伴"
      rootClass="news-section section pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
      contentClass="news-carousel section"
      rowClass="row">
      <template #content>
        <house-slider
          :items="['1','2','3','4','5','6']"
          :num="5"
          :showDot="false"
          :showArrow="false">
          <template #item="{item}">
            <div class="brand col"><img :src="`${publicPath}assets/images/brands/brand-${item}.png`" alt=""></div>
          </template>
        </house-slider>
      </template>
    </house-module>
    <!--合作伙伴 end-->
  </div>
</template>

<script>
  import houseWelcome from "@/components/components-w/Home/Welcome"
  import houseDownload from "@/components/components-w/Home/Download"
  import houseSlider from "@/components/components-w/Slider"
  import houseProperty from "@/components/components-w/Property"
  import houseAgent from "@/components/components-w/Agent"
  import houseReview from "@/components/components-w/Home/Review"
  import houseNews from "@/components/components-w/News"
  import BaiduMap from 'vue-baidu-map/components/map/Map.vue'

    export default {
        name: "index",
        components: {
            houseSlider,
            houseProperty,
            houseWelcome,
            houseDownload,
            houseAgent,
            houseReview,
            houseNews,
            BaiduMap
        },
        data() {
            return {
                city: "成都",
                zoom: 15,
                featureProperties: [
                    {
                        id: 1,
                        isHot: false,
                        isNew: false,
                        isAd: false,
                        isSpecial: false,
                        pictureUrl: 'assets/images/property/property-1.jpg',
                        square: 5,
                        roomNumber: 6,
                        bathroomNumber: 6,
                        garageNumber: 6,
                        title: '大豪宅',
                        address: '锦江区东大街下东大街568号',
                        price: '550',
                        typeName: '出售'
                    },
                    {
                        id: 1,
                        isHot: false,
                        isNew: false,
                        isAd: false,
                        isSpecial: false,
                        pictureUrl: 'assets/images/property/property-2.jpg',
                        square: 5,
                        roomNumber: 6,
                        bathroomNumber: 6,
                        garageNumber: 6,
                        title: '江南宅院',
                        address: '锦江区东大街下东大街568号',
                        price: '550',
                        typeName: '出售'
                    },
                    {
                        id: 1,
                        isHot: false,
                        isNew: false,
                        isAd: false,
                        isSpecial: false,
                        pictureUrl: 'assets/images/property/property-3.jpg',
                        square: 5,
                        roomNumber: 6,
                        bathroomNumber: 6,
                        garageNumber: 6,
                        title: '江南宅院',
                        address: '锦江区东大街下东大街568号',
                        price: '550',
                        typeName: '出售'
                    },
                    {
                        id: 1,
                        isHot: false,
                        isNew: false,
                        isAd: false,
                        isSpecial: false,
                        pictureUrl: 'assets/images/property/property-4.jpg',
                        square: 5,
                        roomNumber: 6,
                        bathroomNumber: 6,
                        garageNumber: 6,
                        title: '江南宅院',
                        address: '锦江区东大街下东大街568号',
                        price: '550',
                        typeName: '出售'
                    },
                    {
                        id: 1,
                        isHot: false,
                        isNew: false,
                        isAd: false,
                        isSpecial: false,
                        pictureUrl: 'assets/images/property/property-5.jpg',
                        square: 5,
                        roomNumber: 6,
                        bathroomNumber: 6,
                        garageNumber: 6,
                        title: '江南宅院',
                        address: '锦江区东大街下东大街568号',
                        price: '550',
                        typeName: '出售'
                    },
                    {
                        id: 1,
                        isHot: false,
                        isNew: false,
                        isAd: false,
                        isSpecial: false,
                        pictureUrl: 'assets/images/property/property-6.jpg',
                        square: 5,
                        roomNumber: 6,
                        bathroomNumber: 6,
                        garageNumber: 6,
                        title: '江南宅院',
                        address: '锦江区东大街下东大街568号',
                        price: '550',
                        typeName: '出售'
                    }
                ],
                newProperties: [
                    {
                        id: 1,
                        isHot: false,
                        isNew: true,
                        isAd: false,
                        isSpecial: false,
                        pictureUrl: 'assets/images/property/property-1.jpg',
                        square: 5,
                        roomNumber: 6,
                        bathroomNumber: 6,
                        garageNumber: 6,
                        title: '大豪宅',
                        address: '锦江区东大街下东大街568号',
                        price: '550',
                        typeName: '出售'
                    },
                    {
                        id: 1,
                        isHot: false,
                        isNew: true,
                        isAd: false,
                        isSpecial: false,
                        pictureUrl: 'assets/images/property/property-2.jpg',
                        square: 5,
                        roomNumber: 6,
                        bathroomNumber: 6,
                        garageNumber: 6,
                        title: '江南宅院',
                        address: '锦江区东大街下东大街568号',
                        price: '550',
                        typeName: '出售'
                    },
                    {
                        id: 1,
                        isHot: false,
                        isNew: true,
                        isAd: false,
                        isSpecial: false,
                        pictureUrl: 'assets/images/property/property-3.jpg',
                        square: 5,
                        roomNumber: 6,
                        bathroomNumber: 6,
                        garageNumber: 6,
                        title: '江南宅院',
                        address: '锦江区东大街下东大街568号',
                        price: '550',
                        typeName: '出售'
                    },
                    {
                        id: 1,
                        isHot: false,
                        isNew: true,
                        isAd: false,
                        isSpecial: false,
                        pictureUrl: 'assets/images/property/property-4.jpg',
                        square: 5,
                        roomNumber: 6,
                        bathroomNumber: 6,
                        garageNumber: 6,
                        title: '江南宅院',
                        address: '锦江区东大街下东大街568号',
                        price: '550',
                        typeName: '出售'
                    },
                    {
                        id: 1,
                        isHot: false,
                        isNew: true,
                        isAd: false,
                        isSpecial: false,
                        pictureUrl: 'assets/images/property/property-5.jpg',
                        square: 5,
                        roomNumber: 6,
                        bathroomNumber: 6,
                        garageNumber: 6,
                        title: '江南宅院',
                        address: '锦江区东大街下东大街568号',
                        price: '550',
                        typeName: '出售'
                    },
                    {
                        id: 1,
                        isHot: false,
                        isNew: true,
                        isAd: false,
                        isSpecial: false,
                        pictureUrl: 'assets/images/property/property-6.jpg',
                        square: 5,
                        roomNumber: 6,
                        bathroomNumber: 6,
                        garageNumber: 6,
                        title: '江南宅院',
                        address: '锦江区东大街下东大街568号',
                        price: '550',
                        typeName: '出售'
                    }
                ],
                agents: [
                    {
                        id: 1,
                        photo: 'assets/images/agent/agent-1.jpg',
                        name: '唐纳德.菲尔',
                        phone: '(756) 447 5779',
                        email: 'info@example.com',
                        properties: 5
                    },
                    {
                        id: 1,
                        photo: 'assets/images/agent/agent-2.jpg',
                        name: '唐纳德.菲尔',
                        phone: '(756) 447 5779',
                        email: 'info@example.com',
                        properties: 5
                    },
                    {
                        id: 1,
                        photo: 'assets/images/agent/agent-3.jpg',
                        name: '唐纳德.菲尔',
                        phone: '(756) 447 5779',
                        email: 'info@example.com',
                        properties: 5
                    },
                    {
                        id: 1,
                        photo: 'assets/images/agent/agent-4.jpg',
                        name: '唐纳德.菲尔',
                        phone: '(756) 447 5779',
                        email: 'info@example.com',
                        properties: 5
                    },
                    {
                        id: 1,
                        photo: 'assets/images/agent/agent-5.jpg',
                        name: '唐纳德.菲尔',
                        phone: '(756) 447 5779',
                        email: 'info@example.com',
                        properties: 5
                    }
                ],
                reviews: [
                    {
                        id: 1,
                    }
                ],
                news: [
                    {
                        id: 1,
                        userId: 1,
                        imageUrl: 'assets/images/news/news-1.jpg',
                        name: '唐纳德',
                        issuingTime: '2018年12月30日',
                        title: '豪华公寓楼',
                        content: '房产交易平台 the best theme for  elit, sed do to eiumod tempor dolor sit amet.',
                    },
                    {
                        id: 1,
                        userId: 1,
                        imageUrl: 'assets/images/news/news-2.jpg',
                        name: '唐纳德',
                        issuingTime: '2018年12月30日',
                        title: '豪华公寓楼',
                        content: '房产交易平台 the best theme for  elit, sed do to eiumod tempor dolor sit amet.',
                    },
                    {
                        id: 1,
                        userId: 1,
                        imageUrl: 'assets/images/news/news-3.jpg',
                        name: '唐纳德',
                        issuingTime: '2018年12月30日',
                        title: '豪华公寓楼',
                        content: '房产交易平台 the best theme for  elit, sed do to eiumod tempor dolor sit amet.',
                    },
                ],
                publicPath: process.env.BASE_URL
            }
        },
        methods: {
            setCity(location) {
                this.city = location
            }
        }
    }
</script>

<style scoped>
    .bm-view {
        width: 100%;
        height: calc(100vh - 90px);
    }
</style>