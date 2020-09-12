package sec01_instanceinnerclass.EX02;

class A {
	int a = 3;
	int b = 4;
	void abc() {
		System.out.println("A Ŭ���� �޼���");
	}
	
	//�ν��Ͻ� �̳�Ŭ���� ����
	class B {
		int a = 5;
		int b = 6;
		void abc() {
			System.out.println("B Ŭ���� �޼���");
		}
		void bcd() {
			// #1. inner class�� ��� ȣ�� �Ǵ� ���
			System.out.println(a); //this. �ڵ��߰�  5
			System.out.println(b); //this. �ڵ��߰�  6
			abc(); //this. �ڵ��߰�  B Ŭ���� �޼���
			
			// #2. outer class�� ��� ȣ�� �Ǵ� ���
			System.out.println(A.this.a); //this. �ڵ��߰�  3
			System.out.println(A.this.b); //this. �ڵ��߰�  4
			A.this.abc(); //this. �ڵ��߰�  A Ŭ���� �޼���
		}
	}
}

public class UseMembersOfOuterClass {
	public static void main(String[] args) {
		//#1. outer class��ü ����
		A a = new A();
		
		//#2. inner class ��ü ����
		A.B b = a.new B();
		b.bcd();
	}
}




























