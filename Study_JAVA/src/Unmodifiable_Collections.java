import java.util.*;

public class Unmodifiable_Collections {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();  
        Collections.addAll(list, "A", "B", "C");  
        List<String> list2 = Collections.unmodifiableList(list); 
        //unmodifiableList �޼��� ���Ŀ� ��� ��
        System.out.println("Unmodifiable List: " + list2);  
        //unmodifiableList �޼��� ���Ŀ� add�ϹǷ� �����߻�
        list2.add("D");   
	}
}
