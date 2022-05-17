import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class signupservlet extends HttpServlet {

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
String s1=request.getParameter("fname");
String s2=request.getParameter("lname");
String s3=request.getParameter("email");
String s4=request.getParameter("phone");
String s5=request.getParameter("uname");
String s6=request.getParameter("pass");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
                Statement stmt=conn.createStatement();
                PrintWriter out=response.getWriter();
                ResultSet rs=stmt.executeQuery("select * from signup where email='"+s3+"'");
                if(rs.next())
                {
                    out.println("<html>");
                    out.println("<script>alert('There is already an existing account with this E-Mail ID')</script>");
                    out.println("</html>");
                    response.sendRedirect("signup.html");
                }
                else{
                stmt.executeUpdate("insert into signup values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"')");
                response.sendRedirect("login.html");
                }
                
                }catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(signupservlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}