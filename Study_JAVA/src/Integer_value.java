
public class Integer_value {

	public static void main(String[] args) {
		
		//���� "100" -> ���� 100���� ��ȯ
		int i = Integer.parseInt("100"); 
		int i2 = Integer.valueOf("100");
		
		//���� -> ���ڷ� ��ȯ		
		int num = 100;
		String str1 = num + "";
		String str2 = String.valueOf(num);
	}
}
