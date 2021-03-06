package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class adminPharmacistView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <title>Admin &mdash; Pharamacist Details</title>\n");
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
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");

       if(session.getAttribute("uName")==null)
       {
          response.sendRedirect("adminLogin.jsp");
       }
    
    
      out.write("\n");
      out.write("    <form action=\"regiServlet\" method=\"POST\">\n");
      out.write("         \n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"site-navbar py-2\">\n");
      out.write("\n");
      out.write("      <div class=\"search-wrap\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <a href=\"#\" class=\"search-close js-search-close\"><span class=\"icon-close2\"></span></a>\n");
      out.write("         \n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Search keyword and hit enter...\">\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"d-flex align-items-center justify-content-between\">\n");
      out.write("          <div class=\"logo\">\n");
      out.write("            <div class=\"site-logo\">\n");
      out.write("              <a href=\"index.html\" class=\"js-logo-clone\">Pharmacy</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"main-nav d-none d-lg-block\">\n");
      out.write("            <nav class=\"site-navigation text-right text-md-center\" role=\"navigation\">\n");
      out.write("              <ul class=\"site-menu js-clone-nav d-none d-lg-block\">\n");
      out.write("                 <li class=\"active\"><a href=\"index.html\">Home</a></li>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"https://covid19.gov.lk/\">COVID-19</a></li>\n");
      out.write("                \n");
      out.write("              \n");
      out.write("                <li class=\"has-children\">\n");
      out.write("                  <a href=\"#\">MEDICINE</a>\n");
      out.write("                  <ul class=\"dropdown\">\n");
      out.write("                    <li><a href=\"adminMedicineAdd.jsp\">ADD MEDICINE</a></li>\n");
      out.write("                    <li><a href=\"adminMedicineView.jsp\">VIEW LIST</a></li>\n");
      out.write("                   </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"has-children\">\n");
      out.write("                  <a href=\"#\">PHARMACIST</a>\n");
      out.write("                  <ul class=\"dropdown\">\n");
      out.write("                    <li><a href=\"adminPharmacistAdd.jsp\">ADD PHARMACIST</a></li>\n");
      out.write("                    <li><a href=\"adminPharmacistView.jsp\">VIEW LIST</a></li>\n");
      out.write("                   </ul>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("            </nav>\n");
      out.write("          </div>\n");
      out.write("            <div class=\"main-nav d-none d-lg-block\">\n");
      out.write("              <nav class=\"site-navigation text-right text-md-center\" role=\"navigation\">\n");
      out.write("              <ul class=\"site-menu js-clone-nav d-none d-lg-block\">\n");
      out.write("         \n");
      out.write("                 <li class=\"has-children\"><a> \n");
      out.write("                         Welcome:Admin ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${uName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                </a>\n");
      out.write("                 <ul class=\"dropdown\">\n");
      out.write("                    <li><a href=\"#\">CHANGE PASSWORD</a></li>\n");
      out.write("                    <li><a href=\"#\">LOGOUT</a></li>\n");
      out.write("                   </ul>\n");
      out.write("                 </li>\n");
      out.write("              </ul>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("       <div class=\"bg-light py-3\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12 mb-0\">\n");
      out.write("            <a href=\"index.html\">Home</a> <span class=\"mx-2 mb-0\">/</span>\n");
      out.write("            <a href=\"adminHome.jsp\">Admin Home</a> <span class=\"mx-2 mb-0\">/</span>\n");
      out.write("            <strong class=\"text-black\">View Pharmacist</strong>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("       <div class=\"site-section\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row mb-5\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <div class=\"bg-light rounded p-3\">\n");
      out.write("              <p class=\"mb-0\">Pharamacist <a href=\"#\" class=\"d-inline-block\"> List</a></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-6 mb-5 mb-md-0\">\n");
      out.write("            <h2 class=\"h3 mb-3 text-black\">Pharamacist Details</h2>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("               <div class=\"form-group row\">\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("                    <center>\n");
      out.write("                    <table border=\"1\" id=\"t01\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>First Name</th>\n");
      out.write("                                <th>Last Name</th>\n");
      out.write("                                <th>Email</th>\n");
      out.write("                                <th>Address</th>\n");
      out.write("                                <th>ID</th>\n");
      out.write("                                <th>City</th>\n");
      out.write("                                <th>Password</th>\n");
      out.write("                                <th>Phone</th>\n");
      out.write("                                <th>Note</th>\n");
      out.write("                                <th>Edit</th>\n");
      out.write("                                <th>Delete</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        ");

                           Connection con;
                           PreparedStatement pst;
                           ResultSet rs;
                            String url="jdbc:mysql://localhost:3306/pharma";
                           Class.forName("com.mysql.jdbc.Driver");
                           con = DriverManager.getConnection(url,"root","");
                           
                           String query="select * from pharmacist";
                           Statement st = con.createStatement();
                           
                           rs = st.executeQuery(query);
                           while(rs.next())
                           {
                              String no =rs.getString("no");
        
                        
      out.write("\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(rs.getString("fName") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("lName") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("email") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("address") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("id") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("city") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("password") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("phone") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("notes") );
      out.write("</td>\n");
      out.write("                                \n");
      out.write("                                <td><input class=\"btn btn-info\" type=\"button\" onclick=\"window.location.href = 'adminPharmacistUpdate.jsp?no=");
      out.print(no);
      out.write("';\" value=\"EDIT\"/></td>\n");
      out.write("                                <td><input class=\"btn btn-danger\" type=\"button\" onclick=\"window.location.href = 'adminPharmacistDelete.jsp?no=");
      out.print(no);
      out.write("';\" value=\"DELETE\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                            }
                            
      out.write("\n");
      out.write("                           \n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                    </center>\n");
      out.write("                    <style>\n");
      out.write("                  table, th, td {\n");
      out.write("                  border: 1px solid black;\n");
      out.write("                  border-collapse: collapse;\n");
      out.write("                 }\n");
      out.write("                  th, td {\n");
      out.write("                  padding: 10px;\n");
      out.write("                  text-align: center;\n");
      out.write("                 }\n");
      out.write("                  table#t01 {\n");
      out.write("                  width: 150%;    \n");
      out.write("                  background-color: #F6F7F8;\n");
      out.write("                 }\n");
      out.write("                  </style>\n");
      out.write("    \n");
      out.write("      </div>\n");
      out.write("          </div>\n");
      out.write("       \n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("          <br>\n");
      out.write("          <br>\n");
      out.write("          <br>\n");
      out.write("        \n");
      out.write("\n");
      out.write("    <div class=\"site-section bg-secondary bg-image\" style=\"background-image: url('images/bg_2.jpg');\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row align-items-stretch\">\n");
      out.write("          <div class=\"col-lg-6 mb-5 mb-lg-0\">\n");
      out.write("            <a href=\"#\" class=\"banner-1 h-100 d-flex\" style=\"background-image: url('images/bg_1.jpg');\">\n");
      out.write("              <div class=\"banner-1-inner align-self-center\">\n");
      out.write("                <h2>Pharmacy Products</h2>\n");
      out.write("                <p>A healthier nation that contributes to its economic, social, mental and spiritual development.\n");
      out.write("                </p>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-6 mb-5 mb-lg-0\">\n");
      out.write("            <a href=\"#\" class=\"banner-1 h-100 d-flex\" style=\"background-image: url('images/bg_2.jpg');\">\n");
      out.write("              <div class=\"banner-1-inner ml-auto  align-self-center\">\n");
      out.write("                <h2>Rated by Experts</h2>\n");
      out.write("                <p>To be the Admired Healthcare Retailer in Sri Lanka.\n");
      out.write("                </p>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <footer class=\"site-footer\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-6 col-lg-3 mb-4 mb-lg-0\">\n");
      out.write("\n");
      out.write("            <div class=\"block-7\">\n");
      out.write("              <h3 class=\"footer-heading mb-4\">About Us</h3>\n");
      out.write("              <p>To contribute to social and economic development of Sri Lanka by achieving the highest attainable\n");
      out.write("                  health status through promotive, preventive, curative and rehabilitative services of high quality\n");
      out.write("                  made available and accessible to people of Sri Lanka.</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-3 mx-auto mb-5 mb-lg-0\">\n");
      out.write("            <h3 class=\"footer-heading mb-4\">Quick Links</h3>\n");
      out.write("            <ul class=\"list-unstyled\">\n");
      out.write("              <li><a href=\"#\">Supplements</a></li>\n");
      out.write("              <li><a href=\"#\">Vitamins</a></li>\n");
      out.write("              <li><a href=\"#\">Diet &amp; Nutrition</a></li>\n");
      out.write("              <li><a href=\"#\">Tea &amp; Coffee</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-md-6 col-lg-3\">\n");
      out.write("            <div class=\"block-5 mb-5\">\n");
      out.write("              <h3 class=\"footer-heading mb-4\">Contact Info</h3>\n");
      out.write("              <ul class=\"list-unstyled\">\n");
      out.write("                <li class=\"address\">\n");
      out.write("                   SUWASIRIPAYA\n");
      out.write("                   No. 385,\n");
      out.write("                   Rev. Baddegama Wimalawansa Thero Mawatha.\n");
      out.write("                   Colombo 10, Sri Lanka</li>\n");
      out.write("                <li class=\"phone\"><a href=\"tel://0770553938\">+94 77 055 3938</a></li>\n");
      out.write("                <li class=\"email\">Dananjaya.chanuka@gmail.com</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row pt-5 mt-5 text-center\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <p>\n");
      out.write("            \n");
      out.write("              Copyright &copy;\n");
      out.write("              <script>document.write(new Date().getFullYear());</script> All rights reserved |\n");
      out.write("               <i class=\"icon-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\"\n");
      out.write("                class=\"text-primary\">DANA</a>\n");
      out.write("              \n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery-ui.js\"></script>\n");
      out.write("  <script src=\"js/popper.min.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("  <script src=\"js/aos.js\"></script>\n");
      out.write("\n");
      out.write("  <script src=\"js/main.js\"></script>\n");
      out.write("    \n");
      out.write("</form> \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("    \n");
      out.write("             \n");
      out.write("    \n");
      out.write("    \n");
      out.write("              \n");
      out.write("    \n");
      out.write("            \n");
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
