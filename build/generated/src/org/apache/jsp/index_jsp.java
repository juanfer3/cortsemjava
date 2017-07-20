package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Modelo.Empleados;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/jsp/header.jsp");
    _jspx_dependants.add("/ContenidoIndex.jsp");
    _jspx_dependants.add("/jsp/bodyIndex.jsp");
    _jspx_dependants.add("/jsp/footer.jsp");
  }

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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"imagenes\">\r\n");
      out.write("        <link href=\"https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/estilos.css\">\r\n");
      out.write("\r\n");
      out.write("        <title>Index Cortsem</title>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"script/cambiotablas.js\"></script>\r\n");
      out.write("        <script ></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js\"></script>\r\n");
      out.write("<script src=\"script/cambiotablas.js\"></script>\r\n");
      out.write("<!--script>\r\n");
      out.write("$(function () {\r\n");
      out.write("$(\"#datepicker\").datepicker();\r\n");
      out.write("});\r\n");
      out.write("</script-->\r\n");
      out.write("\r\n");
      out.write("<div id=\"datepicker\"></div>\r\n");
      out.write("\r\n");
      out.write("        ");
HttpSession sesion= request.getSession();
        
        
        
        
        if(sesion.getAttribute("rol")== null){
           
        
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <header>\r\n");
      out.write("            \r\n");
      out.write("            <hr class=\"rayainicial\">\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("                                                                \r\n");
      out.write("        <nav class=\"navbar navbar-inverse barra\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\" id=\"cortsemindex\">CORTSEM</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                   \r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                    \r\n");
      out.write("                   \r\n");
      out.write("                    <li><a href=\"#\" id=\"login\"><span class=\"glyphicon glyphicon-log-in loguito\">\r\n");
      out.write("                                          \r\n");
      out.write("                            </span>Login</a></li>\r\n");
      out.write("                           \r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("        ");
}else if (sesion.getAttribute("rol").equals("Gerente")){
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <header>\r\n");
      out.write("            \r\n");
      out.write("            <hr class=\"rayainicial\">\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("                                                                \r\n");
      out.write("        <nav class=\"navbar navbar-inverse barra\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\" id=\"boton\">CORTSEM</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li class=\"botoncompra\"><a href=\"ListarEmpleados\">EMPLEADOS</a></li>\r\n");
      out.write("                    <li class=\"botoncompra\"><a href=\"ListarClientes\">CLIENTES</a></li>\r\n");
      out.write("                    <li class=\"botoncompra\"><a href=\"#\">PRODUCCION</a></li>\r\n");
      out.write("                    <li class=\"botoncompra\"><a href=\"SeleccionCliente.jsp\">VENTAS</a></li>\r\n");
      out.write("                    <li class=\"botoncompra\"><a href=\"ListarPedidos.jsp\">PEDIDOS</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                    \r\n");
      out.write("                    <li><a href=\"CerrarSession\"><span class=\"glyphicon glyphicon-log-in loguito\">\r\n");
      out.write("                                         \r\n");
      out.write("                            </span>Cerrar Sesion</a></li>\r\n");
      out.write("                           \r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("       \r\n");
      out.write("        <header class=\"menu\" id=\"menu\">\r\n");
      out.write("            <h5>Bienvenido</h5>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <li class=\"menu-item\">\r\n");
      out.write("                <a href=\"#\">Pedidos</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"menu-item\">\r\n");
      out.write("                <a href=\"#\">Empleados</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"menu-item\">\r\n");
      out.write("                <a href=\"#\">Clientes</a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </header>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("         ");
}else if (sesion.getAttribute("rol").equals("Vendedor")){
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <header>\r\n");
      out.write("            \r\n");
      out.write("            <hr class=\"rayainicial\">\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("                                                                \r\n");
      out.write("        <nav class=\"navbar navbar-inverse barra\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\" id=\"boton\">CORTSEM</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    \r\n");
      out.write("                    <li class=\"botoncompra\"><a href=\"ListarClientes\">CLIENTES</a></li>\r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                    \r\n");
      out.write("                    <li><a href=\"CerrarSession\"><span class=\"glyphicon glyphicon-log-in loguito\">\r\n");
      out.write("                                         \r\n");
      out.write("                            </span>Cerrar Sesion</a></li>\r\n");
      out.write("                           \r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("       \r\n");
      out.write("        <header class=\"menu\" id=\"menu\">\r\n");
      out.write("            <h5>Bienvenido</h5>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <li class=\"menu-item\">\r\n");
      out.write("                <a href=\"#\">Pedidos</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"menu-item\">\r\n");
      out.write("                <a href=\"#\">Empleados</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"menu-item\">\r\n");
      out.write("                <a href=\"#\">Clientes</a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </header>\r\n");
      out.write("        \r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("          \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<div id=\"contenido\">\r\n");
      out.write("    \r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    \r\n");
      out.write("        <div class=\"row\"> \r\n");
      out.write("            <div class=\"col-sm-12\">  \r\n");
      out.write("                <div class=\"banner container\"> \r\n");
      out.write("\r\n");
      out.write("                    <img src=\"imagenes/baner.jpg\" alt=\"\" class=\"banner\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container\" > \r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-2 col-sm-offset-1\">\r\n");
      out.write("                    <h2 class=\"\">MISIÓN</h2>\r\n");
      out.write("                    <hr class=\"rayamision\"></div>\r\n");
      out.write("                <div class=\"col-sm-2 col-sm-offset-6\">\r\n");
      out.write("                    <h2 class=\"\">VISIÓN</h2>\r\n");
      out.write("                    <hr class=\"raya\"> </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row vomo \">\r\n");
      out.write("                    <div class=\"col-sm-4\">\r\n");
      out.write("\r\n");
      out.write("                        <p align=\"justify\">Somos una empresa que día a día trabaja por su crecimiento económico y corporativo, \r\n");
      out.write("                        brindando calidad y los mejores productos a cada empresa;logrando la satisfacción \r\n");
      out.write("                        plena en términos de relación costo – beneficio, este resultado se refleja en la \r\n");
      out.write("                        constancia y persistencia de cada uno de nuestros trabajadores. </p>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-4 col-sm-offset-4\">\r\n");
      out.write("                        <p align=\"justify\"> Nuestra meta en el 2015 es seguir siendo una excelente alternativa, y consolidarnos \r\n");
      out.write("                        como la mejor  opción para el consumidor final en términos de calidad, tiempos de entrega, \r\n");
      out.write("                        precios competitivos e innovación</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div> \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div id=\"tabla\" ></div>\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <footer >\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"contenedorTexto\">\r\n");
      out.write("                \r\n");
      out.write("                Telefono: 277-45-63<br>\r\n");
      out.write("                Direccion Cra 56# 56 a 13\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("            <div class=\"posicionIconos\">\r\n");
      out.write("                <a href=\"#\"><span class=\"icon-facebook iconosFooter\"></span> </a>\r\n");
      out.write("                <a href=\"#\"><span class=\"icon-google-plus iconosFooter\"></span> </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
