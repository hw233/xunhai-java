/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.29
 * Generated at: 2018-09-03 03:33:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.*;
import java.util.*;
import com.domain.User;
import java.util.*;
import com.constant.OptTypeConstant;
import java.util.*;
import java.util.*;

public final class payOrder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/index_header.jsp", Long.valueOf(1535887514027L));
    _jspx_dependants.put("/index_menu.jsp", Long.valueOf(1535887514028L));
    _jspx_dependants.put("/index_footer.jsp", Long.valueOf(1535887514027L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1535887514007L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.json.JSONObject");
    _jspx_imports_classes.add("com.domain.User");
    _jspx_imports_classes.add("com.constant.OptTypeConstant");
    _jspx_imports_classes.add("org.json.JSONArray");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
			
	String startDate = (String)request.getAttribute("startDate");
	String endDate = (String)request.getAttribute("endDate");
			
	JSONObject data = (JSONObject) request.getAttribute("data");
	JSONArray payOrderData = new JSONArray();
	if (data != null) {
		payOrderData = (JSONArray) data.getJSONArray("dataList");
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>运营分析系统</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link rel=\"icon\" href=\"");
      out.print(path );
      out.write("/images/favicon.ico\" type=\"image/x-icon\"/>");
      out.write("\r\n");
      out.write("<link type=\"text/css\" href=\"");
      out.print(path);
      out.write("/css/index.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link type=\"text/css\" href=\"");
      out.print(path);
      out.write("/css/datetimepicker.css\"\r\n");
      out.write("\trel=\"stylesheet\" />\r\n");
      out.write("<link type=\"text/css\" href=\"");
      out.print(path);
      out.write("/css/jquery.dataTables.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/datetimepicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.print(path);
      out.write("/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/highcharts.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('#table_1').dataTable({\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('.datetimepicker').datetimepicker({\r\n");
      out.write("\t\t\tlang : 'ch',\r\n");
      out.write("\t\t\ttimepicker : false,\r\n");
      out.write("\t\t\tformat : 'Y-m-d',\r\n");
      out.write("\t\t\tformatDate : 'Y-m-d',\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\r\n");

	String agent = (String)request.getSession().getAttribute("agent");
	String gameSite = (String)request.getSession().getAttribute("gameSiteName");
	String server = "";
	String[] serverArray = {}; 
	if (!agent.equals("")) {
		serverArray = agent.split(",");
	} else if (!gameSite.equals("")) {
		serverArray = gameSite.split(",");
	}
	
	int n = serverArray.length;
	
	if (n > 8) 
		n = 9;
	for (int i = 0; i < n; i++) {
		if (i == 8) {
			server += "....." + "、";
		} else {
			server += serverArray[i] + "、";
		}
	}
	
	n = server.length();
	if (n > 0) {
		server = server.substring(0, n - 1);
	}
	
	String username = "";
	User user = (User)request.getSession().getAttribute(request.getSession().getId());
	if (user != null) {
		username = user.getUserName();
	}

      out.write("\r\n");
      out.write("<link type=\"text/css\" href=\"");
      out.print( path);
      out.write("/css/index_header.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\t<div class=\"header_top\">\r\n");
      out.write("\t\t<span class=\"systemname\">运营分析系统  v1.0.0</span>\r\n");
      out.write("\t\t<div class=\"top_menu\">\r\n");
      out.write("\t\t\t<div class=\"top_menu_item\">\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print( path);
      out.write("/logout\"><span class=\"icon icon-quit\"></span> 注销 </a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"header_bottom\">\r\n");
      out.write("\t\t<div class=\"bottom_left_menu\">\r\n");
      out.write("\t\t\t<div class=\"bottom_left_menu_item\">\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print( path);
      out.write("/all?optType=111\"><b>HOME</b></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"bottom_left_menu_item\">\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print( path);
      out.write("/all?optType=116\" id=\"btn_selectSer\">选择服务器 </a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"server_state\">\r\n");
      out.write("\t\t\t<span>当前服务器 【");
      out.print( server);
      out.write("】</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<span class=\"username\"><span class=\"icon icon-profile\"></span>&nbsp;欢迎您，");
      out.print(username );
      out.write("！</span>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"left_container\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\r\n");

	int pageIndex = 0;
	if (request.getAttribute("pageIndex") != null) {
		pageIndex = Integer.parseInt(request.getAttribute("pageIndex").toString());
	}

      out.write("\r\n");
      out.write("<link type=\"text/css\" href=\"");
      out.print( request.getContextPath());
      out.write("/css/index_menu.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print( request.getContextPath());
      out.write("/js/index_menu.js\"> </script>\r\n");
      out.write("\r\n");
      out.write("<div id=\"menu\">\r\n");
      out.write("\t<div id=\"menucontent\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li class=\"menu\">\r\n");
      out.write("\t\t\t\t<a href=\"\" onclick=\"return false\" class=\"menuheader\">运营分析</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"");
      out.print( pageIndex == 101 ? "menuitem_current" : "menuitem_none");
      out.write("\" href=\"");
      out.print( request.getContextPath());
      out.write("/dataAnalysis?optType=");
      out.print( OptTypeConstant.DATA_ANALYSIS_2);
      out.write("\">实时监控</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"");
      out.print( pageIndex == 102 ? "menuitem_current" : "menuitem_none");
      out.write("\" href=\"");
      out.print( request.getContextPath());
      out.write("/dataAnalysis?optType=");
      out.print( OptTypeConstant.DATA_ANALYSIS_4);
      out.write("\">留存分析</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"");
      out.print( pageIndex == 105 ? "menuitem_current" : "menuitem_none");
      out.write("\" href=\"");
      out.print( request.getContextPath());
      out.write("/dataAnalysis?optType=");
      out.print( OptTypeConstant.DATA_ANALYSIS_18);
      out.write("\">游戏区看盘</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"");
      out.print( pageIndex == 106 ? "menuitem_current" : "menuitem_none");
      out.write("\" href=\"");
      out.print( request.getContextPath());
      out.write("/dataAnalysis?optType=");
      out.print( OptTypeConstant.DATA_ANALYSIS_19);
      out.write("\">指标趋势看盘</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"");
      out.print( pageIndex == 108 ? "menuitem_current" : "menuitem_none");
      out.write("\" href=\"");
      out.print( request.getContextPath());
      out.write("/dataAnalysis?optType=");
      out.print( OptTypeConstant.DATA_ANALYSIS_21);
      out.write("\">在线时长分析</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"");
      out.print( pageIndex == 109 ? "menuitem_current" : "menuitem_none");
      out.write("\" href=\"");
      out.print( request.getContextPath());
      out.write("/dataAnalysis?optType=");
      out.print( OptTypeConstant.DATA_ANALYSIS_22);
      out.write("\">登录用户构成</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"");
      out.print( pageIndex == 311 ? "menuitem_current" : "menuitem_none");
      out.write("\" href=\"");
      out.print( request.getContextPath());
      out.write("/behaviorAnalysis?optType=");
      out.print( OptTypeConstant.BEHAVIOR_ANALYSIS_11);
      out.write("\">新手节点流失分析</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"menu\">\r\n");
      out.write("\t\t\t\t<a href=\"\" onclick=\"return false\" class=\"menuheader\">客户管理</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"");
      out.print( pageIndex == 401 ? "menuitem_current" : "menuitem_none");
      out.write("\" href=\"");
      out.print( request.getContextPath());
      out.write("/accountAnalysis?optType=");
      out.print(OptTypeConstant.ACCOUNT_ANALYSIS_1);
      out.write("\">大客户管理</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"");
      out.print( pageIndex == 402 ? "menuitem_current" : "menuitem_none");
      out.write("\" href=\"");
      out.print( request.getContextPath());
      out.write("/accountAnalysis?optType=");
      out.print(OptTypeConstant.ACCOUNT_ANALYSIS_2);
      out.write("\">充值订单</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"");
      out.print( pageIndex == 403 ? "menuitem_current" : "menuitem_none");
      out.write("\" href=\"");
      out.print( request.getContextPath());
      out.write("/accountAnalysis?optType=");
      out.print(OptTypeConstant.ACCOUNT_ANALYSIS_4);
      out.write("\">区服充值数据</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");

				if (request.getSession().getAttribute("canUsePay") != null && Boolean.parseBoolean(request.getSession().getAttribute("canUsePay").toString()) == true) {
			 
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"menu\">\r\n");
      out.write("\t\t\t\t<a href=\"\" onclick=\"return false\" class=\"menuheader\">付费分析</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"");
      out.print( pageIndex == 201 ? "menuitem_current" : "menuitem_none");
      out.write("\" href=\"");
      out.print( request.getContextPath());
      out.write("/payAnalysis?optType=");
      out.print(OptTypeConstant.PAY_ANALYSIS_31);
      out.write("\">商城销量分析</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"");
      out.print( pageIndex == 202 ? "menuitem_current" : "menuitem_none");
      out.write("\" href=\"");
      out.print( request.getContextPath());
      out.write("/payAnalysis?optType=");
      out.print(OptTypeConstant.PAY_ANALYSIS_32);
      out.write("\">元宝消耗分布</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"");
      out.print( pageIndex == 203 ? "menuitem_current" : "menuitem_none");
      out.write("\" href=\"");
      out.print( request.getContextPath());
      out.write("/payAnalysis?optType=");
      out.print(OptTypeConstant.PAY_ANALYSIS_41);
      out.write("\">首次付费分析</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"");
      out.print( pageIndex == 204 ? "menuitem_current" : "menuitem_none");
      out.write("\" href=\"");
      out.print( request.getContextPath());
      out.write("/payAnalysis?optType=");
      out.print(OptTypeConstant.PAY_ANALYSIS_42);
      out.write("\">首次付费等级分布</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"menu\">\r\n");
      out.write("\t\t\t\t<a href=\"\" onclick=\"return false\" class=\"menuheader\">中控系统</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print( request.getContextPath());
      out.write("/gccServer.jsp\">中控系统</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");

				}
				
				if (request.getSession().getAttribute("canUseBeaviour") != null && Boolean.parseBoolean(request.getSession().getAttribute("canUseBeaviour").toString()) == true) {
			 
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

				}
			 
      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"right_container\">\r\n");
      out.write("\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t<div class=\"content_top\">\r\n");
      out.write("\t\t\t\t\t<form action=\"");
      out.print(path );
      out.write("/accountAnalysis\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"optType\" value=\"");
      out.print( OptTypeConstant.ACCOUNT_ANALYSIS_2);
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"datetimepicker\" name=\"startDate\" value=\"");
      out.print( startDate );
      out.write("\" /> <span> - </span>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"datetimepicker\" name=\"endDate\" value=\"");
      out.print( endDate );
      out.write("\" /><span>&nbsp;&nbsp;</span>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"确定\" class=\"btn_1\" />\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"content_panel\">\r\n");
      out.write("\t\t\t\t\t<div class=\"content_panel_title\">\r\n");
      out.write("\t\t\t\t\t\t<h3>充值订单</h3>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"link\" href=\"");
      out.print(path );
      out.write("/accountAnalysis?optType=");
      out.print( OptTypeConstant.ACCOUNT_ANALYSIS_2);
      out.write("&export=excel&startDate=");
      out.print(startDate);
      out.write("\">导出本月Excel报表（以开始日期为准）</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"content_panel_content\">\r\n");
      out.write("\t\t\t\t\t\t<table id=\"table_1\" class=\"display\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>支付记录ID</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>用户编号</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>玩家编号</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>支付区服</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>商户订单号</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>平台订单号</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>金额</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>支付类型</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>商品编号</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>链接参数</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>订单状态</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>支付时间</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									for (int i = 0; i < payOrderData.length(); i++) {
										JSONObject obj = payOrderData.getJSONObject(i);
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(obj.getString("logId"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(obj.getString("userId"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(obj.getString("playerId"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(obj.getString("paySite") );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(obj.getString("outOrderNo"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(obj.getString("orderNo"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(obj.getString("money"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(obj.getString("payType"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(obj.getString("payItemId"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(obj.getString("payUrl"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(obj.getString("state"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(obj.getString("createTime"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									}
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<link type=\"text/css\" href=\"");
      out.print( path);
      out.write("/css/index_footer.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<div class=\"copyright\">\r\n");
      out.write("\t<span>Copyright © 2018 产品团队  粤ICP备XXXXXXX-X号</span>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
