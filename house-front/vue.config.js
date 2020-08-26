const webpack = require('webpack');
module.exports = {
    publicPath:'/',//访问路径
    assetsDir:'static',//静态资源存放目录
    productionSourceMap:false,//关闭调试
    configureWebpack: {
        plugins: [
            new webpack.ProvidePlugin({
                $: 'jquery',
                jQuery: 'jquery',
                'windows.jQuery': 'jquery'
            })
        ]
    },
    devServer: {
        //自动打开页面
        open: true,
        port: 80,
        proxy:{
            "/p/":{
                target:"http://192.168.12.4:10000",
                changeOrigin: true,
            },
            "/ag/":{
                target:"http://192.168.12.4:10000",
                changeOrigin: true,
            },
            "/p2":{
                target:"http://192.168.12.4:10000",
                changeOrigin: true
            }

        }
    }
};
