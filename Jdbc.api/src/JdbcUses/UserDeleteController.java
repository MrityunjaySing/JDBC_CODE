package JdbcUses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class UserDeleteController {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Id To delete Yourself");
		int id = scanner.nextInt();

		Connection connection = null;
		try {
//	    ==================== load driver =========================================
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
//      ==================== create connection ====================================
			String url = "jdbc:mysql://localhost:3306/jspider";
			String user = "root";
			String pass = "root";

			connection = DriverManager.getConnection(url, user, pass);

//		=====================	here is create statement==========================
			Statement statement = connection.createStatement();

//		===================== here is execute query ===============================
			String deleteQuery = "delete from user WHERE id=" + id;

			int a = statement.executeUpdate(deleteQuery);

			if (a == 1) {
				System.out.println("USer PAssed Away");
			} else {
				System.out.println("id is not present");
			}
		} catch (SQLException e) {
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
