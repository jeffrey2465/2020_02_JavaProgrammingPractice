package sec05_inheritanceofgeneric.EX02;

class Parent {
	<T extends Number> void print(T t) {
		System.out.println(t);
	}
}

class Child extends Parent {
	
}

public class InheritanceGenericMethod {
	public static void main(String[] args) {
		
		//#1. �θ�Ŭ���� ���׸��޼��� �̿�
		Parent p = new Parent();
		p.<Integer>print(10);
		p.print(10);
		
		//#2. �ڽ�Ŭ���� ���׸��޼��� �̿�
		Child c = new Child();
		c.<Integer>print(10);
		c.print(10);
	}
}
