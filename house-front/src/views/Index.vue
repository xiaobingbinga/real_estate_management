<template>
  <div>
    <house-special title="特色房产" :list="houseList">
      <template #item="{itemData}">
        <div class="property-item col">

          <house-inner :houseInfo="itemData"></house-inner>

        </div>
      </template>
    </house-special>
  </div>
</template>

<script>
// @ is an alias to /src
import houseSpecial from '@/components/index/MySlot.vue'
import houseInner from '@/components/house/HouseInner.vue'
export default {
  components: {
    houseSpecial,
    houseInner
  },
  data(){
    return{
      houseList:[{
        id:1,
        pictureUrl:'assets/images/property/property-1.jpg',
        square:550,
        roomNumber:5,
        bathroomNumber:1,
        garageNumber:2,
        title:'江南宅院',
        address:'锦江区东大街下东大街568号',
        rentType:1,
        price:550,
        leaseType:1,
        isHot:1,
        isNew:2,
        isSpecial:1,
      },
        {
          id:2,
          pictureUrl:'assets/images/property/property-1.jpg',
          square:550,
          roomNumber:5,
          bathroomNumber:1,
          garageNumber:2,
          title:'江南宅院',
          address:'锦江区东大街下东大街568号',
          rentType:1,
          price:550,
          leaseType:1,
          isHot:1,
          isNew:2,
          isSpecial:1,
        },
        {
          id:3,
          pictureUrl:'assets/images/property/property-1.jpg',
          square:550,
          roomNumber:5,
          bathroomNumber:1,
          garageNumber:2,
          title:'江南宅院',
          address:'锦江区东大街下东大街568号',
          rentType:1,
          price:550,
          leaseType:1,
          isHot:1,
          isNew:2,
          isSpecial:1,
        },
        {
          id:4,
          pictureUrl:'assets/images/property/property-1.jpg',
          square:550,
          roomNumber:5,
          bathroomNumber:1,
          garageNumber:2,
          title:'江南宅院',
          address:'锦江区东大街下东大街568号',
          rentType:1,
          price:550,
          leaseType:1,
          isHot:1,
          isNew:2,
          isSpecial:1,
        },
        {
          id:5,
          pictureUrl:'assets/images/property/property-1.jpg',
          square:550,
          roomNumber:5,
          bathroomNumber:1,
          garageNumber:2,
          title:'江南宅院',
          address:'锦江区东大街下东大街568号',
          rentType:1,
          price:550,
          leaseType:1,
          isHot:1,
          isNew:2,
          isSpecial:1,
        }
      ],
    }
  }
}
</script>
