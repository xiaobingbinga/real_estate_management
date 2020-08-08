<template>
  <!--Agent satrt-->
  <div :class="agentClass">
    <div :class="agentInnerClass">
      <div class="image">
        <a class="img" :href="agentUrl"><img :src="`${publicPath}${agent.photo}`" alt=""></a><div class="social">
        <a :href="agent.facebook || 'javascript:;'" class="facebook"><i class="fa fa-facebook"></i></a>
        <a :href="agent.twitter || 'javascript:;'" class="twitter"><i class="fa fa-twitter"></i></a>
        <a :href="agent.linkedin || 'javascript:;'" class="linkedin"><i class="fa fa-linkedin"></i></a>
        <a :href="agent.google || 'javascript:;'" class="google"><i class="fa fa-google-plus"></i></a>
      </div>
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
    name: "HouseAgent",
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
            facebook: 'javascript:;',
            twitter: 'javascript:;',
            linkedin: 'javascript:;',
            google: 'javascript:;',
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