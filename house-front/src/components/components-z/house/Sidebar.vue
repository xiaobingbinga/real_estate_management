<template>
    <div :class="rootClass">
        <sidebar-item sidebarTitle="Search Property">
            <template #content>
                <div class="property-search sidebar-property-search">
                    <form action="#">
                        <div v-for="(item,key) in search" :key="key">

                            <b-form-select v-if="key==='province'" v-model="selectedValue[key]"
                                           class="nice-select search-select" @change="changeProvince">
                                <template #first>
                                    <b-form-select-option :value="null">{{item.label}}</b-form-select-option>
                                </template>
                                <b-form-select-option v-for="item in address.districts"
                                                      :key="item.adcode"
                                                      :value="item.name">
                                    {{item.name}}
                                </b-form-select-option>
                            </b-form-select>

                            <b-form-select v-else-if="key==='city'" v-model="selectedValue[key]"
                                           class="nice-select search-select">
                                <template #first>
                                    <b-form-select-option :value="null">{{item.label}}</b-form-select-option>
                                </template>
                                <b-form-select-option v-for="item in cities"
                                                      :key="item.citycode"
                                                      :value="item.name">
                                    {{item.name}}
                                </b-form-select-option>
                            </b-form-select>

                            <b-form-select v-else v-model="selectedValue[key]"
                                           class="nice-select search-select">
                                <template #first>
                                    <b-form-select-option :value="null">{{item.label}}</b-form-select-option>
                                </template>
                                <b-form-select-option v-for="option in item.options"
                                                      :key="option.value"
                                                      :value="option.value">
                                    {{option.tip}}
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
                                        :tooltipStyle="{backgroundColor:'#fff'}"/>
                        </div>
                        <div>
                            <button type="button" @click="searchProperties">搜索</button>
                        </div>
                    </form>
                </div>
            </template>
        </sidebar-item>

        <sidebar-item sidebarTitle="Feature Property">
            <template #content>
                <div class="sidebar-property-list">
                    <sidebar-house-inner v-for="houseInfo in sidebarFeatureList"
                                         :key="houseInfo.id"
                                         :houseInfo="houseInfo"/>
                </div>
            </template>
        </sidebar-item>

        <sidebar-item sidebarTitle="Top Agents">
            <template #content>
                <div class="sidebar-agent-list">
                    <sidebar-agent-inner v-for="agent in agentList" :key="agent.id" :agent="agent"/>
                </div>
            </template>
        </sidebar-item>

        <sidebar-item sidebarTitle="Popular Tags">
            <template #content>
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
            </template>
        </sidebar-item>
    </div>
</template>

<script>
    import VueSlider from 'vue-slider-component'
    import 'vue-slider-component/theme/default.css'

    import SidebarHouseInner from "@/components/components-z/house/SidebarHouseInner";
    import SidebarAgentInner from "@/components/components-z/house/SidebarAgentInner";
    import SidebarItem from "@/components/components-z/house/SidebarItem.vue";
    import {mapGetters} from 'vuex'

    export default {
        components:{SidebarHouseInner,SidebarAgentInner,SidebarItem,VueSlider},
        computed:{
            ...mapGetters('search',['search']),
            ...mapGetters('address',['address']),
            // ...mapGetters('featureList',['sidebarFeatureList']),
            // ...mapGetters('agentList',['agentList'])
        },
        props:{
            rootClass:String,
            pageNum: {
                type: Number,
                default: 1
            },
            pageSize: {
                type: Number,
                default: 6
            }
        },
        data:()=>({
            selectedValue:{
                rentType: null,
                houseType: null,
                province: null,
                city: null,
                roomNumber: null,
                bathroomNumber: null
            },
            sliderValue:[1250,7500],
            sidebarFeatureList:[],
            cities:[],
            agentList:[]
        }),
        methods:{
            changeProvince(){
                this.cities = this.address.districts.filter(item => item.name === this.selectedValue.province)[0].districts
            },
            searchProperties(){
                let param = this.selectedValue
                param.pageNum = this.pageNum
                param.pageSize = this.pageSize
                param.minPrice = this.sliderValue[0]
                param.maxPrice = this.sliderValue[1]
                console.log(param)
                this.$emit('getCondition',param)
            },
            getSidebarFeatureList(){
                this.axios.get(process.env.VUE_APP_PROPERTIES + '/condition-features').then(res => {
                    this.sidebarFeatureList = res.data.data
                })
            },
            getAgentList(){
                this.axios.get("/ag/agent/recommend").then(res => {
                    this.agentList = res.data.data
                })
            }
        },
        created() {
            this.getSidebarFeatureList()
            this.getAgentList()
        }
    }
</script>

<style scoped>
    ::v-deep div.vue-slider.vue-slider-ltr{
        margin-top: 10px;
    }
    ::v-deep .vue-slider-dot-tooltip-text {
        font-family: "Poppins", sans-serif;
        font-size: 15px;
        font-style: normal;
        font-weight: normal;
        color: #666666;
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
