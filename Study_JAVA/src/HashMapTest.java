import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put("Key1", "value1");
		map.put("Key2", "value2");
		map.put("Key3", "value3");
		
		//key, value 전체출력
		System.out.println(map);
		//key값을 통해서 value 출력
		System.out.println(map.get("Key1"));
		//value값을 통해서 찾으면 null
		System.out.println(map.get("value1"));

	}

}
