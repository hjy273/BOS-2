/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2017-07-16 10:12:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reSetPwd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>找回密码主页</title>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.8.3.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/style.css\" />\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/style_grey.css\" />\r\n");
      out.write("<style>\r\n");
      out.write("input[type=text] {\r\n");
      out.write("\twidth: 80%;\r\n");
      out.write("\theight: 25px;\r\n");
      out.write("\tfont-size: 12pt;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tmargin-left: 45px;\r\n");
      out.write("\tpadding: 3px;\r\n");
      out.write("\tborder-width: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=password] {\r\n");
      out.write("\twidth: 80%;\r\n");
      out.write("\theight: 25px;\r\n");
      out.write("\tfont-size: 12pt;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tmargin-left: 45px;\r\n");
      out.write("\tpadding: 3px;\r\n");
      out.write("\tborder-width: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#loginform\\:codeInput {\r\n");
      out.write("\tmargin-left: 1px;\r\n");
      out.write("\tmargin-top: 1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#loginform\\:vCode {\r\n");
      out.write("\tmargin: 0px 0 0 60px;\r\n");
      out.write("\theight: 34px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tif(window.self != window.top){\r\n");
      out.write("\t\twindow.top.location = window.location;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar flag = false;\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"input[name='password']\").blur(function(){\r\n");
      out.write("\t\t\tif($(this).val()==\"\"){\r\n");
      out.write("\t\t\t\tflag = false;\r\n");
      out.write("\t\t\t\t$(\"#passworderror\").html(\"密码不能为空\");\r\n");
      out.write("\t\t\t\treturn ;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar reg = /\\s+/;\r\n");
      out.write("\t\t\t\tif(reg.test($(this).val())){\r\n");
      out.write("\t\t\t\t\t$(\"#passworderror\").html(\"密码不可以包含空字符\");\r\n");
      out.write("\t\t\t\t\tflag = false;\r\n");
      out.write("\t\t\t\t\treturn ;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t//var regex =  /^[\\w]{6,20}$/;\r\n");
      out.write("\t\t\t\tvar regex = /^[0-9A-Za_z]{6,16}$/;\r\n");
      out.write("\t\t\t\tif(!regex.test($(this).val())){\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#passworderror\").html(\"密码必须是3到16位的数字或者字母\");\r\n");
      out.write("\t\t\t\t\tflag = false;\r\n");
      out.write("\t\t\t\t\treturn ;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tflag = true;\r\n");
      out.write("\t\t\t\t$(\"#passworderror\").html(\"\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tflag =true;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"input[name='rePassword']\").blur(function(){\r\n");
      out.write("\t\t\tvar password = $(\"input[name='password']\").val();\r\n");
      out.write("\t\t\tvar rePassword = $(\"input[name='rePassword\").val();\r\n");
      out.write("\t\t\tif(password==rePassword){\r\n");
      out.write("\t\t\t\tflag = true;\r\n");
      out.write("\t\t\t\t$(\"#rePassworderror\").html(\"\");\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tflag = false;\r\n");
      out.write("\t\t\t\t$(\"#rePassworderror\").html(\"两次密码不一致，请重新录入\");\r\n");
      out.write("\t\t\t\t$(\"input[name='password']\").val(\"\");\r\n");
      out.write("\t\t\t\t$(\"input[name='rePassword']\").val(\"\");\r\n");
      out.write("\t\t\t\t//$(\"#passworderror\").html(\"\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tflag = true;\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t$(\"#reSetPwdCon\").click(function(){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t/* if(flag){\r\n");
      out.write("\t\t\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageCotext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/user_reSetPwd\",{\"password\":$(\"input[name='password']\").val(\"\"),\"rePassword\":$(\"input[name='rePassword']\").val(\"\"),\"telephone\":$(\"#telephone\").val()},function(data){\r\n");
      out.write("\t\t\t\t\t\tif(data){\r\n");
      out.write("\t\t\t\t\t\t\tlocation.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageCotext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/login.jsp\";\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.alert('通知','密码更新失败','info'); \r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});  */\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#newsmsform\").submit(); \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div\r\n");
      out.write("\t\tstyle=\"width: 900px; height: 50px; position: absolute; text-align: left; left: 50%; top: 50%; margin-left: -450px;; margin-top: -280px;\">\r\n");
      out.write("\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/logo.png\" style=\"border-width: 0; margin-left: 0;\" />\r\n");
      out.write("\t\t<span style=\"float: right; margin-top: 35px; color: #488ED5;\">新BOS系统以宅急送开发的ERP系统为基础，致力于便捷、安全、稳定等方面的客户体验</span>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"main-inner\" id=\"mainCnt\"\r\n");
      out.write("\t\tstyle=\"width: 900px; height: 440px; overflow: hidden; position: absolute; left: 50%; top: 50%; margin-left: -450px; margin-top: -220px; background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/bg_login.jpg')\">\r\n");
      out.write("\t\t<div id=\"loginBlock\" class=\"login\"\r\n");
      out.write("\t\t\tstyle=\"margin-top: 80px; height: 255px;\">\r\n");
      out.write("\t\t\t<div class=\"loginFunc\">\r\n");
      out.write("\t\t\t\t<div id=\"lbNormal\" class=\"loginFuncMobile\">重置密码</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fhidden_005f0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("\t\t\t<div class=\"loginForm\">\r\n");
      out.write("\t\t\t\t<form id=\"newsmsform\" name=\"loginform\" method=\"post\" class=\"niceform\"\r\n");
      out.write("\t\t\t\t\taction=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageCotext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/user_reSetPwd\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_s_005fhidden_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- <input type=\"hidden\" name=\"telephone\" value=\"15850002095\"> -->\r\n");
      out.write("\t\t\t\t\t<div id=\"idInputLine\" class=\"loginFormIpt showPlaceholder\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"margin-top: 5px;\">\r\n");
      out.write("\t\t\t\t\t\t<input id=\"loginform:idInput\" type=\"text\" name=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"loginFormTdIpt\" maxlength=\"50\"/>\r\n");
      out.write("\t\t\t\t\t\t<label for=\"idInput\" class=\"placeholder\" id=\"idPlaceholder\">新密码：</label>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"forgetPwdLine\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"pwdInputLine\" class=\"loginFormIpt showPlaceholder\">\r\n");
      out.write("\t\t\t\t\t\t<input id=\"loginform:pwdInput\" class=\"loginFormTdIpt\" type=\"text\" name=\"rePassword\"/>\r\n");
      out.write("\t\t\t\t\t\t<label for=\"pwdInput\" class=\"placeholder\" id=\"pwdPlaceholder\">确认密码：</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"loginFormIpt loginFormIptWiotTh\"\tstyle=\"margin-top:58px;\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" id=\"reSetPwd\" name=\"reSetPwd\">\r\n");
      out.write("\t\t\t\t\t\t<span id=\"reSetPwdCon\" class=\"btn btn-login\" style=\"margin-top:-36px;\" >确认</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<span id=\"passworderror\"></span>\t\r\n");
      out.write("\t\t\t\t\t<span id=\"rePassworderror\"></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div\r\n");
      out.write("\t\tstyle=\"width: 900px; height: 50px; position: absolute; text-align: left; left: 50%; top: 50%; margin-left: -450px;; margin-top: 220px;\">\r\n");
      out.write("\t\t<span style=\"color: #488ED5;\">Powered By www.itcast.cn</span><span\r\n");
      out.write("\t\t\tstyle=\"color: #488ED5;margin-left:10px;\">推荐浏览器（右键链接-目标另存为）：<a\r\n");
      out.write("\t\t\thref=\"http://download.firefox.com.cn/releases/full/23.0/zh-CN/Firefox-full-latest.exe\">Firefox</a>\r\n");
      out.write("\t\t</span><span style=\"float: right; color: #488ED5;\">宅急送BOS系统</span>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005fhidden_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f0 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f0.setParent(null);
    // /reSetPwd.jsp(131,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setName("telephone");
    // /reSetPwd.jsp(131,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setValue("15850002095");
    int _jspx_eval_s_005fhidden_005f0 = _jspx_th_s_005fhidden_005f0.doStartTag();
    if (_jspx_th_s_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f1 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f1.setParent(null);
    // /reSetPwd.jsp(135,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setName("telephone");
    // /reSetPwd.jsp(135,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setValue("15850002095");
    int _jspx_eval_s_005fhidden_005f1 = _jspx_th_s_005fhidden_005f1.doStartTag();
    if (_jspx_th_s_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f1);
    return false;
  }
}