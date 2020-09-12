package sec02_genericclass.EX03;

class Apple{}
class Pencil{}

class Goods<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class Solution2_Generic {
	public static void main(String[] args) {
		//#1. Goods�� ���ؼ� Apple ��ü �߰� �� ��������
		Goods<Apple> goods1 = new Goods<>();
		goods1.set(new Apple());
		Apple apple = goods1.get(); //�ٿ�ĳ���� �ʿ� ����
		
		//#2. Goods�� ���ؼ� Pencil ��ü �߰� �� ��������
		Goods<Pencil> goods2 = new Goods<>();
		goods2.set(new Pencil());
		Pencil pencil = goods2.get();
		
		//#3. �߸��� ĳ���� ()
		Goods<Apple> goods3 = new Goods<>();
		goods3.set(new Apple());
//		Pencil pencil2 = goods3.get(); //����Ÿ��üũ
	}
}
