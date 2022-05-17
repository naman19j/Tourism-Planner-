import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class loginservlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
        @Override
        public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        response.setContentType("text/html");
final String JDBC_DRIVER="com.mysql.jdbc.Driver";
final String DB_URL="jdbc:mysql://localhost:3306/ajp";
final String USER="root";
final String PASS="root";
String title;
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
PrintWriter out = response.getWriter();
Statement stmt=conn.createStatement();
String s1=request.getParameter("ID");
String s2=request.getParameter("password");


ResultSet rs=stmt.executeQuery("select * from signup where uname='"+s1+"' and pass='"+s2+"'");
if("admin".equals(s1) && "admin@123".equals(s2)){
    RequestDispatcher req=request.getRequestDispatcher("admin.html");
    req.include(request, response);
}

else if(rs.next())
{
    RequestDispatcher req=request.getRequestDispatcher("profilePage.html");
    req.include(request, response);
    
}
else
{
    out.println("<script>alert('Invalid Credentials, please try again!')</script>");
    RequestDispatcher req=request.getRequestDispatcher("login.html");
    req.include(request,response);
}


}catch( SQLException | ClassNotFoundException ex )
{
Logger.getLogger(loginservlet.class.getName()).log(Level.SEVERE, null, ex);
}
}
}
    

