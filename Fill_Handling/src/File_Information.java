import java.io.File;

public class File_Information {

	public static void main(String[] args) {

		File fo = new File("E:FileOperationExample.txt");

		if (fo.exists()) {
			
			//File name by using obj.getName() method
			System.out.println("The name of the file: "+fo.getName());
			
			// File path by using obj.getAbsolutePath() method
			System.out.println("File path is: "+fo.getAbsolutePath());
			
			// Checking whether the file is writable or not using obj.canWrite() method
			System.out.println("The file is writable: "+fo.canWrite());
			
			// Checking whether the file is Readable or not using obj,canRead() method
			System.out.println("The file is readable: "+fo.canRead());
			
			// Getting the length of file in byte using obj.length() method
			System.out.println("File length is: "+fo.length());
			}
		
		else {
			System.out.println("File does not Exist");
		}

	}

}
