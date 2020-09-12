package sec02_abstractmodifier.EX02;

//Ãß»óÅ¬·¡½º/Ãß»ó¸Þ¼­µå »ç¿ëÇÏ´Â °æ¿ì 
abstract class Animal {
	abstract void cry();
}

class Cat extends Animal {
	void cry() {
		System.out.println("¾ß¿Ë");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("¸Û¸Û");
	}
}

//abstract class B {
//	void bcd() {}
//}

public class AbstractModifier_2 {
	public static void main(String[] args) {
		//#1. °´Ã¼»ý¼º
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		//#2. ¸Þ¼­µå È£Ãâ
		animal1.cry(); //¾ß¿Ë
		animal2.cry(); //¸Û¸Û
	}
}
