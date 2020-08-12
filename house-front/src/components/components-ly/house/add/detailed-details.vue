<template>
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
</template>

<script>
    export default {
        name: "detailed-details"
    }
</script>

<style scoped>

</style>