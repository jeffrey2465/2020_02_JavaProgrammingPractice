package sec01_instanceinnerclass.EX01;

class A {
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;
	
	void abc() {
		System.out.println("A Ŭ���� �޼��� abc()");
	}
	
	//�ν��Ͻ� �̳�Ŭ����
	class B {
		void bcd() {
			//#1. outer class�� �ʵ� ���			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
			//#2. outer class�� �޼��� ȣ��
			abc();
		}		
	}
}


public class CreateObjectAndAccessMember {
	public static void main(String[] args) {
		//#1. ��ü���� �ܰ� 1. outer class ��ü ����
		A a = new A();
		
		//#2. ��� ���
		A.B b = a.new B();
		b.bcd();
		
		
	}
}


























