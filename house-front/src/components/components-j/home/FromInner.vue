<template>
    <div>
        <form action="#">
            <div>
                <b-form-select v-model="selectedProvince" class="nice-select search-select"
                               @change="setCity(selectedProvince)">
                    <template #first>
                        <b-form-select-option :value="null" disabled>请选择省份</b-form-select-option>
                    </template>
                    <b-form-select-option
                            v-for="(onePro,idxPro) in address.districts"
                            :key="idxPro"
                            :value="onePro" >
                        {{onePro.name}}
                    </b-form-select-option>
                </b-form-select>
            </div>

            <div>
                <b-form-select v-model="condition.city" class="nice-select search-select">
                    <template #first>
                        <b-form-select-option :value="null" disabled>请选择城市</b-form-select-option>
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

            <!--类型-->
            <div>
                <b-form-select v-model="condition.statusId" class="nice-select search-select ">
                    <template #first>
                        <b-form-select-option :value="null" disabled>请选择租售类型</b-form-select-option>
                    </template>
                    <b-form-select-option
                            v-for="(oneRent,idxRent) in search1.rentType.options"
                            :key="idxRent" :value="oneRent.value">
                        {{oneRent.tip}}
                    </b-form-select-option>
                </b-form-select>
            </div>
            <!--类型-->
            <div>
                <b-form-select v-model="condition.type" class="nice-select search-select ">
                    <template #first>
                        <b-form-select-option :value="null" disabled>请选择房屋类型</b-form-select-option>
                    </template>
                    <b-form-select-option
                            v-for="(oneHouse,idxHouse) in search1.houseType.options"
                            :key="idxHouse" :value="oneHouse.value">
                        {{oneHouse.tip}}
                    </b-form-select-option>

                </b-form-select>
            </div>
            <!--房间数-->
            <div>
                <b-form-select v-model="condition.roomNumber" class="nice-select search-select ">
                    <template #first>
                        <b-form-select-option :value="null" disabled>请选择房间数</b-form-select-option>
                    </template>
                    <b-form-select-option
                            v-for="(oneRoom,idxRoom) in search1.roomNumber.options"
                            :key="idxRoom" :value="oneRoom.value">
                        {{oneRoom.tip}}
                    </b-form-select-option>
                </b-form-select>
            </div>
            <!--卫生间数-->
            <div>
                <b-form-select v-model="condition.bathroomNumber" class="nice-select search-select ">
                    <template #first>
                        <b-form-select-option :value="null" disabled>请选择卫生间数</b-form-select-option>
                    </template>
                    <b-form-select-option
                            v-for="(oneBath,idxBath) in search1.bathroomNumber.options"
                            :key="idxBath" :value="oneBath.value">
                        {{oneBath.tip}}
                    </b-form-select-option>
                </b-form-select>
            </div>

            <div>
                <vue-slider v-model="sliderValue"
                            tooltip="always"
                            :dotSize="15"
                            :height="10"
                            :max="10000"
                            :tooltip-formatter="'￥{value}'"
                            :dotStyle="{backgroundColor:'#004395'}"
                            :processStyle="{backgroundColor:'#004395'}"
                            :railStyle="{backgroundColor:'#f4f4f4'}"
                            :tooltipStyle="{backgroundColor:'#fff'}">
                </vue-slider>
            </div>
            <div>
                <button type="button" @click="insurance()">搜索</button>
            </div>
        </form>

    </div>
</template>

<script>
    import VueSlider from 'vue-slider-component'
    import 'vue-slider-component/theme/default.css'
    import {mapGetters} from 'vuex'

    export default {
        components: {VueSlider},
        name: "MySearch",
        data() {
            return {
                sliderValue: [1250, 7500],
                selectedProvince:null,
                citys:null,
                condition:{
                    id:null,
                    ownerId:null,
                    statusId:null,
                    type:null,
                    city:null,
                    roomNumber:null,
                    bathroomNumber:null,
                    startPrice:null,
                    endPrice:null,
                    pageNum:1,
                    pageSize:6
                }
            }
        },
        computed:{
            ...mapGetters('search1',["search1"]),
            ...mapGetters('address',["address"])
        },
        methods:{
            setCity(obj){
                this.citys = obj
            },
            insurance(){
                this.condition.startPrice = this.sliderValue[0];
                this.condition.endPrice = this.sliderValue[1];
                if (this.condition.city != null){
                    this.condition.city = this.condition.city.substring(0,this.condition.city.length-1);
                }
                this.$emit('insurance',this.condition);
            }
        }
    }
</script>
<style scoped>
    ::v-deep div.vue-slider.vue-slider-ltr{
        margin-top: 10px;
    }
    ::v-deep .vue-slider-dot-tooltip-top {
        top: 0px;
        left: 50%;
        transform: translate(-50%,-100%);
    }
    ::v-deep .vue-slider-dot-tooltip-inner-top::after {
        display: none;
    }
</style>

<style>

    .vue-slider-dot-tooltip-text {
        font-family: "Poppins", sans-serif !important;
        font-size: 15px !important;
        font-style: normal !important;
        font-weight: normal !important;
        color: #666666 !important;
    }

    .search-select {
        height: 50px !important;
        padding-left: 20px !important;
    }
</style>