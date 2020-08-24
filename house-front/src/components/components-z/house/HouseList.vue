<template>

    <div :class="rootClass">
        <div class="row">
            <div :class="itemRootClass"
                 v-for="houseInfo in pageInfo.list"
                 :key="houseInfo.id">
                <house-inner :houseInfo="houseInfo">
                    <template #houseDescription="{description}">
                        <div class="desc">
                            <p>{{description}}</p>
                        </div>
                        <a href="single-properties.html" class="read-more">View Property</a>
                    </template>
                </house-inner>
            </div>

        </div>

        <div class="row mt-20">
            <div class="col">
                <b-pagination class="page-pagination"
                              v-model="pageInfo.pageNum"
                              :total-rows="pageInfo.total"
                              :per-page="pageInfo.pageSize"
                              align="center"
                              size="lg"
                              pills
                              @change="changePage"
                              :hide-goto-end-buttons="true"
                              :hide-goto-start-buttons="true"
                              prev-text='< Prev'
                              next-text='Next >'>
                </b-pagination>
            </div>
        </div>
    </div>
</template>

<script>
    import HouseInner from "@/components/components-z/house/HouseInner";

    export default {
        components:{HouseInner},
        props:{
            rootClass:String,
            itemRootClass:String,
            pageInfo:Object
        },
        data:()=>({
        }),
        methods:{
            changePage(pageNum){
                console.log(pageNum)
                this.$emit('changePage',pageNum)
            }
        },
        created() {
        }
    }
</script>

<style scoped>
    ::v-deep .b-pagination-pills .page-item .page-link {
        margin-left: 0;
    }
    ::v-deep .page-pagination li [role='menuitem'] {
        width: auto;
        padding: 10px 20px;
    }
    ::v-deep .page-item.active .page-link {
        background-color: #004395;
        border-color: #004395;
    }
    ::v-deep .page-link:not([aria-checked='true']){
        color: #000000;
        background-color: #f8f8f8;
        border-color: #f8f8f8;
    }
    ::v-deep button.page-link[role='menuitem']:hover,
    ::v-deep button.page-link[aria-checked='false']:hover {
        background-color: #ffc107;
        border-color: #ffc107;
    }

    ::v-deep .page-pagination li span,
    ::v-deep .page-pagination li button {
        padding: 10px;
        width: 44px;
        height: 44px;
    }
</style>
