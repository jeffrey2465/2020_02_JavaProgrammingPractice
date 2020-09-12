package sec05_threadstates.EX03;


class MyThread1 extends Thread {
	@Override
	public void run() {
		for(long i=0; i<1000000000L ; i++) {} //�ð�����
	}
}

class MyThread2 extends Thread {
	MyThread1 myThread1;
	public MyThread2(MyThread1 myThread1) {
		this.myThread1 = myThread1;
	}
	
	@Override
	public void run() {
		try {
			myThread1.join(3000);
		} catch (InterruptedException e) {
			System.out.println(" -- join(...) ������ interrupt() �߻�");
			for(long i=0; i<1000000000L ; i++) {} //�ð�����
		}
	}
}


public class TimedWaiting_Sleep {
	public static void main(String[] args) {
		
		//#1. ��ü ���� 
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2(myThread1);
		myThread1.start();
		myThread2.start();
		
		try {Thread.sleep(100);} catch (InterruptedException e) {} //������ ���� �غ� �ð�
		System.out.println("MyThread1 State = " + myThread1.getState()); //Runnable
		System.out.println("MyThread2 State = " + myThread2.getState()); //Timed_waiting
		
		myThread2.interrupt();
		System.out.println("MyThread1 State = " + myThread1.getState()); //Runnable
		System.out.println("MyThread2 State = " + myThread2.getState()); //Runnable
				
	}
}
