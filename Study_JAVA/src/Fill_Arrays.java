import java.util.Arrays;

public class Fill_Arrays {

	public static void main(String[] args) {

			int[] arr = new int[5];
			//9�� �迭 ����
			Arrays.fill(arr, 9);
			System.out.println(Arrays.toString(arr));
			//random�Լ��� ���� �迭�� ����
			Arrays.setAll(arr, (i) -> (int)(Math.random()*5)+1);
			System.out.println(Arrays.toString(arr));
	}

}
