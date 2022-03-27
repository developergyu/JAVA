import java.util.*;

public class Singleton_Test {

	public static void main(String[] args) {
		
		List<String> list = Collections.singletonList("A");
        //singletonList 메서드 이후에 출력 값
        System.out.println("singletonList List: " + list);  
        //singletonList 메서드 이후에 add하므로 오류발생
        list.add("D");   
	}
}
