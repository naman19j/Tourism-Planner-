import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RANfood3 extends HttpServlet {

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
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
PrintWriter out = response.getWriter();
Statement stmt=conn.createStatement();
String s1=request.getParameter("sn1");
int sn1=Integer.parseInt(s1);
String s2=request.getParameter("sn2");
int sn2=Integer.parseInt(s2);
String s3=request.getParameter("sn3");
int sn3=Integer.parseInt(s3);
String s4=request.getParameter("sn4");
int sn4=Integer.parseInt(s4);
String s5=request.getParameter("sn5");
int sn5=Integer.parseInt(s5);
String s6=request.getParameter("sn6");
int sn6=Integer.parseInt(s6);
String s7=request.getParameter("sn7");
int sn7=Integer.parseInt(s7);
String s8=request.getParameter("sn8");
int sn8=Integer.parseInt(s8);

int amount=sn1*199 + sn2*195 + sn3*169 + sn4*45 + sn5*39 + sn6*179 + sn7*19 + sn8*155;
out.println("<!DOCTYPE html>\n" +
"<html>\n" +
"<head>\n" +
"    <title>Payment Gateway</title>\n" +
"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n" +
"<style>\n" +
"body {\n" +
"  font-family: Arial;\n" +
"  font-size: 17px;\n" +
"  padding: 8px;\n" +
"}\n" +
"\n" +
"* {\n" +
"  box-sizing: border-box;\n" +
"}\n" +
"\n" +
".row {\n" +
"  display: -ms-flexbox; /* IE10 */\n" +
"  display: flex;\n" +
"  -ms-flex-wrap: wrap; /* IE10 */\n" +
"  flex-wrap: wrap;\n" +
"  margin: 0 -16px;\n" +
"}\n" +
"\n" +
".col-25 {\n" +
"  -ms-flex: 25%; /* IE10 */\n" +
"  flex: 25%;\n" +
"}\n" +
"\n" +
".col-50 {\n" +
"  -ms-flex: 50%; /* IE10 */\n" +
"  flex: 50%;\n" +
"}\n" +
"\n" +
".col-75 {\n" +
"  -ms-flex: 75%; /* IE10 */\n" +
"  flex: 75%;\n" +
"}\n" +
"\n" +
".col-25,\n" +
".col-50,\n" +
".col-75 {\n" +
"  padding: 0 16px;\n" +
"}\n" +
"\n" +
".container {\n" +
"  background-color: #f2f2f2;\n" +
"  padding: 5px 20px 15px 20px;\n" +
"  border: 1px solid lightgrey;\n" +
"  border-radius: 3px;\n" +
"}\n" +
"\n" +
"input[type=text] {\n" +
"  width: 100%;\n" +
"  margin-bottom: 20px;\n" +
"  padding: 12px;\n" +
"  border: 1px solid #ccc;\n" +
"  border-radius: 3px;\n" +
"}\n" +
"\n" +
"label {\n" +
"  margin-bottom: 10px;\n" +
"  display: block;\n" +
"}\n" +
"\n" +
".icon-container {\n" +
"  margin-bottom: 20px;\n" +
"  padding: 7px 0;\n" +
"  font-size: 24px;\n" +
"}\n" +
"\n" +
".btn {\n" +
"  background-color: #04AA6D;\n" +
"  color: white;\n" +
"  padding: 12px;\n" +
"  margin: 10px 0;\n" +
"  border: none;\n" +
"  width: 100%;\n" +
"  border-radius: 3px;\n" +
"  cursor: pointer;\n" +
"  font-size: 17px;\n" +
"}\n" +
"\n" +
".btn:hover {\n" +
"  background-color: #45a049;\n" +
"}\n" +
"\n" +
"a {\n" +
"  color: #2196F3;\n" +
"}\n" +
"\n" +
"hr {\n" +
"  border: 1px solid lightgrey;\n" +
"}\n" +
"\n" +
"span.price {\n" +
"  float: right;\n" +
"  color: grey;\n" +
"}\n" +
"\n" +
"/* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other (also change the direction - make the \"cart\" column go on top) */\n" +
"@media (max-width: 800px) {\n" +
"  .row {\n" +
"    flex-direction: column-reverse;\n" +
"  }\n" +
"  .col-25 {\n" +
"    margin-bottom: 20px;\n" +
"  }\n" +
"}\n" +
"</style>\n" +
"</head>\n" +
"<body style=\"background-image: url(projectback.jpg);\n" +
"  background-repeat: no-repeat;\n" +
"  background-size: cover;\n" +
"  background-attachment: fixed; text-align:center\">\n" +
        "<h2 style=\"text-align:center\">The Total Amount is "+amount+"/-</h2>"+
"<div class=\"row\">\n" +
"  <div class=\"col-75\">\n" +
"    <div class=\"container\">\n" +
"      <form action=\"restcnfm.html\">\n" +
"      \n" +
"        <div class=\"row\">\n" +
"          <div class=\"col-50\">\n" +
"            <h3>Billing Address</h3>\n" +
"            <label for=\"fname\"><i class=\"fa fa-user\"></i> Full Name</label>\n" +
"            <input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=\"Enter first name...\">\n" +
"            <label for=\"email\"><i class=\"fa fa-envelope\"></i> Email</label>\n" +
"            <input type=\"text\" id=\"email\" name=\"email\" placeholder=\"Enter E-Mail ID...\">\n" +
"            <label for=\"adr\"><i class=\"fa fa-address-card-o\"></i> Address</label>\n" +
"            <input type=\"text\" id=\"adr\" name=\"address\" placeholder=\"Enter address...\">\n" +
"            <label for=\"city\"><i class=\"fa fa-institution\"></i> City</label>\n" +
"            <input type=\"text\" id=\"city\" name=\"city\" placeholder=\"Enter city...\">\n" +
"\n" +
"            <div class=\"row\">\n" +
"              <div class=\"col-50\">\n" +
"                <label for=\"state\">State</label>\n" +
"                <input type=\"text\" id=\"state\" name=\"state\" placeholder=\"Enter state...\">\n" +
"              </div>\n" +
"              <div class=\"col-50\">\n" +
"                <label for=\"zip\">Zip</label>\n" +
"                <input type=\"text\" id=\"zip\" name=\"zip\" placeholder=\"10001\">\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"\n" +
"          <div class=\"col-50\">\n" +
"            <h3>Payment</h3>\n" +
"            <label for=\"fname\">Accepted Cards</label>\n" +
"            <div class=\"icon-container\">\n" +
"              <i class=\"fa fa-cc-visa\" style=\"color:navy;\"></i>\n" +
"              <i class=\"fa fa-cc-amex\" style=\"color:blue;\"></i>\n" +
"              <i class=\"fa fa-cc-mastercard\" style=\"color:red;\"></i>\n" +
"              <i class=\"fa fa-cc-discover\" style=\"color:orange;\"></i>\n" +
"            </div>\n" +
"            <label for=\"cname\">Name on Card</label>\n" +
"            <input type=\"text\" id=\"cname\" name=\"cardname\" placeholder=\"Enter name...\">\n" +
"            <label for=\"ccnum\">Card number</label>\n" +
"            <input type=\"text\" id=\"ccnum\" name=\"cardnumber\" placeholder=\"Enter card number...\">\n" +
"            <label for=\"expmonth\">Exp Month</label>\n" +
"            <input type=\"text\" id=\"expmonth\" name=\"expmonth\" placeholder=\"Enter expiry month...\">\n" +
"            <div class=\"row\">\n" +
"              <div class=\"col-50\">\n" +
"                <label for=\"expyear\">Exp Year</label>\n" +
"                <input type=\"text\" id=\"expyear\" name=\"expyear\" placeholder=\"Enter expiry year...\">\n" +
"              </div>\n" +
"              <div class=\"col-50\">\n" +
"                <label for=\"cvv\">CVV</label>\n" +
"                <input type=\"text\" id=\"cvv\" name=\"cvv\" placeholder=\"Enter CVV...\">\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"          \n" +
"        </div>\n" +
"        <label>\n" +
"          <input type=\"checkbox\" checked=\"checked\" name=\"sameadr\"> Shipping address same as billing\n" +
"        </label>\n" +
"        <input type=\"submit\" value=\"Continue to checkout\" class=\"btn\">\n" +
"      </form>\n" +
"    </div>\n" +
"  </div>");
}catch( SQLException | ClassNotFoundException ex )
{
Logger.getLogger(RANfood3.class.getName()).log(Level.SEVERE, null, ex);
}
}
}