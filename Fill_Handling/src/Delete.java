 // import File class
import java.io.File;
public class Delete {

	public static void main(String[] args) {
		File fo=new File("E:FileCreate.txt");
		
		if(fo.delete())
		{
			System.out.println(fo.getName()+" File is Delete successfully");
		}
		else
		{
			System.out.println("Unexpected error found in deletion of the file.");
		}
		

	}

}
