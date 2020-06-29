package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class customerPurchasedView2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <title>Pharmacy &mdash; SignUp</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Rubik:400,700|Crimson+Text:400,400i\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"fonts/icomoon/style.css\">\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/jquery-ui.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/aos.css\">\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"#\" method=\"POST\">\n");
      out.write("            \n");
      out.write("            ");
 
                           Connection con;
                           PreparedStatement pst;
                           ResultSet rs;
                           
                           String url="jdbc:mysql://localhost:3306/pharma";
                           Class.forName("com.mysql.jdbc.Driver");
                           con = DriverManager.getConnection(url,"root","");
                           
                           String no = request.getParameter("no");
                           pst = con.prepareStatement("select *from customerbook where no=?");
                           pst.setString((1), no);
                           rs = pst.executeQuery();
                           
                             while(rs.next())
                             {
                             
                             
            
            
            
            
            
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-6 mb-5 mb-md-0\">\n");
      out.write("            <h2 class=\"h3 mb-3 text-black\">Medicine Details</h2>\n");
      out.write("            <div class=\"p-3 p-lg-5 border\">\n");
      out.write("            \n");
      out.write("              <div class=\"form-group row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label for=\"c_fname\"class=\"text-black\">Name <span class=\"text-danger\" >*</span></label>\n");
      out.write("                  <input type=\"text\"class=\"form-control\" value=\"");
      out.print(rs.getString("name"));
      out.write("\"  name=\"name\" value=\"\" readonly/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                  <label for=\"c_lname\" class=\"text-black\">Category <span class=\"text-danger\">*</span></label>\n");
      out.write("                  <input type=\"text\"class=\"form-control\" value=\"");
      out.print(rs.getString("category"));
      out.write("\"  name=\"category\" value=\"\" readonly/>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("          </div>\n");
      out.write("                 \n");
      out.write("          <div class=\"col-md-6 mb-5 mb-md-0\">\n");
      out.write("              <h2 class=\"h3 mb-3 text-black\">Delivery Address</h2>\n");
      out.write("              <div class=\"p-3 p-lg-10 border\">\n");
      out.write("              \n");
      out.write("              <div class=\"form-group row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label for=\"c_fname\"class=\"text-black\">First Name <span class=\"text-danger\" >*</span></label>\n");
      out.write("                  <input type=\"text\"class=\"form-control\" value=\"");
      out.print(rs.getString("fName"));
      out.write("\"  name=\"name\" value=\"\" readonly/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                  <label for=\"c_lname\" class=\"text-black\">Last Name<span class=\"text-danger\">*</span></label>\n");
      out.write("                  <input type=\"text\"class=\"form-control\" value=\"");
      out.print(rs.getString("lName"));
      out.write("\"  name=\"category\" value=\"\" readonly/>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                  <label for=\"c_address\" class=\"text-black\">Email <span class=\"text-danger\">*</span></label>\n");
      out.write("                  <input type=\"text\"class=\"form-control\"value=\"");
      out.print(rs.getString("email"));
      out.write("\"  name=\"quantity\" value=\"\" readonly/>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("                  <div class=\"form-group row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                  <label for=\"c_address\" class=\"text-black\">Address <span class=\"text-danger\">*</span></label>\n");
      out.write("                  <input type=\"text\"class=\"form-control\"value=\"");
      out.print(rs.getString("address"));
      out.write("\"  name=\"description\" value=\"\" readonly/>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                  <div class=\"form-group row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                  <label for=\"c_address\" class=\"text-black\">Province <span class=\"text-danger\">*</span></label>\n");
      out.write("                  <input type=\"text\"class=\"form-control\"value=\"");
      out.print(rs.getString("province"));
      out.write("\"  name=\"description\" value=\"\" readonly/>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                  <div class=\"form-group row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label for=\"c_fname\"class=\"text-black\">Postal Code <span class=\"text-danger\" >*</span></label>\n");
      out.write("                  <input type=\"text\"class=\"form-control\" value=\"");
      out.print(rs.getString("postelCode"));
      out.write("\"  name=\"name\" value=\"\" readonly/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                  <label for=\"c_lname\" class=\"text-black\">Phone<span class=\"text-danger\">*</span></label>\n");
      out.write("                  <input type=\"text\"class=\"form-control\" value=\"");
      out.print(rs.getString("phone"));
      out.write("\"  name=\"category\" value=\"\" readonly/>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("              \n");
      out.write("            \n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                <br>\n");
      out.write("          \n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     <input class=\"btn btn-black\" type=\"button\" onclick=\"window.location.href = 'customerPurchasedView.jsp';\" value=\"BACK\"/>\n");
      out.write("          \n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("                       \n");
      out.write("        </div>\n");
      out.write("          </div>\n");
      out.write("          </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("         \n");
      out.write("        </form> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
