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
public class bookcnfm extends HttpServlet {

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
String s1=request.getParameter("email");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
                Statement stmt=conn.createStatement();
                PrintWriter out=response.getWriter();
                ResultSet rs=stmt.executeQuery("select name,email,phone,arrive,depart,people,bedding from bookdetails where email='"+s1+"'");
                while(rs.next()){    
                String n1=rs.getString("name");
                    String n2=rs.getString("email");
                    String n3=rs.getString("phone");
                    String n4=rs.getString("arrive");
                    String n5=rs.getString("depart");
                    String n6=rs.getString("people");
                    String n7=rs.getString("bedding");
                    out.println("<!DOCTYPE html>\n" +
"<!--\n" +
"To change this license header, choose License Headers in Project Properties.\n" +
"To change this template file, choose Tools | Templates\n" +
"and open the template in the editor.\n" +
"-->\n" +
"<html>\n" +
"    <head>\n" +
"        <title>Booking Details Confirmation</title>\n" +
"    </head>\n" +
"    <style>\n" +
"        .topnav {\n" +
"    background-color: #333;\n" +
"    overflow: hidden;\n" +
"  }\n" +
"  \n" +
"  /* Style the links inside the navigation bar */\n" +
"  .topnav a {\n" +
"    float: left;\n" +
"    color: #f2f2f2;\n" +
"    text-align: center;\n" +
"    padding: 14px 16px;\n" +
"    text-decoration: none;\n" +
"    font-size: 17px;\n" +
"  }\n" +
"  \n" +
"  /* Change the color of links on hover */\n" +
"  .topnav a:hover {\n" +
"    background-color: #ddd;\n" +
"    color: black;\n" +
"  }\n" +
"  \n" +
"  /* Add a color to the active/current link */\n" +
"  .topnav a.active {\n" +
"    background-color: #04AA6D;\n" +
"    color: white;\n" +
"  }\n" +
"   h4{\n" +
"    text-align: center;\n" +
"  }\n" +
"  fieldset {\n" +
"  background-color: #eeeeee;\n" +
"}\n" +
"\n" +
"legend {\n" +
"  background-color: white;\n" +
"  color: darkblue;\n" +
"  padding: 5px 10px;\n" +
"  border: 1px solid black;\n" +
"  font-weight:bold;\n" +
"  font-family: Georgia\n" +
"}\n" +
"label{\n" +
"    color:darkblue;\n" +
"    font-weight:bold;\n" +
"    font-family: Georgia\n" +
"}\n" +
"    </style>\n" +
"    <body style=\"background-image: url(projectback.jpg);\n" +
"  background-repeat: no-repeat;\n" +
"  background-size: cover;\n" +
"  background-attachment: fixed;\">\n" +
"        \n" +
"        <div class=\"topnav\">\n" +
"            <a class=\"active\" href=\"profilePage.html\">Go Back</a>\n" +
"      </div>\n" +
"        <h4><center>\n" +
"          <img style=\"border-radius:50%;width:15%\" src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9caYDMJ2nqtVibErc90LGCP3mQ9UcyfbXXg&usqp=CAU\" alt=\"Tick Mark\">\n" +
"          </center></h4>\n" +
"      \n" +
"      <h1 style=\"text-align: center; color:lightseagreen\"><u>Your Booking has been confirmed</u></h1>\n" +
"       <fieldset>\n" +
"           <legend>Booking Details</legend><br>\n" +
"  <label for=\"name\">Name: "+n1+"</label><br><br>\n" +
"  <label for=\"email\">Email ID: "+n2+"</label><br><br>\n" +
"  <label for=\"phone\">Phone: "+n3+"</label><br><br>\n" +
"  <label for=\"arrive\">Arrival Date: "+n4+"</label><br><br>\n" +
"  <label for=\"depart\">Departure Date: "+n5+"</label><br><br>\n" +
"  <label for=\"people\">No. of People: "+n6+"</label><br><br>\n" +
"    <label for=\"bedding\">Type of Bedding: "+n7+"</label><br><br>\n" +
"\n" +
"       </fieldset>\n" +
"    </body>\n" +
"</html>\n" +
"");
                }
                }catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(bookcnfm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
        
