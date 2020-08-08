import Vue from 'vue';

const path = require('path');
const fs = require('fs');
const requireComponent = require.context('.', true, /\.vue$/);
requireComponent.keys().forEach(fileName => {
  const config = requireComponent(fileName);
  // console.log();
  Vue.component(config.default.name, config.default || config);
});
function mapDir(dir, get, finish) { // eslint-disable-line no-unused-vars
  fs.readdir(dir, function(err, files) {
    if (err) {
      console.error('玛德什么问题');
      return;
    }
    files.forEach((filename, index) => {
      let pathname = path.join(dir, filename);
      fs.stat(pathname, (err, stats) => {
        if (err) {
          console.log('烦死了烦死了');
          return;
        }
        if (stats.isDirectory()) {
          mapDir(pathname, get, finish);
        } else if (stats.isFile()) {
          if (['.js'].includes(path.extname(pathname))) {
            return;
          }
          fs.readFile(pathname, (err, data) => {
            if (err) {
              console.error(err);
              return;
            }
            if(get) get(data);
          })
        }
      });
      if (index === files.length - 1) {
        if(finish) finish();
      }
    })
  })
}