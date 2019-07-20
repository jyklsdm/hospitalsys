$(function(){

	$.ajax({
		type:"post",
		url:"user/showUsername",
		dataType:"json",
		async:false,
		success:function(data){
			$("#showUsrname").html(data.name);
		},
		error:function(data){
			$("#showUsrname").html($.cookie("username"));
		}
	});
	
	$("#logout").click(function(){
		$.ajax({
			type:"get",
			url:"user/loginout",
			dataType:"json",
			async:false,
			complete:function(XMLHttpRequest, textStatus){
				location.href ="login.html";
			}
		})	
	});
})