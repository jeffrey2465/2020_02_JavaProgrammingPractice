package sec01_abstractclass.EX01;

//�߻�Ŭ������ ��ü ���� ��� #1 (�ڽ�Ŭ���� ���� + �ڽ�Ŭ���� �����ڸ� ������ ��ü ����)
abstract class A {
	abstract void abc();
}

class B extends A {	
	void abc() {
		System.out.println("���#1. �ڽ�Ŭ���� ���� �� �߻�޼��� ����");
	}
}


public class AbstractClass_1 {
	public static void main(String[] args) {
		
		//#1. ��ü ����
		A b1 = new B();
		A b2 = new B();
		
		//#2. �޼��� ȣ��
		b1.abc(); //���#1. �ڽ�Ŭ���� ���� �� �߻�޼��� ����
		b2.abc(); //���#1. �ڽ�Ŭ���� ���� �� �߻�޼��� ����
	
	}
}
