package sec03_threadproperties.EX01;

//������ ��ü ��������/ �̸�����/ ������ �� 

public class ThreadProperties_1 {	
	public static void main(String[] args) {
		
		//#1. ��ü�������� (currentThread()) / ������ �� (activeCount())
		Thread curThread = Thread.currentThread();
		System.out.println("���� �������� �̸� = " + curThread.getName());
		System.out.println("�����ϴ� ������ �� = " + Thread.activeCount());
		
		//#2. ������ �̸� ���� (�ڵ�����)
		for(int i=0; i<3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		//#3. ������ �̸� ���� ����
		for(int i=0; i<3; i++) {
			Thread thread = new Thread();
			thread.setName(i+"��° ������");
			System.out.println(thread.getName());
			thread.start();
		}
		
		//#4. ������ �̸� ���� (�ڵ�����)
		for(int i=0; i<3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		//#5. ������ �� 
		System.out.println("�����ϴ� ������ �� = " + Thread.activeCount());
		
	}
}
