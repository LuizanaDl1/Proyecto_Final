package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"icon\" href=\"Sol.ico\"\n");
      out.write("        <title>Registro</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t\t<style>\n");
      out.write("\t\tbody {\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t\t}\n");
      out.write("\t\t</style>\n");
      out.write("\t\t\n");
      out.write("\t\t<center>\n");
      out.write("\t\t<h1>Registrate en MeteoREG</h1>\n");
      out.write("\t\t\n");
      out.write("\t\t<br>\n");
      out.write("\t\t</head>\n");
      out.write("\t\t<body>\n");
      out.write("\t\t<center><img src=\"arcoiris.png\" width=\"80\" height=\"80\"></center>\n");
      out.write("\t\t<br>\n");
      out.write("           <form action=\"Registro\" method=\"POST\">\n");
      out.write("Nombre: <input type=\"text\" name=\"nombre\" /><br /><p>\n");
      out.write("E-mail: <input type=\"text\" name=\"apellidos\" /><br /><p>\n");
      out.write("Usuario: <input type=\"text\" name=\"direccion\" /><br /><p>\n");
      out.write("Password: <input type=\"password\" name=\"psw\"><p> \n");
      out.write("  \n");
      out.write("    <label for=\"fecha_dia\">Mes de nacimiento</label> \n");
      out.write("    <select id=\"fecha_mes\" name=\"fecha_mes\">\n");
      out.write("    <option value=\"1\">Enero</option>\n");
      out.write("    <option value=\"2\">Febrero</option>\n");
      out.write("    <option value=\"3\">Marzo</option>\n");
      out.write("    <option value=\"4\">Abril</option>\n");
      out.write("    <option value=\"5\">Mayo</option>\n");
      out.write("    <option value=\"6\">Junio</option>\n");
      out.write("    <option selected value=\"7\">Julio</option>\n");
      out.write("    <option value=\"8\">Agosto</option>\n");
      out.write("    <option value=\"9\">Septiembre</option>\n");
      out.write("    <option value=\"10\">Octubre</option>\n");
      out.write("    <option value=\"11\">Noviembre</option>\n");
      out.write("    <option value=\"12\">Diciembre</option>\n");
      out.write("  </select>\n");
      out.write("     <p>Sexo:\n");
      out.write("    <input type=\"radio\" name=\"hm\" value=\"h\" required=\"required\"> Hombre\n");
      out.write("    <input type=\"radio\" name=\"hm\" value=\"m\" required=\"required\"> Mujer\n");
      out.write("    </p>\n");
      out.write("    \n");
      out.write("     <input type=\"submit\" value=\"Enviar\" />\n");
      out.write("        <input type=\"reset\" value=\"Borrar\" onClick=\"this.form.reset()\" />\n");
      out.write("        <button type=\"button\" onclick=\"location.href = 'index.html'\" >Volver al inicio</button> <p>\n");
      out.write("\t\t</center>\n");
      out.write("\t\t\n");
      out.write("         \n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("    <body bgcolor=\"#1687A3\"> \n");
      out.write("        </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
