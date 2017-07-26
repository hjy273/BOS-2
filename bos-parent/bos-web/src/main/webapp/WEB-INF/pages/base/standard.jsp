<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>取派标准</title>
		<!-- 导入jquery核心类库 -->
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
			$(function(){
				// 先将body隐藏，再显示，不会出现页面刷新效果
				$("body").css({visibility:"visible"});
				
				// 收派标准信息表格
				$('#grid').datagrid( {
					iconCls : 'icon-forward',
					fit : true,
					border : false,
					rownumbers : true,
					striped : true,
					pageList: [15,30,50],
					pagination : true,
					toolbar : toolbar,
					url : "${pageContext.request.contextPath}/bc/standard_findAll",
					idField : 'id',
					columns : columns
				});
				// 添加取派员窗口
				$('#addStandardWindow').window({
			        title: '取派员操作',
			        width: 600,
			        modal: true,
			        shadow: true,
			        closed: true,
			        height: 400,
			        resizable:false,
			         onBeforeClose:function(){
			        	//   清除form 表单数据 尤其  隐藏id 一定要清除  reset   jquery --->Dom
			        	  $("#addStandardForm").form('reset');//  text  
			        	 $("#tel").removeClass('validatebox-invalid');  
			             $("#id").val("");  //  一定将隐藏id 值清除 // hidden
			        } 
			    });
			});	
			
			//工具栏
			var toolbar = [ {
				id : 'button-add',
				text : '增加',
				iconCls : 'icon-add',
				handler : function(){
					$('#addStandardWindow').window("open");
				}
			}, {
				id : 'button-edit',
				text : '修改',
				iconCls : 'icon-edit',
				handler : function(){
					//alert('修改');
					var sels = $("#grid").datagrid('getSelections');  
					
					if(sels.length>0){
						if(sels.length==1){
							id = sels[0].id;
							$.post("${pageContext.request.contextPath}/bc/standard_findStandardByid",{"id":id},function(data){
								$('#updateStandardForm').form('load',{ 
									id:data['id'],
								    name:data['name'],  	
								    minweight:data['minweight'],  	
								    maxweight:data['maxweight'],  	
								    minlength:data['minlength'],  
								    maxlength:data['maxlength'],
								    operationtime:data['operationtime'],
								    operator:data['operator'],
								    deltag:data['deltag'],
								    operatorcompany:data['operatorcompany']
								}); 
								
								/* 
								$("input[name='id']").val(data['id']);
								$("input[name='name']").val(data['name']);
								$("input[name='minweight']").val(data['minweight']);
								$("input[name='maxweight']").val(data['maxweight']);
								$("input[name='minlength']").val(data['minlength']);
								$("input[name='maxlength']").val(data['maxlength']);
								$("input[name='operationtime']").val(data['operationtime']);
								$("input[name='operator']").val(data['operator']);
								$("input[name='deltag']").val(data['deltag']);
								$("input[name='operatorcompany']").val(data['operatorcompany']); */
								
							});
						<!--获取到数据后弹窗-->
							$('#updateStanstardWindow').window("open");
							
						}else{
							$.messager.alert('警告','您一次只能修改一个选项','warning'); 
							$("#grid"). datagrid("clearSelections");
						}
					}else{
						$.messager.alert('警告','您还没有选择要修改的项目，请选择后再进行修改操作!','warning'); 
					}
					
				}
			},{
				id : 'button-delete',
				text : '作废',
				iconCls : 'icon-cancel',
				handler : function(){
				//	alert('作废');
					var sels = $("#grid").datagrid('getSelections');  
					var ids = "";
					if(sels.length>0){
						for (var i = 0; i < sels.length; i++) {
							var id = sels[i].id;
							ids = ids + id+",";
						}
						$.post("${pageContext.request.contextPath}/bc/standard_deletStandard",{"ids":ids},function(data){
							if(data){
								$.messager.alert('通知','删除成功','info'); 
								$("#grid"). datagrid("clearSelections");
								$("#grid"). datagrid("reload");
							}else{
								$.messager.alert('通知','系统正忙','info'); 
								$("#grid"). datagrid("clearSelections");
							}
						});
					}else{
						$.messager.alert('警告','您还没有选择要删除的项目，请选择后再进行删除!','warning'); 
					}
					
					
				}
			},{
				id : 'button-restore',
				text : '还原',
				iconCls : 'icon-save',
				handler : function(){
				//	alert('还原');
					var sels = $("#grid").datagrid('getSelections');  
					var ids = "";
					if(sels.length>0){
						for (var i = 0; i < sels.length; i++) {
							var id = sels[i].id;
							ids = ids + id+",";
						}
						$.post("${pageContext.request.contextPath}/bc/standard_restoreStandard",{"ids":ids},function(data){
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
			}];
			
			  
			// 定义列
			var columns = [ [ {
				field : 'id',
				checkbox : true
			},{
				field : 'name',
				title : '标准名称',
				width : 120, 
				align : 'center'
			}, {
				field : 'minweight',
				title : '最小重量',
				width : 120,
				align : 'center'
			}, {
				field : 'maxweight',
				title : '最大重量',
				width : 120,
				align : 'center'
			}, {
				field : 'minlength',
				title : '最小长度',
				width : 120,
				align : 'center'
			}, {
				field : 'maxlength',
				title : '最大长度',
				width : 120,
				align : 'center'
			}, {
				field : 'operator',
				title : '操作人',
				width : 120,
				align : 'center'
			}, {
				field : 'operationtime',
				title : '操作时间',
				width : 120,
				align : 'center'
			}, {
				field : 'operatorcompany',
				title : '操作单位',
				width : 120,
				align : 'center'
			},
			{
				field : 'deltag',
				title : '是否作废',
				width : 120,
				formatter : function(data,row, index){
					if(data=="1"){
						return "正常使用"
					}else{
						return "已作废";
					}
				},
				align : 'center'
			}] ];
		</script>
	</head>

	<body class="easyui-layout" style="visibility:hidden;">
		<div region="center" border="false">
			<table id="grid"></table>
		</div>
		
		
<!-- 添加取派员窗体  -->
	<div class="easyui-window" title="对收派员进行添加或者修改" id="addStandardWindow" collapsible="false" minimizable="false" maximizable="false" style="top:20px;left:200px">
		<div region="north" style="height:31px;overflow:hidden;" split="false" border="false" >
			<div class="datagrid-toolbar">
				<a id="save" icon="icon-save" href="#" class="easyui-linkbutton" plain="true" >保存</a>
			</div>
		</div>
		
		<div region="center" style="overflow:auto;padding:5px;" border="false">
			<form id="addStandardForm" method="post" action="${pageContext.request.contextPath}/bc/standard_save">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">收派标准</td>
					</tr>
					<tr>
						<td>标准名称：</td>
						<td>
						<input type="hidden" name="id" id="id"/>
						<input type="text"  name="name" class="easyui-validatebox" data-options="required:true"/></td>
					</tr>
					<tr>
						<td>最小重量：</td>
						<td>
						 <input type="text" id="minweight" name="minweight" class="easyui-numberbox" data-options="required:true,min:0,suffix:'kg'"></input>
						 <!-- <input type="text" name="minweight" class="easyui-validatebox" data-options="required:true"/></td>  -->
					</tr>
					<tr>
						<td>最大重量：</td>
						<td>
					 <input type="text" id="maxweight" name="maxweight"  class="easyui-numberbox" data-options="required:true,min:0,suffix:'kg'"></input>
						<!--  <input type="text" name="maxweight" class="easyui-validatebox" data-options="required:true"/></td>  -->
					</tr>
					<tr>
						<td>单位：</td>
						<td>
						<input type="text" name="operatorcompany" class="easyui-validatebox" data-options="required:true"/></td> 
						
							<!-- <select id="operatorcompany" class="easyui-combobox" data-options="required:true" name="operatorcompany" style="width:80px;"> 
								<option value="g">g</option> 
								<option value="kg">kg</option> 
								<option value="t">t</option> 
							</select>  -->
						</td>
					</tr>
					<tr>
						<td>最小长度：</td>
						<td>
						 <input type="text" id="minlength" name="minlength"  class="easyui-numberbox" data-options="required:true,min:0,suffix:'cm'"></input> 
						
					</tr>
					<tr>
						<td>最大长度：</td>
						<td>
						 <input type="text" id="maxlength" name="maxlength"  class="easyui-numberbox" data-options="required:true,min:0,suffix:'cm'"></input>
					</tr>
					
					</table>
			</form>
		</div>
	</div>
	
	
	
	<!-- 修改页面 -->
	
	<div id="updateStanstardWindow" class="easyui-window" title="修改标准" collapsible="false" minimizable="false" modal="true" closed="true" resizable="false"
        maximizable="false" icon="icon-save"  style="width: 350px; height: 300px; padding: 5px;
        background: #fafafa"  data-options="onBeforeClose:removeSelection"	> 
<!-- style="width:360px;height:160px;" data-options="iconCls:'icon-save',modal:true ,closed:true" -->
				<div class="easyui-layout" data-options="fit:true"> 
					<div data-options="region:'center'"> 
					
					<form id="updateStandardForm" method="post" action="${pageContext.request.contextPath}/bc/standard_updateStandard"> 
						
						<div> 
							<label for="name">标准名称:</label> 
							
							<!-- id -->
							<input type="hidden" name="id" id="standardId">
							<input class="easyui-validatebox" type="text" id="upName" name="name" data-options="required:true" /> 
						</div> 
						<div> 
						
							<label for="minweight">最小重量:</label> 
							<input type="text" id="upMinweight" name="minweight" class="easyui-numberbox" data-options="required:true,min:0,suffix:'kg'"></input>
							<!-- <input class="easyui-validatebox" type="text" id="upMinweight" name="minweight" data-options="required:true" />  -->
						</div> 
						<div> 
							<label for="maxweight">最大重量:</label> 
							 <input type="text" id="upMaxweight" name="maxweight"  class="easyui-numberbox" data-options="required:true,min:0,suffix:'kg'"></input>
							<!-- <input class="easyui-validatebox" type="text" id="upMaxweight" name="maxweight" data-options="required:true" />  -->
						</div> 
						<div> 
							<label for="operationtime">注册时间:</label> 
							<input class="easyui-validatebox" type="text" readonly="true" id="upoperationtime" name="operationtime" data-options="required:true" /> 
						</div> 
						<div> 
							<label for="minlength">最小长度:</label> 
							 <input type="text" id="upMinlength" name="minlength"  class="easyui-numberbox" data-options="required:true,min:0,suffix:'cm'"></input> 
							<!-- <input class="easyui-validatebox" type="text" id="upMinlength" name="minlength" data-options="required:true" />  -->
						</div> 
						<div> 
							<label for="maxlength">最大长度:</label> 
							 <input type="text" id="upMaxlength" name="maxlength"  class="easyui-numberbox" data-options="required:true,min:0,suffix:'cm'"></input>
							<!-- <input class="easyui-validatebox" type="text" id="upMaxlength" name="maxlength" data-options="required:true" />  -->
						</div> 
						
						<div> 
							<label for="deltag">操作者:</label> 
							<input class="easyui-validatebox"  readonly="true" type="text" id="upOperator" name="operator"  data-options="required:true" /> 
						</div> 
						<div> 
							<label for="deltag">操作者所在单位:</label> 
							<input class="easyui-validatebox" type="text"  readonly="true" id="upOperatorcompany" name="operatorcompany"  data-options="required:true" /> 
						</div> 
						<div> 
							<label for="deltag">是否有效:</label> 
							<input class="easyui-validatebox" type="text" id="upDeltag" name="deltag"  data-options="required:true" /> 
						</div> 
					</form>
				</div> 
					
					<div data-options="region:'south',split:true" style="height:50px">
						<a id="updateSubmit" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">提交</a>
						<a id="updateReset" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-reload'">重置</a>
						
					</div> 
					<span id="rePassworderror"></span>
				</div> 
			
			</div> 
	
	</body>
<script type="text/javascript">

	<!--修改窗口设置 -->
		$("#updateSubmit").click(function(){
			var f1 = $('#updateStandardForm').form('validate');
			if(f1){
				 $('#updateStandardForm').submit();
			}
		});
		
		$("#updateReset").click(function(){
			
			//$('#ff').form('load'
			$("#upName").val("");
			$("#upMinweight").val("");
			$("#upMaxweight").val("");
			$("#upMinlength").val("");
			$("#upMaxlength").val("");
			$("#upoperationtime").val("");
			$("#upOperator").val("");
			$("#upDeltag").val("");
			$("#upOperatorcompany").val("");
			
		});

		<!--添加标准窗口设置 -->
		$('#minweight').numberbox({ 
			min:0, 
		}); 
		$('#maxweight').numberbox({ 
			min:0, 
		//	precision:2 
		}); 
				
		$('#minlength').numberbox({ 
			min:0, 
			//suffix:'cm',
			//precision:2 
		}); 
		$('#maxlength').numberbox({ 
			min:0, 
			//suffix:'cm',
			//precision:2 
		}); 

	$(function(){
		<!--校验name属性是否唯一-->
		$("input[name='name']").blur(function(){
			$.post("${pageContext.request.contextPath}/bc/standard_nameIsUnique",{"name":$("input[name='name']").val},function(data){
				if(data=="0"){
					$.messager.alert('警告','您输入的标准名称已经存在，请换一个','warning');  
				}
			});
		})
		
		$("#save").click(function(){
			var flag = $('#addStandardForm').form('load');
			if(flag){
				$("#addStandardForm").submit();
			}
			
		});
	});
	
	function removeSelection(){
		$("#grid"). datagrid("clearSelections");
		return true;
	}
	
	
	
</script>
</html>