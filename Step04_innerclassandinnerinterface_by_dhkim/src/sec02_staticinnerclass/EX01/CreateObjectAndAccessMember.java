package sec02_staticinnerclass.EX01;

class A {
	int a = 3;
	static int b = 4;
	void method1() {
		System.out.println("instance method");
	}
	static void method2() {
		System.out.println("static method");
	}
	
	//static inner class
	static class B {
		void bcd() {
			//#1.�ʵ� ���
//			System.out.println(a); //static�� static�� ���� ���� 
			System.out.println(b);
			//#2.�޼��� ȣ��
//			method1();//static�� static�� ���� ����
			method2();
		}
	}
}

public class CreateObjectAndAccessMember {
	public static void main(String[] args) {
		//#1. static inner class�� ��ü ����
		A.B b = new A.B();
		//#2. �޼��� ȣ��
		b.bcd();
	}
}




























