package Conec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
	
	public Connection getConnection() throws ClassNotFoundException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/distribuidos", "root", "");
			} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}