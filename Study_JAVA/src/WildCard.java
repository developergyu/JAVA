import java.util.*;

class Fruit2				{public String toString() {return "Fruit";}}
class Apple2 extends Fruit2 {public String toString() {return "Apple";}}
class Grape2 extends Fruit2 {public String toString() {return "Grape";}}

class Juicer{
	//와일드 카드의 상한 제한 Fruit2와 그 자손들만 가능
	static Juice makeJuice(FruitBox2<? extends Fruit2> box)
	{
		String tmp = "";
		
		for(Fruit2 f : box.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
}

class Juice{
	String name;
	
	Juice(String name){this.name = name + "Juice";}
	public String toString() {return name;}
}

public class WildCard {

	public static void main(String[] args) {
		
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));

	}
}

class FruitBox2<T extends Fruit2> extends Box<T>{}

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) 			{list.add(item);}
	T get(int i) 				{return list.get(i);}
	ArrayList<T> getList() 		{return list;}
    int size() 				    {return list.size();}
	public String toString() 	{return list.toString();}
}

	