
export default{
    // 开启命名空间
    namespaced:true,
    // 属性
    state: {
        menus:[
            {title:'首页',
                url:'/',
                subMenu:[
                    {title:'默认主题的主页',url:'/'},
                    {title:'带推荐广告的主页',url:'/index2'},
                    {title:'带地图显示的主页',url:'/index3'}
                ]},
            {title:'房产',
                url:'/',
                subMenu:[
                    {title:'房产格局显示',url:'/',
                        subMenu:[
                            {title:'默认格局',url:'/'},
                            {title:'左倾式格局',url:'/'},
                            {title:'右倾式格局',url:'/'}
                        ]},
                    {title:'房产列表显示',url:'/',
                        subMenu:[
                            {title: '左倾式',url:'/'},
                            {title: '右倾式',url:'/'}
                        ]},
                    {title:'房产阶梯式显示',url:'/',
                        subMenu:[
                            {title:'单个阶梯',url:'/'},
                            {title:'两个阶梯',url:'/'}
                        ]},
                    {title:'单个房产显示',url:'/',
                        subMenu:[
                            {title:'左倾式',url:'/'},
                            {title:'右倾式',url:'/'}
                        ]}
                ]},
            {title:'房产代理',
                url:'/',
                subMenu:[
                    {title:'代理人显示方式',url:'/',
                        subMenu:[
                            {title:'三列显示',url:'/'},
                            {title:'四列显示',url:'/'}
                        ]},
                    {title:'带阶梯房产代理人显示方式',url:'/',
                        subMenu:[
                            {title: '三列显示',url:'/'},
                            {title: '三列四行显示',url:'/'},
                            {title: '四列显示',url:'/'},
                            {title: '四列两行',url:'/'}
                        ]},
                    {title:'代理人详情',url:'/'},
                ]},
            {title:'房产代理商',
                url:'/',
                subMenu:[
                    {title:'房产代理商',url:'/'},
                    {title:'代理商详情',url:'/'}
                ]},
            {title:'房产新闻',
                url:'/',
                subMenu:[
                    {title:'默认方式显示',url:'/'},
                    {title:'左倾式',url:'/'},
                    {title:'右倾式',url:'/'},
                    {title:'单阶梯式',url:'/'},
                    {title:'两阶梯式',url:'/'},
                    {title:'详情左倾式显示',url:'/'},
                    {title:'详情右倾式显示',url:'/'}
                ]},
            {title:'展示页面',
                url:'/',
                subMenu:[
                    {title:'关于我们',url:'/'},
                    {title:'添加房产',url:'/'},
                    {title:'联系我们',url:'/'},
                    {title:'2列画廊展示',url:'/'},
                    {title:'3列画廊展示',url:'/'},
                    {title:'4列画廊展示',url:'/'},
                    {title:'登录和注册',url:'/'},
                    {title:'我的帐号',url:'/'}
                ]},
        ]
    },
    // 读取属性方法
    getters:{
        menus:(state)=>{
            return state.menus;
        }
    },
    // 写入属性方法
    mutations: {
        addMenu:(state,menu)=>{
            state.menus.push(menu);
        }
    },
    // 异步，读取属性，并可通过mutations修改属性
    actions: {
    }
}
