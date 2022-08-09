import request from '@/utils/request'

export const userAccountLogin = ({ username, password }) => {
  return request('/login', 'post', { username, password })
}
