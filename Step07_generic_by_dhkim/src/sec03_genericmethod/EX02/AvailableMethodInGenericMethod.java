package sec03_genericmethod.EX02;

class A {
	public <T> void method(T t) {
		//System.out.println(t.length()); //�Ұ��� : Object �޼��常 ȣ�Ⱑ��
		System.out.println(t.equals("�ȳ�")); //Object �޼��常 ȣ�Ⱑ��
	}
}

public class AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		
		A a = new A();
		a.<String>method("�ȳ�");
		
	}
}
