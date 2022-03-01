
public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str  = "abc";
		String str2 = "Abc";
		
		//일반 문자열 비교
		System.out.println(" == : " + str == str2);
		//대소문자 구분해서 비교
		System.out.println("equals : " + str.equals(str2));
		//대소문자 무시해서 비교
		System.out.println("equalsIgnoreCase : " + str.equalsIgnoreCase(str2));
	}

}
