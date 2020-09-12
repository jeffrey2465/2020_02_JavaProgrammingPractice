package sec04_userexception.EX04;

//#������ ������ ��쿡 ���ܹ߻�
class MinusException extends Exception {
	public MinusException() {
		super();		
	}
	public MinusException(String message) {
		super(message);		
	}	
}
//#������ 100���� �ʰ��ϴ� ��쿡 ���� �߻�
class OverException extends Exception {
	public OverException() {
		super();		
	}
	public OverException(String message) {
		super(message);		
	}	
}

class A {
	void checkScore(int score) throws MinusException, OverException {
		if(score<0) {
			throw new MinusException("���ܹ߻� : �������Է�");
		}
        else if (score>100)
			throw new OverException("���ܹ߻� : 100�� �ʰ�");
        else 
        	System.out.println("�������� ���Դϴ�.");
	}
}

public class UserExceptionExample {
	public static void main(String[] args) {
				
		A a = new A();
		try {
			a.checkScore(85);
			a.checkScore(150);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
	}

}

























