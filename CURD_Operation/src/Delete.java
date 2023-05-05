import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			String sql = "DELETE FROM info WHERE id = ?";

			// Create a prepared statement object
			PreparedStatement pstmt = con.prepareStatement(sql);

			// Set the value for the condition parameter
			pstmt.setInt(1, 4);

			// Execute the query
			int rowsDeleted = pstmt.executeUpdate();

			System.out.println(rowsDeleted + " rows deleted.");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
