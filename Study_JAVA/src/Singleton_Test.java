import java.util.*;

public class Singleton_Test {

	public static void main(String[] args) {
		
		List<String> list = Collections.singletonList("A");
        //singletonList �޼��� ���Ŀ� ��� ��
        System.out.println("singletonList List: " + list);  
        //singletonList �޼��� ���Ŀ� add�ϹǷ� �����߻�
        list.add("D");   
	}
}
