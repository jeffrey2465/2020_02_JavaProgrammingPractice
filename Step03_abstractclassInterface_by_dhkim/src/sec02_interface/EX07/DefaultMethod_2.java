package sec02_interface.EX07;

interface A {
	default void abc() {
		System.out.println("A �������̽��� abc()");
	}
}

class B implements A {
	public void abc() {
		A.super.abc();	//super.abc() �̰� �θ�Ŭ������  abc() �޼��� ȣ���϶� �Ҹ�	
		System.out.println("B Ŭ������ abc()");		
	}
}


public class DefaultMethod_2 {
	public static void main(String[] args) {
		//#1. ��ü����
		B b = new B();
		
		//#2. �޼��� ȣ��
		b.abc(); //A �������̽��� abc() B Ŭ������ abc()
	}
}
