$(function() {
	$("#myFile").change(function(e) {
		debugger;
		var imgFile = e.currentTarget.files[0];
		var fr = new FileReader();
		fr.readAsDataURL(imgFile);
		fr.onload = function(e) {
			$(".fileUploadLabel").css({
				background: "url(" + this.result + ")",
				backgroundSize:"100% 100%"
			})
			$(".fileUploadLabel").html("")
			
		}
	})
	
	
})
