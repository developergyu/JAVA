
public class Integer_value {

	public static void main(String[] args) {
		
		//문자 "100" -> 숫자 100으로 변환
		int i = Integer.parseInt("100"); 
		int i2 = Integer.valueOf("100");
		
		//숫자 -> 문자로 변환		
		int num = 100;
		String str1 = num + "";
		String str2 = String.valueOf(num);
	}
}
