package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class itemCatalogue_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fcommandName;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fcommandName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fcommandName.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write("\r\n");
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
      out.write("\r\n");
      out.write("#body{\r\n");
      out.write("\twidth: 1200px;\r\n");
      out.write("\tmin-height: 2300px;\r\n");
      out.write("\toverflow-y: auto;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\tbackground: #F2F3F4;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\t//border: 2px ridge black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#category{\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\theight: 1400px;\r\n");
      out.write("\tbackground-color: #F2F3F4;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\t//border: 2px ridge yellow;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#container{\r\n");
      out.write("\twidth: 980px;\r\n");
      out.write("\theight: 1150px;\r\n");
      out.write("\tbackground-color: #F2F3F4;\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("\t//padding: 20px 0px 20px 20px;\r\n");
      out.write("\t//border: 2px ridge red;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#itemHeader{\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\twidth: 900px;\r\n");
      out.write("\theight: 45px;\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tborder: 1px ridge;\r\n");
      out.write("\tmargin: 20px;\r\n");
      out.write("}\r\n");
      out.write("#item{\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\twidth: 270px;\r\n");
      out.write("\theight: 300px;\r\n");
      out.write("\tmargin: 20px 20px 20px 20px;\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("\t//border: 2px ridge red;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul.ulcategory{\r\n");
      out.write("\tlist-style-type: none;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("}\r\n");
      out.write("li.ulcategory{\r\n");
      out.write("border-bottom: 2px solid #F2F3F4;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("li.ulcategory:last-child {\r\n");
      out.write("    border-bottom: none;\r\n");
      out.write("}\r\n");
      out.write("li a.ulcategory{\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("\tpadding: 8px 10px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tfont-size: 13px;\r\n");
      out.write("}\r\n");
      out.write("li a.ulcategory:hover{\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("\tcolor: blue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img.itemImg {\r\n");
      out.write("\theight: 205px;\r\n");
      out.write("\twidth: 205px;\r\n");
      out.write("\talign: center;\r\n");
      out.write("\tpadding: 0px 10px 10px 30px;\r\n");
      out.write("\t//border: 1px solid red;\r\n");
      out.write("\ttop: 0px;\r\n");
      out.write("}\r\n");
      out.write("div.itemRate{\r\n");
      out.write("\tfont-size: 25px;\r\n");
      out.write("\tcolor: #589ADB;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tpadding: 0px 80px;\r\n");
      out.write("\talign: center;\r\n");
      out.write("}\r\n");
      out.write("div.itemDesc{\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tcolor: grey;\r\n");
      out.write("\tfont-family: \"Verdana\",Sans-serif;\r\n");
      out.write("\t//font-weight: bold;\r\n");
      out.write("\tpadding: 10px 20px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#F2F3F4\">\r\n");
      out.write("\t<dir id=\"body\">\r\n");
      out.write("\t\t<div id=\"category\">\r\n");
      out.write("\t\t\t<ul class=\"ulcategory\">\r\n");
      out.write("  \t\t\t\t<li class=\"ulcategory\"><a class=\"ulcategory\" href=\"index.html\">Category One</a></li>\r\n");
      out.write("  \t\t\t\t<li class=\"ulcategory\"><a class=\"ulcategory\" href=\"index.html\">Category Tow</a></li>\r\n");
      out.write("  \t\t\t\t<li class=\"ulcategory\"><a class=\"ulcategory\" href=\"index.html\">Category Three</a></li>\r\n");
      out.write("  \t\t\t\t<li class=\"ulcategory\"><a class=\"ulcategory\" href=\"index.html\">Category Four</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t&nbsp;<br>\r\n");
      out.write("\t\t\t&nbsp;\r\n");
      out.write("\t\t\t<ul class=\"ulcategory\">\r\n");
      out.write("  \t\t\t\t<li class=\"ulcategory\"><a class=\"ulcategory\" href=\"index.html\">Filter One</a></li>\r\n");
      out.write("  \t\t\t\t<li class=\"ulcategory\"><a class=\"ulcategory\" href=\"index.html\">Filter Tow</a></li>\r\n");
      out.write("  \t\t\t\t<li class=\"ulcategory\"><a class=\"ulcategory\" href=\"index.html\">Filter Three</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"container\">\r\n");
      out.write("\t\t&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <div id=\"itemHeader\"> &nbsp; &nbsp; Items List</div>\r\n");
      out.write("\t\t<div id=\"item\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("\t\t</div> &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\t\t<div id=\"item\"> \r\n");
      out.write("\t\t\t<img class=\"itemImg\" alt=\"cake one\" src=\"images/button_scotch.jpeg\" > \r\n");
      out.write("\t\t\t<div class=\"itemRate\">&#x20b9;100.00</div>\r\n");
      out.write("\t\t\t<div class=\"itemDesc\">Buttor Scotch</div>\r\n");
      out.write("\t\t</div> &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\t\t<div id=\"item\"> \r\n");
      out.write("\t\t\t<img class=\"itemImg\" alt=\"cake one\" src=\"images/black_forest.jpeg\" > \r\n");
      out.write("\t\t\t<div class=\"itemRate\">&#x20b9;100.00</div>\r\n");
      out.write("\t\t\t<div class=\"itemDesc\">Black current</div>\r\n");
      out.write("\t\t</div> &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\t\t<div id=\"item\"> \r\n");
      out.write("\t\t\t<img class=\"itemImg\" alt=\"cake one\" src=\"images/button_scotch.jpeg\" > \r\n");
      out.write("\t\t\t<div class=\"itemRate\">&#x20b9;100.00</div>\r\n");
      out.write("\t\t\t<div class=\"itemDesc\">Buttor Scotch</div>\r\n");
      out.write("\t\t</div> &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\t\t<div id=\"item\"> \r\n");
      out.write("\t\t\t<img class=\"itemImg\" alt=\"cake one\" src=\"images/black_forest.jpeg\" > \r\n");
      out.write("\t\t\t<div class=\"itemRate\">&#x20b9;100.00</div>\r\n");
      out.write("\t\t\t<div class=\"itemDesc\">Black current</div>\r\n");
      out.write("\t\t</div> &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\t\t<div id=\"item\"> \r\n");
      out.write("\t\t\t<img class=\"itemImg\" alt=\"cake one\" src=\"images/button_scotch.jpeg\" > \r\n");
      out.write("\t\t\t<div class=\"itemRate\">&#x20b9;100.00</div>\r\n");
      out.write("\t\t\t<div class=\"itemDesc\">Buttor Scotch</div>\r\n");
      out.write("\t\t</div> &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\t\t<div id=\"itemHeader\"> &nbsp; &nbsp; Items List</div>\r\n");
      out.write("\t\t<div id=\"item\"> \r\n");
      out.write("\t\t\t<img class=\"itemImg\" alt=\"cake one\" src=\"images/button_scotch.jpeg\" > \r\n");
      out.write("\t\t\t<div class=\"itemRate\">&#x20b9;100.00</div>\r\n");
      out.write("\t\t\t<div class=\"itemDesc\">Buttor Scotch</div>\r\n");
      out.write("\t\t</div> &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\t\t<div id=\"item\"> \r\n");
      out.write("\t\t\t<img class=\"itemImg\" alt=\"cake one\" src=\"images/black_forest.jpeg\" > \r\n");
      out.write("\t\t\t<div class=\"itemRate\">&#x20b9;100.00</div>\r\n");
      out.write("\t\t\t<div class=\"itemDesc\">Black current</div>\r\n");
      out.write("\t\t</div> &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\t\t<div id=\"item\"> \r\n");
      out.write("\t\t\t<img class=\"itemImg\" alt=\"cake one\" src=\"images/button_scotch.jpeg\" > \r\n");
      out.write("\t\t\t<div class=\"itemRate\">&#x20b9;100.00</div>\r\n");
      out.write("\t\t\t<div class=\"itemDesc\">Buttor Scotch</div>\r\n");
      out.write("\t\t</div> &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\t\t<div id=\"item\"> \r\n");
      out.write("\t\t\t<img class=\"itemImg\" alt=\"cake one\" src=\"images/black_forest.jpeg\" > \r\n");
      out.write("\t\t\t<div class=\"itemRate\">&#x20b9;100.00</div>\r\n");
      out.write("\t\t\t<div class=\"itemDesc\">Black current</div>\r\n");
      out.write("\t\t</div> &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\t\t<div id=\"item\"> \r\n");
      out.write("\t\t\t<img class=\"itemImg\" alt=\"cake one\" src=\"images/button_scotch.jpeg\" > \r\n");
      out.write("\t\t\t<div class=\"itemRate\">&#x20b9;100.00</div>\r\n");
      out.write("\t\t\t<div class=\"itemDesc\">Buttor Scotch</div>\r\n");
      out.write("\t\t</div> &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\t\t<div id=\"item\"> \r\n");
      out.write("\t\t\t<img class=\"itemImg\" alt=\"cake one\" src=\"images/black_forest.jpeg\" > \r\n");
      out.write("\t\t\t<div class=\"itemRate\">&#x20b9;100.00</div>\r\n");
      out.write("\t\t\t<div class=\"itemDesc\">Black current</div>\r\n");
      out.write("\t\t</div> &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\t\t<div id=\"item\"> \r\n");
      out.write("\t\t\t<img class=\"itemImg\" alt=\"cake one\" src=\"images/button_scotch.jpeg\" > \r\n");
      out.write("\t\t\t<div class=\"itemRate\">&#x20b9;100.00</div>\r\n");
      out.write("\t\t\t<div class=\"itemDesc\">Buttor Scotch</div>\r\n");
      out.write("\t\t</div> &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\t\t<div id=\"item\"> \r\n");
      out.write("\t\t\t<img class=\"itemImg\" alt=\"cake one\" src=\"images/black_forest.jpeg\" > \r\n");
      out.write("\t\t\t<div class=\"itemRate\">&#x20b9;100.00</div>\r\n");
      out.write("\t\t\t<div class=\"itemDesc\">Black current</div>\r\n");
      out.write("\t\t</div> &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</dir>\r\n");
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

  private boolean _jspx_meth_form_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fcommandName.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/views/itemCatalogue.jsp(132,2) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setCommandName("imageList");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t<div class=\"itemRate\">&#x20b9;100.00</div>\r\n");
          out.write("\t\t\t<div class=\"itemDesc\">Black currenttt</div>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fcommandName.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/itemCatalogue.jsp(133,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty imageList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_005fset_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/views/itemCatalogue.jsp(134,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("contextPath");
    // /WEB-INF/views/itemCatalogue.jsp(134,4) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/itemCatalogue.jsp(134,4) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/views/itemCatalogue.jsp(135,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/itemCatalogue.jsp(135,4) '${imageList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${imageList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/itemCatalogue.jsp(135,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("image");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<img class=\"itemImg\" alt=\"cake one\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("/index/imageDisplay?img_id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${image.img_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" > \r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
