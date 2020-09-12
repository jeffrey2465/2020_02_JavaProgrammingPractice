package sec03_throwsexception.EX03;

//#1. �����޼��忡 ���� ���ܸ� ó���ϴ� ���
class A {
	
	void abc() {
		bcd();
	}	
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object"); //�Ϲݿ��� : ClassNotFoundException
			Thread.sleep(1000); //�Ϲݿ��� : InterruptedException
		} catch (InterruptedException | ClassNotFoundException e) {
			//����ó�� ����
		} 
	}
}

//#2. ���ܸ� ȣ�� �޼���� �����ϴ� ���
class B {
	void abc() {		
		try {
			bcd(); //�Ϲݿ��� : InterruptedException
		} catch (InterruptedException | ClassNotFoundException e) {
			//����ó�� ����
		}
	}
	void bcd() throws InterruptedException, ClassNotFoundException {
		Class cls = Class.forName("java.lang.Object"); //�Ϲݿ��� : ClassNotFoundException
		Thread.sleep(1000); //�Ϲݿ��� : InterruptedException
	}
}


public class ThrowsException_3 {

}
