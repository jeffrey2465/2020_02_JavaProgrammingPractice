package sec02_abstractmodifier.EX02;

//�߻�Ŭ����/�߻�޼��� ����ϴ� ��� 
abstract class Animal {
	abstract void cry();
}

class Cat extends Animal {
	void cry() {
		System.out.println("�߿�");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("�۸�");
	}
}

//abstract class B {
//	void bcd() {}
//}

public class AbstractModifier_2 {
	public static void main(String[] args) {
		//#1. ��ü����
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		//#2. �޼��� ȣ��
		animal1.cry(); //�߿�
		animal2.cry(); //�۸�
	}
}
