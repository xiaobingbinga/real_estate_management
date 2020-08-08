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
          <div class="property-search">
            <from-inner/>
          </div>
        
        </div>
      </div>
    
    </div>
  </div>
</template>

<script>
    import FromInner from "./FromInner";

    export default {
        components: {FromInner}


    }
</script>

<style>

</style>