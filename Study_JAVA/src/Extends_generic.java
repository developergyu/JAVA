class Fruit{
	public String toString() {return "Fruit";}
}

class Apple extends Fruit {public String toString() {return "Apple";}}
class Grape extends Fruit {public String toString() {return "Grape";}}
class Toy  				  {public String toString() {return "Toy";}}

public class Extends_generic {

	public static void main(String[] args) {

		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		
		//Fruit Class의 자손
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		
		//FruitBox는 Fruit Class의 자손까지만 타입으로 지정가능.
		//FruitBox<Toy> toyBox = new FruitBox<Toy>();
	}

}

class FruitBox<T extends Fruit>{}
