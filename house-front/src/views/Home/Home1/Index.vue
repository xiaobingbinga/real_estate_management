<template>
    <div>
        <house-hero/>
        <house-search/>
        <house-list :list="houseList" title="新增加的房产"/>
        <house-welcome/>
        <house-download/>
        <house-services :serviceHouseList="serviceHouseList"/>

        <house-slider root-class="property-section section pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
                      item-root-class="property-carousel section"
                      title="特色房产"
                      :showPageDot="true"
                      :list="FeatureHouseList"
                      :swiperOption="featureSwiperOption">
            <template #item="{itemData}">
                <div class="property-item col">
                    <house-inner :houseInfo="itemData"/>
                </div>
            </template>
        </house-slider>

        <house-c-t-a/>

        <house-slider
                root-class="agent-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
                item-root-class="agent-carousel section"
                title="我的代理"
                :list="agentList"
                :swiperOption="agentSwiperOption">
            <template #item="{itemData}">
                <div class="col">
                    <div class="agent">
                        <div class="image">
                            <a class="img" href="agent-details.html">
                                <img :src="itemData.photo" alt="">
                            </a>
                        </div>
                        <div class="content">
                            <h4 class="title"><a href="agent-details.html">{{itemData.name}}</a></h4>
                            <a href="#" class="phone">{{itemData.phone}}</a>
                            <a href="#" class="email">{{itemData.email}}</a>
                            <span class="properties">{{itemData.houseCount}}房</span>
                        </div>
                    </div>
                </div>
            </template>
        </house-slider>

        <house-slider root-class="news-section section pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
                      item-root-class="news-carousel section"
                      title="房产新闻"
                      :showPageDot="false"
                      :list="newsList"
                      :swiperOption="newsSwiperOption">
            <template #item="{itemData}">
                <div class="col">
                    <house-news-inner :newsInfo="itemData"/>
                </div>
            </template>
        </house-slider>

        <house-slider root-class="brand-section section pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
                      item-root-class="brand-carousel section"
                      title="合作伙伴"
                      :showPageDot="false"
                      :showArrowButton="false"
                      :list="brandList"
                      :swiperOption="brandSwiperOption">
            <template #item="{itemData}">
                <div class="brand col"><img :src="itemData.pictureUrl" alt=""></div>
            </template>
        </house-slider>

    </div>
</template>

<script>
    // @ is an alias to /src
    import HouseHero from '@/components/components-z/index/Hero.vue'
    import HouseSearch from "@/components/components-z/index/Search.vue";
    import HouseList from '@/components/components-z/index/List.vue'
    import HouseWelcome from "@/components/components-z/index/Welcome.vue";
    import HouseDownload from "@/components/components-z/index/Download.vue";
    import HouseServices from "@/components/components-z/index/Services.vue";
    import HouseCTA from "@/components/components-z/index/CTA.vue";
    import HouseNewsInner from "@/components/components-z/news/HouseNewsInner.vue";

    import houseInner from "@/components/components-z/house/HouseInner";
    import houseSlider from "@/components/components-z/index/MySlider";

    import {mapGetters} from 'vuex'

    export default {
        name: 'Index',
        components: {
            HouseHero,
            HouseSearch,
            HouseList,
            HouseWelcome,
            HouseDownload,
            HouseServices,
            HouseCTA,
            HouseNewsInner,
            houseSlider,
            houseInner
        },
        computed: {
            ...mapGetters('agentList', ['agentList']),
            ...mapGetters('brandList', ['brandList']),
            // ...mapGetters('featureList', ['featureList']),
            // ...mapGetters('houseList', ['houseList']),
            ...mapGetters('newsList', ['newsList']),
            // ...mapGetters('serviceHouseList', ['serviceHouseList'])
        },
        data: () => ({
            featureSwiperOption: {
                slidesPerView: 3,
                spaceBetween: 0,
                loop: true,
                pagination: {
                    el: '.swiper-pagination',
                    clickable: true,
                },
                navigation: {
                    nextEl: '.slick-next',
                    prevEl: '.slick-prev'
                }
            },
            agentSwiperOption: {
                slidesPerView: 4,
                spaceBetween: 0,
                loop: true,
                pagination: {
                    el: '.swiper-pagination',
                    clickable: true,
                },
                navigation: {
                    nextEl: '.slick-next',
                    prevEl: '.slick-prev'
                }
            },
            newsSwiperOption: {
                slidesPerView: 3,
                spaceBetween: 0,
                loop: true,
                pagination: {
                    el: '.swiper-pagination',
                    clickable: true,
                },
                navigation: {
                    nextEl: '.slick-next',
                    prevEl: '.slick-prev'
                }
            },
            brandSwiperOption: {
                slidesPerView: 5,
                spaceBetween: 0,
                loop: true,
                pagination: {
                    el: '.swiper-pagination',
                    clickable: true,
                },
                navigation: {
                    nextEl: '.slick-next',
                    prevEl: '.slick-prev'
                }
            },
            houseList:[],
            serviceHouseList:[],
            FeatureHouseList:[]
        }),
        methods:{
            getHouseList(){
                this.axios.get(process.env.VUE_APP_PROPERTIES + "/properties-add").then(res => {
                    console.log(res)
                    this.houseList = res.data.data
                })
            },
            getServiceHouseList(){
                this.axios.get(process.env.VUE_APP_PROPERTIES + "/list").then(res => {
                    console.log(res)
                    this.serviceHouseList = res.data.data.list
                })
            },
            getFeatureHouseList(){
                this.axios.get(process.env.VUE_APP_PROPERTIES + "/condition-features").then(res => {
                    console.log(res)
                    this.FeatureHouseList = res.data.data
                })
            }
        },
        created() {
            this.getHouseList()
            this.getServiceHouseList()
            this.getFeatureHouseList()
        }
    }
</script>
