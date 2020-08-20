<template>
    <div class="search-section section pt-0 pt-sm-60 pt-xs-50 ">
        <div class="container">
            <div class="row d-flex d-lg-none">
                <div class="col-md-12 mb-60 mb-xs-30">
                    <div class="section-title center">
                        <h1>找到您的房子</h1>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-12">
                    <div class="hero-search">
                        <form action="#">
                            <div v-for="(item,key) in search" :key="key"
                                 style="border:solid 5px rgba(0, 0, 0, 0.1);">
                                <h4>{{item.label}}</h4>

                                <b-form-select v-if="key==='province'" v-model="selectedValue[key]"
                                               class="nice-select search-select" @change="changeProvince">
                                    <template #first>
                                        <b-form-select-option :value="null" disabled>请选择</b-form-select-option>
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
                                        <b-form-select-option :value="null" disabled>请选择</b-form-select-option>
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
                                        <b-form-select-option :value="null" disabled>请选择</b-form-select-option>
                                    </template>
                                    <b-form-select-option v-for="option in item.options"
                                                          :key="option.value"
                                                          :value="option.value">
                                        {{option.tip}}
                                    </b-form-select-option>
                                </b-form-select>

                            </div>
                            <div>
                                <h4>搜索</h4>
                                <div class="submit">
                                    <button>点击这里</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>

        </div>
    </div>
</template>

<script>
    import {mapGetters} from 'vuex'
    export default {
        data:()=>({
            selectedValue:{
                rentType: null,
                houseType: null,
                province:null,
                city: null,
                roomNumber: null,
                bathroomNumber: null
            },
            cities:[]
        }),
        computed:{
            ...mapGetters('search',['search']),
            ...mapGetters('address',['address'])
        },
        methods:{
            changeProvince(){
                this.cities = this.address.districts.filter(item => item.name === this.selectedValue.province)[0].districts
            }
        }
    }
</script>

<style scoped>

</style>

<style>
    .search-select {
        height: 60px !important;
        padding-left: 20px !important;
    }
</style>
