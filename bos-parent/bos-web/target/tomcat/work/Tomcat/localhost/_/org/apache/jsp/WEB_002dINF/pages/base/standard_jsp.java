/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2017-07-19 10:18:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class standard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write(" <!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title>取派标准</title>\r\n");
      out.write("\t\t<!-- 导入jquery核心类库 -->\r\n");
      out.write("\t\t<!-- 导入jquery核心类库 -->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.8.3.js\"></script>\r\n");
      out.write("<!-- 导入easyui类库 -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/portal.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/default.css\">\t\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/jquery.portal.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/jquery.cookie.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/locale/easyui-lang-zh_CN.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(function(){\r\n");
      out.write("\t\t\t\t// 先将body隐藏，再显示，不会出现页面刷新效果\r\n");
      out.write("\t\t\t\t$(\"body\").css({visibility:\"visible\"});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// 收派标准信息表格\r\n");
      out.write("\t\t\t\t$('#grid').datagrid( {\r\n");
      out.write("\t\t\t\t\ticonCls : 'icon-forward',\r\n");
      out.write("\t\t\t\t\tfit : true,\r\n");
      out.write("\t\t\t\t\tborder : false,\r\n");
      out.write("\t\t\t\t\trownumbers : true,\r\n");
      out.write("\t\t\t\t\tstriped : true,\r\n");
      out.write("\t\t\t\t\tpageList: [15,30,50],\r\n");
      out.write("\t\t\t\t\tpagination : true,\r\n");
      out.write("\t\t\t\t\ttoolbar : toolbar,\r\n");
      out.write("\t\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bc/standard_findAll\",\r\n");
      out.write("\t\t\t\t\tidField : 'id',\r\n");
      out.write("\t\t\t\t\tcolumns : columns\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t// 添加取派员窗口\r\n");
      out.write("\t\t\t\t$('#addStandardWindow').window({\r\n");
      out.write("\t\t\t        title: '取派员操作',\r\n");
      out.write("\t\t\t        width: 600,\r\n");
      out.write("\t\t\t        modal: true,\r\n");
      out.write("\t\t\t        shadow: true,\r\n");
      out.write("\t\t\t        closed: true,\r\n");
      out.write("\t\t\t        height: 400,\r\n");
      out.write("\t\t\t        resizable:false,\r\n");
      out.write("\t\t\t         onBeforeClose:function(){\r\n");
      out.write("\t\t\t        \t//   清除form 表单数据 尤其  隐藏id 一定要清除  reset   jquery --->Dom\r\n");
      out.write("\t\t\t        \t  $(\"#addStandardForm\").form('reset');//  text  \r\n");
      out.write("\t\t\t        \t $(\"#tel\").removeClass('validatebox-invalid');  \r\n");
      out.write("\t\t\t             $(\"#id\").val(\"\");  //  一定将隐藏id 值清除 // hidden\r\n");
      out.write("\t\t\t        } \r\n");
      out.write("\t\t\t    });\r\n");
      out.write("\t\t\t});\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//工具栏\r\n");
      out.write("\t\t\tvar toolbar = [ {\r\n");
      out.write("\t\t\t\tid : 'button-add',\r\n");
      out.write("\t\t\t\ttext : '增加',\r\n");
      out.write("\t\t\t\ticonCls : 'icon-add',\r\n");
      out.write("\t\t\t\thandler : function(){\r\n");
      out.write("\t\t\t\t\t$('#addStandardWindow').window(\"open\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tid : 'button-edit',\r\n");
      out.write("\t\t\t\ttext : '修改',\r\n");
      out.write("\t\t\t\ticonCls : 'icon-edit',\r\n");
      out.write("\t\t\t\thandler : function(){\r\n");
      out.write("\t\t\t\t\t//alert('修改');\r\n");
      out.write("\t\t\t\t\tvar sels = $(\"#grid\").datagrid('getSelections');  \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(sels.length>0){\r\n");
      out.write("\t\t\t\t\t\tif(sels.length==1){\r\n");
      out.write("\t\t\t\t\t\t\tid = sels[0].id;\r\n");
      out.write("\t\t\t\t\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bc/standard_findStandardByid\",{\"id\":id},function(data){\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#updateStandardForm').form('load',{ \r\n");
      out.write("\t\t\t\t\t\t\t\t\tid:data['id'],\r\n");
      out.write("\t\t\t\t\t\t\t\t    name:data['name'],  \t\r\n");
      out.write("\t\t\t\t\t\t\t\t    minweight:data['minweight'],  \t\r\n");
      out.write("\t\t\t\t\t\t\t\t    maxweight:data['maxweight'],  \t\r\n");
      out.write("\t\t\t\t\t\t\t\t    minlength:data['minlength'],  \r\n");
      out.write("\t\t\t\t\t\t\t\t    maxlength:data['maxlength'],\r\n");
      out.write("\t\t\t\t\t\t\t\t    operationtime:data['operationtime'],\r\n");
      out.write("\t\t\t\t\t\t\t\t    operator:data['operator'],\r\n");
      out.write("\t\t\t\t\t\t\t\t    deltag:data['deltag'],\r\n");
      out.write("\t\t\t\t\t\t\t\t    operatorcompany:data['operatorcompany']\r\n");
      out.write("\t\t\t\t\t\t\t\t}); \r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t/* \r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"input[name='id']\").val(data['id']);\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"input[name='name']\").val(data['name']);\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"input[name='minweight']\").val(data['minweight']);\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"input[name='maxweight']\").val(data['maxweight']);\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"input[name='minlength']\").val(data['minlength']);\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"input[name='maxlength']\").val(data['maxlength']);\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"input[name='operationtime']\").val(data['operationtime']);\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"input[name='operator']\").val(data['operator']);\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"input[name='deltag']\").val(data['deltag']);\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"input[name='operatorcompany']\").val(data['operatorcompany']); */\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t<!--获取到数据后弹窗-->\r\n");
      out.write("\t\t\t\t\t\t\t$('#updateStanstardWindow').window(\"open\");\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.alert('警告','您一次只能修改一个选项','warning'); \r\n");
      out.write("\t\t\t\t\t\t\t$(\"#grid\"). datagrid(\"clearSelections\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t$.messager.alert('警告','您还没有选择要修改的项目，请选择后再进行修改操作!','warning'); \r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},{\r\n");
      out.write("\t\t\t\tid : 'button-delete',\r\n");
      out.write("\t\t\t\ttext : '作废',\r\n");
      out.write("\t\t\t\ticonCls : 'icon-cancel',\r\n");
      out.write("\t\t\t\thandler : function(){\r\n");
      out.write("\t\t\t\t//\talert('作废');\r\n");
      out.write("\t\t\t\t\tvar sels = $(\"#grid\").datagrid('getSelections');  \r\n");
      out.write("\t\t\t\t\tvar ids = \"\";\r\n");
      out.write("\t\t\t\t\tif(sels.length>0){\r\n");
      out.write("\t\t\t\t\t\tfor (var i = 0; i < sels.length; i++) {\r\n");
      out.write("\t\t\t\t\t\t\tvar id = sels[i].id;\r\n");
      out.write("\t\t\t\t\t\t\tids = ids + id+\",\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bc/standard_deletStandard\",{\"ids\":ids},function(data){\r\n");
      out.write("\t\t\t\t\t\t\tif(data){\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.alert('通知','删除成功','info'); \r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#grid\"). datagrid(\"clearSelections\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#grid\"). datagrid(\"reload\");\r\n");
      out.write("\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.alert('通知','系统正忙','info'); \r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#grid\"). datagrid(\"clearSelections\");\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t$.messager.alert('警告','您还没有选择要删除的项目，请选择后再进行删除!','warning'); \r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},{\r\n");
      out.write("\t\t\t\tid : 'button-restore',\r\n");
      out.write("\t\t\t\ttext : '还原',\r\n");
      out.write("\t\t\t\ticonCls : 'icon-save',\r\n");
      out.write("\t\t\t\thandler : function(){\r\n");
      out.write("\t\t\t\t//\talert('还原');\r\n");
      out.write("\t\t\t\t\tvar sels = $(\"#grid\").datagrid('getSelections');  \r\n");
      out.write("\t\t\t\t\tvar ids = \"\";\r\n");
      out.write("\t\t\t\t\tif(sels.length>0){\r\n");
      out.write("\t\t\t\t\t\tfor (var i = 0; i < sels.length; i++) {\r\n");
      out.write("\t\t\t\t\t\t\tvar id = sels[i].id;\r\n");
      out.write("\t\t\t\t\t\t\tids = ids + id+\",\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bc/standard_restoreStandard\",{\"ids\":ids},function(data){\r\n");
      out.write("\t\t\t\t\t\t\tif(data==\"1\"){\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.alert('通知','还原成功','info'); \r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#grid\"). datagrid(\"clearSelections\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#grid\"). datagrid(\"reload\");\r\n");
      out.write("\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.alert('通知','系统正忙','info'); \r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#grid\"). datagrid(\"clearSelections\");\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t$.messager.alert('警告','您还没有选择要还原的项目，请选择后再进行还原!','warning'); \r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}];\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t// 定义列\r\n");
      out.write("\t\t\tvar columns = [ [ {\r\n");
      out.write("\t\t\t\tfield : 'id',\r\n");
      out.write("\t\t\t\tcheckbox : true\r\n");
      out.write("\t\t\t},{\r\n");
      out.write("\t\t\t\tfield : 'name',\r\n");
      out.write("\t\t\t\ttitle : '标准名称',\r\n");
      out.write("\t\t\t\twidth : 120, \r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'minweight',\r\n");
      out.write("\t\t\t\ttitle : '最小重量',\r\n");
      out.write("\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'maxweight',\r\n");
      out.write("\t\t\t\ttitle : '最大重量',\r\n");
      out.write("\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'minlength',\r\n");
      out.write("\t\t\t\ttitle : '最小长度',\r\n");
      out.write("\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'maxlength',\r\n");
      out.write("\t\t\t\ttitle : '最大长度',\r\n");
      out.write("\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'operator',\r\n");
      out.write("\t\t\t\ttitle : '操作人',\r\n");
      out.write("\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'operationtime',\r\n");
      out.write("\t\t\t\ttitle : '操作时间',\r\n");
      out.write("\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'operatorcompany',\r\n");
      out.write("\t\t\t\ttitle : '操作单位',\r\n");
      out.write("\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tfield : 'deltag',\r\n");
      out.write("\t\t\t\ttitle : '是否作废',\r\n");
      out.write("\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\tformatter : function(data,row, index){\r\n");
      out.write("\t\t\t\t\tif(data==\"1\"){\r\n");
      out.write("\t\t\t\t\t\treturn \"正常使用\"\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\treturn \"已作废\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}] ];\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body class=\"easyui-layout\" style=\"visibility:hidden;\">\r\n");
      out.write("\t\t<div region=\"center\" border=\"false\">\r\n");
      out.write("\t\t\t<table id=\"grid\"></table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("<!-- 添加取派员窗体  -->\r\n");
      out.write("\t<div class=\"easyui-window\" title=\"对收派员进行添加或者修改\" id=\"addStandardWindow\" collapsible=\"false\" minimizable=\"false\" maximizable=\"false\" style=\"top:20px;left:200px\">\r\n");
      out.write("\t\t<div region=\"north\" style=\"height:31px;overflow:hidden;\" split=\"false\" border=\"false\" >\r\n");
      out.write("\t\t\t<div class=\"datagrid-toolbar\">\r\n");
      out.write("\t\t\t\t<a id=\"save\" icon=\"icon-save\" href=\"#\" class=\"easyui-linkbutton\" plain=\"true\" >保存</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div region=\"center\" style=\"overflow:auto;padding:5px;\" border=\"false\">\r\n");
      out.write("\t\t\t<form id=\"addStandardForm\" method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bc/standard_save\">\r\n");
      out.write("\t\t\t\t<table class=\"table-edit\" width=\"80%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<tr class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">收派标准</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>标准名称：</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" id=\"id\"/>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\"  name=\"name\" class=\"easyui-validatebox\" data-options=\"required:true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>最小重量：</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t <input type=\"text\" id=\"minweight\" name=\"minweight\" class=\"easyui-numberbox\" data-options=\"required:true,min:0,suffix:'kg'\"></input>\r\n");
      out.write("\t\t\t\t\t\t <!-- <input type=\"text\" name=\"minweight\" class=\"easyui-validatebox\" data-options=\"required:true\"/></td>  -->\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>最大重量：</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t <input type=\"text\" id=\"maxweight\" name=\"maxweight\"  class=\"easyui-numberbox\" data-options=\"required:true,min:0,suffix:'kg'\"></input>\r\n");
      out.write("\t\t\t\t\t\t<!--  <input type=\"text\" name=\"maxweight\" class=\"easyui-validatebox\" data-options=\"required:true\"/></td>  -->\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>单位：</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"operatorcompany\" class=\"easyui-validatebox\" data-options=\"required:true\"/></td> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <select id=\"operatorcompany\" class=\"easyui-combobox\" data-options=\"required:true\" name=\"operatorcompany\" style=\"width:80px;\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"g\">g</option> \r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"kg\">kg</option> \r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"t\">t</option> \r\n");
      out.write("\t\t\t\t\t\t\t</select>  -->\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>最小长度：</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t <input type=\"text\" id=\"minlength\" name=\"minlength\"  class=\"easyui-numberbox\" data-options=\"required:true,min:0,suffix:'cm'\"></input> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>最大长度：</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t <input type=\"text\" id=\"maxlength\" name=\"maxlength\"  class=\"easyui-numberbox\" data-options=\"required:true,min:0,suffix:'cm'\"></input>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 修改页面 -->\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"updateStanstardWindow\" class=\"easyui-window\" title=\"修改标准\" collapsible=\"false\" minimizable=\"false\" modal=\"true\" closed=\"true\" resizable=\"false\"\r\n");
      out.write("        maximizable=\"false\" icon=\"icon-save\"  style=\"width: 350px; height: 300px; padding: 5px;\r\n");
      out.write("        background: #fafafa\"  data-options=\"onBeforeClose:removeSelection\"\t> \r\n");
      out.write("<!-- style=\"width:360px;height:160px;\" data-options=\"iconCls:'icon-save',modal:true ,closed:true\" -->\r\n");
      out.write("\t\t\t\t<div class=\"easyui-layout\" data-options=\"fit:true\"> \r\n");
      out.write("\t\t\t\t\t<div data-options=\"region:'center'\"> \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<form id=\"updateStandardForm\" method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bc/standard_updateStandard\"> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div> \r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"name\">标准名称:</label> \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- id -->\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" id=\"standardId\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"easyui-validatebox\" type=\"text\" id=\"upName\" name=\"name\" data-options=\"required:true\" /> \r\n");
      out.write("\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t<div> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"minweight\">最小重量:</label> \r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"upMinweight\" name=\"minweight\" class=\"easyui-numberbox\" data-options=\"required:true,min:0,suffix:'kg'\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <input class=\"easyui-validatebox\" type=\"text\" id=\"upMinweight\" name=\"minweight\" data-options=\"required:true\" />  -->\r\n");
      out.write("\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t<div> \r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"maxweight\">最大重量:</label> \r\n");
      out.write("\t\t\t\t\t\t\t <input type=\"text\" id=\"upMaxweight\" name=\"maxweight\"  class=\"easyui-numberbox\" data-options=\"required:true,min:0,suffix:'kg'\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <input class=\"easyui-validatebox\" type=\"text\" id=\"upMaxweight\" name=\"maxweight\" data-options=\"required:true\" />  -->\r\n");
      out.write("\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t<div> \r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"operationtime\">注册时间:</label> \r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"easyui-validatebox\" type=\"text\" readonly=\"true\" id=\"upoperationtime\" name=\"operationtime\" data-options=\"required:true\" /> \r\n");
      out.write("\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t<div> \r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"minlength\">最小长度:</label> \r\n");
      out.write("\t\t\t\t\t\t\t <input type=\"text\" id=\"upMinlength\" name=\"minlength\"  class=\"easyui-numberbox\" data-options=\"required:true,min:0,suffix:'cm'\"></input> \r\n");
      out.write("\t\t\t\t\t\t\t<!-- <input class=\"easyui-validatebox\" type=\"text\" id=\"upMinlength\" name=\"minlength\" data-options=\"required:true\" />  -->\r\n");
      out.write("\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t<div> \r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"maxlength\">最大长度:</label> \r\n");
      out.write("\t\t\t\t\t\t\t <input type=\"text\" id=\"upMaxlength\" name=\"maxlength\"  class=\"easyui-numberbox\" data-options=\"required:true,min:0,suffix:'cm'\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <input class=\"easyui-validatebox\" type=\"text\" id=\"upMaxlength\" name=\"maxlength\" data-options=\"required:true\" />  -->\r\n");
      out.write("\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div> \r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"deltag\">操作者:</label> \r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"easyui-validatebox\"  readonly=\"true\" type=\"text\" id=\"upOperator\" name=\"operator\"  data-options=\"required:true\" /> \r\n");
      out.write("\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t<div> \r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"deltag\">操作者所在单位:</label> \r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"easyui-validatebox\" type=\"text\"  readonly=\"true\" id=\"upOperatorcompany\" name=\"operatorcompany\"  data-options=\"required:true\" /> \r\n");
      out.write("\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t<div> \r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"deltag\">是否有效:</label> \r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"easyui-validatebox\" type=\"text\" id=\"upDeltag\" name=\"deltag\"  data-options=\"required:true\" /> \r\n");
      out.write("\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div data-options=\"region:'south',split:true\" style=\"height:50px\">\r\n");
      out.write("\t\t\t\t\t\t<a id=\"updateSubmit\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-ok'\">提交</a>\r\n");
      out.write("\t\t\t\t\t\t<a id=\"updateReset\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-reload'\">重置</a>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t<span id=\"rePassworderror\"></span>\r\n");
      out.write("\t\t\t\t</div> \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div> \r\n");
      out.write("\t\r\n");
      out.write("\t</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t<!--修改窗口设置 -->\r\n");
      out.write("\t\t$(\"#updateSubmit\").click(function(){\r\n");
      out.write("\t\t\tvar f1 = $('#updateStandardForm').form('validate');\r\n");
      out.write("\t\t\tif(f1){\r\n");
      out.write("\t\t\t\t $('#updateStandardForm').submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#updateReset\").click(function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//$('#ff').form('load'\r\n");
      out.write("\t\t\t$(\"#upName\").val(\"\");\r\n");
      out.write("\t\t\t$(\"#upMinweight\").val(\"\");\r\n");
      out.write("\t\t\t$(\"#upMaxweight\").val(\"\");\r\n");
      out.write("\t\t\t$(\"#upMinlength\").val(\"\");\r\n");
      out.write("\t\t\t$(\"#upMaxlength\").val(\"\");\r\n");
      out.write("\t\t\t$(\"#upoperationtime\").val(\"\");\r\n");
      out.write("\t\t\t$(\"#upOperator\").val(\"\");\r\n");
      out.write("\t\t\t$(\"#upDeltag\").val(\"\");\r\n");
      out.write("\t\t\t$(\"#upOperatorcompany\").val(\"\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t<!--添加标准窗口设置 -->\r\n");
      out.write("\t\t$('#minweight').numberbox({ \r\n");
      out.write("\t\t\tmin:0, \r\n");
      out.write("\t\t}); \r\n");
      out.write("\t\t$('#maxweight').numberbox({ \r\n");
      out.write("\t\t\tmin:0, \r\n");
      out.write("\t\t//\tprecision:2 \r\n");
      out.write("\t\t}); \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t$('#minlength').numberbox({ \r\n");
      out.write("\t\t\tmin:0, \r\n");
      out.write("\t\t\t//suffix:'cm',\r\n");
      out.write("\t\t\t//precision:2 \r\n");
      out.write("\t\t}); \r\n");
      out.write("\t\t$('#maxlength').numberbox({ \r\n");
      out.write("\t\t\tmin:0, \r\n");
      out.write("\t\t\t//suffix:'cm',\r\n");
      out.write("\t\t\t//precision:2 \r\n");
      out.write("\t\t}); \r\n");
      out.write("\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t<!--校验name属性是否唯一-->\r\n");
      out.write("\t\t$(\"input[name='name']\").blur(function(){\r\n");
      out.write("\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bc/standard_nameIsUnique\",{\"name\":$(\"input[name='name']\").val},function(data){\r\n");
      out.write("\t\t\t\tif(data==\"0\"){\r\n");
      out.write("\t\t\t\t\t$.messager.alert('警告','您输入的标准名称已经存在，请换一个','warning');  \r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#save\").click(function(){\r\n");
      out.write("\t\t\tvar flag = $('#addStandardForm').form('load');\r\n");
      out.write("\t\t\tif(flag){\r\n");
      out.write("\t\t\t\t$(\"#addStandardForm\").submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction removeSelection(){\r\n");
      out.write("\t\t$(\"#grid\"). datagrid(\"clearSelections\");\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
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
}
