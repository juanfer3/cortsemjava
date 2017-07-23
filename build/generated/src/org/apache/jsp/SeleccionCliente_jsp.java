package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Clientes;
import Modelo.Telas;
import Modelo.DBClientes;
import Modelo.DBTelas;
import java.util.ArrayList;
import Modelo.Empleados;

public final class SeleccionCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/jsp/header.jsp");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"imagenes\">\r\n");
      out.write("        <link href=\"https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css\" rel=\"stylesheet\">     \r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/estilos.css\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <script src=\"script/Alertas/alertify.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("//override defaults\r\n");
      out.write("            alertify.defaults.transition = \"slide\";\r\n");
      out.write("            alertify.defaults.theme.ok = \"btn btn-primary\";\r\n");
      out.write("            alertify.defaults.theme.cancel = \"btn btn-danger\";\r\n");
      out.write("            alertify.defaults.theme.input = \"form-control\";\r\n");
      out.write("        </script>\r\n");
      out.write("        <script src=\"script/cambiotablas.js\"></script>\r\n");
      out.write("        <script src=\"script/seleccionClientes.js\"></script>\r\n");
      out.write("        <script ></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    ");
 DBTelas telas = new DBTelas();
        DBClientes client = new DBClientes();

        ArrayList<Telas> ListarTelas = new ArrayList();
        ArrayList<Clientes> ListarClientes = new ArrayList();

        ListarTelas.clear();
        ListarClientes.clear();

        
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("        <div class=\"container\" id=\"ocultarlistarclientes\">\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <form method=\"POST\" action=\"Pedido\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <div class=\"panel panel-primary\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <h3 class=\"panel-title\">Clientes</h3>\r\n");
      out.write("                                <div class=\"pull-right\">\r\n");
      out.write("                                    <span class=\"clickable filter\" data-toggle=\"tooltip\" title=\"Toggle table filter\" data-container=\"body\">\r\n");
      out.write("\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"panel-body\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"dev-table-filter\" data-action=\"filter\" data-filters=\"#dev-table\" placeholder=\"Filter Developers\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <table class=\"table table-hover\" id=\"dev-table\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th>Nombre</th>\r\n");
      out.write("                                        <th>Fecha de pedido</th>\r\n");
      out.write("                                        <th>Fecha de entrega</th>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"text\" class=\"id\" value=\"\" style=\"visibility:hidden\">\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("\r\n");
      out.write("                                        <td>\r\n");
      out.write("                                            <select class=\"form-control\" style=\"height: 32px;\" name=\"cliente\">\r\n");
      out.write("                                                ");
ListarClientes = client.ListarClientes();
                                                    int cont;
                                                    cont = 1;

                                                    for (Clientes cli : ListarClientes) {

                                                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                <option value=\"");
      out.print(cli.getId());
      out.write("\" style=\"height: 32px;\" > ");
      out.print(cli.getNombre());
      out.write("</option>\r\n");
      out.write("\r\n");
      out.write("                                                ");
;
      out.write("\r\n");
      out.write("                                                ");
cont += 1;
                                                
      out.write("                                                \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                ");

                                                    }
      out.write("\r\n");
      out.write("                                            </select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        </td>\r\n");
      out.write("\r\n");
      out.write("                                        <td><input type=\"date\"  class=\"form-control\" value=\"\" id=\"f_pedido\" name=\"f_pedido\"></td>\r\n");
      out.write("                                        <td><input type=\"date\"  class=\"form-control\" value=\"\" id=\"f_entrega\" name=\"f_entrega\" ></td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    </tr>\r\n");
      out.write("\r\n");
      out.write("                                </tbody>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row \">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-xs-12 col-md-12\"><input class=\"btn btn-success btn-block btn-lg\" id=\"aceptarClientePedido\" value=\"Aceptar\" type=\"submit\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("                                          \r\n");
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
      out.write("\r\n");
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
