<template>
  <!--Agent satrt-->
  <div :class="agentClass">
    <div :class="agentInnerClass">
      <div class="image">
        <a class="img" :href="agentUrl"><img :src="`${publicPath}${agent.photo}`" alt=""></a>
      </div>
      <div class="content">
        <h4 class="title"><a :href="agentUrl">{{agent.name}}</a></h4>
        <a href="#" class="phone">{{agent.phone}}</a>
        <a href="#" class="email">{{agent.email}}</a>
        <span class="properties">{{agent.properties}}房</span>
      </div>
    </div>
  </div>
  <!--Agent end-->
</template>

<script>
  export default {
    name: "index",
    data () {
      return {
        publicPath: process.env.BASE_URL
      }
    },
    props: {
      agentClass: {
        type: String,
        default: 'col'
      },
      agentInnerClass: {
        type: String,
        default: 'agent'
      },
      agent: {
        type: Object,
        default: () => {
          return {
            id: 1,
            photo: 'assets/images/agent/agent-1.jpg',
            name: '唐纳德.菲尔',
            phone: '(756) 447 5779',
            email: 'info@example.com',
            properties: 5
          }
        }
      },
      agentUrl: {
        type: String,
        default: 'javascript:;'
      }
    }
  }
</script>

<style scoped>

</style>