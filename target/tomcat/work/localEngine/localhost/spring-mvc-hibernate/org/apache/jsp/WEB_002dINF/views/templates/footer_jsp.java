package org.apache.jsp.WEB_002dINF.views.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Filter Test</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("div {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("}\r\n");
      out.write("#foot{\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 200px;\r\n");
      out.write("\tbackground: #1B2631;\r\n");
      out.write("\tborder-radius: 10px 10px 0px 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#footerInfo{\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tmargin-top: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul.footerMenu{\r\n");
      out.write("\tlist-style-type: none;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\twidth: 220px;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\t//background-color: white;\r\n");
      out.write("}\r\n");
      out.write("li.footerMenu{\r\n");
      out.write("\tborder-bottom:0px;\r\n");
      out.write("\tpadding: 10px 25px 5px 45px;\r\n");
      out.write("}\r\n");
      out.write("li.footerMenu:first-child{\r\n");
      out.write("\tfont-size: 15px;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("li.footerMenu a.footerMenu{\r\n");
      out.write("\tcolor: #589ADB;\r\n");
      out.write("\tpadding: 10px 15px 20px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#F2F3F4\">\r\n");
      out.write("\t<div id=\"foot\">\r\n");
      out.write("\t\t<div id=\"footerInfo\">\r\n");
      out.write("\t\t\t<ul class=\"footerMenu\">\r\n");
      out.write("\t\t\t\t<li class=\"footerMenu\">Information</li>\r\n");
      out.write("\t\t\t\t<li class=\"footerMenu\"><a class=\"footerMenu\" href=\"index.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"footerMenu\"><a class=\"footerMenu\" href=\"index.html\">About US</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"footerMenu\">\r\n");
      out.write("\t\t\t\t<li class=\"footerMenu\">Collections</li>\r\n");
      out.write("\t\t\t\t<li class=\"footerMenu\"><a class=\"footerMenu\" href=\"index.html\">Category One</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"footerMenu\"><a class=\"footerMenu\" href=\"index.html\">Category Two</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"footerMenu\">\r\n");
      out.write("\t\t\t\t<li class=\"footerMenu\">My Account</li>\r\n");
      out.write("\t\t\t\t<li class=\"footerMenu\"><a class=\"footerMenu\" href=\"index.html\">My Account</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"footerMenu\">\r\n");
      out.write("\t\t\t\t<li class=\"footerMenu\">Follow US</li>\r\n");
      out.write("\t\t\t\t<li class=\"footerMenu\"><a class=\"footerMenu\" href=\"index.html\">Twitter</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"footerMenu\"><a class=\"footerMenu\" href=\"index.html\">FaceBook</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<hr class=\"footHR\">\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
