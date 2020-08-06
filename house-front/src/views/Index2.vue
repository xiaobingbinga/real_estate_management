<template>
    <div>
<!--        第一栏-->
        <hero-slot :list="heroList" :show-page-dot="false">
        <template #item="{itemData}">
            <Hero-inner :hero-info="itemData"></Hero-inner>
        </template>
        </hero-slot>

<!--        第二栏-->
        <div class="search-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50">
            <div class="container">

                <!--Section Title start-->
                <div class="row">
                    <div class="col-md-12 mb-60 mb-xs-30">
                        <div class="section-title center">
                            <h1>找到您的房子</h1>
                        </div>
                    </div>
                </div>
                <!--Section Title end-->

                <div class="row">
                    <div class="col">

                        <!--Property Search start-->
                        <div class="property-search">

                            <form action="#">

                                <div>
                                    <input type="text" placeholder="位置">
                                </div>

                                <div>
                                    <select class="nice-select">
                                        <option>所有城市</option>
                                        <option>北京</option>
                                        <option>上海</option>
                                        <option>广州</option>
                                        <option>深圳</option>
                                        <option>成都</option>
                                        <option>重庆</option>
                                        <option>武汉</option>
                                        <option>沈阳</option>
                                        <option>福州</option>
                                        <option>厦门</option>
                                        <option>银川</option>
                                        <option>拉萨</option>
                                        <option>绵阳</option>
                                        <option>遂宁</option>
                                        <option>攀枝花</option>
                                        <option>简阳</option>
                                        <option>德阳</option>
                                        <option>金堂</option>
                                        <option>泸州</option>
                                        <option>内江</option>
                                        <option>阆中</option>
                                    </select>
                                </div>

                                <div>
                                    <select class="nice-select">
                                        <option>租房</option>
                                        <option>卖房</option>
                                    </select>
                                </div>

                                <div>
                                    <select class="nice-select">
                                        <option>类型</option>
                                        <option>公寓</option>
                                        <option>咖啡馆</option>
                                        <option>住宅</option>
                                        <option>餐馆</option>
                                        <option>商店</option>
                                        <option>别墅</option>
                                    </select>
                                </div>

                                <div>
                                    <select class="nice-select">
                                        <option>房间数</option>
                                        <option>1</option>
                                        <option>2</option>
                                        <option>3</option>
                                        <option>4</option>
                                        <option>5</option>
                                        <option>6</option>
                                    </select>
                                </div>

                                <div>
                                    <select class="nice-select">
                                        <option>卫生间数</option>
                                        <option>1</option>
                                        <option>2</option>
                                        <option>3</option>
                                        <option>4</option>
                                        <option>5</option>
                                        <option>6</option>
                                    </select>
                                </div>

                                <div>
                                    <div id="search-price-range"></div>
                                </div>

                                <div>
                                    <button>搜索</button>
                                </div>

                            </form>

                        </div>
                        <!--Property Search end-->

                    </div>
                </div>

            </div>
        </div>

<!--        第三栏-->
        <MySlot
                rootClass="property-section section bg-gray pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
                title="特色房产"
                itemRootClass="property-carousel section"
                :list="houseList"
                :show-page-dot="true">
            <template #item="{itemData}">
                <div class="property-item col">

                    <house-inner :houseInfo="itemData"></house-inner>

                </div>
            </template>
        </MySlot>

