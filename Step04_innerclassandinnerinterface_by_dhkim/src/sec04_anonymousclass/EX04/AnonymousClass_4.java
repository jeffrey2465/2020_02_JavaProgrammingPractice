package sec04_anonymousclass.EX04;

interface A {
	public abstract void abc();
}

class C {
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass_4 {
	public static void main(String[] args) {
		C c = new C();
		
		//#3. ���#3 Ŭ������ X + ����������  O	
		A a = new A() {
			public void abc() {
				System.out.println("�Ű����� ����");
			}			
		};
		c.cde(a); //�Ű����� ����
		
		//#4. ���#4 Ŭ������ X + ����������  X		
		c.cde(new A() {
			public void abc() {
				System.out.println("�Ű����� ����");
			}			
		}); //�Ű����� ����
	}
}
