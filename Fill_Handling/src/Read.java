
// importing file class
import java.io.File;

// Importing Exception
import java.io.FileNotFoundException;   

// use Scanner class
import java.util.Scanner;

public class Read {

	public static void main(String[] args) {
		try {
			File fo = new File("E:FileOperationExample.txt");
			Scanner dataReader = new Scanner(fo);
			while (dataReader.hasNextLine()) {
				String fileData = dataReader.nextLine();
				System.out.println(fileData);
			}
			dataReader.close();

		} catch (FileNotFoundException e) {
			System.out.println("Unexcpected error occurred!");
			e.printStackTrace();
		}

	}

}
