import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put("Key1", "value1");
		map.put("Key2", "value2");
		map.put("Key3", "value3");
		
		//key, value ��ü���
		System.out.println(map);
		//key���� ���ؼ� value ���
		System.out.println(map.get("Key1"));
		//value���� ���ؼ� ã���� null
		System.out.println(map.get("value1"));

	}

}
