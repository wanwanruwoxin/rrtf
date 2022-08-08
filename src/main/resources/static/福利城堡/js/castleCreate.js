	$(function() {
		$("#basic").click(function(e) {
			$(".flcb_cardMenu>ul>li").removeClass("on");
			$(e.currentTarget).parent().addClass("on");
			$("#basicContent").css("display","block");
			$("#descContent").css("display","none");
			$("#fileContent").css("display","none");
		})
		$("#desc").click(function(e) {
			$(".flcb_cardMenu>ul>li").removeClass("on");
			$(e.currentTarget).parent().addClass("on");
			$("#basicContent").css("display","none");
			$("#descContent").css("display","block");
			$("#fileContent").css("display","none");
		})
		$("#file").click(function(e) {
			$(".flcb_cardMenu>ul>li").removeClass("on");
			$(e.currentTarget).parent().addClass("on");
			$("#basicContent").css("display","none");
			$("#descContent").css("display","none");
			$("#fileContent").css("display","block");
		})
		
	})