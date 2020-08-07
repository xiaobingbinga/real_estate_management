export default {
    namespaced:true,
    state:{
        agentList:[
            {
                id:1,
                photo:'assets/images/agent/agent-1.jpg',
                name:'唐纳德.菲尔',
                phone:'(756) 447 5779',
                email:'info@example.com',
                houseCount:5
            },{
                id:2,
                photo:'assets/images/agent/agent-2.jpg',
                name:'唐纳德.菲尔',
                phone:'(756) 447 5779',
                email:'info@example.com',
                houseCount:5
            },{
                id:3,
                photo:'assets/images/agent/agent-3.jpg',
                name:'唐纳德.菲尔',
                phone:'(756) 447 5779',
                email:'info@example.com',
                houseCount:5
            },{
                id:4,
                photo:'assets/images/agent/agent-4.jpg',
                name:'唐纳德.菲尔',
                phone:'(756) 447 5779',
                email:'info@example.com',
                houseCount:5
            }
        ],

    },
    getters:{
        agentList: state => state.agentList
    },
    mutations:{},
    actions:{},
    modules:{}
}