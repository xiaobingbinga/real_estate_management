<template>
  <div class="sidebar-agent">
    <div class="image">
      <a href="javascript:;" @click="getDetails"><img :src="photo" alt=""></a>
    </div>
    <div class="content">
      <h5 class="title"><a href="javascript:;" @click="getDetails">{{ agent.name }}</a></h5>
      <a href="javascript:;" class="phone">{{ agent.phone }}</a>
      <span class="properties">{{ agent.properties }}房</span>
      <div class="social">
        <a href="facebook" class="facebook"><i class="fa fa-facebook"></i></a>
        <a href="twitter" class="twitter"><i class="fa fa-twitter"></i></a>
        <a href="linkedin" class="linkedin"><i class="fa fa-linkedin"></i></a>
        <a href="google" class="google"><i class="fa fa-google-plus"></i></a>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "HouseAgentThumbnail",
    data: () => ({
      publicPath: process.env.BASE_URL
    }),
    props: {
      agent: {
        type: Object,
        default: {
          id: 1,
          photo: 'assets/images/agent/agent-1.jpg',
          name: 'Donald Palmer',
          phone: '(756) 447 5779',
          properties: 5,
          facebook: 'javascript:;',
          twitter: 'javascript:;',
          linkedin: 'javascript:;',
          google: 'javascript:;'
        }
      }
    },
    computed: {
      photo: function() {
        if (!this.agent.photo){
          return '';
        }else {
          if(this.agent.photo.indexOf('http') != -1){
            return this.agent.photo;
          }else {
            return `${this.publicPath}${this.agent.photo}`;
          }
        }
      }
    },
    methods: {
      getDetails() {
        this.$emit('getDetails', this.agent.id);
      }
    }
  }
</script>

<style scoped>

</style>