import { createStore } from 'vuex'
import createPersistedState from 'vuex-persistedstate'
export default createStore({
  state: {
    user: {
      loginName: '',
      status: ''
    }
  },
  getters: {
  },
  mutations: {
    setUser (state, payload) {
      state.user.loginName = payload.loginName
      state.user.status = payload.status
    }
  },
  actions: {
    login (ctx, payload) {
      ctx.commit('setUser', payload)
    }
  },
  modules: {
  },
  // 配置插件
  plugins: [
    // 默认存储在localStorage
    createPersistedState({
      // 本地存储名字
      key: 'toefl',
      // 指定需要存储的模块
      paths: ['user']
    })
  ]
})
