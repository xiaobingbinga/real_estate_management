<template>
  <div class="property-search sidebar-property-search">
    <form action="#">

      <div>
        <input type="text" placeholder="位置">
      </div>

      <div>
        <b-form-select v-model="status" style="height: 50px; padding: 15px" :options="property.statuses"></b-form-select>
      </div>

      <div>
        <b-form-select v-model="type" style="height: 50px; padding: 15px" :options="property.types"></b-form-select>
      </div>

      <div>
        <b-form-select v-model="location" style="height: 50px; padding: 15px" :options="property.locations"></b-form-select>
      </div>

      <div>
        <b-form-select v-model="roomNum" style="height: 50px; padding: 15px" :options="property.roomNums"></b-form-select>
      </div>

      <div>
        <b-form-select v-model="toiletNum" style="height: 50px; padding: 15px" :options="property.toiletNums"></b-form-select>
      </div>

      <div>
        <vue-slider v-model="price"
                    :dotSize="20"
                    :max="100000"
                    :height="10"
                    tooltip="always"
                    :tooltip-formatter="'￥{value}'"></vue-slider>
      </div>

      <div class="submit">
        <button>点击这里</button>
      </div>

    </form>
  </div>
</template>

<script>
  import VueSlider from 'vue-slider-component'
  import 'vue-slider-component/theme/default.css'
  export default {
    name: "HouseSearchThumbnail",
    components: {
      VueSlider
    },
    data: () => ({
      status: null,
      type: null,
      location: null,
      roomNum: null,
      toiletNum: null,
      price: [0,50000]
    }),
    props: {
      property: {
        type: Object,
        default: () => {
          return {
            statuses: [
              {value: null, text: '请选择状态', disabled: true},
              {value: 1, text: '租房'},
              {value: 2, text: '买房'}
            ],
            types: [
              {value: null, text: '请选择类型', disabled: true},
              {value: 1, text: '公寓'},
              {value: 2, text: '咖啡馆'},
              {value: 3, text: '住宅'},
              {value: 4, text: '餐馆'},
              {value: 5, text: '商店'},
              {value: 6, text: '别墅'}
            ],
            locations: [
              {value: null, text: '请选择地理位置', disabled: true},
              {value: 1, text: '成都'},
              {value: 2, text: '北京'},
              {value: 3, text: '上海'},
              {value: 4, text: '广州'},
              {value: 5, text: '深圳'},
              {value: 6, text: '重庆'},
              {value: 7, text: '武汉'},
              {value: 8, text: '沈阳'},
              {value: 9, text: '福州'},
              {value: 10, text: '厦门'},
              {value: 11, text: '银川'},
              {value: 12, text: '拉萨'},
              {value: 13, text: '绵阳'},
              {value: 14, text: '遂宁'},
              {value: 15, text: '攀枝花'},
              {value: 16, text: '简阳'},
              {value: 17, text: '德阳'},
              {value: 18, text: '金堂'},
              {value: 19, text: '泸州'},
              {value: 20, text: '内江'},
              {value: 21, text: '阆中'}
            ],
            roomNums: [
              {value: null, text: '请选择房间数', disabled: true},
              {value: 1, text: '1'},
              {value: 2, text: '2'},
              {value: 3, text: '3'},
              {value: 4, text: '4'},
              {value: 5, text: '5'},
              {value: 6, text: '6'}
            ],
            toiletNums: [
              {value: null, text: '请选择卫生间数', disabled: true},
              {value: 1, text: '1'},
              {value: 2, text: '2'},
              {value: 3, text: '3'},
              {value: 4, text: '4'},
              {value: 5, text: '5'},
              {value: 6, text: '6'}
            ]
          }
        }
      }
    }
  }
</script>

<style scoped>

</style>