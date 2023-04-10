import java.io.File;
import java.io.IOException;
public class Create {

	public static void main(String[] args) {
		File fo=new File("E:FileCreate.txt");
		try {
			if(fo.createNewFile())
			{
				System.out.println("File "+fo+" create Susseccfully");
			}
			else {
				System.out.println("File Alredy exist");
			}
			
		} catch (IOException e) {
			System.out.println("An unexpected error is occurred.");
			e.printStackTrace();
			
			
		}


	}

}
