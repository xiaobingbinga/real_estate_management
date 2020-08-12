<template>
    <div>
        <!--Page Banner Section start-->
        <div class="page-banner-section section">
            <div class="container">
                <div class="row">
                    <div class="col">
                        <h1 class="page-banner-title">新增房产</h1>
                        <ul class="page-breadcrumb">
                            <li><a href="index.html">主页</a></li>
                            <li class="active">新增房产</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <!--Page Banner Section end-->

        <!--Add Properties section start-->
        <div class="add-properties-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50">
            <div class="container">
                <div class="row">
                    <div class="add-property-wrap col">

                        <ul class="add-property-tab-list nav mb-50">
                            <li class="working"><a href="#basic_info" data-toggle="tab">1. 基本信息</a></li>
                            <li><a href="#gallery_video" data-toggle="tab">2. 图片 & 视频信息</a></li>
                            <li><a href="#detailed_info" data-toggle="tab">3. 详细信息</a></li>
                        </ul>

                        <div class="add-property-form tab-content">

                            <div class="tab-pane show active" id="basic_info">
                                <div class="tab-body">

                                    <form action="#">
                                        <div class="row">
                                            <div class="col-12 mb-30">
                                                <label for="property_title">房产标题</label>
                                                <input type="text" id="property_title">
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label for="property_address">地址</label>
                                                <input type="text" id="property_address">
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>状态</label>
                                                <select class="nice-select">
                                                    <option>租房</option>
                                                    <option>卖房</option>
                                                </select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>租期</label>
                                                <select class="nice-select">
                                                    <option>按天计</option>
                                                    <option>按周计</option>
                                                    <option>按月计</option>
                                                    <option>按年计</option>
                                                </select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>类型</label>
                                                <select class="nice-select">
                                                    <option>公寓</option>
                                                    <option>咖啡馆</option>
                                                    <option>住宅</option>
                                                    <option>餐馆</option>
                                                    <option>商店</option>
                                                    <option>别墅</option>
                                                </select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label for="property_price">价格 <span>(RMB)</span></label>
                                                <input type="text" id="property_price">
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label for="property_area">面积 <span>(平方米)</span></label>
                                                <input type="text" id="property_area">
                                            </div>

                                            <div class="nav d-flex justify-content-end col-12 mb-30 pl-15 pr-15">
                                                <a href="#gallery_video" data-toggle="tab" class="btn">下一页</a>
                                            </div>
                                        </div>
                                    </form>

                                </div>
                            </div>

                            <div class="tab-pane" id="gallery_video">
                                <div class="tab-body">

                                    <form action="#">
                                        <div class="row">
                                            <div class="col-12 mb-30">
                                                <label>上传房屋图片</label>
                                                <div class="dropzone"></div>
                                            </div>

                                            <div class="col-12 mb-30">
                                                <label for="property_video">视频呈现链接</label>
                                                <input type="text" id="property_video">
                                            </div>

                                            <div class="nav d-flex justify-content-end col-12 mb-30 pl-15 pr-15">
                                                <a href="#detailed_info" data-toggle="tab" class="btn">下一页</a>
                                            </div>
                                        </div>
                                    </form>

                                </div>
                            </div>

                            <div class="tab-pane" id="detailed_info">
                                <div class="tab-body">

                                    <form action="#">
                                        <div class="row">
                                            <div class="col-12 mb-30">
                                                <label for="property_description">描述</label>
                                                <textarea id="property_description"></textarea>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>建造年份</label>
                                                <select class="nice-select">
                                                    <option>1 年以上</option>
                                                    <option>2 年以上</option>
                                                    <option>3 年以上</option>
                                                    <option>4 年以上</option>
                                                    <option>5 年以上</option>
                                                    <option>6 年以上</option>
                                                    <option>7 年以上</option>
                                                    <option>8 年以上</option>
                                                    <option>9 年以上</option>
                                                </select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>房间数</label>
                                                <select class="nice-select">
                                                    <option>1</option>
                                                    <option>2</option>
                                                    <option>3</option>
                                                    <option>4</option>
                                                    <option>5</option>
                                                    <option>6</option>
                                                    <option>7</option>
                                                    <option>8</option>
                                                    <option>9</option>
                                                </select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>卫生间数</label>
                                                <select class="nice-select">
                                                    <option>1</option>
                                                    <option>2</option>
                                                    <option>3</option>
                                                    <option>4</option>
                                                    <option>5</option>
                                                    <option>6</option>
                                                    <option>7</option>
                                                    <option>8</option>
                                                    <option>9</option>
                                                </select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>厨房</label>
                                                <select class="nice-select">
                                                    <option>1</option>
                                                    <option>2</option>
                                                    <option>3</option>
                                                </select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>车位</label>
                                                <select class="nice-select">
                                                    <option>1</option>
                                                    <option>2</option>
                                                    <option>3</option>
                                                    <option>4</option>
                                                </select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>是否有物管</label>
                                                <select class="nice-select">
                                                    <option>Yes</option>
                                                    <option>No</option>
                                                </select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>电</label>
                                                <select class="nice-select">
                                                    <option>Yes</option>
                                                    <option>No</option>
                                                </select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>气</label>
                                                <select class="nice-select">
                                                    <option>Yes</option>
                                                    <option>No</option>
                                                </select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>水</label>
                                                <select class="nice-select">
                                                    <option>Yes</option>
                                                    <option>No</option>
                                                </select>
                                            </div>

                                            <div class="col-12 mb-30">
                                                <h4>其他信息</h4>
                                                <ul class="other-features">
                                                    <li><input type="checkbox" id="air_condition"><label for="air_condition">空调</label></li>
                                                    <li><input type="checkbox" id="bedding"><label for="bedding">床上用品</label></li>
                                                    <li><input type="checkbox" id="balcony"><label for="balcony">阳台</label></li>
                                                    <li><input type="checkbox" id="cable_tv"><label for="cable_tv">有线电视</label></li>
                                                    <li><input type="checkbox" id="internet"><label for="internet">互联网</label></li>
                                                    <li><input type="checkbox" id="parking"><label for="parking">停车位</label></li>
                                                    <li><input type="checkbox" id="lift"><label for="lift">电梯</label></li>
                                                    <li><input type="checkbox" id="pool"><label for="pool">游泳池</label></li>
                                                    <li><input type="checkbox" id="dishwasher"><label for="dishwasher">洗衣机</label></li>
                                                    <li><input type="checkbox" id="toaster"><label for="toaster">冰箱</label></li>
                                                    <li><input type="checkbox" id="gym"><label for="gym">厨具</label></li>
                                                </ul>
                                            </div>

                                            <div class="col-12">
                                                <h4>地图信息</h4>
                                                <div class="row mt-20">
                                                    <div class="col-lg-6 col-12 mb-30">
                                                        <label for="map_address">Google Maps Address</label>
                                                        <input type="text" id="map_address">
                                                    </div>
                                                    <div class="col-lg-3 col-md-6 col-12 mb-30">
                                                        <label for="map_lan">续度</label>
                                                        <input type="text" id="map_lan">
                                                    </div>
                                                    <div class="col-lg-3 col-md-6 col-12 mb-30">
                                                        <label for="map_long">经度</label>
                                                        <input type="text" id="map_long">
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="nav d-flex justify-content-end col-12 mb-30 pl-15 pr-15">
                                                <button class="property-submit btn">添加房产信息</button>
                                            </div>
                                        </div>
                                    </form>

                                </div>
                            </div>

                        </div>

                    </div>
                </div>
            </div>
        </div>
        <!--Add Properties section end-->
    </div>
</template>

<script>
    export default {
        name: "AddProperties"
    }
</script>

<style scoped>

</style>