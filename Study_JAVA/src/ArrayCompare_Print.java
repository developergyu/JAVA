import java.util.Arrays;

public class ArrayCompare_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,3,4};
		int[] arr2 = {0,1,2,3,4};
		int[][] arr2D = {{11,12},{21,22}};
		int[][] arr2D2 = {{11,12},{21,22}};
		
		//1���� �迭 ��� ��
		System.out.println("1���� �迭 ��� : " + Arrays.toString(arr));
		//n���� �迭 ��� ��
		System.out.println("n���� �迭 ��� : " + Arrays.deepToString(arr2D));
		
		//������ �ٸ��� sort�ϸ� ���� ������ ����
		//Arrays.sort(arr2);
		//1���� �迭 ��
		System.out.println("1���� �迭 �� : " + Arrays.equals(arr, arr2));
		//n���� �迭 ��
		System.out.println("n���� �迭 �� : " + Arrays.deepEquals(arr2D, arr2D2));
	}

}
