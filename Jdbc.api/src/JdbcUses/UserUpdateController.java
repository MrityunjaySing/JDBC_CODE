package JdbcUses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserUpdateController {

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
			Statement statement = connection.createStatement();

//		===================== here is execute query ===============================
			String updateQuery = "update  user set name ='mrityunjay singh' WHERE id =3";
			int id = statement.executeUpdate(updateQuery);
			if (id != 0) {
				System.out.println("data is updated");
			} else {
				System.out.println("id is not present");
			}
			System.out.println("data is updated");
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
