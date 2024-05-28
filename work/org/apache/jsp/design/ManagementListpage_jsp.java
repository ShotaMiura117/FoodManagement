/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.39
 * Generated at: 2024-05-28 05:01:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.design;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ManagementListpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      response.setContentType("text/html; charset=windows-31j");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=windows-31j\">\r\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>管理する食材リストページ</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\" href=\"");
      out.print(request.getContextPath() );
      out.write("//ManagementListpage.css\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://kit.fontaweso me.com/8ff098a16e.js\"crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t<form action=\"#\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"検索してください\" name=\"search\">\r\n");
      out.write("\t\t\t\t<button>\r\n");
      out.write("\t\t\t\t\t<i class=\"fa-solid fa-magnifying-glass\" style=\"font-size: 14px;\">検索</i>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t <div class=\"logout\">\r\n");
      out.write("            \t<button class=\"b\">\r\n");
      out.write("            \t<a href=\"login.jsp\">ログアウト</a></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"hyoji\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-outline-primary\" name=\"hyoji\">選択した商品詳細を表示</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-outline-info\" name=\"tsuika\">食品を追加</button>\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"list\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>開封</th>\r\n");
      out.write("\t\t\t\t\t<th>食材名</th>\r\n");
      out.write("\t\t\t\t\t<th>数量</th>\r\n");
      out.write("\t\t\t\t\t<th>賞味期限．消費期限</th>\r\n");
      out.write("\t\t\t\t\t<th>削除</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>未</td>\r\n");
      out.write("\t\t\t\t\t<td>豚肉</td>\r\n");
      out.write("\t\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t\t<td>2024-05-02</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"number\" name=\"number\" min=\"1\" max=\"50\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\"></td>\r\n");
      out.write("\t\t\t\t\t <td><button type=\"button\" class=\"btn btn-outline-success\" name=\"kakutei\">確定</button></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>未</td>\r\n");
      out.write("\t\t\t\t\t<td>豚肉</td>\r\n");
      out.write("\t\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t\t<td>2024-05-02</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"number\" name=\"number\" min=\"1\" max=\"50\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\"></td>\r\n");
      out.write("\t\t\t\t\t <td><button type=\"button\" class=\"btn btn-outline-success\" name=\"kakutei\">確定</button></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>未</td>\r\n");
      out.write("\t\t\t\t\t<td>豚肉</td>\r\n");
      out.write("\t\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t\t<td>2024-05-02</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"number\" name=\"number\" min=\"1\" max=\"50\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\"></td>\r\n");
      out.write("\t\t\t\t\t <td><button type=\"button\" class=\"btn btn-outline-success\" name=\"kakutei\">確定</button></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
