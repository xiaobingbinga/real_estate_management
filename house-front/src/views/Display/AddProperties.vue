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
                                                <input v-model="condition.title"
                                                       type="text" id="property_title" placeholder="标题（必填）">
                                            </div>

                                            <div class="col-md-2 col-12 mb-30">
                                                <label>省份</label>
                                                <b-form-select v-model="selectedProvince" class="nice-select search-select "
                                                               @change="setCity(selectedProvince)">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>省份（必选）</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(onePro,idxPro) in address.districts"
                                                            :key="idxPro"
                                                            :value="onePro" >
                                                        {{onePro.name}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-2 col-12 mb-30">
                                                <label>城市</label>
                                                <b-form-select v-model="condition.city" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>城市（必选）</b-form-select-option>
                                                    </template>
                                                    <template v-if="citys">
                                                    <b-form-select-option
                                                            v-for="(oneCity,idxCity) in citys.districts"
                                                            :key="idxCity"
                                                            :value="oneCity.name">
                                                        {{oneCity.name}}
                                                    </b-form-select-option>
                                                    </template>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-8 col-12 mb-30">
                                                <label for="property_address">详细地址</label>
                                                <input v-model="condition.address"
                                                       type="text" id="property_address" placeholder="详细地址（必填）">
                                            </div>


                                            <div class="col-md-4 col-12 mb-30">
                                                <label>租售类型</label>
                                                <b-form-select v-model="condition.rentType" class="nice-select search-select "
                                                               @change="setStatusId(condition.rentType)">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>租售类型（必选）</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(oneStatus,idxStatus) in search1.rentType.options"
                                                            :key="idxStatus" :value="oneStatus.value">
                                                        {{oneStatus.tip}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>


                                            <div class="col-md-4 col-12 mb-30">
                                                <label>状态</label>
                                                <b-form-select v-model="condition.statusId" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>房屋状态（必选）</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(oneStatus,idxStatus) in (
                                                                status === 2 ? search1.status.option2 : search1.status.option1
                                                            )"
                                                            :key="idxStatus" :value="oneStatus.value">
                                                        {{oneStatus.tip}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>




                                            <div class="col-md-4 col-12 mb-30">
                                                <label>租期类型</label>
                                                <b-form-select v-model="condition.leaseType" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>
                                                            {{status !== 2 ? '租期类型（必选）' : '永久（默认）'}}</b-form-select-option>
                                                    </template>
                                                    <template v-if="status !== 2">
                                                    <b-form-select-option
                                                            v-for="(oneLeaseTerm,idxLeaseTerm) in search1.leaseTermType.options"
                                                            :key="idxLeaseTerm" :value="oneLeaseTerm.value">
                                                        {{oneLeaseTerm.tip}}
                                                    </b-form-select-option>
                                                    </template>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label for="property_address">租期</label>
                                                <input v-if="status === 1"
                                                       v-model="condition.lease"
                                                       type="number"
                                                       id="property_lease"
                                                       placeholder="0">
                                                <input v-else placeholder="0" disabled>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>类型</label>
                                                <b-form-select v-model="condition.type" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>房屋类型（必选）</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(oneTypes,idxTypes) in search1.houseType.options"
                                                            :key="idxTypes" :value="oneTypes.value">
                                                        {{oneTypes.tip}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label for="property_price">价格 <span>(RMB)</span></label>
                                                <input v-model="condition.price"
                                                       type="text" id="property_price" placeholder="价格（必填）">
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label for="property_area">面积 <span>(平方米)</span></label>
                                                <input v-model="condition.square"
                                                       type="text" id="property_area" placeholder="面积（必填）">
                                            </div>

                                            <div class="nav d-flex justify-content-end col-12 mb-30 pl-15 pr-15">
                                                <a  data-toggle="tab"
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
                                                <vue-dropzone id="dropzone" :options="dropzoneOptions"/>
                                            </div>

                                            <div class="col-12 mb-30">
                                                <label for="property_video">视频呈现链接</label>
                                                <input type="text" id="property_video">
                                            </div>

                                            <div class="nav d-flex justify-content-end col-12 mb-30 pl-15 pr-15">
                                                <a data-toggle="tab"
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
                                                <textarea v-model="condition.description"
                                                          id="property_description" placeholder="描述（必填）"/>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>建造年份</label>
                                                <b-form-select v-model="condition.yearType" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>建造年份（必选）</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(oneConstructionYear,idxConstructionYear) in search1.constructionYear.options"
                                                            :key="idxConstructionYear" :value="oneConstructionYear.value">
                                                        {{oneConstructionYear.tip}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>房间数</label>
                                                <b-form-select v-model="condition.roomNumber" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>房间数量（必选）</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(oneHouseNum,idxHouseNum) in search1.roomNumber.options"
                                                            :key="idxHouseNum" :value="oneHouseNum.value">
                                                        {{oneHouseNum.tip}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>卫生间数</label>
                                                <b-form-select v-model="condition.bathroomNumber" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>卫生间数量（必选）</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(oneToiletsNum,idxToiletsNum) in search1.bathroomNumber.options"
                                                            :key="idxToiletsNum" :value="oneToiletsNum.value">
                                                        {{oneToiletsNum.tip}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>厨房</label>
                                                <b-form-select v-model="condition.kitchenNumber" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>厨房数量（必选）</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(oneKitchen,idxKitchen) in search1.kitchen.options"
                                                            :key="idxKitchen" :value="oneKitchen.value">
                                                        {{oneKitchen.tip}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>车位</label>
                                                <b-form-select v-model="condition.garageNumber" class="nice-select search-select ">
                                                    <template #first>
                                                        <b-form-select-option :value="null" disabled>车位数量（必选）</b-form-select-option>
                                                    </template>
                                                    <b-form-select-option
                                                            v-for="(oneParkingSpace,idxParkingSpace) in search1.parkingSpace.options"
                                                            :key="idxParkingSpace" :value="oneParkingSpace.value">
                                                        {{oneParkingSpace.tip}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>是否有物管</label>
                                                <b-form-select v-model="condition.realtyManagement" class="nice-select search-select ">
                                                    <b-form-select-option
                                                            v-for="(oneProperty,idxProperty) in search1.bool.options"
                                                            :key="idxProperty" :value="oneProperty.value">
                                                        {{oneProperty.tip}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>电</label>
                                                <b-form-select v-model="condition.electric" class="nice-select search-select ">
                                                    <b-form-select-option
                                                            v-for="(oneElectricity,idxElectricity) in search1.bool.options"
                                                            :key="idxElectricity" :value="oneElectricity.value">
                                                        {{oneElectricity.tip}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>气</label>
                                                <b-form-select v-model="condition.naturalGas" class="nice-select search-select ">
                                                    <b-form-select-option
                                                            v-for="(oneNaturalGas,idxNaturalGas) in search1.bool.options"
                                                            :key="idxNaturalGas" :value="oneNaturalGas.value">
                                                        {{oneNaturalGas.tip}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>

                                            <div class="col-md-4 col-12 mb-30">
                                                <label>水</label>
                                                <b-form-select v-model="condition.water" class="nice-select search-select ">
                                                    <b-form-select-option
                                                            v-for="(oneWater,idxWater) in search1.bool.options"
                                                            :key="idxWater" :value="oneWater.value">
                                                        {{oneWater.tip}}
                                                    </b-form-select-option>
                                                </b-form-select>
                                            </div>

                                            <div class="col-12 mb-30">
                                                <h4>其他信息</h4>
                                                <ul class="other-features">
                                                    <li><input type="checkbox" id="air_condition"
                                                               v-model="condition.airConditioning">
                                                        <label for="air_condition">空调</label></li>

                                                    <li><input type="checkbox" id="bedding"
                                                               v-model="condition.furniture">
                                                        <label for="bedding">床上用品</label></li>

                                                    <li><input type="checkbox" id="balcony"
                                                               v-model="condition.balcony">
                                                        <label for="balcony">阳台</label></li>

                                                    <li><input type="checkbox" id="cable_tv"
                                                               v-model="condition.cableTV">
                                                        <label for="cable_tv">有线电视</label></li>

<!--                                                    <li><input type="checkbox" id="internet">-->
<!--                                                    <label for="internet">互联网</label></li>-->

                                                    <li><input type="checkbox" id="parking"
                                                               v-model="condition.parking">
                                                        <label for="parking">车库</label></li>

                                                    <li><input type="checkbox" id="lift"
                                                               v-model="condition.lift">
                                                        <label for="lift">电梯</label></li>

                                                    <li><input type="checkbox" id="pool"
                                                               v-model="condition.pool">
                                                        <label for="pool">游泳池</label></li>

                                                    <li><input type="checkbox" id="dishwasher"
                                                               v-model="condition.dishwater">
                                                        <label for="dishwasher">洗衣机</label></li>

                                                    <li><input type="checkbox" id="toaster"
                                                               v-model="condition.refrigerator">
                                                        <label for="toaster">冰箱</label></li>

                                                    <li><input type="checkbox" id="gym"
                                                               v-model="condition.kitchenUtensils">
                                                        <label for="gym">厨具</label></li>
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
                                                <button type="button" class="property-submit btn"
                                                        @click="setCondition()">添加房产信息</button>
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
    import {mapGetters} from 'vuex'

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

                selectedProvince: null,
                citys:null,
                status:null,
                condition:{
                    id:null,
                    ownerId:null,//发布人编号
                    title:null,//标题
                    city:null,//城市
                    address:null,//详细地址
                    statusId:null,//状态
                    leaseType:null,//租期类型
                    lease:0,//租期
                    rentType:null,//租售类型
                    type:null,//类型
                    price:null,//价格
                    square:null,//面积
                    pictureUrl:null,//房产图片链接
                    videoUrl:null,//房产视频链接
                    description:null,//描述
                    yearType:null,//建造年份
                    roomNumber:null,//房间数
                    bathroomNumber:null,//卫生间数
                    kitchenNumber:null,//厨房数
                    garageNumber:null,//车位数
                    realtyManagement:0,//物管
                    electric:0,//电
                    naturalGas:0,//气
                    water:0,//水
                    airConditioning:0,//空调
                    furniture:0,//家具
                    balcony:0,//阳台
                    cableTV:0,//有线电话
                    parking:0,//车库
                    lift:0,//电梯
                    pool:0,//游泳池
                    dishwater:0,//洗衣机
                    refrigerator:0,//冰箱
                    kitchenUtensils:0,//厨具
                },

                fromNum:1,//翻页判断
                counter: 0,//提示框
            }
        },
        computed:{
            ...mapGetters('address',["address"]),
            ...mapGetters('search1',['search1'])
        },
        methods:{
            setFromNum(num){
                if (num === 2){

                    if (this.condition.title === null ||
                        this.condition.city === null ||
                        this.condition.address === null ||
                        this.condition.statusId === null ||
                        this.condition.rentType === null ||
                        this.condition.type === null ||
                        this.condition.price === null ||
                        this.condition.square === null){
                        this.toast();
                        return;
                    }
                }
                this.fromNum = num;
            },
            setCity(obj){
                this.citys = obj
            },
            setStatusId(obj){
                this.status = obj
            },
            setCondition(){
                if (this.condition.description !== null &&
                    this.condition.yearType !== null &&
                    this.condition.roomNumber !== null &&
                    this.condition.bathroomNumber !== null &&
                    this.condition.kitchenNumber !== null &&
                    this.condition.garageNumber !== null){
                    console.log(this.condition)
                }else {
                    this.toast();
                }
            },
            toast() {
                this.$bvToast.toast('小笨蛋，该填的都要填哦', {
                    title: `警告！有未填项！`,
                    toaster: 'b-toaster-top-full',
                    variant: 'danger',
                    solid: true
                })
            }
        }
    }
</script>

<style scoped>

</style>