package Pack;

// 1)Using packagename.*
import Mypack.*;

// 2)Using packagename.classname
import Mypack.MyclassA;

public class MyclassB {

	public static void main(String[] args) {
		/*
		 * MyclassA obj=new MyclassA(); obj.display();
		 */

		// 3) Using fully qualified name
		Mypack.MyclassA obj = new Mypack.MyclassA();
		obj.display();

	}

}
