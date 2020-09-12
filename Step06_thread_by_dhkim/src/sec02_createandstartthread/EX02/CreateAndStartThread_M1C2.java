package sec02_createandstartthread.EX02;

//#1. ���1(M1). Thread Ŭ���� ����Ͽ� Ŭ���� ����  case2: 3���� ������ ����

class SMIFileThread extends Thread {
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

class VideoFileThread extends Thread {
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

public class CreateAndStartThread_M1C2 {
	public static void main(String[] args) {
		
		//SMIFileThread ��ü ���� �� ����
		Thread smiFileThread = new SMIFileThread();
		smiFileThread.start();
		
		//VideoFileThread ��ü ���� �� ����
		Thread videoFileThread = new VideoFileThread();
		videoFileThread.start();
		
	}
}
