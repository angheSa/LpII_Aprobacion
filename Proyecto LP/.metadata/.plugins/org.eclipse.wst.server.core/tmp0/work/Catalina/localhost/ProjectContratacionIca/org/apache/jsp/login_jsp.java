/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.17
 * Generated at: 2022-06-28 04:41:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/TOSHIBA/OneDrive/Proyecto%20LP%20II/Proyecto%20LP/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ProjectContratacionIca/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098729090000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1656390557724L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <title>Municipalidad Provincial de Ica</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("  background: #eee;\r\n");
      out.write("background-image: url(\"img/fondoActual.png\");\r\n");
      out.write("  background-repeat: no-repeat; /* Do not repeat the image */\r\n");
      out.write("  background-size: cover;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".btn {\r\n");
      out.write("\t\tbackground: #428bca;\r\n");
      out.write("\t\tborder: none;\r\n");
      out.write("\t\tline-height: normal;\r\n");
      out.write("\t\tfont-weight:bold;\r\n");
      out.write("\t\twidth:40%;\r\n");
      out.write("}\r\n");
      out.write("\t.row{\r\n");
      out.write("\tbackground-color:white;\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\t.login{\r\n");
      out.write("\tmargin-top: 7rem;\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\t.form-control {\r\n");
      out.write("\t\tmargin-left: 9.5rem;\r\n");
      out.write("\t\tborder-radius: 60px;\r\n");
      out.write("\t\twidth:50%;\r\n");
      out.write("\t}\r\n");
      out.write("\th5 {\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\tfont-size: 26px;\r\n");
      out.write("\t\tmargin:40px;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t.form-group {\r\n");
      out.write("\t\tposition: relative;\r\n");
      out.write("\t}\r\n");
      out.write("\t.login i {\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\tleft: 102px;\r\n");
      out.write("\t\ttop: 8px;\r\n");
      out.write("\t\tfont-size: 25px;\r\n");
      out.write("\t}\r\n");
      out.write("\th4{\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tbackground-color: #884EA0;\r\n");
      out.write("\tpadding-top: 17px;\r\n");
      out.write("\tpadding-bottom: 6px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("<!-- \r\n");
      out.write("<div class=\"alert alert-warning alert-dismissible fade show\" role=\"alert\">\r\n");
      out.write("  <strong>Holy guacamole!</strong> You should check in on some of those fields below.\r\n");
      out.write("  <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\r\n");
      out.write("</div> -->\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"alert alert-danger d-flex align-items-center\" role=\"alert\">\r\n");
      out.write("  <svg class=\"bi flex-shrink-0 me-2\" width=\"24\" height=\"24\" role=\"img\" aria-label=\"Danger:\"><use xlink:href=\"#exclamation-triangle-fill\"/></svg>\r\n");
      out.write("  \r\n");
      out.write("    <strong>MENSAJE : </strong> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.MENSAJE}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" \r\n");
      out.write("     <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\r\n");
      out.write("\r\n");
      out.write("</div> -->\r\n");
      out.write("\t\t\r\n");
      out.write("<div class=\"login\">\r\n");
      out.write("<div class=\"container\" >\r\n");
      out.write("\t<div class=\"row g-0\"> \r\n");
      out.write("\t\t<div class=\"col-lg-5\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<h4>Municipalidad Provincial de Ica</h4>\r\n");
      out.write("\t\t\t<img src=\"img/logoIca.png\" alt=\"Imagen no encontrada\" \r\n");
      out.write("\t\t\t width=\"440\" height=\"400\" style=\"padding-left: 8px; padding-top: 6px;\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-lg-7 text-center py-5\" style=\"background-color: white;\">\r\n");
      out.write("\t\t\t\t<h5>¡Bienvenido al sistema de aprobación de expediente de contratación!</h5>\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<form action=\"ServletUsuario?tipo=INICIAR\" method=\"post\">\r\n");
      out.write("\t\t\t\t<div class=\"py-3\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group offset-1 col-lg-10\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"bi bi-people-fill\"></i>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Usuario\" required=\"required\" name=\"usuario\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"py-3\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group offset-1 col-lg-10\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"bi bi-file-earmark-lock-fill\"></i>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" placeholder=\"Contraseña\" required=\"required\" name=\"clave\">\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"py-3\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group offset-1 col-lg-10\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-primary btn-sm\"  style=\"background-color: #884EA0; border-radius: 50px; padding:8px;\" aria-pressed=\"true\"value=\"Iniciar Sesión\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</form>\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>     \r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- SCRIPT -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("\t$(\".alert\").fadeTo(2000,500).slideUp(660,function(){\r\n");
      out.write("\t\t$(\".alert\").slideUp(660);\t\r\n");
      out.write("\t});\r\n");
      out.write("    \r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /login.jsp(120,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.MENSAJE!=null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t <div class=\"alert alert-danger alert-dismissible fade show\" role=\"alert\">\r\n");
          out.write("\t\t\t\t\t\t  <i class=\"bi bi-exclamation-triangle-fill\" width=\"24\" height=\"24\" style=\"margin-left: 100px;\"></i> \r\n");
          out.write("\t\t\t\t\t\t  <div style=\"margin-left: 100px;\">\r\n");
          out.write("\t\t\t\t\t\t  ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.MENSAJE}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" \r\n");
          out.write("\t\t\t\t\t\t  </div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
