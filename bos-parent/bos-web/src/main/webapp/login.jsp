<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆页面</title>
<script src="${pageContext.request.contextPath }/js/jquery-1.8.3.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css" />
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/style_grey.css" />

<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/default.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
<script
	src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js"
	type="text/javascript"></script>

<style>
input[type=text] {
	width: 80%;
	height: 25px;
	font-size: 12pt;
	font-weight: bold;
	margin-left: 45px;
	padding: 3px;
	border-width: 0;
}

input[type=password] {
	width: 80%;
	height: 25px;
	font-size: 12pt;
	font-weight: bold;
	margin-left: 45px;
	padding: 3px;
	border-width: 0;
}

#loginform\:codeInput {
	margin-left: 1px;
	margin-top: 1px;
}

#loginform\:vCode {
	margin: 0px 0 0 60px;
	height: 34px;
}
</style>
<script type="text/javascript">
	if(window.self != window.top){
		window.top.location = window.location;
	}
</script>
</head>
<body>
<!-- 错误信息回显 -->
	<s:fielderror/>
	<s:actionerror/>
	<div
		style="width: 900px; height: 50px; position: absolute; text-align: left; left: 50%; top: 50%; margin-left: -450px;; margin-top: -280px;">
		<img src="${pageContext.request.contextPath }/images/logo.png" style="border-width: 0; margin-left: 0;" />
		<span style="float: right; margin-top: 35px; color: #488ED5;">新BOS系统以宅急送开发的ERP系统为基础，致力于便捷、安全、稳定等方面的客户体验</span>
	</div>
	<div class="main-inner" id="mainCnt"
		style="width: 900px; height: 440px; overflow: hidden; position: absolute; left: 50%; top: 50%; margin-left: -450px; margin-top: -220px; background-image: url('${pageContext.request.contextPath }/images/bg_login.jpg')">
		<div id="loginBlock" class="login"
			style="margin-top: 80px; height: 255px;">
			<div class="loginFunc">
				<div id="lbNormal" class="loginFuncMobile">员工登录</div>
			</div>
			<div class="loginForm">
				<form id="loginform" name="loginform" method="post" class="niceform" action="${pageCotext.request.contextPath}/user/user_login">
					<div id="idInputLine" class="loginFormIpt showPlaceholder"
						style="margin-top: 5px;">
						<input id="loginform:idInput" type="text" name="email"
							 class="loginFormTdIpt easyui-validatebox" maxlength="50"  data-options="validType:'email'"/>
						<label for="idInput" class="placeholder" id="idPlaceholder" >帐号：</label>
						
					</div>
					<div class="forgetPwdLine"></div>
					<div id="pwdInputLine" class="loginFormIpt showPlaceholder">
						<input id="loginform:pwdInput"  type="password" class="easyui-validatebox" data-options="required:true" 
							name="password" value="" />
						<label for="pwdInput" class="placeholder" id="pwdPlaceholder">密码：</label>
						
					</div>
					
					<div>
					  <br>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="forget.jsp" target="_blank">邮件找回密码?</a>&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="${pageContext.request.contextPath }/smspassword.jsp" target="_blank">短信找回密码?</a>
						&nbsp;&nbsp;<font color="red"></font>
					</div>
					
					
					<div class="loginFormIpt loginFormIptWiotTh"
						style="margin-top:58px;">
						<div id="codeInputLine" class="loginFormIpt showPlaceholder"
							style="margin-left:0px;margin-top:-40px;width:50px;">
							<input id="loginform:codeInput" class="loginFormTdIpt easyui-validatebo" type="text"
								name="checkcode" title="请输入验证码"  data-options="required:true,validType:'email'"/>
							<img id="loginform:vCode" src="${pageContext.request.contextPath }/validatecode.jsp"
								onclick="javascript:document.getElementById('loginform:vCode').src='${pageContext.request.contextPath }/validatecode.jsp?'+Math.random();" />
						</div>
						<a href="#" id="login" onclick="to_login()" name="loginform:j_id19" >
						<span
							id="loginByForm" class="btn btn-login"
							style="margin-top:-36px;">登录</span>
						</a>
						
						<span id="emailError"></span>
						<span id="pwdError"></span>
						<span id="checkCodeError"></span>
					</div>
				
				</form>
			</div>
		
		</div>
	</div>
	
		
	<div
		style="width: 900px; height: 50px; position: absolute; text-align: left; left: 50%; top: 50%; margin-left: -450px;; margin-top: 220px;">
		<span style="color: #488ED5;">Powered By www.itcast.cn</span><span
			style="color: #488ED5;margin-left:10px;">推荐浏览器（右键链接-目标另存为）：<a
			href="http://download.firefox.com.cn/releases/full/23.0/zh-CN/Firefox-full-latest.exe">Firefox</a>
		</span><span style="float: right; color: #488ED5;">宅急送BOS系统</span>
	</div>
</body>
	<script type="text/javascript">
		var flag = false;
		
		$(function(){
			
			$("input[name='email']").blur(function(){
				if($(this).val()==""){
					flag=false;
					$("#emailError").html("用户名不能为空");
					return ;
				}else{
					flag=true;
					$("#emailError").html("");
					
				}
			});
			
			$("input[name='password']").blur(function(){
				if($(this).val()!=""||$(this).val()>6){
					flag=true;
					$("#pwdError").html("");
				}else{
					flag=false;
					$("#pwdError").html("密码不能为空");
					return ;
				}
			});
			
			$("input[name='checkcode']").blur(function(){
				if($(this).val()==""){
					$("#checkCodeError").html("验证码不能为空");
					//$.messager.alert('错误','验证码不能为空!','error'); 
					flag=false;
					return ;
				}else{
					flag=true;
					$("#checkCodeError").html("");
				}
				$.post("${pageContext.request.contextPath }/user/user_checkCode",{"checkcode" :this.value},function(data){
					if(data){
						flag=true;
						$("#checkCodeError").html("");
					}else{
						flag=false;
						//$.messager.alert('错误','验证码输入有误!','error');  
						$("#checkCodeError").html("验证码输入有误");
						return;
					}
				});
			});
		});
	
		 $(function(){
			$("#login").click(function(){
				if(flag){
					$("#loginform").submit();
				}
				
			});
		}) ;
	</script>

</html>