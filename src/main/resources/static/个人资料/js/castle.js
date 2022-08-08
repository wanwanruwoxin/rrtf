	$(function() {
		$("#gongyi").click(function(e) {
			$(".flcb_cardMenu>ul>li").removeClass("on");
			$(e.currentTarget).parent().addClass("on");
			$("#gongyiContent").css("display","block");
			$("#teseContent").css("display","none");
			$("#mingshiContent").css("display","none");
			$("#wodeContent").css("display","none");
		})
		$("#tese").click(function(e) {
			$(".flcb_cardMenu>ul>li").removeClass("on");
			$(e.currentTarget).parent().addClass("on");
			$("#gongyiContent").css("display","none");
			$("#teseContent").css("display","block");
			$("#mingshiContent").css("display","none");
			$("#wodeContent").css("display","none");
		})
		$("#mingshi").click(function(e) {
			$(".flcb_cardMenu>ul>li").removeClass("on");
			$(e.currentTarget).parent().addClass("on");
			$("#gongyiContent").css("display","none");
			$("#teseContent").css("display","none");
			$("#mingshiContent").css("display","block");
			$("#wodeContent").css("display","none");
		})
		$("#wode").click(function(e) {
			$(".flcb_cardMenu>ul>li").removeClass("on");
			$(e.currentTarget).parent().addClass("on");
			$("#gongyiContent").css("display","none");
			$("#teseContent").css("display","none");
			$("#mingshiContent").css("display","none");
			$("#wodeContent").css("display","block");
		})
	})