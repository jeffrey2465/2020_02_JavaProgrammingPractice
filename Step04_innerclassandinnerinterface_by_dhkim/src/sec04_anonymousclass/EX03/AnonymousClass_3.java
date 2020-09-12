package sec04_anonymousclass.EX03;

interface A {
	public abstract void abc();
}

//#1. �ڽ�Ŭ������ ���� ����
class B implements A {	
	public void abc() {
		System.out.println("�Ű����� ����");
	}
}

class C {
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass_3 {
	public static void main(String[] args) {
		C c = new C();
		
		//#1. ���#1 Ŭ������ O + ����������  O
		A a = new B();
		c.cde(a); //�Ű����� ����
		
		//#2. ���#2 Ŭ������ O + ����������  X		
		c.cde(new B()); //�Ű����� ����
	}
}
