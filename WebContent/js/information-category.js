$(function(){
	$.ajax({
		type:"get",
		url:"constant/getdata",
		dataType:"json",
		async:false,
		success:function(data) {
			$("#datanumber").html(data.length);
			for (var i = 0; i < data.length - 1; i++) {
				$("#sysData").append("<tr class=\"text-c\">" +
						"<td><input type=\"checkbox\" value=\"\" name=\"\"></td>" +
						"<td>" + data[i].id + "</td>" +
						"<td class=\"text-l\">" + data[i].constanttypeid + "</td>" +
						"<td>" + data[i].constantcode + "</td>" +
						"<td>" + data[i].constantname + "</td>" +
						"<td>" + data[i].delmark + "</td>" +
						"<td>" + data[i].constantTypeCode + "</td>" +
						"<td>" + data[i].constantTypeName + "</td>" +
						"</tr>");
			}
		}
	})
})

