/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-02-08 10:27:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <title>File Upload </title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div style=\"text-align: center;\">\n");
      out.write("\n");
      out.write("               ");
 String outParameter = (String)request.getAttribute("message1");
                         if (outParameter != null){
      out.write("\n");
      out.write("                         ");
      out.print(  outParameter );
      out.write(" <br>\n");
      out.write("                         ");
 } else { 
      out.write(" Начало работы<br> ");
 }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<form method=\"post\" action=\"/upload\" enctype=\"multipart/form-data\">\n");
      out.write("  Выберите .pdf файл:<br>\n");
      out.write("  <input type=\"file\" name=\"uploadFile\" />\n");
      out.write("  <br/><br/>\n");
      out.write("  <input type=\"submit\" value=\"Загрузить\" /><br><br>\n");
      out.write("<button href=\"/index.jsp\" onclick=\"window.open('/process');\">Обработать</button><br>\n");
      out.write("\n");
      out.write("<div style=\"text-align: center;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");
  outParameter = (String)request.getAttribute("message2");
                           if (outParameter != null){
      out.write("\n");
      out.write("                           ");
      out.print(  outParameter );
      out.write(" <br>\n");
      out.write("                           ");
 } else { 
      out.write(" <br> ");
 }
      out.write("\n");
      out.write("                ");
  outParameter = (String)request.getAttribute("message3");
                           if (outParameter != null){
      out.write("\n");
      out.write("                           ");
      out.print(  outParameter );
      out.write(" <br>\n");
      out.write("                           ");
 } else { 
      out.write(" <br> ");
 }
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("</form>\n");
      out.write("<form method=\"post\" action=\"/process\">\n");
      out.write("  <input type=\"submit\" value=\"Обработать\" />\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("<a href=\"/index.jsp\" onclick=\"window.open('/process');\">Обработать</a<br>\n");
      out.write("--!>\n");
      out.write("\n");
      out.write("</body>\n");
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
