package sec02_interface.EX07;

interface A {
	default void abc() {
		System.out.println("A 인터페이스의 abc()");
	}
}

class B implements A {
	public void abc() {
		A.super.abc();	//super.abc() 이건 부모클래스의  abc() 메서드 호출하란 소리	
		System.out.println("B 클래스의 abc()");		
	}
}


public class DefaultMethod_2 {
	public static void main(String[] args) {
		//#1. 객체생성
		B b = new B();
		
		//#2. 메서드 호출
		b.abc(); //A 인터페이스의 abc() B 클래스의 abc()
	}
}
