<template>
  <div>
    <house-title title="房产" breadcrumbTitle="房产"></house-title>
    <house-section rootClass="property-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
                   rowClass="row">
      <house-property propertyClass="property-item col-lg-4 col-md-6 col-12 mb-40"
                      v-for="(property, i) in properties"
                      propertyInnerClass="property-inner"
                      :property="property" :key="i"></house-property>
      <house-pagination></house-pagination>
    </house-section>
  </div>
</template>

<script>
  export default {
    name: "index",
    data:()=>({
      currentPage: '1',
      rows: 100,
      properties: [
        {
          id: 1,
          isHot: false,
          isNew: false,
          isAd: false,
          isSpecial: false,
          pictureUrl: 'assets/images/property/property-1.jpg',
          square: 5,
          roomNumber: 6,
          bathroomNumber: 6,
          garageNumber: 6,
          title: '大豪宅',
          address: '锦江区东大街下东大街568号',
          price: '550',
          typeName: '出售'
        },
        {
          id: 1,
          isHot: false,
          isNew: false,
          isAd: false,
          isSpecial: false,
          pictureUrl: 'assets/images/property/property-2.jpg',
          square: 5,
          roomNumber: 6,
          bathroomNumber: 6,
          garageNumber: 6,
          title: '江南宅院',
          address: '锦江区东大街下东大街568号',
          price: '550',
          typeName: '出售'
        },
        {
          id: 1,
          isHot: false,
          isNew: false,
          isAd: false,
          isSpecial: false,
          pictureUrl: 'assets/images/property/property-3.jpg',
          square: 5,
          roomNumber: 6,
          bathroomNumber: 6,
          garageNumber: 6,
          title: '江南宅院',
          address: '锦江区东大街下东大街568号',
          price: '550',
          typeName: '出售'
        },
        {
          id: 1,
          isHot: false,
          isNew: false,
          isAd: false,
          isSpecial: false,
          pictureUrl: 'assets/images/property/property-4.jpg',
          square: 5,
          roomNumber: 6,
          bathroomNumber: 6,
          garageNumber: 6,
          title: '江南宅院',
          address: '锦江区东大街下东大街568号',
          price: '550',
          typeName: '出售'
        },
        {
          id: 1,
          isHot: false,
          isNew: false,
          isAd: false,
          isSpecial: false,
          pictureUrl: 'assets/images/property/property-5.jpg',
          square: 5,
          roomNumber: 6,
          bathroomNumber: 6,
          garageNumber: 6,
          title: '江南宅院',
          address: '锦江区东大街下东大街568号',
          price: '550',
          typeName: '出售'
        },
        {
          id: 1,
          isHot: false,
          isNew: false,
          isAd: false,
          isSpecial: false,
          pictureUrl: 'assets/images/property/property-6.jpg',
          square: 5,
          roomNumber: 6,
          bathroomNumber: 6,
          garageNumber: 6,
          title: '江南宅院',
          address: '锦江区东大街下东大街568号',
          price: '550',
          typeName: '出售'
        },
        {
          id: 1,
          isHot: false,
          isNew: false,
          isAd: false,
          isSpecial: false,
          pictureUrl: 'assets/images/property/property-1.jpg',
          square: 5,
          roomNumber: 6,
          bathroomNumber: 6,
          garageNumber: 6,
          title: '大豪宅',
          address: '锦江区东大街下东大街568号',
          price: '550',
          typeName: '出售'
        },
        {
          id: 1,
          isHot: false,
          isNew: false,
          isAd: false,
          isSpecial: false,
          pictureUrl: 'assets/images/property/property-2.jpg',
          square: 5,
          roomNumber: 6,
          bathroomNumber: 6,
          garageNumber: 6,
          title: '江南宅院',
          address: '锦江区东大街下东大街568号',
          price: '550',
          typeName: '出售'
        },
        {
          id: 1,
          isHot: false,
          isNew: false,
          isAd: false,
          isSpecial: false,
          pictureUrl: 'assets/images/property/property-3.jpg',
          square: 5,
          roomNumber: 6,
          bathroomNumber: 6,
          garageNumber: 6,
          title: '江南宅院',
          address: '锦江区东大街下东大街568号',
          price: '550',
          typeName: '出售'
        }
      ]
    }),
    methods:{
      //需要分页页码数据
      setProperties(){
        this.axios.post('/p/properties/list',{pageNum:1,pageSize:8}).then(result => {
          this.property = result.data.data.list;
          this.rows = result.data.data.total;
        })
      }
    }
  }
</script>

<style scoped>

</style>