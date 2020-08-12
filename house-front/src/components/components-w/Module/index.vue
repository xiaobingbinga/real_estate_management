<template>
  <div :class="rootClass">
    <div class="container">
      <!--Section Title start-->
      <template v-show="title">
        <div class="row">
          <div class="col-md-12 mb-60 mb-xs-30">
            <div class="section-title center">
              <h1>{{ title }}</h1>
            </div>
          </div>
        </div>
      </template>
      <!--Section Title end-->
      <div :class="rowClass">
        <!--Property Slider start-->
        <div v-show="contentClass && !leftClass && !rightClass" :class="contentClass">
          <slot name="content"></slot>
        </div>
        <!--Property Slider end-->
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
    name: "HouseModule",
    props: {
      title: {
        type: String,
        default: ''
      },
      rootClass: {
        type: String,
        require: true
      },
      contentClass: {
        type: String,
        default: ''
      },
      rowClass: {
        type: String,
        require: true
      },
      leftClass:{
        type: String,
        default: ''
      },
      rightClass:{
        type: String,
        default: ''
      }
    }
  }
</script>

<style scoped>

</style>