<template>
  <div>
    <house-title title="房产" breadcrumbTitle="房产"></house-title>
    <house-section rootClass="property-section section pt-100 pt-lg-80 pt-md-70 pt-sm-60 pt-xs-50 pb-100 pb-lg-80 pb-md-70 pb-sm-60 pb-xs-50"
                   rowClass="row"
                   leftClass="col-lg-8 col-12 order-1 order-lg-2 mb-sm-50 mb-xs-50"
                   rightClass="col-lg-4 col-12 order-2 order-lg-1 pr-30 pr-sm-15 pr-xs-15">
      <template #left>
        <div class="row">

          <!--Property start-->
          <house-property-details :property="property"></house-property-details>
          <!--Property end-->

          <!--Comment start-->
          <div class="comment-wrap col-12">
            <h3>3 Feedback</h3>

            <ul class="comment-list">
              <li>
                <div class="comment">
                  <div class="image"><img :src="`${publicPath}assets/images/review/review-1.jpg`" alt=""></div>
                  <div class="content">
                    <h5>Alvaro Santos</h5>
                    <div class="d-flex flex-wrap justify-content-between">
                      <span class="time">10 August, 2018  |  10 Min ago</span>
                      <a href="#" class="reply">reply</a>
                    </div>
                    <div class="decs">
                      <p>But I must explain to you how all this mistaken idea of denouncing pleasure and ising pain  borand I will give you a complete account of the system</p>
                    </div>
                  </div>
                </div>
                <ul class="child-comment">
                  <li>
                    <div class="comment">
                      <div class="image"><img :src="`${publicPath}assets/images/review/review-2.jpg`" alt=""></div>
                      <div class="content">
                        <h5>Silvia Anderson</h5>
                        <div class="d-flex flex-wrap justify-content-between">
                          <span class="time">10 August, 2018  |  25 Min ago</span>
                          <a href="#" class="reply">reply</a>
                        </div>
                        <div class="decs">
                          <p>But I must explain to you how all this mistaken idea of denouncing pleasure and ising pain  borand I will give you a complete account of the system</p>
                        </div>
                      </div>
                    </div>
                  </li>
                </ul>
              </li>
              <li>
                <div class="comment">
                  <div class="image"><img :src="`${publicPath}assets/images/review/review-3.jpg`" alt=""></div>
                  <div class="content">
                    <h5>Nicolus Christopher</h5>
                    <div class="d-flex flex-wrap justify-content-between">
                      <span class="time">10 August, 2018  |  35 Min ago</span>
                      <a href="#" class="reply">reply</a>
                    </div>
                    <div class="decs">
                      <p>But I must explain to you how all this mistaken idea of denouncing pleasure and ising pain  borand I will give you a complete account of the system</p>
                    </div>
                  </div>
                </div>
              </li>
            </ul>

            <h3>Leave a Feedback</h3>

            <div class="comment-form">
              <form action="#">
                <div class="row">
                  <div class="col-md-6 col-12 mb-30"><input type="text" placeholder="Name"></div>
                  <div class="col-md-6 col-12 mb-30"><input type="email" placeholder="Email"></div>
                  <div class="col-12 mb-30"><textarea placeholder="Message"/></div>
                  <div class="col-12"><button class="btn">send now</button></div>
                </div>
              </form>
            </div>

          </div>

        </div>
      </template>
      <template #right>
        <house-module-thumbnail title="Search Property">
          <div class="sidebar">


            <!--Property Search start-->
            <div class="property-search sidebar-property-search">

              <from-inner @insurance="jump"/>

            </div>
            <!--Property Search end-->

          </div>

