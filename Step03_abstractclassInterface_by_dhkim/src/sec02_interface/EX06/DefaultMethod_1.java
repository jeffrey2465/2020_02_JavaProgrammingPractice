package sec02_interface.EX06;

interface A { 
	void abc(); //2020�� ����
	default void bcd() {
		System.out.println("A �������̽��� bcd()");
	} //2030�� ����
}

class B implements A { //2020�� ����
	public void abc() { 
		System.out.println("B Ŭ������ abc()");
	}
}

class C implements A {
	public void abc() {
		System.out.println("C Ŭ������ abc()");
	}
	public void bcd() {
		System.out.println("C Ŭ������ bcd()");
	}
}

public class DefaultMethod_1 {
	public static void main(String[] args) {
		//#1. ��ü ����
		A a1 = new B();
		A a2 = new C();		
		
		//#2. �޼��� ȣ��
		a1.abc(); //B Ŭ������ abc()
		a1.bcd(); //A �������̽��� bcd()
		
		a2.abc(); //C Ŭ������ abc()
		a2.bcd(); //C Ŭ������ bcd()
	}
}



























