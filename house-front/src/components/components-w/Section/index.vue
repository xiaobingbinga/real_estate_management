<template>
  <div :class="rootClass">
    <div class="container">
      <div class="row">
        <template v-show="!rightClass && !leftClass" >
          <slot></slot>
        </template>
        <div v-show="leftClass" :class="leftClass">
          <slot name="left"></slot>
        </div>
        <div v-show="rightClass" :class="rightClass">
          <slot name="right"></slot>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "HouseSection",
    props: {
      rootClass: {
        type: String,
        require: true
      },
      leftClass: {
        type: String,
        default: 'col-lg-8 col-12 order-1 order-lg-2 mb-sm-50 mb-xs-50'
      },
      rightClass: {
        type: String,
        default: 'col-lg-4 col-12 order-2 order-lg-1 pr-30 pr-sm-15 pr-xs-15'
      }
    }
  }
</script>

<style scoped>

</style>