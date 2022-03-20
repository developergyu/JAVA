import java.util.*;

public class Iterator_Test {

public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println("while문 사용 : " + obj);
		}
		
		for(int i = 0; i < list.size(); i++)
		{
			Object obj = list.get(i);
			System.out.println("for문 사용 : " + obj);
		}
		

	}

}
