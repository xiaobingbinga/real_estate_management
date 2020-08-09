<template>
    <div class="page-banner-section section">
        <div class="container">
            <div class="row">
                <div class="col">
                    <h1 class="page-banner-title">房产</h1>
                    <ul class="page-breadcrumb">
                        <li><a href="index.html">主页</a></li>
                        <li class="active">{{title}}</li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        props:{
            title:{
                type:String,
                default:'Properties List Left Sidebar'
            }
        }
    }
</script>

<style scoped>

</style>