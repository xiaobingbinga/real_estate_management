<template>
  <div :class="rootClass">
    <h4 :class="titleClass"><span class="text">{{ title }}</span><span class="shape"></span></h4>
    <div :class="innerClass">
      <slot></slot>
    </div>
  </div>
</template>

<script>
  export default {
    name: "HouseModuleThumbnail",
    props: {
      title: {
        type: String,
        require: true
      },
      rootClass: {
        type: String,
        default: 'sidebar'
      },
      titleClass: {
        type: String,
        default: 'sidebar-title'
      },
      innerClass: {
        type: String,
        default: 'sidebar-property-list'
      }
    }
  }
</script>

<style scoped>

</style>