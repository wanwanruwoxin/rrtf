<template>
  <div class="doc1180">
    <div class="header">
      <div class="logo"><a href="####"><img src="@/assets/i/logo.png"></a></div>
      <div class="headerUser">
        <ul>
          <li class="headerUserPic"><a href="###"><img src="@/assets/i/30x30.png"></a></li>
          <li class="headerUserName"><a href="###">用户名ABCDEF</a></li>
          <li class="headerUserNotice">通知<a href="###">14</a></li>
        </ul>
      </div>
    </div>
  </div>

  <div class="menu">
    <div class="doc1180">
      <div class="menuLink">
        <ul class="fn-clear">
          <li class="active"><a href="main.html" target="ifr">首页</a></li>
          <li class="dropdown" @click="isShow()">
            <a class="dropdown-toggle" style="cursor: pointer;">
              系统管理 <span class="caret"></span>
            </a>
            <div class="layer" :class="{open: isOpen1 }" v-if="flag1 === true">
              <ul>
                <li><a href="系统管理员/系统管理-课程活动.html" style="cursor: pointer;">课程活动</a></li>
                <li>
                  <RouterLink to="/admin/link" style="cursor: pointer;">
                    网站链接
                  </RouterLink>
                </li>
              </ul>
            </div>

          </li>
          <li class="dropdown" @click="isShow2()">
            <a class="dropdown-toggle" style="cursor: pointer;">
              用户管理 <span class="caret"></span>
            </a>
            <div v-if="flag2 === true" class="layer" :class="{open: isOpen2 }">
              <ul>
                <li><a href="系统管理员/系统管理-讲师列表.html" target="ifr" style="cursor: pointer;">讲师管理</a></li>
                <li><a href="系统管理员/系统管理-用户列表.html" target="ifr" style="cursor: pointer;">用户管理</a></li>
              </ul>
            </div>

          </li>
          <li><a href="系统管理员/系统管理-托福人列表.html" target="ifr">托福人</a></li>
          <li><a href="系统管理员/系统管理-群组列表.html" target="ifr">群组聊天</a></li>
          <li><a href="系统管理员/系统管理-公开课列表.html" target="ifr">公开课</a></li>
          <li><a href="系统管理员/系统管理-福利城堡列表.html" target="ifr">福利城堡</a></li>
        </ul>
      </div>
      <div class="fenxiang">
        <a href="#" class="weibo"><img src="@/assets/i/weibo.png" ></a>
        <a href="#" class="weixin"><img src="@/assets/i/weixin.png" ></a>
      </div>
    </div>
  </div>

  <router-view/>
  <!--  footer-->
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
import { ref } from 'vue'
export default {
  name: 'admin-page',
  setup () {
    const isOpen1 = ref(false)
    const isOpen2 = ref(false)
    const flag1 = ref(false)
    const flag2 = ref(false)
    const isShow = () => {
      isOpen1.value = !isOpen1.value
      flag1.value = !flag1.value
    }
    const isShow2 = () => {
      isOpen2.value = !isOpen2.value
      flag2.value = !flag2.value
    }
    return {
      isOpen1,
      isOpen2,
      flag1,
      flag2,
      isShow,
      isShow2
    }
  }
}
</script>

<style scoped lang="less">
@import "../../assets/c/toefl.css";
@import "../../assets/c/base.css";
// 二级类名弹层
.layer {
  &.open {
    height: 100px;
    opacity: 1;
    z-index: 100;
  }
  width: 400px;
  background-color: #fff;
  position: absolute;
  left: -200px;
  top: 56px;
  height: 0;
  overflow: hidden;
  opacity: 0;
  box-shadow: 0 0 5px #ccc;
  //transition: all .2s .1s;
  color: black;
  ul {
    display: flex;
    flex-wrap: wrap;
    padding: 0 70px;
    align-items: center;
    height: 100px;
    li {
      width: 50%;
      text-align: center;
      p {
        padding-top: 10px;
      }
      &:hover {
        p {
          color: #27BA9B;
        }
      }
      a {
        color: black;
        background-color: #1ab592;
        &:hover {
          color: white;
          background-color: #1b6d85;
        }
      }
    }
  }
}
</style>
