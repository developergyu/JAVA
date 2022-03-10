
public class Instanceof {

	public static void main(String[] args) {
		
		Car c = new Car();
		FireEngine fe = new FireEngine();
		doWork(c, fe);
	}
	
	public static void doWork(Car c, FireEngine fe)
	{
		//c는 FireEngine의 부모임
		System.out.println(c instanceof FireEngine);
		//fe는 Car에 자식임.
		System.out.println(fe instanceof Car);
	}
}

class Car
{
	String color;
	int door;
}

class FireEngine extends Car
{
	void water()
	{
		
	}
}