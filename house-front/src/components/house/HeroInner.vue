<template>
    <div class="hero-item" :style="'background-image: url('+heroInfo.url+')'">
        <div class="container">
            <div class="row">
                <div class="col-12">

                    <!--Hero Content start-->
                    <div class="hero-property-content text-center">

                        <h1 class="title"><a href="single-properties.html">{{heroInfo.title}}</a></h1>
                        <span class="location"><img src="assets/images/icons/hero-marker.png" alt=""> {{heroInfo.location}}</span>
                        <div class="type-wrap">
                            <span class="type">{{heroInfo.type}}</span>
                            <span class="price">${{heroInfo.price}} <span>{{heroInfo.priceDay}}</span></span>
                        </div>
                        <ul class="property-feature">
                            <li>
                                <img src="assets/images/icons/hero-area.png" alt=""><span>{{heroInfo.area}} SqFt</span>
                            </li>
                            <li>
                                <img src="assets/images/icons/hero-bed.png" alt=""><span>{{heroInfo.bed}} Bed</span>
                            </li>
                            <li>
                                <img src="assets/images/icons/hero-bath.png" alt=""><span>{{heroInfo.bath}} Bath</span>
                            </li>
                            <li>
                                <img src="assets/images/icons/hero-parking.png" alt=""><span>{{heroInfo.parking}} Garage</span>
                            </li>
                        </ul>


                    </div>
                    <!--Hero Content end-->

                </div>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        props:{
            heroInfo:{
                type:Object,
                default(){
                    return{
                        id:1,
                        url:'assets/images/hero/hero-1.jpg',
                        title:'江南宅院',
                        location:'568 E 1st Ave, Miami',
                        type:'出租',
                        price:'550',
                        priceDay:'Month',
                        area:'550',
                        bed:'6',
                        bath:'4',
                        parking:'3'
                    }
                }
            }
        }
    }
</script>

<style scoped>

</style>