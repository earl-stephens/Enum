package application;

public class App {

	public static void main(String[] args) {
		/* Enum is a top level type in Java
		 * Designed for when you have a list of almost
		 * identical things, like colors
		 */
		Fruit fruit1 = Fruit.APPLE;
		Fruit fruit2 = Fruit.ORANGE;
		
		System.out.println(fruit1 == fruit2);
		
		Fruit fruit3 = Fruit.BANANA;
		Fruit fruit4 = Fruit.BANANA;
		
		System.out.println(fruit3 == fruit4);
	}

}