<!--        第四栏-->
        <div class="feature-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50">
            <div class="container">

                <div class="feature-wrap row row-25">

                    <!--Feature start-->
                    <div class="col-lg-4 col-sm-6 col-12 mb-50">
                        <div class="feature">
                            <div class="icon"><i class="pe-7s-piggy"></i></div>
                            <div class="content">
                                <h4>低价房</h4>
                                <p>便宜无好货，好货不便宜。。。请消费者自律呢</p>
                            </div>
                        </div>
                    </div>
                    <!--Feature end-->

                    <!--Feature start-->
                    <div class="col-lg-4 col-sm-6 col-12 mb-50">
                        <div class="feature">
                            <div class="icon"><i class="pe-7s-science"></i></div>
                            <div class="content">
                                <h4>现代设计</h4>
                                <p>便宜无好货，好货不便宜。。。请消费者自律呢</p>
                            </div>
                        </div>
                    </div>
                    <!--Feature end-->

                    <!--Feature start-->
                    <div class="col-lg-4 col-sm-6 col-12 mb-50">
                        <div class="feature">
                            <div class="icon"><i class="pe-7s-display1"></i></div>
                            <div class="content">
                                <h4>优质房源</h4>
                                <p>便宜无好货，好货不便宜。。。请消费者自律呢</p>
                            </div>
                        </div>
                    </div>
                    <!--Feature end-->

                    <!--Feature start-->
                    <div class="col-lg-4 col-sm-6 col-12 mb-50">
                        <div class="feature">
                            <div class="icon"><i class="pe-7s-signal"></i></div>
                            <div class="content">
                                <h4>免费Wifi</h4>
                                <p>便宜无好货，好货不便宜。。。请消费者自律呢</p>
                            </div>
                        </div>
                    </div>
                    <!--Feature end-->

                    <!--Feature start-->
                    <div class="col-lg-4 col-sm-6 col-12 mb-50">
                        <div class="feature">
                            <div class="icon"><i class="pe-7s-map"></i></div>
                            <div class="content">
                                <h4>最容易查找房源</h4>
                                <p>便宜无好货，好货不便宜。。。请消费者自律呢</p>
                            </div>
                        </div>
                    </div>
                    <!--Feature end-->

                    <!--Feature start-->
                    <div class="col-lg-4 col-sm-6 col-12 mb-50">
                        <div class="feature">
                            <div class="icon"><i class="pe-7s-shield"></i></div>
                            <div class="content">
                                <h4>最可靠房源</h4>
                                <p>便宜无好货，好货不便宜。。。请消费者自律呢</p>
                            </div>
                        </div>
                    </div>
                    <!--Feature end-->

                </div>

            </div>
        </div>

<!--        第五栏-->
        <div class="download-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50" style="background-image: url(assets/images/bg/download-bg.jpg)">
            <div class="container">
                <div class="row">
                    <div class="col-12">

                        <!--Download Content start-->
                        <div class="download-content">
                            <h1>下载 <span>老九学堂</span> App <br>获取最新最优质房源信息</h1>
                            <div class="buttons">
                                <a href="#">
                                    <i class="fa fa-apple"></i>
                                    <span class="text">

                                    Apple Store
                                </span>
                                </a>
                                <a href="#">
                                    <i class="fa fa-android"></i>
                                    <span class="text">

                                    Android Play
                                </span>
                                </a>
                            </div>
                            <div class="image"><img src="assets/images/others/app.png" alt=""></div>
                        </div>
                        <!--Download Content end-->

                    </div>
                </div>
            </div>
        </div>

<!--        第六栏-->
        <div class="service-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-70 pb-lg-50 pb-md-40 pb-sm-30 pb-xs-20">
            <div class="container">

                <!--Section Title start-->
                <div class="row">
                    <div class="col-md-12 mb-60 mb-xs-30">
                        <div class="section-title center">
                            <h1>我们的服务</h1>
                        </div>
                    </div>
                </div>
                <!--Section Title end-->

                <div class="row row-30 align-items-center">
                    <div class="col-lg-5 col-12 mb-30">
                        <property-slot :list="proList">
                            <template #item="{itemData}">
                                <div class="property-2">
                                    <div class="property-inner">
                                        <a href="single-properties.html" class="image"><img :src="itemData.imgUrl" alt=""></a>
                                        <div class="content">
                                            <h4 class="title"><a href="single-properties.html">{{itemData.title}}</a></h4>
                                            <span class="location">{{itemData.location}}</span>
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
                        </property-slot>




                    </div>
                    <div class="col-lg-7 col-12">
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
                    </div>
                </div>

            </div>
        </div>

