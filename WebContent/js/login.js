$(function(){

	$("#btlogin").click(function(){
			var username = $("#user_name").val();
			var password = $("#password").val();
			if (username == "" || password == "") {
				return;
			}
			$.ajax({
				type:"post",
				url:"userLogin",
				async:false,
				datatype:"json",
				data:{
					username:username,
					password:password
				},
				success:function(data){
					if (data == 1) {
						$(location).attr('href', 'index.html');
					}
				}
			})
		});
})



