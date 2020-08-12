const webpack = require('webpack');
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
  devServer: {
      //自动打开页面
      open: true,
    port: 80
  }
};