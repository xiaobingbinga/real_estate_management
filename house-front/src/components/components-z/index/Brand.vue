<template>
    <div class="brand-section section pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50">
        <div class="container">

            <!--Section Title start-->
            <div class="row">
                <div class="col-md-12 mb-60 mb-xs-30">
                    <div class="section-title center">
                        <h1>合作伙伴</h1>
                    </div>
                </div>
            </div>
            <!--Section Title end-->

            <div class="row">

                <!--Brand Slider start-->
                <div class="brand-carousel section d-flex justify-content-around">
                    <div class="brand col"><img src="assets/images/brands/brand-1.png" alt=""></div>
                    <div class="brand col"><img src="assets/images/brands/brand-2.png" alt=""></div>
                    <div class="brand col"><img src="assets/images/brands/brand-3.png" alt=""></div>
                    <div class="brand col"><img src="assets/images/brands/brand-4.png" alt=""></div>
                    <div class="brand col"><img src="assets/images/brands/brand-5.png" alt=""></div>
                    <div class="brand col"><img src="assets/images/brands/brand-6.png" alt=""></div>
                </div>
                <!--Brand Slider end-->

            </div>

        </div>
    </div>
</template>

<script>
    export default {
        props:{
            list:{
                type:Array,
                default(){
                    return [
                        "assets/images/brands/brand-1.png",
                        "assets/images/brands/brand-2.png",
                        "assets/images/brands/brand-3.png",
                        "assets/images/brands/brand-4.png",
                        "assets/images/brands/brand-5.png",
                        "assets/images/brands/brand-6.png"
                    ]
                }
            }
        }
    }
</script>

<style scoped>

</style>