<!--          <house-search-thumbnail></house-search-thumbnail>-->
        </house-module-thumbnail>
        <house-module-thumbnail title="Feature Property">
          <template v-for="(property, i) in properties">
            <house-property-thumbnail :property="property" :key="i"></house-property-thumbnail>
          </template>
        </house-module-thumbnail>
        <house-module-thumbnail title="Top Agents">
          <template v-for="(agent, i) in agents">
            <house-agent-thumbnail :key="i" :agent="agent"></house-agent-thumbnail>
          </template>
        </house-module-thumbnail>
        <house-module-thumbnail title="Popular Tags">
          <div class="sidebar-tags">
            <a href="#">Houses</a>
            <a href="#">Real Home</a>
            <a href="#">Baths</a>
            <a href="#">Beds</a>
            <a href="#">Garages</a>
            <a href="#">Family</a>
            <a href="#">Real Estates</a>
            <a href="#">Properties</a>
            <a href="#">Location</a>
            <a href="#">Price</a>
          </div>
        </house-module-thumbnail>
      </template>
    </house-section>
  </div>
</template>

<script>
  import FromInner from "../../../components/components-j/home/FromInner";
  export default {
    components:{FromInner},
    name: "index",
    data: () => ({
      properties: [
        {
          id: 1,
          rentType: '出租',
          title: '江南宅院',
          pictureUrl: 'assets/images/property/sidebar-property-1.jpg',
          address: '锦江区东大街下东大街568号',
          price: 550
        },
        {
          id: 1,
          rentType: '出租',
          title: '江南宅院',
          pictureUrl: 'assets/images/property/sidebar-property-2.jpg',
          address: '锦江区东大街下东大街568号',
          price: 550
        },
        {
          id: 1,
          rentType: '出租',
          title: '江南宅院',
          pictureUrl: 'assets/images/property/sidebar-property-3.jpg',
          address: '锦江区东大街下东大街568号',
          price: 550
        }
      ],
      agents: [
        {
          id: 1,
          photo: 'assets/images/agent/agent-1.jpg',
          name: 'Donald Palmer',
          phone: '(756) 447 5779',
          properties: 5,
          facebook: 'javascript:;',
          twitter: 'javascript:;',
          linkedin: 'javascript:;',
          google: 'javascript:;'
        },
        {
          id: 2,
          photo: 'assets/images/agent/agent-2.jpg',
          name: 'Donald Palmer',
          phone: '(756) 447 5779',
          properties: 5,
          facebook: 'javascript:;',
          twitter: 'javascript:;',
          linkedin: 'javascript:;',
          google: 'javascript:;'
        },
        {
          id: 3,
          photo: 'assets/images/agent/agent-3.jpg',
          name: 'Donald Palmer',
          phone: '(756) 447 5779',
          properties: 5,
          facebook: 'javascript:;',
          twitter: 'javascript:;',
          linkedin: 'javascript:;',
          google: 'javascript:;'
        }
      ],
      tags: [

      ],
      property: {
        id: 1,
        title: 'Friuli-Venezia Giulia',
        city: '成都',
        address: '八角咖啡',
        rentType: '出租',
        price: '666',
        pictureUrl: 'assets/images/property/single-property-1.jpg',
        videoUrl: 'https://www.bilibili.com/bangumi/play/ss33802/?spm_id_from=333.851.b_62696c695f7265706f72745f616e696d65.9',
        discription: '房产交易平台ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et lore magna iqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut quipx ea codo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolo.',
        square: '550',
        roomNumber: '6',
        bathroomNumber: '6',
        garageNumber: '6',
        kitchenNumber: '6',
        realtyManagement: true,
        electric: true,
        naturalGas: true,
        water: true,
        airConditioning: true,
        furniture: true,
        balcony: true,
        cableTV: true,
        parking: true,
        lift: true,
        pool: true,
        dishwater: true,
        ferigerator: true,
        kitchenUtensils: true
      },
      publicPath: process.env.BASE_URL
    }),
    methods:{
      setProperty(id){
        this.axios.get(`/p/properties/properties-info?id=${id}`).then(result =>{
          console.log(result);
          this.property = result.data.data;
        })
      },
      jump(condition){
        this.$router.push({
          name:'propertiesLeftSidebar',
          params:{
            condition
          }
        })
      }
    },
    created(){
      let id = this.$route.params.id ? this.$route.params.id : this.$route.query.id;
      console.log(id)
      this.setProperty(id);
    }
  }
</script>

<style scoped>

</style>
