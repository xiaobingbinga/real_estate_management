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
            province:{
                label: '省份',
                options: [
                    {value: 1, tip: ''},
                    {value: 2, tip: ''},
                    {value: 3, tip: ''},
                    {value: 4, tip: ''},
                    {value: 5, tip: ''},
                    {value: 6, tip: ''},
                    {value: 7, tip: ''},
                    {value: 8, tip: ''},
                    {value: 9, tip: ''}
                ]
            },
            city: {
                label: '城市',
                options: [
                    {value: 1, tip: '成都'},
                    {value: 2, tip: '北京'},
                    {value: 3, tip: '上海'},
                    {value: 4, tip: '广州'},
                    {value: 5, tip: '深圳'},
                    {value: 6, tip: '重庆'},
                    {value: 7, tip: '武汉'},
                    {value: 8, tip: '沈阳'},
                    {value: 9, tip: '福州'},
                    {value: 10, tip: '厦门'},
                    {value: 11, tip: '银川'},
                    {value: 12, tip: '拉萨'},
                    {value: 13, tip: '绵阳'},
                    {value: 14, tip: '遂宁'},
                    {value: 15, tip: '攀枝花'},
                    {value: 16, tip: '简阳'},
                    {value: 17, tip: '德阳'},
                    {value: 18, tip: '金堂'},
                    {value: 19, tip: '泸州'},
                    {value: 20, tip: '内江'},
                    {value: 21, tip: '阆中'}
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