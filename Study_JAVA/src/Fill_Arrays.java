import java.util.Arrays;

public class Fill_Arrays {

	public static void main(String[] args) {

			int[] arr = new int[5];
			//9로 배열 생성
			Arrays.fill(arr, 9);
			System.out.println(Arrays.toString(arr));
			//random함수를 통해 배열을 생성
			Arrays.setAll(arr, (i) -> (int)(Math.random()*5)+1);
			System.out.println(Arrays.toString(arr));
	}

}
