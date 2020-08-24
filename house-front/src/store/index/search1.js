export default {
    namespaced: true,
    state: {
        search: {
            rentType: {
                label: '状态',
                options: [
                    {value: 1, tip: '租房'}, {value: 2, tip: '卖房'}
                ]
            },
            leaseTermType:{
                label: '租期类型',
                options: [
                    {value: 1,tip:'按天计'},
                    {value: 2,tip:'按周计'},
                    {value: 3,tip:'按月计'},
                    {value: 4,tip:'按年计'},
                ]
            },
            houseType: {
                label: '类型',
                options: [
                    {value: 1, tip:'公寓'},
                    {value: 2, tip:'咖啡馆'},
                    {value: 3, tip:'住宅'},
                    {value: 4, tip:'餐馆'},
                    {value: 5, tip:'商店'},
                    {value: 6, tip:'别墅'}
                ]
            },
            constructionYear:{
                label:'建造年份',
                options:[
                    {value:1,tip:'1 年以上'},
                    {value:2,tip:'2 年以上'},
                    {value:3,tip:'3 年以上'},
                    {value:4,tip:'4 年以上'},
                    {value:5,tip:'5 年以上'},
                    {value:6,tip:'6 年以上'},
                    {value:7,tip:'7 年以上'},
                    {value:8,tip:'8 年以上'},
                    {value:9,tip:'9 年以上'}
                ]
            },
            roomNumber: {
                label: '房间数',
                options: [
                    {value: 1, tip: '1'},
                    {value: 2, tip: '2'},
                    {value: 3, tip: '3'},
                    {value: 4, tip: '4'},
                    {value: 5, tip: '5'},
                    {value: 6, tip: '6'}
                ]
            },
            bathroomNumber: {
                label: '卫生间数量',
                options: [
                    {value: 1, tip: '1'},
                    {value: 2, tip: '2'},
                    {value: 3, tip: '3'},
                    {value: 4, tip: '4'},
                    {value: 5, tip: '5'},
                    {value: 6, tip: '6'}
                ]
            },
            kitchen:{
                label:'厨房数量',
                options:[
                    {value:1,tip:'1'},
                    {value:2,tip:'2'},
                    {value:3,tip:'3'}
                ]
            },
            parkingSpace:{
                label:'车位数量',
                options:[
                    {value:1,tip:'1'},
                    {value:2,tip:'2'},
                    {value:3,tip:'3'}
                ]
            },
            bool:{
                label:'是否含有',
                options:[
                    {value:0,tip:'没有'},
                    {value:1,tip:'有'}
                ]
            }
        }
    },
    getters: {
        search: state => state.search
    },
    mutations: {},
    actions: {},
    modules: {}
}