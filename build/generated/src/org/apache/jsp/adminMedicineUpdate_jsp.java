package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class adminMedicineUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 
    if(request.getParameter("submit")!=null)
    {
        int no = Integer.parseInt(request.getParameter("no"));
        String name=request.getParameter("name");
        String category=request.getParameter("category");
        String company=request.getParameter("company");
        int price = Integer.parseInt(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String description=request.getParameter("description");
        
                           Connection con;
                           PreparedStatement pst;
                           ResultSet rs;
                           
                           String url="jdbc:mysql://localhost:3306/pharma";
                           Class.forName("com.mysql.jdbc.Driver");
                           con = DriverManager.getConnection(url,"root","");
                           
                           
                           pst = con.prepareStatement("update medicine set name ='"+name+"' ,category = '"+category+"',company = '"+company+"' ,price = '"+price+"' ,quantity ='"+quantity+"' ,description ='"+description+"' where no = ?");
                          pst.setInt(1, no);
                                   
                          pst.executeUpdate();

      out.write('\n');
      out.write('\n');
 }
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
                           pst = con.prepareStatement("select *from medicine where no=?");
                           pst.setString((1), no);
                           rs = pst.executeQuery();
                           
                             while(rs.next())
                             {
                             
                             
            
            
            
            
            
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-6 mb-5 mb-md-0\">\n");
      out.write("            <h2 class=\"h3 mb-3 text-black\">Pharmacist Update</h2>\n");
      out.write("            <div class=\"p-3 p-lg-5 border\">\n");
      out.write("            \n");
      out.write("              <div class=\"form-group row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label for=\"c_fname\"class=\"text-black\">First Name <span class=\"text-danger\" >*</span></label>\n");
      out.write("                  <input type=\"text\"class=\"form-control\" value=\"");
      out.print(rs.getString("fName"));
      out.write("\"  name=\"fName\" value=\"\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                  <label for=\"c_lname\" class=\"text-black\">Last Name <span class=\"text-danger\">*</span></label>\n");
      out.write("                  <input type=\"text\"class=\"form-control\" value=\"");
      out.print(rs.getString("lName"));
      out.write("\"  name=\"lName\" value=\"\" />\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("    \n");
      out.write("              <div class=\"form-group row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                  <label for=\"c_companyname\" class=\"text-black\">Email Address <span class=\"text-danger\">*</span> </label>\n");
      out.write("                  <input type=\"text\" class=\"form-control\"value=\"");
      out.print(rs.getString("email"));
      out.write("\"  name=\"email\" value=\"\" />\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("    \n");
      out.write("              <div class=\"form-group row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                  <label for=\"c_address\" class=\"text-black\">Address <span class=\"text-danger\">*</span></label>\n");
      out.write("                  <input type=\"text\"class=\"form-control\"value=\"");
      out.print(rs.getString("address"));
      out.write("\"  name=\"address\" value=\"\" />\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("     \n");
      out.write("              \n");
      out.write("              <div class=\"form-group row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                  <label for=\"c_state_country\" class=\"text-black\">ID <span class=\"text-danger\">*</span></label>\n");
      out.write("                  <input type=\"text\"class=\"form-control\" name=\"id\" value=\"");
      out.print(rs.getString("id"));
      out.write("\" placeholder=\"ID Number\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                  <label for=\"c_postal_zip\" class=\"text-black\">City <span class=\"text-danger\">*</span></label>\n");
      out.write("                  <input type=\"text\"class=\"form-control\" name=\"city\" value=\"");
      out.print(rs.getString("city"));
      out.write("\" />\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("    \n");
      out.write("              <div class=\"form-group row mb-5\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                  <label for=\"c_email_address\" class=\"text-black\">Password <span class=\"text-danger\">*</span></label>\n");
      out.write("                  <input type=\"password\"class=\"form-control\" name=\"password\" value=\"");
      out.print(rs.getString("password"));
      out.write("\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                  <label for=\"c_phone\" class=\"text-black\">Phone <span class=\"text-danger\">*</span></label>\n");
      out.write("                  <input type=\"text\"class=\"form-control\" name=\"phone\" value=\"");
      out.print(rs.getString("phone"));
      out.write("\" placeholder=\"Phone Number\"/>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                <label for=\"c_order_notes\" class=\"text-black\">Notes</label>\n");
      out.write("               \n");
      out.write("                <textarea name=\"notes\"  rows=\"5\" cols=\"30\" class=\"form-control\"  placeholder=\"Write your notes here...\">");
      out.print(rs.getString("notes"));
      out.write("\n");
      out.write("                </textarea>\n");
      out.write("              </div>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                <br>\n");
      out.write("          \n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                     <input class=\"btn btn-info\" type=\"submit\" value=\"submit\" id=\"submit\" name=\"submit\"/>\n");
      out.write("                     \n");
      out.write("                     <input class=\"btn btn-black\" type=\"button\" onclick=\"window.location.href = 'adminPharmacistView.jsp';\" value=\"BACK\"/>\n");
      out.write("                     \n");
      out.write("                            \n");
      out.write("                     \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("                       </div>\n");
      out.write("        </div>\n");
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
