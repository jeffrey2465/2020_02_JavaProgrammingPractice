package sec02_createandstartthread.EX04;

//#1. ���2(M2). Runnable �������̽� ����Ͽ� Ŭ���� ����  case2: 3���� ������ ����

class SMIFileRunnable implements Runnable {
	
	@Override
	public void run() {
		//#2. �ڸ� ��ȣ �ϳ�~�ټ�
		String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
		try { Thread.sleep(10);} catch (InterruptedException e) {}
		//#4. �ڸ���ȣ ���
		for (int i=0; i<strArray.length; i++) {
			System.out.println(" - (�ڸ���ȣ) "+strArray[i]);
			try { Thread.sleep(200);} catch (InterruptedException e) {}
		}		
	}

}

class VideoFileRunnable implements Runnable {
	@Override
	public void run() {
		//#1 ���������� 1~5
		int[] intArray = {1, 2, 3, 4, 5};
		
		//#3. ���� ������ ���
		for (int i=0; i<intArray.length; i++) {
			System.out.print("(����������) "+intArray[i]);
			try { Thread.sleep(200);} catch (InterruptedException e) {}
		}			
	}
}


public class CreateAndStartThread_M2C2 {
	public static void main(String[] args) {
		
		//SMIRunnable ��ü ����
		Runnable smiFileRunnable = new SMIFileRunnable();
		//smiFileRunnable.start(); //����
		Thread thread1 = new Thread(smiFileRunnable);
		thread1.start();
		
		//VideoFileRunnable ��ü ����
		Runnable videoFileRunnable = new VideoFileRunnable();
		//videoFileRunnable.start(); //����
		Thread thread2 = new Thread(videoFileRunnable);
		thread2.start();
		
	}
}
