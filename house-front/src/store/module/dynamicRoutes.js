export default {
    // 开启命名空间
    namespaced:true,
    // 属性
    state:{
        paths:[
            {
                path:'/display/add-properties',
                name:'AddProperties',
                component:() => import('../../views/Display/AddProperties')
            }
        ],
        loaded:false
    },
    // 读取属性方法
    getters:{
        getPaths:(state)=>{
            return state.paths;
        },
        getLoaded:(state)=>{
            return state.loaded;
        }
    },
    // 写入属性方法
    mutations: {
        addPath:(state,path)=>{
            state.menus.push(path);
        },
        setLoaded:(state,bool)=>{
            state.loaded=bool;
        }
    },
    // 异步，读取属性，并可通过mutations修改属性
    actions: {
    }}

