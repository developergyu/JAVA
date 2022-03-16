import java.io.File;
import java.util.Arrays;

public class ToString {

	public static void main(String[] args) {

		String s = "Hello";
		String s1 = s.toString();
		File file = new File("D\\TEST");
		int[] arr = {0,1,2,3,4};
				
		
		System.out.println(s1);
		System.out.println(file.toString());
		System.out.println(arr.toString());
	}

}
