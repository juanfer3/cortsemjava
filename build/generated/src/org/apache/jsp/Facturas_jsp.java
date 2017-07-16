package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Modelo.Empleados;
import Modelo.Pedidos;
import java.util.ArrayList;
import Modelo.PedidosDetallados;
import Modelo.DBPedidos;
import Modelo.DBPedidoDetallado;

public final class Facturas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/jsp/header.jsp");
    _jspx_dependants.add("/jsp/facturaPedidosDetalladoPorID.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"java/alertify.min.js\"></script>\n");
      out.write("        <!-- include alertify.css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilos/alertify.core.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilos/alertify.default.css\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        \n");
      out.write("        <link href=\"https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css\" rel=\"stylesheet\">     \n");
      out.write("       \n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/estilos.css\">\n");
      out.write("        \n");
      out.write("        <title>Telas</title>\n");
      out.write("        \n");
      out.write("        <script src=\"script/cambiotablas.js\"></script>\n");
      out.write("        <script src=\"script/Telas.js\"></script>\n");
      out.write("        \n");
      out.write("        <script ></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js\"></script>\n");
      out.write("<script src=\"script/cambiotablas.js\"></script>\n");
      out.write("<!--script>\n");
      out.write("$(function () {\n");
      out.write("$(\"#datepicker\").datepicker();\n");
      out.write("});\n");
      out.write("</script-->\n");
      out.write("\n");
      out.write("<div id=\"datepicker\"></div>\n");
      out.write("\n");
      out.write("        ");
HttpSession sesion= request.getSession();
        
        
        
        
        if(sesion.getAttribute("rol")== null){
           
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
      out.write("                    <li class=\"botoncompra\"><a href=\"SeleccionCliente.jsp\">VENTAS</a></li>\n");
      out.write("                    <li class=\"botoncompra\"><a href=\"ListarPedidos.jsp\">PEDIDOS</a></li>\n");
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
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    DBPedidos pedidos=new DBPedidos();
    DBPedidoDetallado detalle=new DBPedidoDetallado();
    
    ArrayList<Pedidos> ListarPedidos=new ArrayList();
    ArrayList<PedidosDetallados> ListarDetalle=new ArrayList();

    ListarDetalle.clear();
    ListarPedidos.clear();
    
    String id1;
    int pedido_id=0;
    float total=0;
    
    ListarDetalle=detalle.BuscarDetallesDePedidosPorIdPedido(35);

      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"span5\">\n");
      out.write("            <table class=\"table table-striped table-condensed\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Prenda</th>\n");
      out.write("                        <th>Tela</th>\n");
      out.write("                        <th>Talla</th>\n");
      out.write("                        <th>Cantidad</th>\n");
      out.write("                        <th>Valor Total</th>\n");
      out.write("                        <th></th>\n");
      out.write("                                                             \n");
      out.write("                    </tr>\n");
      out.write("                </thead>   \n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        
                        for(PedidosDetallados misdetalle:ListarDetalle){
                        
                        
                        
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                       \n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("                       \n");
      out.write("                </tbody>\n");
      out.write("                <tfoot><tr><td>");
      out.print(total);
      out.write("</td></tr></tfoot>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
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
