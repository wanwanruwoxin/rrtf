import { createRouter, createWebHashHistory } from 'vue-router'

const routes = [
  // 一级路由布局容器
  {
    path: '/login',
    component: () => import('@/views/login/index')
  },
  {
    path: '/',
    component: () => import('@/views/main/index')
  },
  {
    path: '/register',
    component: () => import('@/views/register/index')
  },
  {
    path: '/admin',
    component: () => import('@/views/main/admin'),
    children: [
      { path: '/admin', component: () => import('@/views/main/main-footer') },
      { path: '/admin/link', component: () => import('@/views/main/link') }
    ]
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
