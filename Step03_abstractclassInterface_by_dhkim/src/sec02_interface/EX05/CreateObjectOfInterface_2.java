package sec02_interface.EX05;

//#���2. �͸��̳�Ŭ������ �̿��� ��ü ���� 
interface A {
	int a = 3;
	void abc();
}

public class CreateObjectOfInterface_2 {
	public static void main(String[] args) {
		//#1. ��ü ����
		A a1 = new A() {			
			public void abc() {
				System.out.println("���2. �͸��̳�Ŭ������ �̿��� ��ü ���� ");				
			}
		};
		A a2 = new A() {			
			public void abc() {
				System.out.println("���2. �͸��̳�Ŭ������ �̿��� ��ü ���� ");				
			}
		};
		//#2. �޼��� ȣ��
		a1.abc();
		a2.abc();
	}
}
