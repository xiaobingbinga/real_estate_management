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
                <b-form-select v-model="selectedCity" class="nice-select search-select">
                    <template #first>
                        <b-form-select-option :value="null" disabled>请选择城市</b-form-select-option>
                    </template>
                    <template v-if="city">
                        <b-form-select-option
                                v-for="(oneCity,idxCity) in city.districts"
                                :key="idxCity"
                                :value="oneCity.adcode">
                            {{oneCity.name}}
                        </b-form-select-option>
                    </template>
                </b-form-select>
            </div>

            <!--类型-->
            <div>
                <b-form-select v-model="selectedRentType" class="nice-select search-select ">
                    <template #first>
                        <b-form-select-option :value="null" disabled>请选择租售类型</b-form-select-option>
                    </template>
                    <b-form-select-option
                            v-for="(oneRent,idxRent) in search.rentType.options"
                            :key="idxRent" :value="oneRent.value">
                        {{oneRent.tip}}
                    </b-form-select-option>
                </b-form-select>
            </div>
            <!--类型-->
            <div>
                <b-form-select v-model="selectedHouseType" class="nice-select search-select ">
                    <template #first>
                        <b-form-select-option :value="null" disabled>请选择房屋类型</b-form-select-option>
                    </template>
                    <b-form-select-option
                            v-for="(oneHouse,idxHouse) in search.houseType.options"
                            :key="idxHouse" :value="oneHouse.value">
                        {{oneHouse.tip}}
                    </b-form-select-option>

                </b-form-select>
            </div>
            <!--房间数-->
            <div>
                <b-form-select v-model="selectedHouseNum" class="nice-select search-select ">
                    <template #first>
                        <b-form-select-option :value="null" disabled>请选择房间数</b-form-select-option>
                    </template>
                    <b-form-select-option
                            v-for="(oneRoom,idxRoom) in search.roomNumber.options"
                            :key="idxRoom" :value="oneRoom.value">
                        {{oneRoom.tip}}
                    </b-form-select-option>
                </b-form-select>
            </div>
            <!--卫生间数-->
            <div>
                <b-form-select v-model="selectedBathroom" class="nice-select search-select ">
                    <template #first>
                        <b-form-select-option :value="null" disabled>请选择卫生间数</b-form-select-option>
                    </template>
                    <b-form-select-option
                            v-for="(oneBath,idxBath) in search.bathroomNumber.options"
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
                <button>搜索</button>
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
                selectedCity:null,
                selectedRentType:null,
                selectedHouseType:null,
                selectedHouseNum:null,
                selectedBathroom:null,
                selectedProvince:null,
                city:null
            }
        },
        computed:{
            ...mapGetters('search',["search"]),
            ...mapGetters('address',["address"])
        },
        methods:{
            setCity(obj){
                this.city = obj
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