<template>
    <div class="sidebar">
        <h4 class="sidebar-title">
            <span class="text">{{sidebarTitle}}</span>
            <span class="shape"></span>
        </h4>
        <slot name="content"></slot>
    </div>
</template>

<script>
    export default {
        props:{
            sidebarTitle:String
        }
    }
</script>

<style scoped>

</style>