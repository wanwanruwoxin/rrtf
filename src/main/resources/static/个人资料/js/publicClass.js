	$(function() {
		$("#myclass").click(function(e) {
			$(".flcb_cardMenu>ul>li").removeClass("on");
			$(e.currentTarget).parent().addClass("on");
			$("#myclassContent").css("display","block");
			$("#newclassContent").css("display","none");
			$("#descContent").css("display","none");
			$("#myClassContent").css("display","none");
		})
		$("#newclass").click(function(e) {
			$(".flcb_cardMenu>ul>li").removeClass("on");
			$(e.currentTarget).parent().addClass("on");
			$("#myclassContent").css("display","none");
			$("#newclassContent").css("display","block");
			$("#descContent").css("display","none");
			$("#myClassContent").css("display","none");
		})
		$("#desc").click(function(e) {
			$(".flcb_cardMenu>ul>li").removeClass("on");
			$(e.currentTarget).parent().addClass("on");
			$("#myclassContent").css("display","none");
			$("#newclassContent").css("display","none");
			$("#descContent").css("display","block");
			$("#myClassContent").css("display","none");
		})
		$("#myClass").click(function(e) {
			$(".flcb_cardMenu>ul>li").removeClass("on");
			$(e.currentTarget).parent().addClass("on");
			$("#myclassContent").css("display","none");
			$("#newclassContent").css("display","none");
			$("#descContent").css("display","none");
			debugger;
			$("#myClassContent").css("display","block");
		})
		
	})