<!--        第七栏-->
        <div class="property-section section pb-60 pb-lg-40 pb-md-30 pb-sm-20 pb-xs-10">
            <div class="container">

                <!--Section Title start-->
                <div class="row">
                    <div class="col-md-12 mb-60 mb-xs-30">
                        <div class="section-title center">
                            <h1>新增加的房产</h1>
                        </div>
                    </div>
                </div>
                <!--Section Title end-->

                <div class="row">

                    <!--Property start-->
                    <div class="property-item col-lg-4 col-md-6 col-12 mb-40">
                        <div class="property-inner">
                            <div class="image">
                                <a href="single-properties.html"><img src="assets/images/property/property-1.jpg" alt=""></a>
                                <ul class="property-feature">
                                    <li>
                                        <span class="area"><img src="assets/images/icons/area.png" alt="">550 平米</span>
                                    </li>
                                    <li>
                                        <span class="bed"><img src="assets/images/icons/bed.png" alt="">6</span>
                                    </li>
                                    <li>
                                        <span class="bath"><img src="assets/images/icons/bath.png" alt="">4</span>
                                    </li>
                                    <li>
                                        <span class="parking"><img src="assets/images/icons/parking.png" alt="">3</span>
                                    </li>
                                </ul>
                            </div>
                            <div class="content">
                                <div class="left">
                                    <h3 class="title"><a href="single-properties.html">江南宅院</a></h3>
                                    <span class="location"><img src="assets/images/icons/marker.png" alt="">锦江区东大街下东大街568号</span>
                                </div>
                                <div class="right">
                                    <div class="type-wrap">
                                        <span class="price">￥550<span>月</span></span>
                                        <span class="type">出租</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--Property end-->

                    <!--Property start-->
                    <div class="property-item col-lg-4 col-md-6 col-12 mb-40">
                        <div class="property-inner">
                            <div class="image">
                                <span class="label">特色</span>
                                <a href="single-properties.html"><img src="assets/images/property/property-2.jpg" alt=""></a>
                                <ul class="property-feature">
                                    <li>
                                        <span class="area"><img src="assets/images/icons/area.png" alt="">550 平米</span>
                                    </li>
                                    <li>
                                        <span class="bed"><img src="assets/images/icons/bed.png" alt="">6</span>
                                    </li>
                                    <li>
                                        <span class="bath"><img src="assets/images/icons/bath.png" alt="">4</span>
                                    </li>
                                    <li>
                                        <span class="parking"><img src="assets/images/icons/parking.png" alt="">3</span>
                                    </li>
                                </ul>
                            </div>
                            <div class="content">
                                <div class="left">
                                    <h3 class="title"><a href="single-properties.html">木马山别墅</a></h3>
                                    <span class="location"><img src="assets/images/icons/marker.png" alt="">城北大道450附22号</span>
                                </div>
                                <div class="right">
                                    <div class="type-wrap">
                                        <span class="price">￥2550</span>
                                        <span class="type">出售</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--Property end-->

                    <!--Property start-->
                    <div class="property-item col-lg-4 col-md-6 col-12 mb-40">
                        <div class="property-inner">
                            <div class="image">
                                <span class="label">热门</span>
                                <a href="single-properties.html"><img src="assets/images/property/property-3.jpg" alt=""></a>
                                <ul class="property-feature">
                                    <li>
                                        <span class="area"><img src="assets/images/icons/area.png" alt="">550 平米</span>
                                    </li>
                                    <li>
                                        <span class="bed"><img src="assets/images/icons/bed.png" alt="">6</span>
                                    </li>
                                    <li>
                                        <span class="bath"><img src="assets/images/icons/bath.png" alt="">4</span>
                                    </li>
                                    <li>
                                        <span class="parking"><img src="assets/images/icons/parking.png" alt="">3</span>
                                    </li>
                                </ul>
                            </div>
                            <div class="content">
                                <div class="left">
                                    <h3 class="title"><a href="single-properties.html">皇家一号公寓</a></h3>
                                    <span class="location"><img src="assets/images/icons/marker.png" alt="">锦江区福字街215号</span>
                                </div>
                                <div class="right">
                                    <div class="type-wrap">
                                        <span class="price">￥550<span>月</span></span>
                                        <span class="type">出租</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--Property end-->

                    <!--Property start-->
                    <div class="property-item col-lg-4 col-md-6 col-12 mb-40">
                        <div class="property-inner">
                            <div class="image">
                                <a href="single-properties.html"><img src="assets/images/property/property-4.jpg" alt=""></a>
                                <ul class="property-feature">
                                    <li>
                                        <span class="area"><img src="assets/images/icons/area.png" alt="">550 平米</span>
                                    </li>
                                    <li>
                                        <span class="bed"><img src="assets/images/icons/bed.png" alt="">6</span>
                                    </li>
                                    <li>
                                        <span class="bath"><img src="assets/images/icons/bath.png" alt="">4</span>
                                    </li>
                                    <li>
                                        <span class="parking"><img src="assets/images/icons/parking.png" alt="">3</span>
                                    </li>
                                </ul>
                            </div>
                            <div class="content">
                                <div class="left">
                                    <h3 class="title"><a href="single-properties.html">龙城一号别墅</a></h3>
                                    <span class="location"><img src="assets/images/icons/marker.png" alt="">龙泉驿区南山大道333号附12号</span>
                                </div>
                                <div class="right">
                                    <div class="type-wrap">
                                        <span class="price">￥550<span>月</span></span>
                                        <span class="type">出租</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--Property end-->

                    <!--Property start-->
                    <div class="property-item col-lg-4 col-md-6 col-12 mb-40">
                        <div class="property-inner">
                            <div class="image">
                                <a href="single-properties.html"><img src="assets/images/property/property-5.jpg" alt=""></a>
                                <ul class="property-feature">
                                    <li>
                                        <span class="area"><img src="assets/images/icons/area.png" alt="">550 平米</span>
                                    </li>
                                    <li>
                                        <span class="bed"><img src="assets/images/icons/bed.png" alt="">6</span>
                                    </li>
                                    <li>
                                        <span class="bath"><img src="assets/images/icons/bath.png" alt="">4</span>
                                    </li>
                                    <li>
                                        <span class="parking"><img src="assets/images/icons/parking.png" alt="">3</span>
                                    </li>
                                </ul>
                            </div>
                            <div class="content">
                                <div class="left">
                                    <h3 class="title"><a href="single-properties.html">春天花园别墅</a></h3>
                                    <span class="location"><img src="assets/images/icons/marker.png" alt="">金牛区琴台西路668号</span>
                                </div>
                                <div class="right">
                                    <div class="type-wrap">
                                        <span class="price">￥2550</span>
                                        <span class="type">出售</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--Property end-->

                    <!--Property start-->
                    <div class="property-item col-lg-4 col-md-6 col-12 mb-40">
                        <div class="property-inner">
                            <div class="image">
                                <span class="label">特色</span>
                                <a href="single-properties.html"><img src="assets/images/property/property-6.jpg" alt=""></a>
                                <ul class="property-feature">
                                    <li>
                                        <span class="area"><img src="assets/images/icons/area.png" alt="">550 平米</span>
                                    </li>
                                    <li>
                                        <span class="bed"><img src="assets/images/icons/bed.png" alt="">6</span>
                                    </li>
                                    <li>
                                        <span class="bath"><img src="assets/images/icons/bath.png" alt="">4</span>
                                    </li>
                                    <li>
                                        <span class="parking"><img src="assets/images/icons/parking.png" alt="">3</span>
                                    </li>
                                </ul>
                            </div>
                            <div class="content">
                                <div class="left">
                                    <h3 class="title"><a href="single-properties.html">万科西山别墅</a></h3>
                                    <span class="location"><img src="assets/images/icons/marker.png" alt="">高新区蜀都大道12号</span>
                                </div>
                                <div class="right">
                                    <div class="type-wrap">
                                        <span class="price">￥550<span>月</span></span>
                                        <span class="type">出租</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--Property end-->

                </div>

            </div>
        </div>

