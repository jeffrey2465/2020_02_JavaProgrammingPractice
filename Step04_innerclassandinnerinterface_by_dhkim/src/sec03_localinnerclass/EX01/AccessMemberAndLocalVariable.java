package sec03_localinnerclass.EX01;

class A {
	int a = 3; //�ʵ�
	void abc() {
		int b = 5; //��������
		
		//�����̳�Ŭ����
		class B {
			void bcd() {
				System.out.println(a); //�ʵ�
				System.out.println(b); //��������
				a=5;
//				b=7; //�����̳�Ŭ�������� ����ϴ� ���������� �ڵ����� final�� ���� 
			}
		}
		
		B bb = new B();
		bb.bcd();		
	}
}

public class AccessMemberAndLocalVariable {
	public static void main(String[] args) {
		//#1. ��ü ���� �� �޼��� ȣ��
		A a = new A();
		a.abc();
	}
}
