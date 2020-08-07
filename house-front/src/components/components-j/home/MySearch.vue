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
                <b-form-select  class="nice-select search-select">
                  <template #first>
                    <b-form-select-option :value="null" disabled>请选择城市</b-form-select-option>
                  </template>
                  <b-form-select-option>简阳</b-form-select-option>
                  <b-form-select-option>简阳</b-form-select-option>
                </b-form-select>
              </div>
              
              <!--类型-->
              <div>
                <b-form-select  class="nice-select search-select ">
                  <template #first>
                    <b-form-select-option :value="null" disabled>买房</b-form-select-option>
                  </template>
                  <b-form-select-option >租房</b-form-select-option>
                </b-form-select>
              </div>
              <!--类型-->
              <div>
                <b-form-select  class="nice-select search-select ">
                  <template #first>
                    <b-form-select-option :value="null" disabled>类型</b-form-select-option>
                  </template>
                  <b-form-select-option >公寓</b-form-select-option>
                  <b-form-select-option >咖啡馆</b-form-select-option>
                  <b-form-select-option >住宅</b-form-select-option>
                  <b-form-select-option >餐馆</b-form-select-option>
                  <b-form-select-option >商店</b-form-select-option>
                  <b-form-select-option >别墅</b-form-select-option>
                </b-form-select>
              </div>
              <!--房间数-->
              <div>
                <b-form-select  class="nice-select search-select ">
                  <template #first>
                    <b-form-select-option :value="null" disabled>房间数</b-form-select-option>
                  </template>
                  <b-form-select-option >1</b-form-select-option>
                  <b-form-select-option >2</b-form-select-option>
                  <b-form-select-option >3</b-form-select-option>
                  <b-form-select-option >4</b-form-select-option>
                  <b-form-select-option >5</b-form-select-option>
                  <b-form-select-option >6</b-form-select-option>
                </b-form-select>
              </div>
              <!--卫生间数-->
              <div>
                <b-form-select  class="nice-select search-select ">
                  <template #first>
                    <b-form-select-option :value="null" disabled>卫生间数</b-form-select-option>
                  </template>
                  <b-form-select-option >1</b-form-select-option>
                  <b-form-select-option >2</b-form-select-option>
                  <b-form-select-option >3</b-form-select-option>
                  <b-form-select-option >4</b-form-select-option>
                  <b-form-select-option >5</b-form-select-option>
                  <b-form-select-option >6</b-form-select-option>
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

    export default {
        components: {VueSlider},
        name: "MySearch",
        data() {
            return {
                sliderValue: [0, 10000],
            }
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