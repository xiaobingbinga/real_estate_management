<template>
    <div class="sidebar-agent">
        <div class="image">
            <a href="single-properties.html"><img :src="agent.photo" alt=""></a>
        </div>
        <div class="content">
            <h5 class="title"><a href="single-properties.html">{{agent.name}}</a></h5>
            <a href="#" class="phone">{{agent.phone}}</a>
            <span class="properties">{{agent.houseCount}}房</span>
            <div class="social">
                <a href="#" class="facebook"><i class="fa fa-facebook"></i></a>
                <a href="#" class="twitter"><i class="fa fa-twitter"></i></a>
                <a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a>
                <a href="#" class="google"><i class="fa fa-google-plus"></i></a>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        props:{
            agent:Object
        },
        data:()=>({
            publicPath:process.env.BASE_URL
        })
    }
</script>

<style scoped>

</style>
