import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			// create a qurey
			String q = "create table info(ID int(20) primary key auto_increment, Name varchar(20) not Null, Email varchar(20), City varchar(20))";

			// Create a prepared statement object
			Statement stml = con.createStatement();

			stml.executeUpdate(q);
			System.out.println("table created in database...");

			con.close();

		} catch (Exception e) {

		}

	}

}
