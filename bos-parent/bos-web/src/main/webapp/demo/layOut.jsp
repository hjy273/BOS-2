<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/easyui/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/locale/easyui-lang-zh_CN.js"></script>

<link rel="stylesheet" href="${pageContext.request.contextPath}/js/ztree/zTreeStyle.css" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/ztree/jquery.ztree.all-3.5.js"></script>
<title>布局</title>
	
	<SCRIPT type="text/javascript">
		
		var setting = {
			data: {
				simpleData: {
					enable: true
				}
			},
			callback: {
				onClick: zTreeOnClick
			}
		};
		
		function zTreeOnClick(event, treeId, treeNode,clickFlag) {
			  var flag =  $("#tt").tabs("exists",treeNode.name);
	            if(!flag){
	            	//  创建
	             $("#tt").tabs("add",{
				  title:treeNode.name,
				  //  content 内容 添加嵌套页面<iframe>
				  content:'<div style="width:100%;height:100%;overflow:hidden;">'
						+ '<iframe src="'
						+ treeNode.page
						+ '" scrolling="auto" style="width:100%;height:100%;border:0;" ></iframe></div>',
				  closable:true
			  });
	            }else{
	            	// 存在选中当前的tabs
	            	 $("#tt").tabs("select",treeNode.name);
	            }
		};

		$(function(){

			$.post("${pageContext.request.contextPath}/json/menu.json",function(data){
				$.fn.zTree.init($("#treeDemo"), setting, data);
			},"json");
		});

		
	</SCRIPT>

</head>

<body class="easyui-layout">
	<div data-options="region:'north',border:false" style="height:80px;background:url('/images/header_bg.png') no-repeat right">
		<div>
			<img alt="logo" src="${pageContext.request.contextPath}/images/logo.png">
		</div>
		<div id="sessionInfoDiv"
			style="position: absolute;right: 5px;top:10px;">
			[<strong>超级管理员</strong>]，欢迎你！您使用[<strong>192.168.1.100</strong>]IP登录！
		</div>
		<div style="position: absolute; right: 5px; bottom: 10px; ">
			<a href="javascript:void(0);" class="easyui-menubutton"
				data-options="menu:'#layout_north_pfMenu',iconCls:'icon-ok'">更换皮肤</a>
			<a href="javascript:void(0);" class="easyui-menubutton"
				data-options="menu:'#layout_north_kzmbMenu',iconCls:'icon-help'">控制面板</a>
		</div>
		
		<!-- <div id="layout_north_p"  style="width:120px; display:none">
			<div onclick="changeTheme('aa')">aa</div>
			<div onclick="changeTheme('bb')">bb</div>
			<div onclick="changeTheme('cc')">cc</div>
			<div onclick="changeTheme('dd')">dd</div>
			
		</div> -->
	
		
		 <div id="layout_north_pfMenu" style="width: 120px; display: none;">
			<div onclick="changeTheme('default');">default</div>
			<div onclick="changeTheme('gray');">gray</div>
			<div onclick="changeTheme('black');">black</div>
			<div onclick="changeTheme('bootstrap');">bootstrap</div>
			<div onclick="changeTheme('metro');">metro</div>
		</div> 
		<div id="layout_north_kzmbMenu" style="width: 100px; display: none;">
			<div onclick="editPassword();">修改密码</div>
			<div onclick="showAbout();">联系管理员</div>
			<div class="menu-sep"></div>
			<div onclick="logoutFun();">退出系统</div>
		</div>
		
		
		
	</div>
	<div class="easyui-accordion" data-options="region:'west',split:true,title:'菜单项'" style="width:200px;padding:10px;">
		<div class="zTreeDemoBackground left" title="基本功能" fit="true"  style="overflow:auto;">
			<ul id="treeDemo" class="ztree"></ul>
		</div>
		<div title="系统管理"  style="overflow:auto;">
		</div>
		<div title="联系我们"  style="overflow:auto;">
		</div>
		
	
	
	</div>
	<!-- <div data-options="region:'east',split:true,collapsed:true,title:'East'" style="width:100px;padding:10px;">east region</div> -->
	<div data-options="region:'south',border:false ,title:'南部'" style="height:50px;background:#A9FACD;padding:10px;">south region</div>
	<div id="tt" class="easyui-tabs" data-options="region:'center',title:'内容展示'">
		
		
		
	
	</div>
</body>
	

</html>