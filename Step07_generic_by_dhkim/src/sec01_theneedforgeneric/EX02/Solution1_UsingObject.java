package sec01_theneedforgeneric.EX02;

//#1. Apple, Pencil Ŭ������ ��� �����ϰ� ������ �ִ� Ŭ����

class Apple{}
class Pencil{}

class Goods {
	private Object object = new Object();
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
}

public class Solution1_UsingObject {
	public static void main(String[] args) {
		//#1. Goods�� ���ؼ� Apple ��ü �߰� �� ��������
		Goods goods1 = new Goods();
		goods1.setObject(new Apple());
		Apple apple = (Apple)goods1.getObject();
		
		//#2. Goods�� ���ؼ� Pencil ��ü �߰� �� ��������
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil());
		Pencil pencil = (Pencil)goods2.getObject();
		
		//#3. �߸��� ĳ���� (���� Ÿ��üũ)
//		Goods goods3 = new Goods();
//		goods3.setObject(new Apple());
//		Pencil pencil2 = (Pencil)goods3.getObject(); //���࿹��
	}
}






























