	$(function() {
		$("#myJoin").click(function(e) {
			$(".flcb_cardMenu>ul>li").removeClass("on");
			$(e.currentTarget).parent().addClass("on");
			$("#myJoinContent").css("display","block");
			$("#myCreateContent").css("display","none");
			$("#createContent").css("display","none");
		})
		$("#myCreate").click(function(e) {
			$(".flcb_cardMenu>ul>li").removeClass("on");
			$(e.currentTarget).parent().addClass("on");
			$("#myJoinContent").css("display","none");
			$("#myCreateContent").css("display","block");
			$("#createContent").css("display","none");
		})
		$("#create").click(function(e) {
			$(".flcb_cardMenu>ul>li").removeClass("on");
			$(e.currentTarget).parent().addClass("on");
			$("#myJoinContent").css("display","none");
			$("#myCreateContent").css("display","none");
			$("#createContent").css("display","block");
		})
	})