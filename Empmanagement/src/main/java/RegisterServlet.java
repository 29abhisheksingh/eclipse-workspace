

import java.beans.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jdbc.Myjdbc;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn=null;
		//connection 
		 Myjdbc connection=new Myjdbc();
		 conn= connection.getConnection();
		//connection
		 try {
			Statement st=(Statement) conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String id = request.getParameter("Emp_id");
		String name = request.getParameter("Emp_Name");
		String sal = request.getParameter("Sal");
		
		String insertQuery="insert into Empdata(id,name,salry) values (id,name,sal)";
		st.execute(insertQuery);
		doGet(request, response);
	}

}
