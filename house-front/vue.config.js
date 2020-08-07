const webpack = require('webpack');
"use strict";
const path = require('path');
const port = process.env.port || process.env.npm_config_port || 80;
function resolve(dir){
    return path.join(__dirname,dir)
}
module.exports = {
    configureWebpack: {
        plugins: [
            new webpack.ProvidePlugin({
                $: 'jquery',
                jQuery: 'jquery',
                'windows.jQuery': 'jquery'
            })
        ]
    },
    lintOnSave: false,
    productionSourceMap: false,
    // css: {
    //     extract: true,
    //     sourceMap: false,
    //     loaderOptions: {},
    //     modules: false
    // },
    chainWebpack: (config) => {
        config.resolve.alias
          .set('components',resolve('./src/components/components-w'))
          .set('views',resolve('./src/views'))
          .set('assets',resolve('./src/assets'))
          .set('api',resolve('./src/api'))
          .set('util',resolve('./src/util'))
          .set('store',resolve('./src/store'))
    },
    devServer: {
        port: port
    }
};