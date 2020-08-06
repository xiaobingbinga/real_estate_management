<template>
  <div class="hero-search">
    <form action="#">
      
      <div v-for="(condition, conditionIndex) in conditions" :key="conditionIndex">
        <h4>{{ condition.title? condition.title:"请选择"}}</h4>
        <div>
          <select id="mySelect" class="nice-select" style=" height:42px ">
            <option v-for="(option,optionIndex ) in  condition.options" :key="optionIndex">{{option}}</option>
          </select>
          
          <!--<b-form-select  class="mb-3 nice-select" style="height: 100%" >-->
          <!--  <b-form-select-option :value="null"-->
          <!--                        v-for="(option,optionIndex ) in  condition.options"-->
          <!--                        :key="optionIndex">-->
          <!--    {{option}}</b-form-select-option>-->
          <!--</b-form-select>-->
        </div>
      </div>
      
      <div>
        <h4>搜索</h4>
        <div class="submit">
          <button>点击这里</button>
        </div>
      </div>
      
    </form>
  </div>
</template>

<script>

    export default {
        name: "HeroSearch",
        props:{
            conditions:{
                type:Array
            }
        }
    }
</script>

<style scoped>

</style>