<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 导入jquery核心类库 -->
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<!-- 导入easyui类库 -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/ext/portal.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/default.css">	
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/ext/jquery.portal.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/ext/jquery.cookie.js"></script>
<script
	src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js"
	type="text/javascript"></script>
<script type="text/javascript">
	function doAdd(){
		//alert("增加...");
		$('#addStaffWindow').window("open");
	}
	
	//条件查询
	function doView(){
		//alert("查看...");
		$('#queryStaffWindow').window('open'); 
			
		
		
		
	/*  var grid = $("#grid"). datagrid("getSelections");
		//var str ="";
		if(grid.length>=1){
			if(grid.length==1){
				var id = grid[0].id;
				$.post("${pageContext.request.contextPath}/bc/staff_findStaff",{"id":id},function(data){
					if(data){
						$("input[name='id']").val(data['id']);
						$("input[name='name']").val(data['name']);
						$("input[name='telephone']").val(data['telephone'])
						$("input[name='station']").val(data['station']);
						$("input[name='haspda']").val(data['haspda']);
						$("input[name='standard']").val(data['standard']);
						$("input[name='decidedZones']").val(data['decidedZones']);
						
						$('#queryStaffWindow').window('open'); 
						$("#grid"). datagrid("clearSelections");
						$("#grid"). datagrid("reload");
						
					}else if(data=='0'){
						$.messager.alert('消息','获取快递员信息失败，请联系管理员','info'); 
						$("#grid"). datagrid("clearSelections");
					}
				}); 
				
			}else{
				$.messager.alert('消息','您一次只能选择一个快递员进行查询','info'); 
				$("#grid"). datagrid("clearSelections");
			}   
		} else{
			$.messager.alert('消息','您还没有选择要查询的快递员','info'); 
		}   */
}
	function doDelete(){
		//alert("删除...");
		var grid = $("#grid"). datagrid("getSelections");
		var str ="";
		if(grid.length>0){
			var arr = new Array();
			for (var i = 0; i < grid.length; i++) {
				//var str =str + $(grid[i]).val()+",";
				arr.push(grid[i].id);
			}
			var ids = arr.join(",");
			$.post("${pageContext.request.contextPath}/bc/staff_deleteStaff",{"ids":ids},function(data){
				if(data){
					$.messager.alert('消息','删除成功','info'); 
				/* 	$("#grid"). datagrid("refreshRow",{
						index:$("#grid"). datagrid("getSelections");
					}); */
					
					//如何刷新一行数据
					$("#grid"). datagrid("clearSelections");
					$("#grid"). datagrid("reload");
				}else{
					$.messager.alert('消息','删除失败','info'); 
					$("#grid"). datagrid("clearSelections");
				}
			});
			
		}else{
			$.messager.alert('消息','您目前还没有选中任何选项，请选择后再进行操作','info'); 
		}
	}
	
	function doRestore(){
		//alert("将取派员还原...");
		
		var sels = $("#grid").datagrid('getSelections');  
		var ids = "";
		if(sels.length>0){
			for (var i = 0; i < sels.length; i++) {
				var id = sels[i].id;
				ids = ids + id+",";
			}
			$.post("${pageContext.request.contextPath}/bc/staff_restoreStandard",{"ids":ids},function(data){
				if(data=="1"){
					$.messager.alert('通知','还原成功','info'); 
					$("#grid"). datagrid("clearSelections");
					$("#grid"). datagrid("reload");
				}else{
					$.messager.alert('通知','系统正忙','info'); 
					$("#grid"). datagrid("clearSelections");
				}
			});
		}else{
			$.messager.alert('警告','您还没有选择要还原的项目，请选择后再进行还原!','warning'); 
		}
		
	}
	//工具栏
	var toolbar = [ {
		id : 'button-view',	
		text : '查询',
		iconCls : 'icon-search',
		handler : doView
	}, {
		id : 'button-add',
		text : '增加',
		iconCls : 'icon-add',
		handler : doAdd
	}, {
		id : 'button-delete',
		text : '作废',
		iconCls : 'icon-cancel',
		handler : doDelete
	},{
		id : 'button-save',
		text : '还原',
		iconCls : 'icon-save',
		handler : doRestore
	}];
	// 定义列
	var columns = [ [ {
		field : 'id',
		checkbox : true,
	},{
		field : 'name',
		title : '姓名',
		width : 120,
		align : 'center'
	}, {
		field : 'telephone',
		title : '手机号',
		width : 120,
		align : 'center'
	}, {
		field : 'haspda',
		title : '是否有PDA',
		width : 120,
		align : 'center',
		formatter : function(data,row, index){
			if(data=="1"){
				return "有";
			}else{
				return "无";
			}
		}
	}, {
		field : 'deltag',
		title : '是否作废',
		width : 120,
		align : 'center',
		formatter : function(data,row, index){
			if(data=="1"){
				return "正常使用"
			}else{
				return "已作废";
			}
		}
	}, {
		field : 'standard',
		title : '取派标准',
		width : 120,
		align : 'center'
	}, {
		field : 'station',
		title : '所谓单位',
		width : 200,
		align : 'center'
	},
	{
		field : 'standard',
		title : '取派标准',
		width : 200,
		align : 'center'
	}
	] ];
	
	$(function(){
		// 先将body隐藏，再显示，不会出现页面刷新效果
		$("body").css({visibility:"visible"});
		
		// 取派员信息表格
		$('#grid').datagrid( {
			iconCls : 'icon-forward',
			fit : true,
			border : false,
			rownumbers : true,
			striped : true,
			pageList: [5,15,30],
			//pageSize:10,
			pagination : true,
			toolbar : toolbar,
			url : "${pageContext.request.contextPath}/bc/staff_findAll",
			idField : 'id',
			columns : columns,
			onDblClickRow : function(rowIndex, rowData){
				//查询与修改
				$('#addStaffWindow').window('open'); 
				$('#staffquery').form('load',rowData);
				 $("#addId").attr("readonly",true);
				$("#addId").validatebox({ 
					required: true, 
					validType: '' 
					
					}); 
				/* $("input[name='id']").attr("readonly",true);
				$("input[name='id']").validatebox({ 
					required: true, 
					validType: '' 
					
					});  */
			}
		});
		
		// 添加取派员窗口
		$('#addStaffWindow').window({
	        title: '添加取派员',
	        width: 400,
	        modal: true,
	        shadow: true,
	        closed: true,
	        height: 400,
	        resizable:false
	        
	    });
		
		//保存 
		
		$("#save").click(function(){
		 	f2 = 	$('#staffSave').form('validate');
			if(f2){
				//$("#staffSave").submit();
				$('#staffSave').form('submit');
				$("#addStaffWindow").window("close");
				$('#grid').datagrid('reload');
			}
			$('#staffSave').form('clear');
		});
		
		//条件查询
		$("#querySubmit").click(function(){
			var qjson={"id":$("#qid").val(),"name":$("#qname").val(),"telephone":$("#qtelephone").val(),
					 "station":$("#qstation").val(),"haspda":$("#qhaspda").combobox('getValue'),
					 "standard":$('#qstandard').combobox('getValue')};
			//$("input[name='haspda']:checked").val(),
			$('#grid').datagrid('load',qjson);  
			$("#queryStaffWindow").window("close");
		});
	
		
		
	});
	
	function clearForm(){
		$('#staffSave').form('clear');
		$("#addId").removeAttr("readonly");
		$("#addId").validatebox({ 
			required: true, 
			validType: 'checkId' 
		}); 
		$('#grid').datagrid('clearSelections'); 
	}
	
	function clearQueryForm(){
		$('#staffquery').form('clear');
		$("#addId").removeAttr("readonly");
		$("#addId").validatebox({ 
			required: true, 
			validType: 'checkId' 
		}); 
		$('#grid').datagrid('clearSelections'); 
		
	}
	
	//function doDblClickRow(){
		//alert("双击表格数据...");
		//$('#queryStaffWindow').window('open'); 
		
		
	//}
	
	
	$.extend($.fn.validatebox.defaults.rules, { 

		telephone: { 

		validator: function(value,param){ 

			var regex = /^1[3|5|7|8]\d{9}$/;
			return regex.test(value);
		}, 
		
		message: '您录入的不是手机号，请重新录入' 

		},
		checkId: { 

			validator: function(value,param){ 
				var flag ;
				$.ajax({
					   type: "POST",
					   url: "${pageContext.request.contextPath}/bc/staff_checkId",
					   data: {"id":value},
					   timeout : 60000,
					   async: false,
					   success: function(data){
						 flag =data;
					   }
					});
				return flag;
			}, 
			message: '您录入的编号已经存在，请重新录入' 
			},
		
		checkTelephone: { 

			validator: function(value,param){ 
				var flag ;
				$.ajax({
					   type: "POST",
					   url: "${pageContext.request.contextPath}/bc/staff_checkTelephone",
					   data: {"telephone":value},
					   timeout : 60000,
					   async: false,
					   success: function(data){
						 flag =data;
					   }
					});
				return flag;
			}, 
			message: '您录入的手机号已经存在，请重新录入' 
			}
	});
	
	//条件查询，点击查询
	
