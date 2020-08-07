<template>
  <div
    class="search-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50">
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
                <!--<select class="nice-select">-->
                <!--  <option>所有城市</option>-->
                <!--  <option>北京</option>-->
                <!--  <option>上海</option>-->
                <!--  <option>广州</option>-->
                <!--  <option>深圳</option>-->
                <!--  <option>成都</option>-->
                <!--  <option>重庆</option>-->
                <!--  <option>武汉</option>-->
                <!--  <option>沈阳</option>-->
                <!--  <option>福州</option>-->
                <!--  <option>厦门</option>-->
                <!--  <option>银川</option>-->
                <!--  <option>拉萨</option>-->
                <!--  <option>绵阳</option>-->
                <!--  <option>遂宁</option>-->
                <!--  <option>攀枝花</option>-->
                <!--  <option>简阳</option>-->
                <!--  <option>德阳</option>-->
                <!--  <option>金堂</option>-->
                <!--  <option>泸州</option>-->
                <!--  <option>内江</option>-->
                <!--  <option>阆中</option>-->
                <!--</select>-->
                <!--选择城市-->
                <b-form-select v-model="selectedCity" class="nice-select search-select">
                  <template #first>
                    <b-form-select-option :value="null" disabled>请选择城市</b-form-select-option>
                  </template>
                  <b-form-select-option
                          v-for="(oneCity,idxCity) in search.city.options"
                          :key="idxCity"
                          :value="oneCity.value">
                    {{oneCity.tip}}
                  </b-form-select-option>
                </b-form-select>
              </div>
              
              <!--类型-->
              <div>
                <b-form-select v-model="selectedRentType" class="nice-select search-select ">
                  <template #first>
                    <b-form-select-option :value="null" disabled>请选择租售类型</b-form-select-option>
                  </template>
                  <b-form-select-option
                          v-for="(oneRent,idxRent) in search.rentType.option"
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
          <!--Property Search end-->
        
        </div>
      </div>
    
    </div>
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
            }
        },
      computed:{
          ...mapGetters('search',["search"])
      }
    }
</script>

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