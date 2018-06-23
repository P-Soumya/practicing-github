package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.*;

public final class clickout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> INTRODUCTION </title>\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html\"; charset=\"utf-8\">\n");
      out.write("\t\t<link rel = \"stylesheet\" href = \"mini.css\" type=\"text/css\" >\n");
      out.write("    </head>\n");
      out.write("    <script>\n");
      out.write("\t\t\tfunction is_checked()\n");
      out.write("\t\t\t{      \n");
      out.write("                               // var click=\"click\";\n");
      out.write("                  \t\tdocument.write(\"Successful\");\n");
      out.write("                                //document.write(click);\n");
      out.write("                                //document.write(ClickMe);\n");
      out.write("                        }\n");
      out.write("                        function changeColor(aColor)\n");
      out.write("                        {\n");
      out.write("                            if(aColor)\n");
      out.write("                            {\n");
      out.write("                                chromaImg.filters(\"chroma\").enabled=true;\n");
      out.write("                                chromaImg.filters(\"chroma\").color=aColor;\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("    </script>\n");
      out.write("    <body>\n");
      out.write("\t\n");
      out.write("        ");
 
               String click = request.getParameter("clickme");
               String ClickMe = "ClickMe";
                
                
               if(click != null)
               {
                    //out.println("successful");
                    //out.println(click);
                    //out.println(ClickMe);
                    
                
        
      out.write(" \n");
      out.write("           \t\n");
      out.write("        \n");
      out.write("                                        <!-- <form style=\"filter: chroma\">\n");
      out.write("                                                <input type=\"button\" id=\"chromaImg\" value=\"Click out\" onclick=\"changeColor(white)\"/>\n");
      out.write("\t\t\t\t\t\t<br/>\n");
      out.write("\t\t\t\t\t\t<br/>\n");
      out.write("\t\t\t\t\t\t<br/>\n");
      out.write("\t\t\t\t\t\t<br/>\n");
      out.write("                                        </form> -->\n");
      out.write("                                        <form>\n");
      out.write("                                                <input type=\"hidden\" id=\"clickout\" value=\"Click out\" onclick=\"is_checked()\"/>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("            \n");
      out.write("                                        </form>\n");
      out.write("                                        <form> \n");
      out.write("                                            <input type=\"button\" value=\"clickme\"  onmouseout=\"document.getElementById('clickout').click()\" onmouseout=\"document.getElementById('clickout').click()\"/>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</form> \n");
      out.write("        ");

                       
                }
                else
                {
                   //out.println("failure");
                   //out.println(click);
                   //out.println(ClickMe);
        
      out.write("\n");
      out.write("            \n");
      out.write("        <form>\n");
      out.write("            <input type=\"button\" id=\"clickout\" value=\"Click out\" onclick=\"is_checked()\"/>\n");
      out.write("\t\t\t\t\t\t<br/>\n");
      out.write("\t\t\t\t\t\t<br/>\n");
      out.write("\t\t\t\t\t\t<br/>\n");
      out.write("\t\t\t\t\t\t<br/>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("        ");

                       
                }
        
      out.write("   \n");
      out.write("\t</body>\n");
      out.write("        \n");
      out.write("</html>");
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
