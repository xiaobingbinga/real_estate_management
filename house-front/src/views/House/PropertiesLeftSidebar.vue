<template>
    <div>
    <!--Page Banner Section start-->
    <div class="page-banner-section section">
        <div class="container">
            <div class="row">
                <div class="col">
                    <h1 class="page-banner-title">房产</h1>
                    <ul class="page-breadcrumb">
                        <li><a href="index.html">主页</a></li>
                        <li class="active">Properties Left Sidebar</li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <!--Page Banner Section end-->

    <!--New property section start-->
    <div class="property-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50">
        <div class="container">
            <div class="row">
<!--                右侧房产列表-->
                <div class="col-lg-8 col-12 order-1 order-lg-2 mb-sm-50 mb-xs-50">
                    <div class="row">


                        <div v-for="(oneFea,idxFea) in featureList"
                             :key="idxFea"
                             class="property-item col-md-6 col-12 mb-40">
                            <div class="property-inner">
                                <div class="image">
                                    <span v-if="oneFea.isHot === 1" class="label">热门</span>
                                    <span v-if="oneFea.isSpecial === 1" class="label">特色</span>
                                    <a href="single-properties.html">
                                        <img :src="`${oneFea.pictureUrl}`" alt=""></a>
                                    <ul class="property-feature">
                                        <li>
                                            <span class="area">
                                                <img :src="`${publicPath}assets/images/icons/area.png`" alt="">
                                                {{oneFea.square}} 平米</span>
                                        </li>
                                        <li>
                                            <span class="bed">
                                                <img :src="`${publicPath}assets/images/icons/bed.png`" alt="">
                                                {{oneFea.roomNumber}}</span>
                                        </li>
                                        <li>
                                            <span class="bath">
                                                <img :src="`${publicPath}assets/images/icons/bath.png`" alt="">
                                                {{oneFea.bathroomNumber}}</span>
                                        </li>
                                        <li>
                                            <span class="parking">
                                                <img :src="`${publicPath}assets/images/icons/parking.png`" alt="">
                                                {{oneFea.garageNumber}}</span>
                                        </li>
                                    </ul>
                                </div>
                                <div class="content">
                                    <div class="left">
                                        <h3 class="title"><a href="single-properties.html">{{oneFea.title}}</a></h3>
                                        <span class="location">
                                            <img :src="`${publicPath}assets/images/icons/marker.png`" alt="">
                                            {{oneFea.address}}</span>
                                    </div>
                                    <div class="right">
                                        <div class="type-wrap">
                                            <span class="price">￥{{oneFea.price}}</span>
                                            <span v-if="oneFea.leaseType === 1" class="type">出租</span>
                                            <span v-else class="type">出售</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>






                    </div>

                    <div class="row mt-20">
                        <div class="col">

                            <b-pagination
                                    v-model="currentPage"
                                    :total-rows="rows"
                                    :per-page="perPage"
                                    first-number
                                    last-number
                                    prev-text="< 上一页"
                                    next-text="下一页 >"
                                    class="page-pagination"
                                    @change="change"
                            />

                        </div>
                    </div>



                </div>
