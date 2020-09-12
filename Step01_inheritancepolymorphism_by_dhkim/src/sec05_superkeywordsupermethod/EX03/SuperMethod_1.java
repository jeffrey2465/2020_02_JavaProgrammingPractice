package sec05_superkeywordsupermethod.EX03;

class A{
	A(){
		System.out.println("A ������");
	}
}

class B extends A{
	B(){
		super(); //������ �����Ϸ��� �ڵ� �߰� (�θ�Ŭ������ ������ ȣ��)
		System.out.println("B ������");
	}
}

class C {
	C(int a){
		System.out.println("C ������");
	}
}

class D extends C {
//	D(){         //@1
//		super(); //@2
//	}            //@3 1-3 �����Ϸ��� �ڵ����� �߰����ִ� ����
	D(){
		super(3);
	}
}



public class SuperMethod_1 {
	public static void main(String[] args) {
		//#1. A ��ü ����
		A aa = new A();
		System.out.println(); // A ������	
	
		//#2. B ��ü ����
		B bb = new B(); // A ������ -> B ������
	}
}
