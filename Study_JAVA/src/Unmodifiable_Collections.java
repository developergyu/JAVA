import java.util.*;

public class Unmodifiable_Collections {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();  
        Collections.addAll(list, "A", "B", "C");  
        List<String> list2 = Collections.unmodifiableList(list); 
        //unmodifiableList 메서드 이후에 출력 값
        System.out.println("Unmodifiable List: " + list2);  
        //unmodifiableList 메서드 이후에 add하므로 오류발생
        list2.add("D");   
	}
}
