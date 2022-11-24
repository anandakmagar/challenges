package assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDataInput {
	public static void main(String[] args) {
		try {
			// Registering the mysql jdbc driver
			Class.forName("com.mysql.jdbc.Driver");
			// Creating the connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8", "root", "root");
			// Creating the preparedStatement
			PreparedStatement pstmt = connection.prepareStatement("insert into batch63.employee values(?, ?)");
			// Creating scanner object
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the id");
			pstmt.setInt(1, scanner.nextInt());
			scanner.nextLine();
			System.out.println("Enter the name");
			pstmt.setString(2, scanner.nextLine());
			
			int i = pstmt.executeUpdate();
			System.out.println(i + " record has been inserted");
			
			pstmt.close(); connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
