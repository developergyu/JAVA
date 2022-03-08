public class Parent_Super {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class Parent {int x = 10;}

class Child extends Parent
{
	int x = 20;
	
	void method()
	{
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		//C#에 base와 같은 의미
		System.out.println("super.x = " + super.x);
	}
}
