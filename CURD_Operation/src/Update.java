import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			// create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			// Create a prepared statement object
			Statement stmt = con.createStatement();
			String sql = "UPDATE info SET city = 'Nashik' WHERE ID in (1, 3)";
			

			stmt.executeUpdate(sql);
			System.out.println("Record Updated successfully..");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
