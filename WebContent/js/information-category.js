$(function() {

	$.ajax({
			type : "get",
			url : "constant/getdata",
			dataType : "json",
			async : false,
			success : function(data) {
				$("#datanumber").html(data.length);
				for (var i = 0; i < data.length; i++) {
					$("#sysData").append(
							"<tr class=\"text-c\">"
							+ "<td><input type=\"checkbox\" value=\"" + data[i].id + "\" name=\"selectData\"></td>"
							+ "<td>" + data[i].id + "</td>"
							+ "<td class=\"text-l\">"
							+ data[i].constanttypeid
							+ "</td>" + "<td>"
							+ data[i].constantcode
							+ "</td>" + "<td>"
							+ data[i].constantname
							+ "</td>" + "<td>"
							+ data[i].delmark + "</td>"
							+ "<td>"
							+ data[i].constantTypeCode
							+ "</td>" + "<td>"
							+ data[i].constantTypeName
							+ "</td>" + "</tr>");
					}
				}
			});

	$("#searchbutton").click(function() {
		var selectType = $("#selectID").val() + "";
		var selectText = $("#search").val();
		if (selectText == "") {
			$("#tips").html("&nbsp;提示：输入为空!");
			return;
		}
		$("#tips").html("");
		$.ajax({
			type : "get",
			url : "constant/searchConstantData?selectType="
					+ selectType + "&selectText=" + selectText,
			dataType : "json",
			async : false,
			success : function(data) {
				$("#datanumber").html(data.length);
				$("#sysData").html("");
				for (var i = 0; i < data.length; i++) {
					$("#sysData").append(
							"<tr class=\"text-c\">"
							+ "<td><input type=\"checkbox\" value=\"" + data[i].id + "\" name=\"selectData\"></td>"
							+ "<td>" + data[i].id + "</td>"
							+ "<td class=\"text-l\">"
							+ data[i].constanttypeid
							+ "</td>" + "<td>"
							+ data[i].constantcode
							+ "</td>" + "<td>"
							+ data[i].constantname
							+ "</td>" + "<td>"
							+ data[i].delmark + "</td>"
							+ "<td>"
							+ data[i].constantTypeCode
							+ "</td>" + "<td>"
							+ data[i].constantTypeName
							+ "</td>" + "</tr>");
				}	
			}
		})
	});
	
	$("#delete").click(function() {
		var selectAll = document.getElementsByName("selectData");
		var selectData = new Array();
		for (data in selectAll) {
			if (selectAll[data].checked) {
				selectData.push(selectAll[data].value);
			}
		}
		if (selectData.length == 0) {
			$("#tips").html("请选择数据！");
			return;
		}
		if (!confirm("删除数据！")) {
			return;
		}
		if ($("#selectAll").prop("checked")) {
			if (!confirm("删除全部数据！")) {
				return;
			}
		}
		$.ajax({
			type:"post",
			url:"constant/delete",
			dataType:"json",
			async:true,
			data: {
				selectData:selectData
			},
			beforeSend: function(){
				$("#tips").html("正在处理，请稍后...");
				$("#delete").attr({ disabled: "disabled" });
			},
			success:function(data) {
				if (data.result) {
					$("#tips").html("删除成功！");
				} else {
					$("#tips").html("删除失败！数据可能已被修改！请刷新重试！");
				}				
			},
			error:function(data) {
				$("#tips").html("连接出错！删除失败！请刷新重试！");
			},
			complete:function(XMLHttpRequest, textStatus) {
				$("#delete").removeAttr("disabled");
			}
		})
	});
	
	$("#deleteType").click(function(){
		var constantTypeName = prompt("请输入类别名称：");
		if (judgeNull(constantTypeName) == "false") {
			return;
		}
		$.ajax({
			type:"post",
			url:"constant/deleteType",
			dataType:"json",
			async:true,
			data: {
				constantTypeName:constantTypeName
			},
			beforeSend: function(){
				$("#tips").html("正在处理，请稍后...");
				$("#deleteType").attr({ disabled: "disabled" });
			},
			success:function(data) {
				if (data.result) {
					$("#tips").html("删除成功！");
				} else {
					$("#tips").html("删除失败！请核对类别名称！");
				}			
			},
			error:function(data) {
				$("#tips").html("连接出错！删除失败！请刷新重试！");
			},
			complete:function(XMLHttpRequest, textStatus) {
				$("#deleteType").removeAttr("disabled");
			}
		})
	});
	
	$("#additionType").click(function(){
		var constantTypeName = prompt("请输入类别名称：");
		if (judgeNull(constantTypeName) == "false") {
			return;
		}
		var constantTypeCode = prompt("请输入类别编码：");
		if (judgeNull(constantTypeCode) == "false") {
			return;
		}
		$.ajax({
			type:"post",
			url:"constant/additionType",
			dataType:"json",
			async:true,
			data: {
				constantTypeName:constantTypeName,
				constantTypeCode:constantTypeCode
			},
			beforeSend: function(){
				$("#tips").html("正在处理，请稍后...");
				$("#deleteType").attr({ disabled: "disabled" });
			},
			success:function(data) {
				if (data.result == "1") {
					$("#tips").html("添加成功！");
				} 
				else if (data.result == "0") {
					$("#tips").html("添加失败！类别名称重名！");
				} 
				else if (data.result == "-1"){
					$("#tips").html("添加失败！请类别编码重名！");
				} else {
					$("#tips").html("添加失败！请刷新重试！");
				}		
			},
			error:function(data) {
				$("#tips").html("连接出错！添加失败！请刷新重试！");
			},
			complete:function(XMLHttpRequest, textStatus) {
				$("#deleteType").removeAttr("disabled");
			}
		})
	});
	
	$("#addition").click(function() {
		$("#popUp").css("display","block");
		$("#cancel").click(function(){
			$("#addTips").html("");
			$("#popUp").css("display","none");
		});
		$("#submit").click(function(){
			var constantName = $(".addConstantName").val();
			var constantCode = $(".addConstantCode").val();
			var constantTypeName = $(".addConstantTypeName").val();
			$.ajax({
				type:"post",
				datatype:"json",
				url:"constant/addConstant",
				async:true,
				data:{
					constantName:addConstantName,
					constantCode:constantCode,
					constantTypeName,constantTypeName
				},
				beforeSend: function(){
					$("#addTips").html("正在处理，请稍后...");
				},
				success:function(data) {
					if(data.result == "1") {
						$("#tips").html("添加成功！");
						$("#popUp").css("display","none");
					}
					else if (data.result == "0") {
						$("#addTips").html("类别名称不存在！！！");
					}
					else {
						$("#addTips").html("添加失败！请重试！");
					}
				},
			})
		});
	});
	
	function judgeNull(state) {
		if (state == null) {
			return "false";
		}
		if (state == "") {
			$("#tips").html("输入为空！");
			return "false";
		}
		return "ture";
	}
})

