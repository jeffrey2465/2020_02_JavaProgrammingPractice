package sec02_interface.EX03;
//접근지정자

interface A {
	public abstract void abc(); 
}

interface B {
	void bcd(); //생략시 public abstract 
}

class C implements A {
	public void abc() {
		//...
	}
}

//class D implements B {
//	void bcd() { //public -> default 불가능
//		//...
//	}
//}



public class InheritanceOfInterface_2 {

}
