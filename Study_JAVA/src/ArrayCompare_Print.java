import java.util.Arrays;

public class ArrayCompare_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,3,4};
		int[] arr2 = {0,1,2,3,4};
		int[][] arr2D = {{11,12},{21,22}};
		int[][] arr2D2 = {{11,12},{21,22}};
		
		//1차원 배열 출력 시
		System.out.println("1차원 배열 출력 : " + Arrays.toString(arr));
		//n차원 배열 출력 시
		System.out.println("n차원 배열 출력 : " + Arrays.deepToString(arr2D));
		
		//순서가 다를땐 sort하면 같은 값으로 나옴
		//Arrays.sort(arr2);
		//1차원 배열 비교
		System.out.println("1차원 배열 비교 : " + Arrays.equals(arr, arr2));
		//n차원 배열 비교
		System.out.println("n차원 배열 비교 : " + Arrays.deepEquals(arr2D, arr2D2));
	}

}