</script>	
</head>
<body class="easyui-layout" style="visibility:hidden;">
	<div region="center" border="false">
    	<table id="grid"></table>
	</div>

	
	<div class="easyui-window" title="对收派员进行添加或者查询" id="addStaffWindow"  collapsible="false" minimizable="false" 
		maximizable="false" style="top:20px;left:200px" data-options="onBeforeClose:clearForm"  closed="true">
		<div region="north" style="height:31px;overflow:hidden;" split="false" border="false" >
			<div class="datagrid-toolbar">
				<a id="save"  icon="icon-save" href="#" class="easyui-linkbutton easyui-validatebox" plain="true" >保存</a>
			</div>
		</div>
		
		<div region="center" style="overflow:auto;padding:5px;" border="false">
			<form id="staffSave" action="${pageContext.request.contextPath}/bc/staff_addStaff" method="post">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">收派员信息</td>
					</tr>
					<!-- TODO 这里完善收派员添加 table -->
					<tr>
						<td>取派员编号</td>
						<td><input type="text" name="id" id="addId" class="easyui-validatebox" required="true" data-options="validType:'checkId'" />
							<span id="id_check_message"></span>
						</td>
					</tr>
					<tr>
						<td>姓名</td>
						<td><input type="text" name="name" class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td>手机</td>
						<td><input type="text" name="telephone" class="easyui-validatebox " data-options="required:true,validType:['telephone','checkTelephone']"  />
						<span id="telephone_check_message"></span>
						</td>
					</tr>
					<tr>
						<td>单位</td>
						<td><input type="text" name="station" class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td colspan="2">是否有PDA
						<!-- <input type="checkbox" id="haspda" name="haspda" checked="checked"/> -->
						<input type="radio" id="haspda" name="haspda" value="1" checked="checked"/>有 |
						<input type="radio" id="haspda" name="haspda" value="0" />无
						</td>
					</tr>
					<tr>
						<td>取派标准</td>
						<td>
							<input id="standard" class="easyui-combobox" name="standard" enable="true" data-options="required:'true',editble:'false',valueField:'name',textField:'name',url:'${pageContext.request.contextPath}/bc/staff_findStandard'" />
						</td>
					</tr>
					<%-- <tr>
					<td>负责区域</td>
					<td>
							<input id="decidedZones" class="easyui-combobox" name="decidedZones" data-options="valueField:'id',textField:'name',url:'${pageContext.request.contextPath}/bc/staff_findStandard'" />
					</td>
					</tr> --%>
					</table>
			</form>
		</div>
	</div>
	
	<!-- 多条件查询用户信息 -->
	
	<div class="easyui-window" title="取派员信息查询" id="queryStaffWindow" collapsible="false" minimizable="false"
	 maximizable="false" style="top:20px;left:200px ;width:500px;height:600px"  data-options="onBeforeClose:clearQueryForm" closed='true'>
	 <!-- data-options="onBeforeClose:queryStaffWindow" -->
		<div region="north" style="height:31px;overflow:hidden;" split="false" border="false" >
			<div class="datagrid-toolbar">
				<a id="querySubmit"  icon="icon-save" href="#" class="easyui-linkbutton easyui-validatebox" plain="true" >查询</a>
			</div>
		</div>
		
		<div region="center" style="overflow:auto;padding:5px; width:500px;height:550px" border="false">
			<form id="staffquery" action="#" method="post">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">收派员信息条件查询</td>
					</tr>
					<!-- TODO 这里完善收派员添加 table -->
				
					<tr>
						<td>取派员编号</td>
						<td><input type="text" name="id" id="qid"  class="easyui-validatebox" />
						</td>
					</tr>
					<tr>
						<td>姓名</td>
						<td><input type="text" name="name" id="qname" class="easyui-validatebox" /></td>
					</tr>
					<tr>
						<td>手机</td>
						<td><input type="text" name="telephone" id="qtelephone" class="easyui-validatebox " data-options="validType:['telephone','checkTelephone']"/></td>
					</tr>
					<tr>
						<td>单位</td>
						<td><input type="text" name="station" id="qstation" class="easyui-validatebox" /></td>
					</tr>
				
					<tr>
						<td colspan="2">是否有PDA
						<!-- <input type="text" name="haspda" id="qhaspda"  class="easyui-validatebox" /> -->
						 <select id="qhaspda" class="easyui-combobox" name="haspda" style="width:200px; data-options="editable:false"> 
						<option value="">请选择</option>
						<option value="1">有</option> 
						<option value="0">无</option> 
						</select>  
						</td>
					</tr>
					<tr>
						<td>取派标准</td>
						<td>
							<input class="easyui-combobox" name="standard"  id="qstandard" 
							data-options="editable:false,valueField:'name',textField:'name',url:'${pageContext.request.contextPath}/bc/staff_findStandard'" />
						</td>
					</tr>
					
					</table>
			</form>
		</div>
	</div>
</body>
</html>	