<!--        第八栏-->
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

<!--        第九栏-->
        <MySlot
                rootClass="agent-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
                title="我的代理"
                itemRootClass="agent-carousel section"
                :list="agentList"
                :show-page-dot="true">
            <template #item="{itemData}">
                <div class="col">
                    <div class="agent">
                        <div class="image">
                            <a class="img" href="agent-details.html">
                                <img :src="itemData.photo" alt="">
                            </a>
                            <div class="social">
                                <a href="#" class="facebook"><i class="fa fa-facebook"></i></a>
                                <a href="#" class="twitter"><i class="fa fa-twitter"></i></a>
                                <a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a>
                                <a href="#" class="google"><i class="fa fa-google-plus"></i></a>
                            </div>
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
        </MySlot>

<!--        第十栏-->
        <MySlot
                rootClass="news-section section pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
                title="房产最近新闻"
                itemRootClass="news-carousel section"
                :list="newsList"
                :show-page-dot="false">
            <template #item="{itemData}">
                <div class="col">
                    <div class="news">
                        <div class="image">
                            <a href="news-details.html"><img :src="itemData.imgUrl" alt=""></a>
                            <div class="meta-wrap">
                                <ul class="meta">
                                    <li>由 <a href="#">{{itemData.meta}}</a></li>
                                    <li>{{itemData.metaData}}</li>
                                </ul>
                                <ul class="meta back">
                                    <li>由 <a href="#">{{itemData.metaBack}}</a></li>
                                    <li>{{itemData.metaBackData}}</li>
                                </ul>
                            </div>
                        </div>
                        <div class="content">
                            <h4 class="title"><a href="news-details.html">{{itemData.title}}</a></h4>
                            <div class="desc">
                                <p>{{itemData.desc}}</p>
                            </div>
                            <a href="news-details.html" class="readmore">{{itemData.readMore}}</a>
                        </div>
                    </div>
                </div>
            </template>
        </MySlot>

