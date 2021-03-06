package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <title>Pharmacy &mdash; Home</title>\n");
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
      out.write("    <form action=\"meinLogout\">\n");
      out.write("        ");

        response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
        
      out.write("\n");
      out.write("    \n");
      out.write("  <div class=\"site-wrap\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"site-navbar py-2\">\n");
      out.write("\n");
      out.write("      <div class=\"search-wrap\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <a href=\"#\" class=\"search-close js-search-close\"><span class=\"icon-close2\"></span></a>\n");
      out.write("          <form action=\"#\" method=\"post\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Search keyword and hit enter...\">\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"d-flex align-items-center justify-content-between\">\n");
      out.write("          <div class=\"logo\">\n");
      out.write("            <div class=\"site-logo\">\n");
      out.write("              <a href=\"index.jsp\" class=\"js-logo-clone\">Pharmacy</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"main-nav d-none d-lg-block\">\n");
      out.write("            <nav class=\"site-navigation text-right text-md-center\" role=\"navigation\">\n");
      out.write("              <ul class=\"site-menu js-clone-nav d-none d-lg-block\">\n");
      out.write("                <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                   <li class=\"has-children\">\n");
      out.write("                  <a href=\"#\">PURCHASE</a>\n");
      out.write("                  <ul class=\"dropdown\">\n");
      out.write("                    <li><a href=\"customerHome.jsp\">UPLOAD PRESCRIPTION</a></li>\n");
      out.write("                    \n");
      out.write("                    <li><a href=\"customerBookMedicine.jsp\">BOOK MEDICINE</a></li>\n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("               \n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"https://covid19.gov.lk/\">COVID-19</a></li>\n");
      out.write("                \n");
      out.write("              \n");
      out.write("                   <li class=\"has-children\">\n");
      out.write("                  <a href=\"#\">STAFF ACCESS</a>\n");
      out.write("                  <ul class=\"dropdown\">\n");
      out.write("                    <li><a href=\"adminLogin.jsp\">ADMIN</a></li>\n");
      out.write("                    \n");
      out.write("                    <li><a href=\"pharmacistLogin.jsp\">PHARMACIST</a></li>\n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("                 \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </nav>\n");
      out.write("          </div>\n");
      out.write("                <div class=\"main-nav d-none d-lg-block\">\n");
      out.write("              <nav class=\"site-navigation text-right text-md-center\" role=\"navigation\">\n");
      out.write("              <ul class=\"site-menu js-clone-nav d-none d-lg-block\">\n");
      out.write("         \n");
      out.write("                 <li class=\"has-children\"> \n");
      out.write("                         <a href=\"logIn.jsp\">LOGIN ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${uName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                      \n");
      out.write("                 <ul class=\"dropdown\">\n");
      out.write("                    \n");
      out.write("                     <li><input class=\"btn btn-danger btn-lg btn-block\" type=\"submit\" value=\"LOGOUT\" /></li>\n");
      out.write("                   </ul>\n");
      out.write("                 </li>\n");
      out.write("              </ul>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"site-blocks-cover\" style=\"background-image: url('images/hero_1.jpg');\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-7 mx-auto order-lg-2 align-self-center\">\n");
      out.write("            <div class=\"site-block-cover-content text-center\">\n");
      out.write("              <h2 class=\"sub-title\">Effective Medicine, New Medicine Everyday</h2>\n");
      out.write("              <h1>Welcome To Pharmacy</h1>\n");
      out.write("              <p>\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary px-5 py-3\">Purchase & get medicine delivered at your door step</a>\n");
      out.write("              </p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"site-section\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row align-items-stretch section-overlap\">\n");
      out.write("          <div class=\"col-md-6 col-lg-4 mb-4 mb-lg-0\">\n");
      out.write("            <div class=\"banner-wrap bg-primary h-100\">\n");
      out.write("              <a href=\"#\" class=\"h-100\">\n");
      out.write("                <h5>Free <br> Shipping</h5>\n");
      out.write("                <p>\n");
      out.write("                  Mainstream products\n");
      out.write("                  <strong>Get Your Clinic Medicines At Your Doorstep During Curfew.</strong>\n");
      out.write("                </p>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-6 col-lg-4 mb-4 mb-lg-0\">\n");
      out.write("            <div class=\"banner-wrap h-100\">\n");
      out.write("              <a href=\"#\" class=\"h-100\">\n");
      out.write("                <h5>Cash <br> On Delivery</h5>\n");
      out.write("                <p>\n");
      out.write("                  Mainstream products\n");
      out.write("                  <strong>Get Your Clinic Medicines At Your Doorstep During Curfew.</strong>\n");
      out.write("                </p>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-6 col-lg-4 mb-4 mb-lg-0\">\n");
      out.write("            <div class=\"banner-wrap bg-warning h-100\">\n");
      out.write("              <a href=\"#\" class=\"h-100\">\n");
      out.write("                <h5>Locate <br> Nearest Pharmacy Delivery</h5>\n");
      out.write("                <p>\n");
      out.write("                  Mainstream products\n");
      out.write("                  <strong>Get Your Clinic Medicines At Your Doorstep During Curfew.</strong>\n");
      out.write("                </p>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("   \n");
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
      out.write("                <p>To be the Admired Healthcare Retailer in Sri Lanka..\n");
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
      out.write("               <i class=\"icon-heart\" aria-hidden=\"true\"></i> by <a href=\"https://www.facebook.com/dananjaya.jayalath.18\" target=\"_blank\"\n");
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
      out.write("</form>\n");
      out.write("</body>\n");
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
