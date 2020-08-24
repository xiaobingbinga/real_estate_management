<template>
  <b-pagination v-model="page"
                pills
                first-text="<< First"
                :per-page="perPage"
                :total-rows="rows"
                prev-text="< Prev"
                next-text="Next >"
                last-text="Last >>" class="house-page">
    <template #first-text><i class="fa fa-angle-double-left"></i><span>     </span>Frist</template>
  </b-pagination>
</template>

<script>
  export default {
    name: "HousePagination",
    props: {
      currentPage: {
        type: Number,
        default: 3,
      },
      rows: {
        type: Number,
        default: 90
      },
      perPage: {
        type: Number,
        default: 9
      }
    },
    data:() => ({
      page: 1,
    }),
    watch: {
      page: function(newCurrentPage) {
        this.$emit('update:currentPage', newCurrentPage)
      }
    },
    created() {
      this.page = this.currentPage;
    }
  }
</script>

<style scoped>
  .house-page{
    width: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
  }
  ::v-deep li.page-item{
    font-size: 16px;
    line-height: 24px;
    font-family: "Poppins", sans-serif;
    color: #222222;
    font-weight: 400;
    text-align: center;
    margin: 5px 10px;
  }
  ::v-deep li.page-item .page-link{
    border: none;
    background-color: #f8f8f8;
    display: flex;
    justify-content: center;
    align-items: center;
    /*width: 45px;*/
    height: 45px;
    padding: 0 17px;
  }
  ::v-deep li.page-item .page-link:hover{
    background-color: #f9c322;
    display: flex;
    justify-content: center;
    align-items: center;
    /*width: 45px;*/
    height: 45px;
    padding: 0 17px;
  }
  ::v-deep li.page-item.active .page-link{
    background-color: rgb(0, 67, 149) !important;
  }
</style>