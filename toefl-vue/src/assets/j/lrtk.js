function getStyle (obj, name) {
  if (obj.currentStyle) {
    return obj.currentStyle[name]
  } else {
    return getComputedStyle(obj, false)[name]
  }
}

function getByClass (oParent, nClass) {
  var eLe = oParent.getElementsByTagName('*')
  var aRrent = []
  for (var i = 0; i < eLe.length; i++) {
    if (eLe[i].className == nClass) {
      aRrent.push(eLe[i])
    }
  }
  return aRrent
}

function startMove (obj, att, add) {
  clearInterval(obj.timer)
  obj.timer = setInterval(function () {
    var cutt = 0
    if (att === 'opacity') {
      cutt = Math.round(parseFloat(getStyle(obj, att)))
    } else {
      cutt = Math.round(parseInt(getStyle(obj, att)))
    }
    var speed = (add - cutt) / 4
    speed = speed > 0 ? Math.ceil(speed) : Math.floor(speed)
    if (cutt === add) {
      clearInterval(obj.timer)
    } else {
      if (att === 'opacity') {
        obj.style.opacity = (cutt + speed) / 100
        obj.style.filter = 'alpha(opacity:' + (cutt + speed) + ')'
      } else {
        obj.style[att] = cutt + speed + 'px'
      }
    }
  }, 30)
}

window.onload = function () {
  var oDiv = document.getElementById('playBox')
  var oPre = getByClass(oDiv, 'pre')[0]
  var oNext = getByClass(oDiv, 'next')[0]
  var oUlBig = getByClass(oDiv, 'oUlplay')[0]
  var aBigLi = oUlBig.getElementsByTagName('li')
  var oDivSmall = getByClass(oDiv, 'smalltitle')[0]
  var aLiSmall = oDivSmall.getElementsByTagName('li')

  function tab () {
    for (var i = 0; i < aLiSmall.length; i++) {
      aLiSmall[i].className = ''
    }
    aLiSmall[now].className = 'thistitle'
    startMove(oUlBig, 'left', -(now * aBigLi[0].offsetWidth))
  }

  var now = 0
  for (var i = 0; i < aLiSmall.length; i++) {
    aLiSmall[i].index = i
    aLiSmall[i].onclick = function () {
      now = this.index
      tab()
    }
  }
  oPre.onclick = function () {
    now--
    if (now === -1) {
      now = aBigLi.length
    }
    tab()
  }
  oNext.onclick = function () {
    now++
    if (now === aBigLi.length) {
      now = 0
    }
    tab()
  }
  var timer = setInterval(oNext.onclick, 3000) // ????????????????????????
  oDiv.onmouseover = function () {
    clearInterval(timer)
  }
  oDiv.onmouseout = function () {
    timer = setInterval(oNext.onclick, 3000) // ????????????????????????
  }
}

function b () {
  // eslint-disable-next-line no-undef
  const h = $(window).height()
  // eslint-disable-next-line no-undef
  t = $(document).scrollTop()
  // eslint-disable-next-line no-undef
  if (t > h) {
    // eslint-disable-next-line no-undef
    $('#gotop').show()
  } else {
    // eslint-disable-next-line no-undef
    $('#gotop').hide()
  }
}

// eslint-disable-next-line no-undef
$(document).ready(function (e) {
  b()
  // eslint-disable-next-line no-undef
  $('#gotop').click(function () {
    // eslint-disable-next-line no-undef
    $(document).scrollTop(0)
  })
})

// eslint-disable-next-line no-undef
$(window).scroll(function (e) {
  b()
})

// ????????????
// eslint-disable-next-line no-undef
$(function () {
  // eslint-disable-next-line no-undef
  $('#goweixin').mouseover(function () {
    // eslint-disable-next-line no-undef
    $('#index_erweima').show()
  })
  // eslint-disable-next-line no-undef
  $('#goweixin').mouseout(function () {
    // eslint-disable-next-line no-undef
    $('#index_erweima').hide()
  })
})
