<template>
  <div :class="col === true?'col':''">
    <div class="agent">
      <div class="image">
        <a class="img" href="agent-details.html">
          <img
            :src="agent.photo != null ? agent.photo: publicPath+'assets/images/agent/default.jpg'"
            alt=""></a>
        <div class="social">
          <a :href="agent.facebookUrl" class="facebook"><i class="fa fa-facebook"></i></a>
          <a :href="agent.twitterUrl" class="twitter"><i class="fa fa-twitter"></i></a>
          <a :href="agent.linkedinUrl" class="linkedin"><i class="fa fa-linkedin"></i></a>
          <a :href="agent.googleUrl" class="google"><i class="fa fa-google-plus"></i></a>
        </div>
      </div>
      <div class="content">
        <h4 class="title"><a href="agent-details.html">{{agent.name}}</a></h4>
        <a href="#" class="phone">{{agent.mobile}}</a>
        <a href="#" class="email">{{agent.email}}</a>
        <span class="properties">{{agent.count}}房</span>
      </div>
    </div>
  </div>
</template>

<script>
    export default {
        name: "MyAgent",
        data(){
            return {
              publicPath :process.env.BASE_URL
            }
        },
        props:{
            agent:{
                type:Object,
                default(){
                    return {
                        photo:"assets/images/agent/agent-1.jpg",
                        name:"唐纳德.菲尔",
                        mobile:'(756) 447 5779',
                        email:'info@example.com',
                        count:5,
                        facebookUrl:'#',
                        twitterUrl:"#",
                        linkedinUrl:'#',
                        googleUrl:'#'
                    }
                }
                
            },
            col:{
                type:Boolean,
                default(){
                    return true;
                }
            }
        }
    }
</script>

<style scoped>

</style>