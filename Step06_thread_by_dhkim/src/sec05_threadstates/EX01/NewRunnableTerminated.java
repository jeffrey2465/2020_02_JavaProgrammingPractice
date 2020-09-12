package sec05_threadstates.EX01;

public class NewRunnableTerminated {
	public static void main(String[] args) {
		//#������ ���� ���� Ŭ���� 
		Thread.State state;
		
		//#1. ��ü ���� (NEW)
		Thread thread = new Thread() {
			@Override
			public void run() {
				for(long i=0; i<1000000000L ; i++) {} //�ð�����
			}
		};		
		state = thread.getState(); 
		System.out.println("thread state = "+ state); //NEW
		
		//#2. Thread ����
		thread.start();
		state = thread.getState();
		System.out.println("thread state = "+ state); //Runnable
		
		
		//#3. Thread ����
		try {
			thread.join();
		} catch (InterruptedException e) {	}
		
		state = thread.getState();
		System.out.println("thread state = "+ state); //TERMINATED
		
	}
}
