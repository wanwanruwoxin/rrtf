<template>
  <div class="doc1180">
    <div class="header">
      <div class="logo"><a href="####"><img src="@/assets/i/logo.png"></a></div>
      <div class="headerLink">
        <a class="###">登录</a>
        <a class="###">注册</a>
      </div>
    </div>
  </div>
  <div class="menu">
    <div class="doc1180">
      <div class="menuLink">
        <ul class="fn-clear">
          <li><a href="###">首页</a></li>
          <li><a href="###">托福人</a></li>
          <li><a href="###">公开课</a></li>
          <li><a href="###">群组聊</a></li>
          <li><a href="###">自习室</a></li>
          <li><a href="###">福利城堡</a></li>
        </ul>
      </div>
      <div class="fenxiang">
        <a href="#" class="weibo"><img src="@/assets/i/weibo.png"></a>
        <a href="#" class="weixin"><img src="@/assets/i/weixin.png"></a>
      </div>
    </div>
  </div>
  <div class="doc1180">
    <div class="login">
      <div class="login_left">
        <h3 class="login_h3">新用户注册</h3>
        <div class="login_sr"><input type="text" class="login_inputYhm" placeholder="用户名" v-model="user.loginName"></div>
        <div class="login_sr"><input type="text" class="login_inputMm" placeholder="密码" v-model="user.password"></div>
        <div class="login_sr"><input type="text" class="login_inputEmail" placeholder="邮箱" v-model="user.email"></div>
        <div class="login_sr fn-clear"><input name="" type="text" class="login_inputYzm" placeholder="验证码">
          <div class="login_inputYzmPic"><img src="@/assets/i/yzm.png"></div>
          <a href="###" class="login_inputYzmH">看不清，还一张</a></div>
        <div class="login_xieyi"><input name="" type="checkbox" value=""
                                        style="margin-right:10px; vertical-align:middle;">我同意<a
          href="###">《人人托福网服务协议》</a></div>
        <div><a href="###" class="login_Button">注册</a></div>
        <div class="login_zcymm"><span>已有帐号？</span><a href="###">马上登录</a><a href="###" class="login_zhmm">找回密码</a></div>
      </div>
      <div class="login_right">
        <div class="login_rightH3">您也可以使用以下方式登录：</div>
        <div class="login_sanfang"><a href="###"><img src="@/assets/i/login_wb.png">新浪微博</a></div>
        <div class="login_sanfang"><a href="###"><img src="@/assets/i/login_qq.png">QQ登录</a></div>
        <div class="login_sanfang"><a href="###"><img src="@/assets/i/login_qw.png">腾讯微博</a></div>
        <div class="login_sanfang"><a href="###"><img src="@/assets/i/login_rr.png">人人网</a></div>
        <div class="login_shouquan">授权后表明你已同意 <a href="###">《人人托福网服务协议》</a></div>
      </div>
    </div>
  </div>
  <div class="flink">
    <div class="flinkTop"></div>
    <div class="flinkBody">
      <h3>友情链接</h3>
      <ul>
        <li>友情连接友情连接</li>
        <li>友情连接友情连接</li>
        <li>友情连接友情连接</li>
        <li>友情连接友情连接</li>
        <li>友情连接友情连接</li>
        <li>友情连接友情连接</li>
        <li>友情连接友情连接</li>
      </ul>
    </div>
  </div>
  <div class="footer">
    <div class="doc1180">
      <div class="footerLink">
        <a href="###">人人托福</a>|
        <a href="###">联系我们</a>|
        <a href="###">招聘信息</a>|
        <a href="###">合作媒体</a>|
        <a href="###">意见反馈</a>|
        <a href="###">版权说明</a>
      </div>
      <div class="footerTxet">©2014 – xuanke.com All rights reserved. 京ICP备14022672号-1</div>
    </div>
  </div>
</template>

<script>
import { reactive } from 'vue'
import axios from 'axios'
import { useRouter } from 'vue-router'

export default {
  name: 'register-page',
  setup () {
    const user = reactive({
      loginName: '',
      password: '',
      email: ''
    })
    const router = useRouter()
    const register = () => {
      axios.post('/api/register', user).then(res => {
        console.log(res.data.data)
        router.push({ path: '/' })
      })
    }
    return {
      user,
      register
    }
  }
}
</script>

<style scoped>
@import "../../assets/c/toefl.css";
@import "../../assets/c/base.css";
</style>
