package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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


    if(session.getAttribute("fullname") == null)
        response.sendRedirect("login.jsp");

      out.write('\n');
      out.write('\n');

String color = "";
Cookie[] cookies = request.getCookies();
for(Cookie c : cookies) { 
  if(c.getName().equals("color")) { 
    color = c.getValue();
  }
}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Bienvenido</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("body {\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    <body style=\"background-color: ");
      out.print( color );
      out.write(";\">\n");
      out.write("    <center>\n");
      out.write("        <h1>Hola, ");
      out.print( session.getAttribute("fullname") );
      out.write("</h1>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("             <!-- <a href=\"LogoutController\" title=\"Cerrar sesión\">Cerrar sesión</a> \n");
      out.write("             Probando con botón Onclick-->\n");
      out.write("\n");
      out.write("             <button type=\"button\" onclick=\"location.href = 'LogoutController'\" >Cerrar la sesión</button> <p>\n");
      out.write("             \n");
      out.write("             Escoge tu color favorito para tu perfil.\n");
      out.write("    <form action=\"ProfileController\" method=\"POST\">             \n");
      out.write("    <select name=\"color\" id=\"colorfondo\">\n");
      out.write("     <option value=\"#008000\">Verde</option>\n");
      out.write("     <option value=\"#800000\">Marrón</option>\n");
      out.write("     <option value=\"#800080\">Purpura</option>\n");
      out.write("     <option value=\"#000080\">Azul</option>\n");
      out.write("     </select>\n");
      out.write("        <input type=\"submit\" value=\"Guardar\">\n");
      out.write("     </form>    \n");
      out.write("     <br>\n");
      out.write("     Escoge una ciudad.\n");
      out.write("     <br>\n");
      out.write("  <select size=\"1\" name=\"links\" onchange=\"window.location.href=this.value;\">\n");
      out.write("<option value=\"\">Elige...</option>\n");
      out.write("<option value=\"Monterrey.jsp\">Monterrey</option>\n");
      out.write("<option value=\"Guadalajara.jsp\">Guadalajara</option>\n");
      out.write("<option value=\"CDMX.jsp\">Cd de México</option>\n");
      out.write("</select>           \n");
      out.write("         </center>    \n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("    </body>\n");
      out.write("      <body bgcolor=\"#1687A3\"> \n");
      out.write("</html>\n");
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
