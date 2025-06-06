import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import peisongwancheng from '@/views/modules/peisongwancheng/list'
    import yonghu from '@/views/modules/yonghu/list'
    import querenwancheng from '@/views/modules/querenwancheng/list'
    import peisongkuaidi from '@/views/modules/peisongkuaidi/list'
    import peisongxinxi from '@/views/modules/peisongxinxi/list'
    import config from '@/views/modules/config/list'
    import kuaidixinxi from '@/views/modules/kuaidixinxi/list'
    import peisongyuan from '@/views/modules/peisongyuan/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '平台公告',
        component: news
      }
      ,{
	path: '/peisongwancheng',
        name: '配送完成',
        component: peisongwancheng
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/querenwancheng',
        name: '确认完成',
        component: querenwancheng
      }
      ,{
	path: '/peisongkuaidi',
        name: '配送快递',
        component: peisongkuaidi
      }
      ,{
	path: '/peisongxinxi',
        name: '配送信息',
        component: peisongxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/kuaidixinxi',
        name: '快递信息',
        component: kuaidixinxi
      }
      ,{
	path: '/peisongyuan',
        name: '配送员',
        component: peisongyuan
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
