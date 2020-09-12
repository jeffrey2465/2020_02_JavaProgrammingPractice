package sec03_threadproperties.EX04;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon()? "���󾲷���":"�Ϲݾ�����") );
		for(int i =0; i<6; i++) {
			System.out.println(getName() + " : " + i + "��");
			try{Thread.sleep(1000);}catch(InterruptedException e) {}
		}
	}
}

public class ThreadProperties_3_2 {
	public static void main(String[] args) {
		
//		//#1. �Ϲݾ�����
//		Thread thread1 = new MyThread();
//		thread1.setDaemon(false);//����Ʈ
//		thread1.setName("thread1");
//		thread1.start();
		
		//#2. ���󾲷���
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);//����Ʈ
		thread2.setName("thread2");
		thread2.start();
		
		//#3. 3���� main Thread ����
		try {Thread.sleep(3100);} catch (InterruptedException e) {}
		System.out.println("main Thread ����");
	}
}









