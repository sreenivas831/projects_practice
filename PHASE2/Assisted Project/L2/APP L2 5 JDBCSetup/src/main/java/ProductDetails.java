
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Afzalecommerce.DBConnection;


@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
           InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
           Properties props = new Properties();
           props.load(in);
           
           
           DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
           Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
           stmt.executeUpdate("insert into eproduct (name, price, date_added) values ('Iron box', 2800.00, now())");
           out.println("<h2>Executed an insert operation Iron box</h32>");

           stmt.executeUpdate("update eproduct set price=2000 where name = 'Iron box'");
           out.println("<h2>Executed an update operation update</h2><br>");
           
           
           stmt.executeUpdate("delete from eproduct where name = 'Iron box'");
           out.println("<h2>Executed a delete operation</h2><br>");
          
           
           stmt.close();
           
           conn.closeConnection();
           
           
           out.println("</body></html>");
           conn.closeConnection();
           
   } catch (ClassNotFoundException e) {
           e.printStackTrace();
   } catch (SQLException e) {
           e.printStackTrace();
   }
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
