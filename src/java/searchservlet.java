import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class searchservlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
        @Override
        public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        response.setContentType("text/html");


PrintWriter out = response.getWriter();
String s1=request.getParameter("search2");

if(s1.equals("Jal Mahal") | s1.equals("jal mahal") | s1.equals("jalmahal") | s1.equals("JalMahal"))
{
    RequestDispatcher rd=request.getRequestDispatcher("jalmahal.html");
                    rd.include(request,response);
}
if(s1.equals("Ranthambore") | s1.equals("ranthambore"))
{
    RequestDispatcher rd=request.getRequestDispatcher("ranthambore.html");
                    rd.include(request,response);
}
if(s1.equals("amber fort") | s1.equals("Amber Fort") | s1.equals("amberfort") | s1.equals("AmberFort") | s1.equals("amer fort") | s1.equals("Amer Fort") | s1.equals("amerfort") | s1.equals("AmerFort"))
{
    RequestDispatcher rd=request.getRequestDispatcher("amberfort.html");
                    rd.include(request,response);
}
if(s1.equals("Rishikesh") | s1.equals("rishikesh"))
{
    RequestDispatcher rd=request.getRequestDispatcher("rishikesh.html");
                    rd.include(request,response);
}if(s1.equals("Auli") | s1.equals("auli"))
{
    RequestDispatcher rd=request.getRequestDispatcher("auli.html");
                    rd.include(request,response);
}
if(s1.equals("Char Dham") | s1.equals("char dham") | s1.equals("CharDham") | s1.equals("chardham"))
{
    RequestDispatcher rd=request.getRequestDispatcher("chardham.html");
                    rd.include(request,response);
}
        }

}
    

