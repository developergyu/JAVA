
public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str  = "abc";
		String str2 = "Abc";
		
		//�Ϲ� ���ڿ� ��
		System.out.println(" == : " + str == str2);
		//��ҹ��� �����ؼ� ��
		System.out.println("equals : " + str.equals(str2));
		//��ҹ��� �����ؼ� ��
		System.out.println("equalsIgnoreCase : " + str.equalsIgnoreCase(str2));
	}

}
