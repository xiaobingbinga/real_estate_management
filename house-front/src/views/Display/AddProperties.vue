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
                            <li :class="fromNum >= 1 ? 'working' : ''">
                                <a href="#basic_info" data-toggle="tab" @click="setFromNum(1)">1. 基本信息</a></li>
                            <li :class="fromNum >= 2 ? 'working' : ''">
                                <a href="#gallery_video" data-toggle="tab" @click="setFromNum(2)">2. 图片 & 视频信息</a></li>
                            <li :class="fromNum >= 3 ? 'working' : ''">
                                <a href="#detailed_info" data-toggle="tab" @click="setFromNum(3)">3. 详细信息</a></li>
                        </ul>

                        <div class="add-property-form tab-content">

                            <div :class="fromNum === 1 ? 'tab-pane show active' : 'tab-pane'" id="basic_info">
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
                                                <b-form-select v-model="selectedStatus" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>请选择房屋状态</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(oneStatus,idxStatus) in select.status"
                                                            :key="idxStatus" :value="oneStatus">
                                                        {{oneStatus}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>


                                            <div class="col-md-4 col-12 mb-30">
                                                <label>租期</label>
                                                <b-form-select v-model="selectedLeaseTerm" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>请选择租期类型</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(oneLeaseTerm,idxLeaseTerm) in select.leaseTerm"
                                                            :key="idxLeaseTerm" :value="oneLeaseTerm">
                                                        {{oneLeaseTerm}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>类型</label>
                                                <b-form-select v-model="selectedTypes" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>请选择房屋类型</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(oneTypes,idxTypes) in select.types"
                                                            :key="idxTypes" :value="oneTypes">
                                                        {{oneTypes}}
                                                    </b-form-select-option>
                                                </b-form-select>
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
                                                <a href="#gallery_video" data-toggle="tab"
                                                   class="btn" @click="setFromNum(2)">下一页</a>
                                            </div>
                                        </div>
                                    </form>

                                </div>
                            </div>

                            <div :class="fromNum === 2 ? 'tab-pane show active' : 'tab-pane'" id="gallery_video">
                                <div class="tab-body">

                                    <form action="#">
                                        <div class="row">
                                            <div class="col-12 mb-30">
                                                <label>上传房屋图片</label>
                                                <vue-dropzone id="dropzone" :options="dropzoneOptions"></vue-dropzone>
                                            </div>

                                            <div class="col-12 mb-30">
                                                <label for="property_video">视频呈现链接</label>
                                                <input type="text" id="property_video">
                                            </div>

                                            <div class="nav d-flex justify-content-end col-12 mb-30 pl-15 pr-15">
                                                <a href="#detailed_info" data-toggle="tab"
                                                   class="btn" @click="setFromNum(3)">下一页</a>
                                            </div>
                                        </div>
                                    </form>

                                </div>
                            </div>

                            <div :class="fromNum === 3 ? 'tab-pane show active' : 'tab-pane'" id="detailed_info">
                                <div class="tab-body">

                                    <form action="#">
                                        <div class="row">
                                            <div class="col-12 mb-30">
                                                <label for="property_description">描述</label>
                                                <textarea id="property_description"></textarea>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>建造年份</label>
                                                <b-form-select v-model="selectedConstructionYear" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>请选择建造年份</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(oneConstructionYear,idxConstructionYear) in select.constructionYear"
                                                            :key="idxConstructionYear" :value="oneConstructionYear">
                                                        {{oneConstructionYear}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>房间数</label>
                                                <b-form-select v-model="selectedHouseNum" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>请选择房间数量</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(oneHouseNum,idxHouseNum) in select.houseNum"
                                                            :key="idxHouseNum" :value="oneHouseNum">
                                                        {{oneHouseNum}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>卫生间数</label>
                                                <b-form-select v-model="selectedToiletsNum" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>请选择卫生间数量</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(oneToiletsNum,idxToiletsNum) in select.toiletsNum"
                                                            :key="idxToiletsNum" :value="oneToiletsNum">
                                                        {{oneToiletsNum}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>厨房</label>
                                                <b-form-select v-model="selectedKitchen" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>请选择厨房数量</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(oneKitchen,idxKitchen) in select.kitchen"
                                                            :key="idxKitchen" :value="oneKitchen">
                                                        {{oneKitchen}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>车位</label>
                                                <b-form-select v-model="selectedParkingSpace" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>请选择车位数量</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(oneParkingSpace,idxParkingSpace) in select.parkingSpace"
                                                            :key="idxParkingSpace" :value="oneParkingSpace">
                                                        {{oneParkingSpace}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>是否有物管</label>
                                                <b-form-select v-model="selectedProperty" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>是否有物业</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(oneProperty,idxProperty) in select.bool"
                                                            :key="idxProperty" :value="oneProperty">
                                                        {{oneProperty}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>电</label>
                                                <b-form-select v-model="selectedElectricity" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>是否通电</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(oneElectricity,idxElectricity) in select.bool"
                                                            :key="idxElectricity" :value="oneElectricity">
                                                        {{oneElectricity}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>气</label>
                                                <b-form-select v-model="selectedNaturalGas" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>是否有天然气</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(oneNaturalGas,idxNaturalGas) in select.bool"
                                                            :key="idxNaturalGas" :value="oneNaturalGas">
                                                        {{oneNaturalGas}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>水</label>
                                                <b-form-select v-model="selectedWater" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>是否通水</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(oneWater,idxWater) in select.bool"
                                                            :key="idxWater" :value="oneWater">
                                                        {{oneWater}}
                                                    </b-form-select-option>
                                                </b-form-select>
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
    import vueDropzone from 'vue2-dropzone'
    import 'vue2-dropzone/dist/vue2Dropzone.min.css'


    export default {
        components: {
            vueDropzone
        },
        data() {
            return {
                dropzoneOptions: {
                    //图片上传路径
                    url:"https://httpbin.org/post",
                    //禁止自动提交
                    autoProcessQueue: false,
                    //添加移除连接
                    addRemoveLinks: true,
                    //最大文件数量
                    maxFiles: 1,
                    dictDefaultMessage: "<i class='pe-7s-cloud-upload'></i>点击或拖拽上传文件"
                },
                fromNum:1,
                select:{
                    status:['租房','卖房'],
                    leaseTerm:['按天计','按周计','按月计','按年计'],
                    types:['公寓','咖啡馆','住宅','餐馆','商店','别墅'],
                    constructionYear:
                        ['1 年以上','2 年以上','3 年以上','4 年以上','5 年以上','6 年以上','7 年以上','8 年以上','9 年以上'],
                    houseNum:['1','2','3','4','5','6','7','8','9'],
                    toiletsNum:['1','2','3','4','5','6','7','8','9'],
                    kitchen:['1','2','3'],
                    parkingSpace:['1','2','3'],
                    bool:['有','没有']
                },
                selectedStatus:null,
                selectedLeaseTerm:null,
                selectedTypes:null,
                selectedConstructionYear:null,
                selectedHouseNum:null,
                selectedToiletsNum:null,
                selectedKitchen:null,
                selectedParkingSpace:null,
                selectedProperty:null,
                selectedElectricity:null,
                selectedNaturalGas:null,
                selectedWater:null

            }
        },
        methods:{
            setFromNum(num){
                this.fromNum = num;
            }
        }
    }
</script>

<style scoped>

</style>