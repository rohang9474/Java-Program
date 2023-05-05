import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			// Create a prepared statement object
			Statement stmt = con.createStatement();

			// Insert Multiple data
			String insert1 = "insert into info values(1,'Rohan Ghodke','rg@gmail.com','pune')";
			String insert2 = "insert into info values(2,'Rushi biradar','rb@gmail.com','latur')";
			String insert3 = "insert into info values(3,'akash rathod','ak@gmail.com','mumbai')";
			String insert4 = "insert into info values(4,'pushkar kulkarni','pk@gmail.com','nagpur')";
			stmt.addBatch(insert1);
			stmt.addBatch(insert2);
			stmt.addBatch(insert3);
			stmt.addBatch(insert4);

			stmt.executeBatch();
			System.out.println("Records inserted successfully..");

		} catch (Exception e) {
			System.out.println(e);

		}

	}

}
