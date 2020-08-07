const state = {
  menus: [
    { title: '主页',
      url: '/',
      subMenus: [
        { title: '默认主题的主页', url: '/' },
        { title: '带推荐广告的主页', url: '/index2' },
        { title: '带地图显示的主页', url: '/index3' }
      ]
    },

    {
      title: '房产',
      url: '/',
      subMenus: [
        {
          title: '房产格局显示',
          url: '/',
          subMenus: [
            { title: '默认格局', url: '/' },
            { title: '左倾式格局', url: '/' },
            { title: '右倾式格局', url: '/' }
          ]
        },
        {
          title: '房产列表显示',
          url: '/',
          subMenus: [
            { title: '左倾式', url: '/' },
            { title: '右倾式', url: '/' }
          ]
        },
        { title: '房产阶梯式显示',
          url: '/',
          subMenus: [
            { title: '单个阶梯', url: '/' },
            { title: '两个阶梯', url: '/' }
          ]
        },

        {
          title: '单个房产显示',
          url: '/',
          subMenus: [
            { title: '左倾式', url: '/' },
            { title: '右倾式', url: '/' }
          ]
        },
      ]
    },

    {
      title: '房产代理',
      url: '/',
      subMenus: [
        {
          title: '代理人显示方式',
          url: '/',
          subMenus: [
            { title: '三列显示', url: '/' },
            { title: '四列显示', url: '/' }
          ]
        },
        {
          title: '带阶梯房产代理人显示方式',
          url: '/',
          subMenus: [
            { title: '三列显示', url: '/' },
            { title: '三列四行显示', url: '/' },
            { title: '四列显示', url: '/' },
            { title: '四列两行显示', url: '/' }
          ]
        },
        {
          title: '代理人详情',
          url: '/'
        }
      ]
    },

    {
      title: '房产代理商',
      url: '/',
      subMenus: [
        { title: '房产代理商', url: '/' },
        { title: '代理商详情', url: '/' }
      ]
    },

    {
      title: '房产新闻',
      url: '/',
      subMenus: [
        { title: '默认方式显示', url: '/' },
        { title: '左倾式', url: '/' },
        { title: '右倾式', url: '/' },
        { title: '单阶梯式', url: '/' },
        { title: '两阶梯式', url: '/' },
        { title: '详情左倾式显示', url: '/' },
        { title: '详情右倾式显示', url: '/' }
      ]
    },

    {
      title: '房产代理',
      url: '/',
      subMenus: [
        { title: '关于我们', url: '/' },
        { title: '添加房产', url: '/' },
        { title: '联系我们', url: '/' },
        { title: '2列画廊展示', url: '/' },
        { title: '3列画廊展示', url: '/' },
        { title: '4列画廊展示', url: '/' },
        { title: '登录和注册', url: '/' },
        { title: '我的帐号', url: '/' }
      ]
    },
  ],
  links: [
    {title: 'Rental Builidngs', url: '/'},
    {title: 'Browe all Categories', url: '/'},
    {title: 'Top Mortagages Rates', url: '/'},
    {title: 'RentalTerms of use', url: '/'},
    {title: 'Privacy Policy', url: '/'}
  ],
  phones: [
    { num: '+012 345 678 102', url: '/' },
    { num: '+012 345 678 101', url: '/' }
  ],
  emails: [
    { email: 'info@example.com', url: '/' },
    { email: 'www.example.com', url: '/' }
  ],
  address: '成都市高新区公兴保税区256号',

};

const getters = {
  menus: state => state.menus,
  links: state => state.links,
  address: state => state.address,
  phones: state => state.phones,
  emails: state => state.emails
};

const view = {
  namespaced: true,
  state,
  getters
};

export default view;