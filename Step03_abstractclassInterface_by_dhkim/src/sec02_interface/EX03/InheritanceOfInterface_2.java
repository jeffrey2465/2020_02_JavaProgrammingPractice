package sec02_interface.EX03;
//����������

interface A {
	public abstract void abc(); 
}

interface B {
	void bcd(); //������ public abstract 
}

class C implements A {
	public void abc() {
		//...
	}
}

//class D implements B {
//	void bcd() { //public -> default �Ұ���
//		//...
//	}
//}



public class InheritanceOfInterface_2 {

}
