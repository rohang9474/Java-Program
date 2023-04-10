import java.io.FileWriter;
import java.io.IOException;
public class Write {

	public static void main(String[] args) {
	
		try {
			FileWriter fwrite=new FileWriter("E:FileOperationExample.txt");
			
			fwrite.write("In this file, That file is created by using File handling. now we can write file using write method");
			fwrite.close();
			System.out.println("File writing successfully");
			
		} catch (Exception e) {
			System.out.println("Unexpected error occurred");
			e.printStackTrace();
			
		}
		
		

	}

}
