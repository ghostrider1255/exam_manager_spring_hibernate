package org.apache.jsp.WEB_002dINF.views.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("div {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("}\r\n");
      out.write("#top{\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 180px;\r\n");
      out.write("\tbackground: white;\r\n");
      out.write("\t//border: 2px ridge red;\r\n");
      out.write("}\r\n");
      out.write("#logoBody{\r\n");
      out.write("\twidth: 1200px;\r\n");
      out.write("\theight: 174px;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\tbackground: white;\r\n");
      out.write("\t//border: 2px ridge red;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logoCategory{\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\theight: 176px;\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\t//border: 1px ridge black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logoContainer{\r\n");
      out.write("\twidth: 980px;\r\n");
      out.write("\theight: 172px;\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("\t//border: 1px ridge black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#categoryHeader{\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\tbackground-color: #589ADB;\r\n");
      out.write("\tborder-radius: 10px 10px 0px 0px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tbottom: 0px;\r\n");
      out.write("\tfont-style: Bold;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tpadding: 5px 0px 5px;\r\n");
      out.write("}\r\n");
      out.write("#horizontalMenuArea{\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 0px;\r\n");
      out.write("\twidth: 900px;\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("\tbackground-color: #102841;\r\n");
      out.write("\tborder-radius: 10px 10px 0px 0px;\r\n");
      out.write("\tfont-style: Bold;\r\n");
      out.write("\tfont-size: 17px;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tbottom: 10px;\r\n");
      out.write("\tmargin-top: 137px;\r\n");
      out.write("\tmargin-left: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul.horizMenu{\r\n");
      out.write("\tlist-style-type: none;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("li.horizMenu{\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("}\r\n");
      out.write("li a.horizMenu{\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tpadding: 20px 30px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("li a.horizMenu:hover{\r\n");
      out.write("\tcolor: #589ADB;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li.horizMenu:first-child a.horizMenu{\r\n");
      out.write("\tcolor: #589ADB;\r\n");
      out.write("}\r\n");
      out.write(".searchArea{\r\n");
      out.write("\t//display: inline-block;\r\n");
      out.write("\tbackground: none;\r\n");
      out.write("\theight: 31px;\r\n");
      out.write("\twidth: 630px;\r\n");
      out.write("\tmargin-top: 60px;\r\n");
      out.write("\tmargin-left: 22px;\r\n");
      out.write("\tborder: 0px;\r\n");
      out.write("\tborder-radius: 0px 5px 5px 0px;\t\r\n");
      out.write("\t//border: 2px ridge red;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write(".searchBox{\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\theight:31px;\r\n");
      out.write("\twidth:500px;\r\n");
      out.write("\tborder-radius: 10px 0px 0px 10px;\r\n");
      out.write("\tborder-color: #589ADB;\r\n");
      out.write("\tborder-right: 0px;\r\n");
      out.write("\tbackground: transparent;\r\n");
      out.write("\tfont: 15px solid, \"Times New Roman\";\r\n");
      out.write("\tpadding: 0px 30px 0px 10px;\r\n");
      out.write("}\r\n");
      out.write(".searchBox input,\r\n");
      out.write(".searchBox input:active,\r\n");
      out.write(".searchBox input:focus{\r\n");
      out.write("\tmargin-top: -15px;\r\n");
      out.write("\tborder-color: #589ADB;\r\n");
      out.write("\tborder-right: 0px;\r\n");
      out.write("}\r\n");
      out.write(".searchButton{\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\theight:36px;\r\n");
      out.write("\twidth:80px;\r\n");
      out.write("\tbackground-color: #589ADB;\r\n");
      out.write("\tborder-radius: 0px 10px 10px 0px;\r\n");
      out.write("\tborder: 0px;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\t-webkit-transition: color 2s ease-out;\r\n");
      out.write("    -moz-transition: color 2s ease-out;\r\n");
      out.write("    -ms-transition: color 2s ease-out;\r\n");
      out.write("    -o-transition: color 2s ease-out;\r\n");
      out.write("\ttransition: color 2s ease-out;\r\n");
      out.write("}\r\n");
      out.write("input.searchButton:hover{\r\n");
      out.write("\tbackground-color: black;\r\n");
      out.write("}\r\n");
      out.write("#logo_twitter{\r\n");
      out.write("\tright: 300px;\r\n");
      out.write("\twidth: 27px;\r\n");
      out.write("\tbackground: url('images/social-media-icons.jpg') -124px -19px;\r\n");
      out.write("\tborder-radius: 10px 10px 10px 10px;\r\n");
      out.write("}\r\n");
      out.write("#logo_twitter a:hover{\r\n");
      out.write("\tright: 300px;\r\n");
      out.write("\twidth: 27px;\r\n");
      out.write("\tbackground: url('images/social-media-icons.jpg') -124px -118px;\r\n");
      out.write("\tborder-radius: 10px 10px 10px 10px;\r\n");
      out.write("}\r\n");
      out.write("#logo_gPlus{\r\n");
      out.write("\tright: 268px;\r\n");
      out.write("\twidth: 27px;\r\n");
      out.write("\tbackground: url('images/social-media-icons.jpg') -87px -19px;\r\n");
      out.write("\tborder-radius: 10px 10px 10px 10px;\r\n");
      out.write("}\r\n");
      out.write("#logo_gPlus a:hover{\r\n");
      out.write("\tright: 268px;\r\n");
      out.write("\twidth: 27px;\r\n");
      out.write("\tbackground: url('images/social-media-icons.jpg') -87px -118px;\r\n");
      out.write("\tborder-radius: 10px 10px 10px 10px;\r\n");
      out.write("}\r\n");
      out.write("#logo_fb{\r\n");
      out.write("\tright: 234px;\r\n");
      out.write("\twidth: 27px;\r\n");
      out.write("\tbackground: url('images/social-media-icons.jpg') -342px -19px;\r\n");
      out.write("\tborder-radius: 10px 10px 10px 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logo_fb a:hover{\r\n");
      out.write("\tright: 234px;\r\n");
      out.write("\twidth: 27px;\r\n");
      out.write("\tbackground: url('images/social-media-icons.jpg') -342px -118px;\r\n");
      out.write("\tborder-radius: 10px 10px 10px 10px;\r\n");
      out.write("}\r\n");
      out.write("#logo_nav_ul{\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\t//border: 2px ridge red;\r\n");
      out.write("\theight: 20px;\r\n");
      out.write("\twidth: 600px;\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("}\r\n");
      out.write("#logo_nav_ul li{\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tlist-style: none;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("}\r\n");
      out.write("#logo_nav_ul li,#logo_nav_ul a{\r\n");
      out.write("\theight: 28px;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<div id=\"top\">\r\n");
      out.write("\t\t\t<div id=\"logoBody\">\r\n");
      out.write("\t\t\t\t<div id=\"logoCategory\"> \r\n");
      out.write("\t\t\t\t\t<div id=\"categoryHeader\">&nbsp; &nbsp;Category</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"logoContainer\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<ul id=\"logo_nav_ul\">\r\n");
      out.write("\t\t\t\t\t\t\t<li id=\"logo_twitter\"><a href=\"index.html\"></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li id=\"logo_gPlus\"><a href=\"index.html\"></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li id=\"logo_fb\"><a href=\"index.html\"></a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t<div class=\"searchArea\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"searchBox\" type=\"text\" name=\"searchBox\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"searchButton\" type=\"submit\" name=\"search\" value=\"Search\" >\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"horizontalMenuArea\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"horizMenu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"horizMenu\"><a class=\"horizMenu\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/index\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"horizMenu\"><a class=\"horizMenu\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/pattern/createPattern\">Paper Pattern</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"horizMenu\"><a class=\"horizMenu\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/exam/createExamPattern\">Exam</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"horizMenu\"><a class=\"horizMenu\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/subjects\">Subject</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"horizMenu\"><a class=\"horizMenu\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/questions\">Question</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"horizMenu\"><a class=\"horizMenu\" href=\"#\">Contact US</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
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

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/views/templates/header.jsp(202,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("contextPath");
    // /WEB-INF/views/templates/header.jsp(202,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/templates/header.jsp(202,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
