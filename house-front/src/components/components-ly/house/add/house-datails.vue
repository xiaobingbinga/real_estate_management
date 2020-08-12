<template>
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
</template>

<script>
    export default {
        name: "house-datails"
    }
</script>

<style scoped>

</style>