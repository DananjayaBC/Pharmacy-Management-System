package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logIn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <title>Pharmacy &mdash; LogIn</title>\n");
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
      out.write("    <form action=\"customerLoginServlet\" method=\"POST\">\n");
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
      out.write("                <li class=\"active\"><a href=\"index.html\">Home</a></li>\n");
      out.write("                <li><a href=\"shop.html\">PURCHASE</a></li>\n");
      out.write("               \n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"about.html\">COVID-19</a></li>\n");
      out.write("                <li><a href=\"SignUP.jsp\">SINGUP</a></li>\n");
      out.write("                <li><a href=\"contact.html\">STAFF ACCESS</a></li>\n");
      out.write("                \n");
      out.write("              </ul>\n");
      out.write("            </nav>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"icons\">\n");
      out.write("            <a href=\"#\" class=\"icons-btn d-inline-block js-search-open\"><span class=\"icon-search\"></span></a>\n");
      out.write("            <a href=\"cart.html\" class=\"icons-btn d-inline-block bag\">\n");
      out.write("              <span class=\"icon-shopping-bag\"></span>\n");
      out.write("              <span class=\"number\">2</span>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"site-menu-toggle js-menu-toggle ml-3 d-inline-block d-lg-none\"><span\n");
      out.write("                class=\"icon-menu\"></span></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("       <div class=\"bg-light py-3\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12 mb-0\">\n");
      out.write("            <a href=\"index.html\">Home</a> <span class=\"mx-2 mb-0\">/</span>\n");
      out.write("            <strong class=\"text-black\">LogIn</strong>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("       <div class=\"site-section\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row mb-5\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <div class=\"bg-light rounded p-3\">\n");
      out.write("              <p class=\"mb-0\">Not Registered !! <a href=\"SignUP.jsp\" class=\"d-inline-block\">Click here</a> to SignUp</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-6 mb-5 mb-md-0\">\n");
      out.write("            <h2 class=\"h3 mb-3 text-black\">Enter LogIn Details</h2>\n");
      out.write("            <div class=\"p-3 p-lg-5 border\">\n");
      out.write("            \n");
      out.write("             \n");
      out.write("    \n");
      out.write("              <div class=\"form-group row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                  <label for=\"c_companyname\" class=\"text-black\">Email <span class=\"text-danger\">*</span> </label>\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"email\" value=\"\"  placeholder=\"Email Address\" />\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("    \n");
      out.write("              <div class=\"form-group row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                  <label for=\"c_address\" class=\"text-black\">Password <span class=\"text-danger\">*</span></label>\n");
      out.write("                  <input type=\"password\"class=\"form-control\" name=\"pass\" value=\"\" />\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("     \n");
      out.write("              \n");
      out.write("           \n");
      out.write("              </div>\n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                     <input class=\"btn btn-primary btn-lg btn-block\" type=\"submit\" value=\"LOGIN\" />\n");
      out.write("                     \n");
      out.write("                  </div>\n");
      out.write("                \n");
      out.write("    \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("       \n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12 block-3 products-wrap\">\n");
      out.write("            <div class=\"nonloop-block-3 no-direction owl-carousel\">\n");
      out.write("        \n");
      out.write("              <div class=\"testimony\">\n");
      out.write("                <blockquote>\n");
      out.write("                  <img src=\"images/person_1.jpg\" alt=\"Image\" class=\"img-fluid w-25 mb-4 rounded-circle\">\n");
      out.write("                  <p>&ldquo;Lorem ipsum dolor, sit amet consectetur adipisicing elit. Nemo omnis voluptatem consectetur quam tempore obcaecati maiores voluptate aspernatur iusto eveniet, placeat ab quod tenetur ducimus. Minus ratione sit quaerat unde.&rdquo;</p>\n");
      out.write("                </blockquote>\n");
      out.write("\n");
      out.write("                <p>&mdash; Kelly Holmes</p>\n");
      out.write("              </div>\n");
      out.write("        \n");
      out.write("              <div class=\"testimony\">\n");
      out.write("                <blockquote>\n");
      out.write("                  <img src=\"images/person_2.jpg\" alt=\"Image\" class=\"img-fluid w-25 mb-4 rounded-circle\">\n");
      out.write("                  <p>&ldquo;Lorem ipsum dolor, sit amet consectetur adipisicing elit. Nemo omnis voluptatem consectetur quam tempore\n");
      out.write("                    obcaecati maiores voluptate aspernatur iusto eveniet, placeat ab quod tenetur ducimus. Minus ratione sit quaerat\n");
      out.write("                    unde.&rdquo;</p>\n");
      out.write("                </blockquote>\n");
      out.write("              \n");
      out.write("                <p>&mdash; Rebecca Morando</p>\n");
      out.write("              </div>\n");
      out.write("        \n");
      out.write("              <div class=\"testimony\">\n");
      out.write("                <blockquote>\n");
      out.write("                  <img src=\"images/person_3.jpg\" alt=\"Image\" class=\"img-fluid w-25 mb-4 rounded-circle\">\n");
      out.write("                  <p>&ldquo;Lorem ipsum dolor, sit amet consectetur adipisicing elit. Nemo omnis voluptatem consectetur quam tempore\n");
      out.write("                    obcaecati maiores voluptate aspernatur iusto eveniet, placeat ab quod tenetur ducimus. Minus ratione sit quaerat\n");
      out.write("                    unde.&rdquo;</p>\n");
      out.write("                </blockquote>\n");
      out.write("              \n");
      out.write("                <p>&mdash; Lucas Gallone</p>\n");
      out.write("              </div>\n");
      out.write("        \n");
      out.write("              <div class=\"testimony\">\n");
      out.write("                <blockquote>\n");
      out.write("                  <img src=\"images/person_4.jpg\" alt=\"Image\" class=\"img-fluid w-25 mb-4 rounded-circle\">\n");
      out.write("                  <p>&ldquo;Lorem ipsum dolor, sit amet consectetur adipisicing elit. Nemo omnis voluptatem consectetur quam tempore\n");
      out.write("                    obcaecati maiores voluptate aspernatur iusto eveniet, placeat ab quod tenetur ducimus. Minus ratione sit quaerat\n");
      out.write("                    unde.&rdquo;</p>\n");
      out.write("                </blockquote>\n");
      out.write("              \n");
      out.write("                <p>&mdash; Andrew Neel</p>\n");
      out.write("              </div>\n");
      out.write("        \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"site-section bg-secondary bg-image\" style=\"background-image: url('images/bg_2.jpg');\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row align-items-stretch\">\n");
      out.write("          <div class=\"col-lg-6 mb-5 mb-lg-0\">\n");
      out.write("            <a href=\"#\" class=\"banner-1 h-100 d-flex\" style=\"background-image: url('images/bg_1.jpg');\">\n");
      out.write("              <div class=\"banner-1-inner align-self-center\">\n");
      out.write("                <h2>Pharma Products</h2>\n");
      out.write("                <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Molestiae ex ad minus rem odio voluptatem.\n");
      out.write("                </p>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-6 mb-5 mb-lg-0\">\n");
      out.write("            <a href=\"#\" class=\"banner-1 h-100 d-flex\" style=\"background-image: url('images/bg_2.jpg');\">\n");
      out.write("              <div class=\"banner-1-inner ml-auto  align-self-center\">\n");
      out.write("                <h2>Rated by Experts</h2>\n");
      out.write("                <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Molestiae ex ad minus rem odio voluptatem.\n");
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
      out.write("              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eius quae reiciendis distinctio voluptates\n");
      out.write("                sed dolorum excepturi iure eaque, aut unde.</p>\n");
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
