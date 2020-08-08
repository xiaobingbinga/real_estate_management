<template>
  <div class="page-banner-section section">
    <div class="container">
      <div class="row">
        <div class="col">
          <h1 class="page-banner-title">{{ title }}</h1>
          <ul class="page-breadcrumb">
            <li><a href="index.html">主页</a></li>
            <li class="active">{{ breadcrumbTitle }}</li>
          </ul>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "HouseTitle",
    props: {
      title: {
        type: String,
        require: true
      },
      breadcrumbTitle: {
        type: String,
        require: true
      }
    }
  }
</script>

<style scoped>

</style>