<!--                左侧搜索栏-->
                <div class="col-lg-4 col-12 order-2 order-lg-1 pr-30 pr-sm-15 pr-xs-15">

                    <!--Sidebar start-->
                    <div class="sidebar">
                        <h4 class="sidebar-title"><span class="text text-select-t">搜索房产</span><span class="shape"></span></h4>


                        <!--Property Search start-->
                        <div class="property-search sidebar-property-search">

                            <from-inner/>

                        </div>
                        <!--Property Search end-->

                    </div>
                    <!--Sidebar end-->

                    <!--Sidebar start-->
                    <div class="sidebar">
                        <h4 class="sidebar-title"><span class="text text-select-t">特别推荐</span><span class="shape"></span></h4>

                        <!--Sidebar Property start-->
                        <div class="sidebar-property-list">

                            <div class="sidebar-property">
                                <div class="image">
                                    <span class="type">出租</span>
                                    <a href="single-properties.html"><img :src="`${publicPath}assets/images/property/sidebar-property-1.jpg`" alt=""></a>
                                </div>
                                <div class="content">
                                    <h5 class="title"><a href="single-properties.html">江南宅院</a></h5>
                                    <span class="location"><img :src="`${publicPath}assets/images/icons/marker.png`" alt="">锦江区东大街下东大街568号</span>
                                    <span class="price">$550 <span>Month</span></span>
                                </div>
                            </div>

                            <div class="sidebar-property">
                                <div class="image">
                                    <span class="type">出售</span>
                                    <a href="single-properties.html"><img :src="`${publicPath}assets/images/property/sidebar-property-2.jpg`" alt=""></a>
                                </div>
                                <div class="content">
                                    <h5 class="title"><a href="single-properties.html">木马山别墅</a></h5>
                                    <span class="location"><img :src="`${publicPath}assets/images/icons/marker.png`" alt="">城北大道450附22号</span>
                                    <span class="price">￥2550</span>
                                </div>
                            </div>

                            <div class="sidebar-property">
                                <div class="image">
                                    <span class="type">出租</span>
                                    <a href="single-properties.html"><img :src="`${publicPath}assets/images/property/sidebar-property-3.jpg`" alt=""></a>
                                </div>
                                <div class="content">
                                    <h5 class="title"><a href="single-properties.html">皇家一号公寓</a></h5>
                                    <span class="location"><img :src="`${publicPath}assets/images/icons/marker.png`" alt="">锦江区福字街215号</span>
                                    <span class="price">$550 <span>Month</span></span>
                                </div>
                            </div>

                        </div>
                        <!--Sidebar Property end-->

                    </div>

                    <!--Sidebar start-->
                    <div class="sidebar">
                        <h4 class="sidebar-title"><span class="text text-select-t">顶级代理人</span><span class="shape"/></h4>

                        <!--Sidebar Agents start-->
                        <div class="sidebar-agent-list">

                            <div class="sidebar-agent">
                                <div class="image">
                                    <a href="single-properties.html"><img :src="`${publicPath}assets/images/agent/agent-1.jpg`" alt=""></a>
                                </div>
                                <div class="content">
                                    <h5 class="title"><a href="single-properties.html">Donald Palmer</a></h5>
                                    <a href="#" class="phone">(756) 447 5779</a>
                                    <span class="properties">5房</span>
                                    <div class="social">
                                        <a href="#" class="facebook"><i class="fa fa-facebook"/></a>
                                        <a href="#" class="twitter"><i class="fa fa-twitter"/></a>
                                        <a href="#" class="linkedin"><i class="fa fa-linkedin"/></a>
                                        <a href="#" class="google"><i class="fa fa-google-plus"/></a>
                                    </div>
                                </div>
                            </div>

                            <div class="sidebar-agent">
                                <div class="image">
                                    <a href="single-properties.html"><img :src="`${publicPath}assets/images/agent/agent-2.jpg`" alt=""></a>
                                </div>
                                <div class="content">
                                    <h5 class="title"><a href="single-properties.html">Sean Hamilton</a></h5>
                                    <a href="#" class="phone">(756) 447 5779</a>
                                    <span class="properties">5房</span>
                                    <div class="social">
                                        <a href="#" class="facebook"><i class="fa fa-facebook"/></a>
                                        <a href="#" class="twitter"><i class="fa fa-twitter"/></a>
                                        <a href="#" class="instagram"><i class="fa fa-instagram"/></a>
                                    </div>
                                </div>
                            </div>

                            <div class="sidebar-agent">
                                <div class="image">
                                    <a href="single-properties.html"><img :src="`${publicPath}assets/images/agent/agent-3.jpg`" alt=""></a>
                                </div>
                                <div class="content">
                                    <h5 class="title"><a href="single-properties.html">Christine Gilbert</a></h5>
                                    <a href="#" class="phone">(756) 447 5779</a>
                                    <span class="properties">5房</span>
                                    <div class="social">
                                        <a href="#" class="facebook"><i class="fa fa-facebook"/></a>
                                        <a href="#" class="twitter"><i class="fa fa-twitter"/></a>
                                        <a href="#" class="skype"><i class="fa fa-skype"/></a>
                                        <a href="#" class="pinterest"><i class="fa fa-pinterest"/></a>
                                    </div>
                                </div>
                            </div>

                        </div>
                        <!--Sidebar Agents end-->

                    </div>

                    <!--Sidebar start-->
                    <div class="sidebar">
                        <h4 class="sidebar-title"><span class="text text-select-t">热门标签</span><span class="shape"/></h4>

                        <!--Sidebar Tags start-->
                        <div class="sidebar-tags">
                            <a href="#">Houses</a>
                            <a href="#">Real Home</a>
                            <a href="#">Baths</a>
                            <a href="#">Beds</a>
                            <a href="#">Garages</a>
                            <a href="#">Family</a>
                            <a href="#">Real Estates</a>
                            <a href="#">Properties</a>
                            <a href="#">Location</a>
                            <a href="#">Price</a>
                        </div>
                        <!--Sidebar Tags end-->

                    </div>

                </div>

            </div>
        </div>
    </div>
    <!--New property section end-->
    </div>
</template>

<script>
    import FromInner from "../../components/components-j/home/FromInner";
    // import {mapGetters} from "vuex"
    export default {
        components:{FromInner},
        data() {
            return {
                currHouse: [],//分页数据
                rows: 60,//数据总条数
                perPage: 6,//每页显示数据
                currentPage: 1,//当前页数
                featureList:null,//房产数据
                publicPath: process.env.BASE_URL//路径数据
            }
        },
        computed:{
            // ...mapGetters('featureList',['featureList'])
        },
        methods:{
            setCondition(){
                console.log(this.$route.params.condition);
                if (this.$route.params.condition != null){
                    this.axios.post('/p/properties/condition',this.$route.params.condition)
                        .then(result => {
                            this.featureList = result.data.data;
                        });
                }else {
                    this.axios.post('/p/properties/list',{pageNum:this.currentPage,pageSize:this.perPage})
                        .then(result => {
                            this.featureList = result.data.data;
                        });
                }

            }
        },
        created() {
            this.setCondition();
        }
    }
</script>

<style scoped>
    ::v-deep .text-select-t{
        font-size: 18px !important;
        font-weight: 600 !important;
    }
    ::v-deep .active button{
        background-color: #004395 !important;
        border-color: #004395 !important;
        color: #fff !important;
    }
    ::v-deep .page-pagination li:first-child button,
    ::v-deep .page-pagination li:first-child span{
        color: #222222;
        width: auto !important;
        padding: 10px 20px !important;
    }
    ::v-deep .page-pagination li:last-child button,
    ::v-deep .page-pagination li:last-child span{
        color: #222222;
        width: auto !important;
        padding: 10px 20px !important;
    }
    ::v-deep .page-pagination li button,
    ::v-deep .page-pagination li span{
        color: #222222;
        background-color: #f8f8f8;
        padding: 10px !important;
        border-radius: 50px !important;
        width: 44px !important;
        height: 44px !important;
    }


</style>