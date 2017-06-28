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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"imagenes\">\n");
      out.write("        <link href=\"https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css\" rel=\"stylesheet\">     \n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/estilos.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"script/Alertas/alertify.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("//override defaults\n");
      out.write("            alertify.defaults.transition = \"slide\";\n");
      out.write("            alertify.defaults.theme.ok = \"btn btn-primary\";\n");
      out.write("            alertify.defaults.theme.cancel = \"btn btn-danger\";\n");
      out.write("            alertify.defaults.theme.input = \"form-control\";\n");
      out.write("        </script>\n");
      out.write("        <script src=\"script/cambiotablas.js\"></script>\n");
      out.write("        <script src=\"script/seleccionClientes.js\"></script>\n");
      out.write("        <script ></script>\n");
      out.write("    </head>\n");
      out.write("    ");
 DBTelas telas = new DBTelas();
        DBClientes client = new DBClientes();

        ArrayList<Telas> ListarTelas = new ArrayList();
        ArrayList<Clientes> ListarClientes = new ArrayList();

        ListarTelas.clear();
        ListarClientes.clear();

        
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
HttpSession sesion= request.getSession();
        
        
        
        
        if(sesion.getAttribute("rol")== null){
           
        
        
      out.write("\n");
      out.write("        <header>\n");
      out.write("            \n");
      out.write("            <hr class=\"rayainicial\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("                                                                \n");
      out.write("        <nav class=\"navbar navbar-inverse barra\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\" id=\"cortsemindex\">CORTSEM</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                    <li><a href=\"#\" id=\"login\"><span class=\"glyphicon glyphicon-log-in loguito\">\n");
      out.write("                                          \n");
      out.write("                            </span>Login</a></li>\n");
      out.write("                           \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        </header>\n");
      out.write("        ");
}else if (sesion.getAttribute("rol").equals("Gerente")){
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <header>\n");
      out.write("            \n");
      out.write("            <hr class=\"rayainicial\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("                                                                \n");
      out.write("        <nav class=\"navbar navbar-inverse barra\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\" id=\"boton\">CORTSEM</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"botoncompra\"><a href=\"ListarEmpleados\">EMPLEADOS</a></li>\n");
      out.write("                    <li class=\"botoncompra\"><a href=\"ListarClientes\">CLIENTES</a></li>\n");
      out.write("                    <li class=\"botoncompra\"><a href=\"#\">PRODUCCION</a></li>\n");
      out.write("                    <li class=\"botoncompra\"><a href=\"#\">VENTAS</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    \n");
      out.write("                    <li><a href=\"CerrarSession\"><span class=\"glyphicon glyphicon-log-in loguito\">\n");
      out.write("                                         \n");
      out.write("                            </span>Cerrar Sesion</a></li>\n");
      out.write("                           \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        </header>\n");
      out.write("       \n");
      out.write("        <header class=\"menu\" id=\"menu\">\n");
      out.write("            <h5>Bienvenido</h5>\n");
      out.write("            <hr>\n");
      out.write("            <li class=\"menu-item\">\n");
      out.write("                <a href=\"#\">Pedidos</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"menu-item\">\n");
      out.write("                <a href=\"#\">Empleados</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"menu-item\">\n");
      out.write("                <a href=\"#\">Clientes</a>\n");
      out.write("            </li>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         ");
}else if (sesion.getAttribute("rol").equals("Vendedor")){
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <header>\n");
      out.write("            \n");
      out.write("            <hr class=\"rayainicial\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("                                                                \n");
      out.write("        <nav class=\"navbar navbar-inverse barra\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\" id=\"boton\">CORTSEM</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    \n");
      out.write("                    <li class=\"botoncompra\"><a href=\"ListarClientes\">CLIENTES</a></li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    \n");
      out.write("                    <li><a href=\"CerrarSession\"><span class=\"glyphicon glyphicon-log-in loguito\">\n");
      out.write("                                         \n");
      out.write("                            </span>Cerrar Sesion</a></li>\n");
      out.write("                           \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        </header>\n");
      out.write("       \n");
      out.write("        <header class=\"menu\" id=\"menu\">\n");
      out.write("            <h5>Bienvenido</h5>\n");
      out.write("            <hr>\n");
      out.write("            <li class=\"menu-item\">\n");
      out.write("                <a href=\"#\">Pedidos</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"menu-item\">\n");
      out.write("                <a href=\"#\">Empleados</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"menu-item\">\n");
      out.write("                <a href=\"#\">Clientes</a>\n");
      out.write("            </li>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\" id=\"ocultarlistarclientes\">\n");
      out.write("            ");
      out.write("\n");
      out.write("            <form method=\"POST\" action=\"Pedido\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"panel panel-primary\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h3 class=\"panel-title\">Clientes</h3>\n");
      out.write("                                <div class=\"pull-right\">\n");
      out.write("                                    <span class=\"clickable filter\" data-toggle=\"tooltip\" title=\"Toggle table filter\" data-container=\"body\">\n");
      out.write("\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"dev-table-filter\" data-action=\"filter\" data-filters=\"#dev-table\" placeholder=\"Filter Developers\" />\n");
      out.write("                            </div>\n");
      out.write("                            <table class=\"table table-hover\" id=\"dev-table\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Nombre</th>\n");
      out.write("                                        <th>Fecha de pedido</th>\n");
      out.write("                                        <th>Fecha de entrega</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("\n");
      out.write("                                <input type=\"text\" class=\"id\" value=\"\" style=\"visibility:hidden\">\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("\n");
      out.write("                                        <td>\n");
      out.write("                                            <select class=\"form-control\" style=\"height: 32px;\" name=\"cliente\">\n");
      out.write("                                                ");
ListarClientes = client.ListarClientes();
                                                    int cont;
                                                    cont = 1;

                                                    for (Clientes cli : ListarClientes) {

                                                
      out.write("\n");
      out.write("\n");
      out.write("                                                <option value=\"");
      out.print(cli.getId());
      out.write("\" style=\"height: 32px;\" > ");
      out.print(cli.getNombre());
      out.write("</option>\n");
      out.write("\n");
      out.write("                                                ");
;
      out.write("\n");
      out.write("                                                ");
cont += 1;
                                                
      out.write("                                                \n");
      out.write("\n");
      out.write("\n");
      out.write("                                                ");

                                                    }
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </td>\n");
      out.write("\n");
      out.write("                                        <td><input type=\"date\"  class=\"form-control\" value=\"\" id=\"f_pedido\" name=\"f_pedido\"></td>\n");
      out.write("                                        <td><input type=\"date\"  class=\"form-control\" value=\"\" id=\"f_entrega\" name=\"f_entrega\" ></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row \">\n");
      out.write("\n");
      out.write("                    <div class=\"col-xs-12 col-md-12\"><input class=\"btn btn-success btn-block btn-lg\" id=\"aceptarClientePedido\" value=\"Aceptar\" type=\"submit\"></div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("                                          \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer >\n");
      out.write("            \n");
      out.write("            <div class=\"contenedorTexto\">\n");
      out.write("                \n");
      out.write("                Telefono: 277-45-63<br>\n");
      out.write("                Direccion Cra 56# 56 a 13\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            <div class=\"posicionIconos\">\n");
      out.write("                <a href=\"#\"><span class=\"icon-facebook iconosFooter\"></span> </a>\n");
      out.write("                <a href=\"#\"><span class=\"icon-google-plus iconosFooter\"></span> </a>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
