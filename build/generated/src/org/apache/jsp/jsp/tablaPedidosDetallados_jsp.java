package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Pedidos;
import Modelo.DBPedidos;
import Modelo.PedidosDetallados;
import java.util.ArrayList;
import Modelo.DBPedidoDetallado;

public final class tablaPedidosDetallados_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("<!--script src=\"script/PedidosDetalladosFunc.js\"></script-->\n");

    DBPedidoDetallado detalle=new DBPedidoDetallado();
    DBPedidos ped=new DBPedidos();
    ArrayList<Pedidos>Listar=new ArrayList();
    Listar.clear();
    
    
    
    Listar=ped.ListarPedidosConClientes();


      out.write("\n");
      out.write("<script src=\"script/tablaDetallesTabla.js\"></script>\n");
      out.write("<form method=\"POST\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"panel panel-primary\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <h3 class=\"panel-title\">Pedidos</h3>\n");
      out.write("                        <div class=\"pull-right\">\n");
      out.write("                            <span class=\"clickable filter\" data-toggle=\"tooltip\" title=\"Toggle table filter\" data-container=\"body\">\n");
      out.write("\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"dev-table-filter\" data-action=\"filter\" data-filters=\"#dev-table\" placeholder=\"Filter Developers\" />\n");
      out.write("                    </div>\n");
      out.write("                    <table class=\"table table-hover\" id=\"dev-table\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                \n");
      out.write("                                <th>Nombre</th>\n");
      out.write("                                <th>Documento</th>\n");
      out.write("                                <th>N° pedido</th>\n");
      out.write("                                <th>Fecha del pedido</th>\n");
      out.write("                                \n");
      out.write("                                <th>Fecha de entrega</th>\n");
      out.write("                                \n");
      out.write("                                <th></th>\n");
      out.write("                                <th>Detalles</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("      \n");
      out.write("                        <tbody class=\"ListedePedidos\">\n");
      out.write("                            \n");
      out.write("                            ");
for(Pedidos mypedido:Listar){
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(mypedido.getClienteId().getNombre() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(mypedido.getClienteId().getDocumento());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(mypedido.getId() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(mypedido.getFPedido());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(mypedido.getFEntrega()  );
      out.write("</td>\n");
      out.write("                                <td><p class=\"id\" style=\"visibility: hidden;\">");
      out.print(mypedido.getId());
      out.write("</p></td>\n");
      out.write("                                <td><a href='#'class='eliminar'><span class='glyphicon glyphicon-remove borrar'></a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                            \n");
      out.write("                        </tbody>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"row \">\n");
      out.write("\n");
      out.write("            <div class=\"col-xs-12 col-md-12\"><a href=\"#\" class=\"btn btn-success btn-block btn-lg\">Terminar Operacion</a></div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
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