<!--        第十一栏-->
        <brand-slot :list="brandList">
            <template #item="{itemData}">
                <div class="brand col"><img :src="itemData.imgUrl" alt=""></div>
            </template>
        </brand-slot>
    </div>
</template>

<script>
    import HeroInner from "../components/house/HeroInner";
    import HeroSlot from "../components/index/HeroSlot";
    import HouseInner from "../components/house/HouseInner";
    import MySlot from "../components/index/MySlot";
    import BrandSlot from "../components/index/BrandSlot";
    import PropertySlot from "../components/index/PropertySlot";
    export default {
        name: "Index2",
        components: {HeroSlot,HeroInner,HouseInner,MySlot,BrandSlot,PropertySlot},
        data(){
            return{
            heroList:[
                {
                    id:1,
                    url:'assets/images/hero/hero-1.jpg',
                    title:'江南宅院',
                    location:'568 E 1st Ave, Miami',
                    type:'出租',
                    price:'550',
                    priceDay:'Month',
                    area:'550',
                    bed:'6',
                    bath:'4',
                    parking:'3'
                },
                {
                    id:2,
                    url:'assets/images/hero/hero-3.jpg',
                    title:'江南宅院',
                    location:'568 E 1st Ave, Miami',
                    type:'出租',
                    price:'550',
                    priceDay:'Month',
                    area:'550',
                    bed:'6',
                    bath:'4',
                    parking:'3'
                }
            ],
                houseList:[{
                    id:1,
                    pictureUrl:'assets/images/property/property-1.jpg',
                    square:550,
                    roomNumber:5,
                    bathroomNumber:1,
                    garageNumber:2,
                    title:'江南宅院',
                    address:'锦江区东大街下东大街568号',
                    rentType:1,
                    price:550,
                    leaseType:1,
                    isHot:1,
                    isNew:2,
                    isSpecial:1,
                },
                    {
                        id:2,
                        pictureUrl:'assets/images/property/property-1.jpg',
                        square:550,
                        roomNumber:5,
                        bathroomNumber:1,
                        garageNumber:2,
                        title:'江南宅院',
                        address:'锦江区东大街下东大街568号',
                        rentType:1,
                        price:550,
                        leaseType:1,
                        isHot:1,
                        isNew:2,
                        isSpecial:1,
                    },
                    {
                        id:3,
                        pictureUrl:'assets/images/property/property-1.jpg',
                        square:550,
                        roomNumber:5,
                        bathroomNumber:1,
                        garageNumber:2,
                        title:'江南宅院',
                        address:'锦江区东大街下东大街568号',
                        rentType:1,
                        price:550,
                        leaseType:1,
                        isHot:1,
                        isNew:2,
                        isSpecial:1,
                    },
                    {
                        id:4,
                        pictureUrl:'assets/images/property/property-1.jpg',
                        square:550,
                        roomNumber:5,
                        bathroomNumber:1,
                        garageNumber:2,
                        title:'江南宅院',
                        address:'锦江区东大街下东大街568号',
                        rentType:1,
                        price:550,
                        leaseType:1,
                        isHot:1,
                        isNew:2,
                        isSpecial:1,
                    },
                    {
                        id:5,
                        pictureUrl:'assets/images/property/property-1.jpg',
                        square:550,
                        roomNumber:5,
                        bathroomNumber:1,
                        garageNumber:2,
                        title:'江南宅院',
                        address:'锦江区东大街下东大街568号',
                        rentType:1,
                        price:550,
                        leaseType:1,
                        isHot:1,
                        isNew:2,
                        isSpecial:1,
                    }],
                agentList: [
                    {
                        id: 11,
                        photo: "assets/images/agent/agent-1.jpg",
                        name: "唐纳德.菲尔",
                        phone: "(756) 447 5779",
                        email: "info@example.com",
                        houseCount: 5
                    },
                    {
                        id: 12,
                        photo: "assets/images/agent/agent-2.jpg",
                        name: "唐纳德.菲尔",
                        phone: "(756) 447 5779",
                        email: "info@example.com",
                        houseCount: 5
                    },
                    {
                        id: 13,
                        photo: "assets/images/agent/agent-3.jpg",
                        name: "唐纳德.菲尔",
                        phone: "(756) 447 5779",
                        email: "info@example.com",
                        houseCount: 5
                    },
                    {
                        id: 14,
                        photo: "assets/images/agent/agent-4.jpg",
                        name: "唐纳德.菲尔",
                        phone: "(756) 447 5779",
                        email: "info@example.com",
                        houseCount: 5
                    }
                ],
            newsList:[
                {
                    id:1,
                    imgUrl:'assets/images/news/news-1.jpg',
                    meta:'唐纳德',
                    metaData:'2018年12月30日',
                    metaBack:'唐纳德',
                    metaBackData:'2018年12月30日',
                    title:'豪华公寓楼',
                    desc:'房产交易平台 the best theme for  elit, sed do to eiumod tempor dolor sit amet.',
                    readMore:'继续浏览'
                },
                {
                    id:2,
                    imgUrl:'assets/images/news/news-2.jpg',
                    meta:'唐纳德',
                    metaData:'2018年12月30日',
                    metaBack:'唐纳德',
                    metaBackData:'2018年12月30日',
                    title:'豪华公寓楼',
                    desc:'房产交易平台 the best theme for  elit, sed do to eiumod tempor dolor sit amet.',
                    readMore:'继续浏览'
                },
                {
                    id:3,
                    imgUrl:'assets/images/news/news-3.jpg',
                    meta:'唐纳德',
                    metaData:'2018年12月30日',
                    metaBack:'唐纳德',
                    metaBackData:'2018年12月30日',
                    title:'豪华公寓楼',
                    desc:'房产交易平台 the best theme for  elit, sed do to eiumod tempor dolor sit amet.',
                    readMore:'继续浏览'
                }
            ],
            brandList:[
                {
                    id:1,
                    imgUrl:'assets/images/brands/brand-1.png'
                },
                {
                    id:2,
                    imgUrl:'assets/images/brands/brand-2.png'
                },
                {
                    id:3,
                    imgUrl:'assets/images/brands/brand-3.png'
                },
                {
                    id:4,
                    imgUrl:'assets/images/brands/brand-4.png'
                },
                {
                    id:5,
                    imgUrl:'assets/images/brands/brand-5.png'
                },
                {
                    id:6,
                    imgUrl:'assets/images/brands/brand-6.png'
                }
            ],
            proList:[
                {
                    id:1,
                    imgUrl:'assets/images/property/property-13.jpg',
                    title:'江南宅院',
                    location:'成都双流机场大道568',
                    type:'出租',
                    typeMoney:'550',
                    typeDay:'月',

                },
                {
                    id:2,
                    imgUrl:'assets/images/property/property-14.jpg',
                    title:'江南宅院',
                    location:'成都双流机场大道568',
                    type:'出租',
                    typeMoney:'550',
                    typeDay:'月',

                }
            ]}
        }
    }
</script>

<style scoped>

</style>