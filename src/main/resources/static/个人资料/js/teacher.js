	$(function() {
		$("#article").click(function(e) {
			$(".classInfo_menu>ul>li").removeClass("on");
			$(e.currentTarget).parent().addClass("on");
			$("#articleContent").css("display","block");
			$("#publicClassContent").css("display","none");
			$("#castleContent").css("display","none");
			$("#commentContent").css("display","none");
		})
		$("#publicClass").click(function(e) {
			$(".classInfo_menu>ul>li").removeClass("on");
			$(e.currentTarget).parent().addClass("on");
			$("#articleContent").css("display","none");
			$("#publicClassContent").css("display","block");
			$("#castleContent").css("display","none");
			$("#commentContent").css("display","none");
		})
		$("#castle").click(function(e) {
			$(".classInfo_menu>ul>li").removeClass("on");
			$(e.currentTarget).parent().addClass("on");
			$("#articleContent").css("display","none");
			$("#publicClassContent").css("display","none");
			$("#castleContent").css("display","block");
			$("#commentContent").css("display","none");
		})
		$("#comment").click(function(e) {
			$(".classInfo_menu>ul>li").removeClass("on");
			$(e.currentTarget).parent().addClass("on");
			$("#articleContent").css("display","none");
			$("#publicClassContent").css("display","none");
			$("#castleContent").css("display","none");
			$("#commentContent").css("display","block");
		})
	})