package JdbcUses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UseJdbc {
	public static void main(String[] args) {
		Connection connection = null;
		try {
//	    ==================== load driver =========================================
			Class.forName("com.mysql.cj.jdbc.Driver");

//      ==================== create connection ====================================
			String url = "jdbc:mysql://localhost:3306/jspider";
			String user = "root";
			String pass = "root";

			connection = DriverManager.getConnection(url, user, pass);

//		=====================	here is create statement==========================
			Statement st = connection.createStatement();

//		===================== here is execute query ===============================
			String insertQuery = "INSERT INTO user values(4,'ram','ramy@123',9032980109)";
			st.execute(insertQuery);
			System.out.println("data inserted");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
