/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.17
 * Generated at: 2022-06-28 05:16:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memorandos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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


	if(request.getSession().getAttribute("LISTA")==null)
		response.sendRedirect("login.jsp");

      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Memorando</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("<link href=\"https://cdn.datatables.net/1.11.5/css/dataTables.bootstrap5.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.expedientes{\r\n");
      out.write("\t background-color:#F8F3FA ;\r\n");
      out.write("\t padding: 20px;\r\n");
      out.write("\t border-radius: 9px;\r\n");
      out.write("\t margin-top: 13px;\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\th1{\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\tmargin-top: 3rem;\r\n");
      out.write("\t\tcolor:white;\r\n");
      out.write("\t}\r\n");
      out.write("\t.expedienteDos{\r\n");
      out.write("\tbackground-color:#F8F3FA ;\r\n");
      out.write("\t\r\n");
      out.write("\t padding: 20px;\r\n");
      out.write("\t border-radius: 9px;\r\n");
      out.write("\t margin-top: 13px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.modal-header{\r\n");
      out.write("\t\tcolor:#fff;\r\n");
      out.write("\t\tbackground: #428bca;\r\n");
      out.write("\t\tdisplay: flex;\r\n");
      out.write("  \t\tjustify-content: center;\r\n");
      out.write("  \t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t.help-block {\r\n");
      out.write("\t  \t\tcolor: red;\r\n");
      out.write("\t}\r\n");
      out.write("\t.form-group.has-error .form-control-label {\r\n");
      out.write("\t  color: red;\r\n");
      out.write("\t}\r\n");
      out.write("\t.form-group.has-error .form-control {\r\n");
      out.write("\t  border: 1px solid red;\r\n");
      out.write("\t  box-shadow: 0 0 0 0.2rem rgba(250, 16, 0, 0.18);\r\n");
      out.write("\t}\r\n");
      out.write("\t.am{\r\n");
      out.write("\t\tpadding-right: 4px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<!-- Text Gestionar Memorando -->\r\n");
      out.write("\t\t\t<h1>Gestionar Memorando</h1>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t<!-- Nuevo expediente y Criterios de Búsqueda -->\r\n");
      out.write("\t\t<div class=\"expedientes d-flex justify-content-between align-items-center\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<button type=\"button\" id =\"ejemplo\"class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#staticBackdrop\">\r\n");
      out.write("\t\t  <img src=\"img/editar2.png\" class=\"am\">Registrar Memorando\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t\t\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("  \t\t\r\n");
      out.write("  \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- tabla expediente-->\r\n");
      out.write("  \t\t<div class=\"expedienteDos\">\r\n");
      out.write("  \t\t\t<div class=\"mt-4\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t    \t<table id=\"example\" class=\"table table-striped\" style=\"width:100%\">\r\n");
      out.write("\t\t\t\t   <thead class=\"table-dark\" style=\"opacity:0.6;\">\r\n");
      out.write("\t\t\t\t   <tr>\r\n");
      out.write("\t\t\t\t\t    <th>Codigo</th>\r\n");
      out.write("\t\t                <th>N°Memorando</th>\r\n");
      out.write("\t\t                <th>Fecha Registro</th>\r\n");
      out.write("\t\t                <th>Asunto</th>\r\n");
      out.write("\t\t                <th>Gerente</th>\r\n");
      out.write("\t\t                <th>Mensaje</th>\r\n");
      out.write("\t\t                <th>Acciones</th>\r\n");
      out.write("\t\t                \r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t               \r\n");
      out.write("\t\t            </tr>\r\n");
      out.write("\t\t\t\t  </thead>\r\n");
      out.write("\t\t\t\t  <tbody>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t        \t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("             \r\n");
      out.write("\t\t        </tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- MODAL PARA REGISTRAR-->\r\n");
      out.write("<div class=\"modal fade\" id=\"staticBackdrop\" aria-hidden=\"true\" aria-labelledby=\"staticBackdropLabel\" tabindex=\"-1\">\r\n");
      out.write("\t\t  <div class=\"modal-dialog modal-dialog-centered\">\r\n");
      out.write("\t\t    <div class=\"modal-content\">\r\n");
      out.write("\t\t      <div class=\"modal-header\" style=\"color:black;background-color:#D6DBDF;\">\r\n");
      out.write("\t\t        <h5 class=\"modal-title\" id=\"#staticBackdropLabel\"> MEMORANDO</h5>\r\n");
      out.write("\t\t     <!-- >tyle=\"#FAF8F2\r\n");
      out.write("\t\t\t\tstyle=\"color:blue; background-color:#FAF8F2;\"-->\r\n");
      out.write("\t\t      </div> \r\n");
      out.write("\t\t      <div class=\"modal-body\">\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t        <form id=\"idRegistrarOficio\" method=\"post\" action=\"ServletMemorando?tipo=REGISTRAR\">\r\n");
      out.write("\t\t\t\t\t   <div class=\"row justify-content-around\">\r\n");
      out.write("\t\t\t\t\t   <div class=\"form-group col-4\">\r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t    <label for=\"exampleInputEmail1\" class=\"form-label\">N° Expediente</label>\r\n");
      out.write("\t\t\t\t\t\t    <input type=\"text\" class=\"form-control\" name=\"codigoExpe\" id=\"idCodigoExpe\" readonly> \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t  <div class=\"form-group col-4\">\r\n");
      out.write("\t\t\t\t\t  \t<label for=\"exampleInputEmail1\" class=\"form-label\">Buscar</label>\r\n");
      out.write("\t\t\t\t\t\t\t    <button type=\"button\" id=\"BuscarOficio\"class=\"btn btn-dark\"  \r\n");
      out.write("\t\t\t\t\t\t\t    data-bs-toggle=\"modal\" data-bs-target=\"#staticBackdrop\" style=\"border: 5px; font-size:13px\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\tBuscar Expediente\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t  <div class=\"form-group col-4\">\r\n");
      out.write("\t\t\t \t\t\t  <label for=\"exampleInputEmail1\" class=\"form-label\">Codigo</label>\r\n");
      out.write("\t\t\t\t\t    <input type=\"text\" class=\"form-control\" name=\"codSoloMemo\" id=\"idcodSoloMemo\"  readonly value=0 >\r\n");
      out.write("\t\t\t\t\t  \t\r\n");
      out.write("    \r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t <div class=\"form-group col-4\">\r\n");
      out.write("\t\t\t \t\t\t  <label for=\"exampleInputEmail1\" class=\"form-label\">N° Memorando</label>\r\n");
      out.write("\t\t\t\t\t    <input type=\"text\" class=\"form-control\" name=\"codMemorando\" id=\"idNumMemorando\"  readonly >\r\n");
      out.write("\t\t\t\t\t  \t\r\n");
      out.write("    \r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t  <div class=\"form-group col-4\">\r\n");
      out.write("\t\t\t\t\t    <label for=\"exampleInputEmail1\" class=\"form-label\">Fecha Registro</label>\r\n");
      out.write("\t\t\t\t\t    <input type=\"date\" class=\"form-control\" name=\"fechaRegistro\" id=\"idFechaRegistro\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t   <div class=\"form-group col-6\">\r\n");
      out.write("\t\t\t\t\t    <label for=\"exampleInputEmail1\" class=\"form-label\">Nombre Gerente</label>\r\n");
      out.write("\t\t\t\t\t    <input type=\"text\" class=\"form-control\" name=\"nomGerente\" id=\"idNomGerente\">\r\n");
      out.write("\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t  <div class=\"form-group col-4\">\r\n");
      out.write("\t\t\t\t\t    <label for=\"exampleInputEmail1\" class=\"form-label\">Asunto</label>\r\n");
      out.write("\t\t\t\t\t    <input type=\"text\" class=\"form-control\" name=\"asunto\" id=\"idAsunto\">\r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t  <div class=\"form-group\" style=\"margin-top: 5px;\">\r\n");
      out.write("\t\t\t\t\t    <label for=\"exampleInputEmail1\" class=\"form-label\">Mensaje</label>\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t      <textarea class=\"form-control\" placeholder=\"Leave a comment here\" name=\"mens\" id=\"idMensa\"></textarea>\r\n");
      out.write("\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t  \t\t\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t  <div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t  \t<button type=\"submit\" class=\"btn btn-primary\">Guardar</button>\r\n");
      out.write("\t\t\t        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Cerrar</button>\r\n");
      out.write("\t\t\t     \t </div>\r\n");
      out.write("\t\t\t     </div>\t \r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t<!-- MODAL PARA BUSCAR OFICIO -->\r\n");
      out.write("\t\t\t     \t \r\n");
      out.write("\t\t\t\t\t<div class=\"modal fade\" id=\"modalBuscarOfi\"  data-bs-backdrop=\"static\"  aria-hidden=\"true\" aria-labelledby=\"staticBackdropLabel\" tabindex=\"-1\" tabindex=\"-1\">\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"modal-dialog modal-lg modal-dialog-centered modal-dialog-scrollable\">\r\n");
      out.write("\t\t\t\t\t\t    <div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"modal-header\" style=\"color:black;background-color: #D6DBDF;\">\r\n");
      out.write("\t\t\t\t\t\t        <h5 class=\"modal-title\" id=\"staticBackdropLabel\">BUSCAR EXPEDIENTE</h5>\r\n");
      out.write("\t\t\t\t\t\t              <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("\t\t\t\t\t\t      \r\n");
      out.write("\t\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t\t      <form class=\"form-horizontal\" role=\"form\" id=\"form-agregar\">\r\n");
      out.write("    \t\t\t\t\t\t\t<div class=\"modal-body\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table id=\"example2\" class=\"table table-striped\" style=\"width:100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t \t   <thead class=\"table-dark\" style=\"opacity:0.6;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t   <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t               <th>N°Expediente</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t                <th>Fecha Registro</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t                <th>Última Actualización</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t                <th>Secretaria</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t                <th>Estado</th>\r\n");
      out.write("\t\t\t\t                \r\n");
      out.write("\t\t\t\t              \t\t\t\t\t\t<th>Acciones</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t               \r\n");
      out.write("\t\t\t\t\t\t\t\t\t            </tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  </thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <tbody>\r\n");
      out.write("\t\t\t\t\t\t\t        \t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("             \r\n");
      out.write("\t\t\t\t\t\t\t\t        </tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t    \t\t\t\t</div>\r\n");
      out.write("    \t\t\t</form>\t\t\t  \r\n");
      out.write("\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t     </div>\t\t\t\t\t\t     \r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- SCRIPT -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap5.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.bootcdn.net/ajax/libs/bootstrap-validator/0.4.0/js/bootstrapValidator.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tgenerarCodigo();\r\n");
      out.write("\t\r\n");
      out.write("\tfunction generarCodigo(){\r\n");
      out.write("\t\t$.get(\"ServletMemorando?tipo=CODIGO\",function(response){\r\n");
      out.write("\t\t\t$(\"#idNumMemorando\").val(response);\t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$('#example').DataTable();\r\n");
      out.write("\t\t $('#example2').DataTable();\r\n");
      out.write("\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(document).on('click', '#ejemplo', function() {\r\n");
      out.write("\t    $('#staticBackdrop').modal('show');\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(document).on('click', '#BuscarOficio', function() {\r\n");
      out.write("\t    $('#modalBuscarOfi').modal('show');\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t//aisgnar evento click a todos los botones con nombre de clase \"btn-success\"\r\n");
      out.write("\t$(document).on(\"click\",\".btn-success\",function(){\r\n");
      out.write("\t\t//variables\r\n");
      out.write("\t\tlet cod;\r\n");
      out.write("\t\tcod=$(this).parents(\"tr\").find(\"td\")[1].innerHTML;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.get(\"ServletMemorandoJSON?codigo=\"+cod,function(response){\r\n");
      out.write("\t\t\t$(\"#idcodSoloMemo\").val(response.codigoMemorando);\r\n");
      out.write("\t\t\t$(\"#idNumMemorando\").val(cod);\r\n");
      out.write("\t\t\t$(\"#idFechaRegistro\").val(response.fechMemo);\r\n");
      out.write("\t\t\t$(\"#idAsunto\").val(response.asuntMemo);\r\n");
      out.write("\t\t\t$(\"#idNomGerente\").val(response.nomGere);\r\n");
      out.write("\t\t\t$(\"#idCodigoExpe\").val(response.codExpe);\r\n");
      out.write("\t\t\t$(\"#idMensa\").val(response.mens);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t})\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t//aisgnar evento click a todos los botones con nombre de clase \"btn-success\"\r\n");
      out.write("\t$(document).on(\"click\",\".enviarCodigo\",function(){\r\n");
      out.write("\t\t//variables\r\n");
      out.write("\t\tlet cod;\r\n");
      out.write("\t\tcod=$(this).parents(\"tr\").find(\"td\")[0].innerHTML;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.get(\"ServletExpedienteJSON?codigo=\"+cod,function(response){\r\n");
      out.write("\t\t\t$(\"#idCodigoExpe\").val(cod);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t})\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!-- SCRIPT DE VALIDACIÓN DE REGISTRAR OFICIO  --> \r\n");
      out.write("<script type=\"text/javascript\">    \r\n");
      out.write("    $(document).ready(function(){     \r\n");
      out.write("        $('#idRegistrarOficio').bootstrapValidator({      \r\n");
      out.write("        \t fields:{\r\n");
      out.write("        \t\t asunto:{\r\n");
      out.write("    \t\t \t\tvalidators:{\r\n");
      out.write("    \t\t \t\t\tnotEmpty:{\r\n");
      out.write("    \t\t \t\t\t\tmessage:'Es obligatorio este campo'\r\n");
      out.write("    \t\t \t\t\t},\r\n");
      out.write("    \t\t \t\t\tregexp:{\r\n");
      out.write("    \t\t \t\t\t\tregexp:/^[a-zA-Z\\ñ\\Ñ\\s\\á\\é\\í\\ó\\ú\\Á\\É\\Í\\Ó\\Ú]{3,70}$/,\r\n");
      out.write("    \t\t \t\t\t\tmessage:'Ingrese solo letras'\r\n");
      out.write("    \t\t \t\t\t}\r\n");
      out.write("    \t\t \t\t\t\r\n");
      out.write("    \t\t \t\t}\r\n");
      out.write("    \t\t \t},\r\n");
      out.write("    \t\t \tnomGerente:{\r\n");
      out.write("    \t\t \t\tvalidators:{\r\n");
      out.write("    \t\t \t\t\tnotEmpty:{\r\n");
      out.write("    \t\t \t\t\t\tmessage:'Es obligatorio este campo'\r\n");
      out.write("    \t\t \t\t\t},\r\n");
      out.write("    \t\t \t\t\tregexp:{\r\n");
      out.write("    \t\t \t\t\t\tregexp:/^[a-zA-Z\\ñ\\Ñ\\s\\á\\é\\í\\ó\\ú\\Á\\É\\Í\\Ó\\Ú]{3,70}$/,\r\n");
      out.write("    \t\t \t\t\t\tmessage:'Ingrese solo letras'\r\n");
      out.write("    \t\t \t\t\t}\r\n");
      out.write("    \t\t \t\t\t\r\n");
      out.write("    \t\t \t\t}\r\n");
      out.write("    \t\t \t},\r\n");
      out.write("     \t\t \tmens:{\r\n");
      out.write("    \t\t \t\tvalidators:{\r\n");
      out.write("    \t\t \t\t\tnotEmpty:{\r\n");
      out.write("    \t\t \t\t\t\tmessage:'Es obligatorio este campo'\r\n");
      out.write("    \t\t \t\t\t}\r\n");
      out.write("    \t\t \t\t}\r\n");
      out.write("    \t\t \t}\r\n");
      out.write("    \t\t \t\r\n");
      out.write("        \t }\r\n");
      out.write("        });   \r\n");
      out.write("\t\t\t\r\n");
      out.write("    });  \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
      // /memorandos.jsp(64,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.MENSAJE!=null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<div class=\"alert alert-success alert-dismissible fade show\" role=\"alert\">\r\n");
          out.write("\t\t\t\t  <strong>MENSAJE : </strong> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.MENSAJE}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" \r\n");
          out.write("\t\t\t\t  <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\r\n");
          out.write("\t\t\t\t  \r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /memorandos.jsp(105,11) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.listMemorando}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /memorandos.jsp(105,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("row");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t            <tr>\r\n");
            out.write("\t\t\t\t                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.codigoMemorando}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.codMemo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.fechMemo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.asuntMemo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.nomGere}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.mens}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t                \r\n");
            out.write("\t\t\t\t\t\t\t\t\r\n");
            out.write("\t\t\t\t                <td><button type=\"button\"  class=\"btn btn-success\" \r\n");
            out.write("\t\t\t\t                \t\t\tdata-bs-toggle=\"modal\" data-bs-target=\"#staticBackdrop\"><img src=\"img/editar2.png\"></button>\r\n");
            out.write("\t\t\t\t                </td>\r\n");
            out.write("\t\t\t\t          </tr>\r\n");
            out.write("\t\t\t\t        ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f1_reused = false;
    try {
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent(null);
      // /memorandos.jsp(228,16) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.buscarExpedientes}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /memorandos.jsp(228,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("row");
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t            <tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t            \r\n");
            out.write("\t\t\t\t\t\t\t\t\t               <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.codExpediente}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.fechaExpe}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.fechaSalida}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.nomSecretria}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.estadoExpe}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\r\n");
            out.write("\t\t\t\t\t\t\t\t\t               \r\n");
            out.write("\t\t\t\t\t\t\t\t\t               \r\n");
            out.write("\t\t\t\t\t\t\t\t\t                <td><button type=\"button\" class=\"enviarCodigo btn-info\" \r\n");
            out.write("\t\t\t\t\t\t\t\t\t                data-bs-toggle=\"modal\" data-bs-target=\"#staticBackdrop\"><img src=\"img/enviar.png\"></button></td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t          </tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t       ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
      _jspx_th_c_005fforEach_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f1_reused);
    }
    return false;
  }
}
