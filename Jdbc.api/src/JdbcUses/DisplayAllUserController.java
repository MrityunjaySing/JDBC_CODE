package JdbcUses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayAllUserController {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			// step-1 Load or register driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step-2 Create Connection

			String url = "jdbc:mysql://localhost:3306/jspider";
			String user = "root";
			String pass = "root";

			connection = DriverManager.getConnection(url, user, pass);

			// step-3 create statement

			Statement statement = connection.createStatement();

			// step-4 execute Query
			String displayAllUserQuery = "SELECT * FROM user where id=3";

			ResultSet resultSet = statement.executeQuery(displayAllUserQuery);

			System.out.println("@@@@@@@@@@@@@@---DATA---@@@@@@@@@@@@@@");
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");
				long phone = resultSet.getLong("phone");

				System.out.println("id = " + id);
				System.out.println("name = " + name);
				System.out.println("email = " + email);
				System.out.println("phone = " + phone);
				System.out.println("@@@@@@@@@@@@@@---DATA---@@@@@@@@@@@@@@");
			}

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
