/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.39
 * Generated at: 2021-09-22 16:24:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class employeeLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/nav/indexNav.html", Long.valueOf(1632000987677L));
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Employee Login</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t(function() {\r\n");
      out.write("\t\t'use strict';\r\n");
      out.write("\t\twindow.addEventListener('load', function() {\r\n");
      out.write("\t\t\t// Fetch all the forms we want to apply custom Bootstrap validation styles to\r\n");
      out.write("\t\t\tvar forms = document.getElementsByClassName('needs-validation');\r\n");
      out.write("\t\t\t// Loop over them and prevent submission\r\n");
      out.write("\t\t\tvar validation = Array.prototype.filter.call(forms, function(form) {\r\n");
      out.write("\t\t\t\tform.addEventListener('submit', function(event) {\r\n");
      out.write("\t\t\t\t\tif (form.checkValidity() === false) {\r\n");
      out.write("\t\t\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\t\t\tevent.stopPropagation();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tform.classList.add('was-validated');\r\n");
      out.write("\t\t\t\t}, false);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}, false);\r\n");
      out.write("\t})();\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"/ToYoDo/JSP/index.jsp\">ToYoDo</a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\">About</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\">Discover</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item dropdown\">\r\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("          Login\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"/ToYoDo/JSP/customerLogin.jsp\">Customer Login</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"/ToYoDo/JSP/employeeLogin.jsp\">Employee Login</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\">Contact</a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");

		String loginStatus = (String) request.getAttribute("loginStatus");
		if (loginStatus != null) {
	
      out.write("\r\n");
      out.write("\t<div class=\"alert alert-danger alert-dismissible fade show\"\r\n");
      out.write("\t\trole=\"alert\">\r\n");
      out.write("\t\t<strong>");
      out.print(loginStatus);
      out.write("!</strong>\r\n");
      out.write("\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\"\r\n");
      out.write("\t\t\taria-label=\"Close\">\r\n");
      out.write("\t\t\t<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");

		}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"card border-info container\" style=\"max-width: 46rem;\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t<form class=\"needs-validation\" novalidate method=\"POST\"\r\n");
      out.write("\t\t\t\tonsubmit=\"return main()\" action=\"/ToYoDo/LoginController?role=employee\">\r\n");
      out.write("\t\t\t\t<h3>Employee Login</h3>\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"validUsername\">Employee ID</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"employeeID\" name=\"employeeID\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Enter Employee ID\"\r\n");
      out.write("\t\t\t\t\t\taria-describedby=\"inputGroupPrepend\" required>\r\n");
      out.write("\t\t\t\t\t<div class=\"invalid-feedback\">Employee ID is missing!</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"inputPassword\">Password</label> <input type=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"employeePassword\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"employeePassword\" placeholder=\"Enter Password\" required>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"invalid-feedback\">Password is missing!</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn btn-info\">Login</button>\r\n");
      out.write("\t\t\t</form>\r\n");
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
