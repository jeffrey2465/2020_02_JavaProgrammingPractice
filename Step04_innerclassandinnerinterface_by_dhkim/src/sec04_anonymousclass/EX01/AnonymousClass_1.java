package sec04_anonymousclass.EX01;

class A {
	C c = new B();
	
	void abc() {
		c.bcd();
	}
	
	class B implements C {
		public void bcd() {
			System.out.println("�ν��Ͻ� �̳�Ŭ����");			
		}
	}
}

interface C {
	public abstract void bcd();
}

public class AnonymousClass_1 {
	public static void main(String[] args) {
		//#1. ��ü ���� �� �޼��� ȣ��
		A a = new A();
		a.abc(); //�ν��Ͻ� �̳�Ŭ����
	}
}
