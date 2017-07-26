<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>区域设置</title>
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
<script
	src="${pageContext.request.contextPath }/js/upload/jquery.ocupload-1.1.2.js"
	type="text/javascript"></script>
<script type="text/javascript">
	function doAdd(){
		$('#addRegionWindow').window("open");
	}
	
	
	function doView(){
	//	alert("修改...");
		var grid = $("#grid").datagrid("getSelections");
		var str = "";
		if(grid.length>1){
			$.messager.alert('消息','您一次只能修改一个选项，请重新选择','info'); 
			$("#grid"). datagrid("clearSelections");
		}else if(grid.length==0){
			$.messager.alert('消息','您目前还没有选中任何选项，请选择后再进行操作','info'); 
		}else{
			
			id = grid[0].id;
			 $.post("${pageContext.request.contextPath}/bc/region_findRegion",{"id":id},function(data){
					if(data){
						
						$('#regionForm').form('load',{ 
							id:data['id'],
							province:data['province'],  	
							city:data['city'],  	
							district:data['district'],  	
							postcode:data['postcode'],  
							shortcode:data['shortcode'],
							citycode:data['citycode'],
						}); 
					}else{
						$.messager.alert('消息','系统正忙','info'); 
						$("#grid"). datagrid("reload");
						$("#grid"). datagrid("clearSelections");
					}
				});
			
			$('#addRegionWindow').window('open'); 
			$("input[name='id']").attr("readonly",true);
	
			/* $.post("${pageContext.request.contextPath}/bc/region_findRegion",{"id":id},function(data){
				if(data){
					$.messager.alert('消息','修改成功','info'); 
					$("#grid"). datagrid("reload");
					$("#grid"). datagrid("clearSelections");
				}else{
					$.messager.alert('消息','系统正忙','info'); 
					$("#grid"). datagrid("reload");
					$("#grid"). datagrid("clearSelections");
				}
			}); */
		}
		
		
	}
	
	function doDelete(){
	//	alert("删除...");
		var grid = $("#grid"). datagrid("getSelections");
		var str ="";
		if(grid.length>0){
			var arr = new Array();
			for (var i = 0; i < grid.length; i++) {
				//var str =str + $(grid[i]).val()+",";
				arr.push(grid[i].id);
			}
			var ids = arr.join(",");
			$.post("${pageContext.request.contextPath}/bc/region_deleteRegion",{"ids":ids},function(data){
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
	
	function doQuery(){
		$('#queryWindow').window('open'); 
		
	}
	
	//工具栏
	var toolbar = [ {
		id : 'button-edit',	
		text : '修改',
		iconCls : 'icon-edit',
		handler : doView
	}, {
		id : 'button-add',
		text : '增加',
		iconCls : 'icon-add',
		handler : doAdd
	}, {
		id : 'button-delete',
		text : '删除',
		iconCls : 'icon-cancel',
		handler : doDelete
	}, {
		id : 'button-import',
		text : '导入',
		iconCls : 'icon-redo'
	},
	 {
		id : 'button-query',
		text : '多条件查询',
		iconCls : 'icon-search',
		handler : doQuery
	}
	];
	// 定义列
	var columns = [ [ {
		field : 'id',
		checkbox : true,
	},{
		field : 'province',
		title : '省',
		width : 120,
		align : 'center'
	}, {
		field : 'city',
		title : '市',
		width : 120,
		align : 'center'
	}, {
		field : 'district',
		title : '区',
		width : 120,
		align : 'center'
	}, {
		field : 'postcode',
		title : '邮编',
		width : 120,
		align : 'center'
	}, {
		field : 'shortcode',
		title : '简码',
		width : 120,
		align : 'center'
	}, {
		field : 'citycode',
		title : '城市编码',
		width : 200,
		align : 'center'
	} ] ];
	
	$(function(){
		// 先将body隐藏，再显示，不会出现页面刷新效果
		$("body").css({visibility:"visible"});
		
		// 收派标准数据表格
		$('#grid').datagrid( {
			iconCls : 'icon-forward',
			fit : true,
			border : false,
			rownumbers : true,
			striped : true,
			pageList: [30,50,100],
			pagination : true,
			toolbar : toolbar,
			url : "${pageContext.request.contextPath }/bc/region_finAll",
			idField : 'id',
			columns : columns,
			onDblClickRow : function(rowIndex, rowData){
				$('#addRegionWindow').window('open'); 
				$('#regionForm').form('load',rowData); 
			}
		});
		
		// 添加、修改区域窗口
		$('#addRegionWindow').window({
	        title: '添加修改区域',
	        width: 400,
	        modal: true,
	        shadow: true,
	        closed: true,
	        height: 400,
	        resizable:false,
	        onBeforeClose:function(){
	        	$('#regionForm').form('clear');
	        	$('#grid').datagrid('clearSelections'); 
	        	$("input[name='id']").removeAttr("readonly");
	        }
	    });
		
		$('#queryWindow').window({
	        title: '查询区域',
	        width: 400,
	        modal: true,
	        shadow: true,
	        closed: true,
	        height: 400,
	        resizable:false,
	        onBeforeClose:function(){
	        //	$('#regionForm').form('clear');
	        	$('#grid').datagrid('clearSelections'); 
	        	$("input[name='id']").removeAttr("readonly");
	        	$('#queryRegionForm').form('clear');
	        }
	    });
		
	});
	$(function(){
		$("#save").click(function(){
			var f1 = $('#regionForm').form('validate');
			if(f1){
				$('#regionForm').submit();
				$("#addStaffWindow").window("close");
				$('#grid').datagrid('reload');
			}
				$('#regionForm').form('clear');
			
		});
		
		/*多条件查询，条件拼接*/
		$("#querySubmit").click(function(){
			var f1 = $('#queryRegionForm').form('validate');
			if(f1){
				var qjson={"province":$("#qprovince").val(),"city":$("#qcity").val(),"district":$("#qdistrict").val()};
				$('#grid').datagrid('load',qjson);  
				$("#queryWindow").window("close");
			}
				$('#queryRegionForm').form('clear');
			
		});
		
		 $("#button-import").upload({
	            name: 'upload',
	            action: '${pageContext.request.contextPath}/bc/region_uploadRegion',
	            enctype: 'multipart/form-data',
	            onSelect: function() {
	            	var re =/^(.+\.xls|.+\.xlsx)$/;//文件名满足.xls和 .xlsx
	            	if(re.test(this.filename())){
	            		this.submit(); //提交
	            	}else{
	            		$.messager.alert("警告","上传的文件名必须是以.xls或者是.xlsx结尾");
	            	}
	            	
	            },
	            onComplete:function(response){
	            	if(response=="true"){
	            		$.messager.alert('通知','批量导入成功','info');  
	            	}else{
	            		$.messager.alert('通知','批量导入失败','info');  
	            	}
	            }
	    });
		 
	});
	
	

	

	
</script>	
</head>
<body class="easyui-layout" style="visibility:hidden;">
<div region="north" border="false">
	<input id="searcheByNode" name="shortcode" class="easyui-searchbox" style="width:300px" data-options="searcher:qq,prompt:'请输入您要搜索的值',menu:'#mm'"></input> 
	<div id="mm"  style="width:120px">
	 <div data-options="name:'shortcode',iconCls:'icon-ok'">根据简记码查询</div> 
	  <div data-options="name:'postcode',iconCls:'icon-ok'">根据邮编查询</div> 
	 </div>
</div>
	

	<div region="center" border="false">
    	<table id="grid"></table>
	</div>
	
	<div class="easyui-window" title="区域添加修改" id="addRegionWindow" collapsible="false" minimizable="false" maximizable="false" style="top:20px;left:200px">
		<div region="north" style="height:31px;overflow:hidden;" split="false" border="false" >
			<div class="datagrid-toolbar">
				<a id="save" icon="icon-save" href="#" class="easyui-linkbutton" plain="true" >保存</a>
			</div>
		</div>
		
		<div region="center" style="overflow:auto;padding:5px;" border="false">
			<form id="regionForm" action="${pageContext.request.contextPath }/bc/region_saveProvince" method="post">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">区域信息</td>
					</tr>
					<tr>
						<td>编码</td>
						</td>
						<td><input type="text" name="id" class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td>省</td>
						<input type="hidden" name="id" />
						</td>
						<td><input type="text" name="province" class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td>市</td>
						<td><input type="text"  name="city" class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td>区</td>
						<td><input type="text"  name="district" class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td>邮编</td>
						<td><input type="text" name="postcode" class="easyui-validatebox" required="true"/></td>
					</tr>
					<!-- <tr>
						<td>简码</td>
						<td><input type="text" name="shortcode" class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td>城市编码</td>
						<td><input type="text" name="citycode" class="easyui-validatebox" required="true"/></td>
					</tr>  -->
					</table>
			</form>
		</div>
	</div>
	
	<!-- 多条件查询窗口 -->
<div class="easyui-window" title="查询" id="queryWindow" collapsible="false" minimizable="false" maximizable="false" style="top:20px;width:300px;height:350px;left:200px">
		<div region="north" style="height:31px;overflow:hidden;" split="false" border="false" >
			<div class="datagrid-toolbar">
				<a id="querySubmit" icon="icon-save" href="#" class="easyui-linkbutton" plain="true" >提交</a>
			</div>
		</div>
		
		<div region="center" style="overflow:auto;padding:5px; " border="false">
			<form id="queryRegionForm" action="#" method="post">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">查询条件：</td>
					</tr>
					
			
					<tr>
						<td>省：</td>
						</td>
						<td>
						<!-- 省市区采用select 标签进行选择，然后提交查询条件 -->
						<!-- <input id="province" name="province" class="easyui-combobox" data-options=" valueField: 'province', textField: 'province', url: 'get_data1.php'"/> -->
						 <input type="text" id="qprovince"  name="province" class="easyui-validatebox" /></td>
					</tr>
					<tr>
						<td>市：</td>
						<td><input type="text" id="qcity" name="city" class="easyui-validatebox" /></td>
					</tr>
					<tr>
						<td>区(县)：</td>
						<td><input type="text" id="qdistrict" name="district" class="easyui-validatebox" /></td>
					</tr>
				
					</table>
			</form>
		</div>
	</div>
	
	
</body>
	<script type="text/javascript">
	function qq(value,name){
		/*  if("shortcode"==name){
			$('#grid').datagrid('load',{"shortcode":value});  
		}
		if("postcode"==name){
			$('#grid').datagrid('load',{"postcode":value});  
		}  */
		
	 	var obj={};
		obj[name]=value;
		$('#grid').datagrid('load',obj);   
	}
	</script> 
</html>