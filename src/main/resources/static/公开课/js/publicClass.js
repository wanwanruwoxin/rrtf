	$(function() {
		$("#desc").click(function(e) {
			$(".flcb_cardMenu>ul>li").removeClass("on");
			$(e.currentTarget).parent().addClass("on");
			$("#descContent").css("display","block");
			$("#teacherDescContent").css("display","none");
		})
		$("#teacherDesc").click(function(e) {
			$(".flcb_cardMenu>ul>li").removeClass("on");
			$(e.currentTarget).parent().addClass("on");
			$("#descContent").css("display","none");
			$("#teacherDescContent").css("display","block");
		})
		
	})