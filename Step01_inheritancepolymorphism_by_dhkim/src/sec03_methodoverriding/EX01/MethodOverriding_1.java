package sec03_methodoverriding.EX01;

class A{
	void print() {
		System.out.println("A Ŭ����");
	}
}

class B extends A{
	@Override
	void print() {
		System.out.println("B Ŭ����");
	}
}

public class MethodOverriding_1 {
	public static void main(String[] args) {
		//#1. A Ÿ�� / A ������
		A aa = new A();
		aa.print(); //A Ŭ����
		
		//#2. B Ÿ�� / B ������
		B bb = new B();
		bb.print(); //B Ŭ����
		
		//#3. A Ÿ�� / B ������
		A ab = new B();
		ab.print(); //B Ŭ����
	}
}
