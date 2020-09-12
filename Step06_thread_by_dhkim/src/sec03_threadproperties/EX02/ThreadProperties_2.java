package sec03_threadproperties.EX02;

//�켱����

class MyThread extends Thread {
	@Override
	public void run() {
		for(long i=0; i<1000000000 ; i++) { } //�ð� ������
		System.out.println(getName() + "  �켱���� : "+ getPriority());		
	}
}

public class ThreadProperties_2 {
	public static void main(String[] args) {
		
		//#����. CPU core
		System.out.println("�ھ�� : "+ Runtime.getRuntime().availableProcessors()); //
		
		//#1. ����Ʈ �켱����
		for(int i=0; i<3; i++) {
			Thread thread = new MyThread();
			thread.start();
		}
		
		//#2. �켱������ ���� ����
		for(int i=0; i<10; i++) {
			Thread thread = new MyThread();
			thread.setName(i+"��° ������");
			if(i==9) thread.setPriority(10);
			thread.start();
		}
		
	}
}
