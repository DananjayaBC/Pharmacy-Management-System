package org.apache.jsp.css.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkCustomerOrderStatus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Medical Clinic</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" media=\"screen\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<script>\r\n");
      out.write("function validate()\r\n");
      out.write("{\r\n");
      out.write("var corder_id=document.abc.corder_id.value;\r\n");
      out.write("\r\n");
      out.write("if(corder_id.length==0)\r\n");
      out.write("{\r\n");
      out.write("window.alert(\"ENTER ORDER ID TO PROCEED\");\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<div id=\"main_container\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("    <div id=\"logo\"><a href=\"#\"><img src=\"images/logo.png\" alt=\"\" width=\"162\" height=\"54\" border=\"0\" /></a></div>\r\n");
      out.write("    <div class=\"right_header\">\r\n");
      out.write("      <div class=\"top_menu\"> <a href=\"customerLogout.do\" class=\"login\">log out</a> <a href=\"#\" class=\"sign_up\">report</a> </div>\r\n");
      out.write("      <div id=\"menu\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li><a href=\"customerHome.jsp\">Home</a></li>\r\n");
      out.write("          <li><a href=\"aboutUs.html\">About Us</a></li>\r\n");
      out.write("          <li><a href=\"services.html\">Services</a></li>\r\n");
      out.write("          <li><a href=\"contactUs.html\">Contact Us</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"middle_box\">\r\n");
      out.write("    <div class=\"middle_box_content\"><img src=\"images/banner_content.jpg\" alt=\"\" /><h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3></div>\r\n");
      out.write("  </div>\r\n");
      out.write("    <div class=\"pattern_bg\">\r\n");
      out.write("    <div class=\"pattern_box\">\r\n");
      out.write("      <div class=\"pattern_box_icon\"><img src=\"images/icon1.png\" alt=\"\" width=\"70\" height=\"112\" /></div>\r\n");
      out.write("      <div class=\"pattern_content\">\r\n");
      out.write("        <h1>Company<span class=\"blue\"> Vision</span></h1>\r\n");
      out.write("        <p class=\"pat\">Jupitar's vision for the next phase of development is to 'Touch a Billion Lives'.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"pattern_box\">\r\n");
      out.write("      <div class=\"pattern_box_icon\"><img src=\"images/icon2.png\" alt=\"\" width=\"70\" height=\"112\" /></div>\r\n");
      out.write("      <div class=\"pattern_content\">\r\n");
      out.write("        <h1> Mission <span class=\"blue\">Statement</span></h1>\r\n");
      out.write("        <p class=\"pat\"> \"Our mission is to bring healthcare of International standards within the reach of every individual. We are\r\n");
      out.write("committed to the achievement and maintenance of excellence in education, research and healthcare for the\r\n");
      out.write("benefit of humanity\" </p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"main_content\">\r\n");
      out.write("    <div class=\"box_icon\"><img src=\"images/customer_logo.jpg\" width=\"250\" height=\"250\" /></div>\r\n");
      out.write("    <div class=\"box_content\">\r\n");
      out.write("      <div class=\"box_title\">\r\n");
      out.write("        <div class=\"title_icon\"></div>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("      <form name=\"abc\" method=\"post\" action=\"customerOrderStatus.do\" onsubmit=\"return validate(this)\">\r\n");
      out.write("      <div class=\"box_text_content\"> <img src=\"images/checked.gif\" alt=\"\" class=\"box_icon\" />\r\n");
      out.write("        <div class=\"box_text\"><p align=\"left\">Enter order id:</p><input type=\"text\" name=\"corder_id\"/></div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"box_text_content\">\r\n");
      out.write("        <div class=\"box_text\"><p align=\"right\"><input type=\"submit\" name=\"checkStatus\" value=\"Check Status\"/></p></div>\r\n");
      out.write("       \r\n");
      out.write("      </div>\r\n");
      out.write("       </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"top_menu\">\r\n");
      out.write("      <div class=\"top_menu\"><img src=\"images/customer_check_orderstatus.jpg\" width=\"300\" height=\"250\"  align=\"right\" class=\"login\" /></div></div>\r\n");
      out.write("    <div class=\"clear\"></div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"footer\">\r\n");
      out.write("    <div class=\"copyright\"> <img src=\"images/footer_logo.gif\" alt=\"\" /> </div>\r\n");
      out.write("    <div class=\"center_footer\">&copy; Medical Clinic 2008. All Rights Reserved</div>\r\n");
      out.write("    <div style=\"clear:both;\"></div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
