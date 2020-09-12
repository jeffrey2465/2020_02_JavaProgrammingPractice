package sec05_innerinterface_EX02;

class Button {
	OnClickListener ocl;
	
	void setOnClickListener (OnClickListener ocl) {
		this.ocl = ocl;
	}
	
	interface OnClickListener {
		public abstract void onClick();
	}
	
	void onClick () {
		ocl.onClick();
	}
}

public class ButtonAPIExample {
	public static void main(String[] args) {
		
		//#1. ������ 1. Ŭ�������� �������
		Button btn1 = new Button();
		btn1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("������1 : �������");				
			}
		});
		btn1.onClick(); //������1 : �������
		
		//#2. ������ 2. Ŭ�������� ���̹� ����
		Button btn2 = new Button();
		btn2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("������2 : ���̹�����");				
			}
		});
		btn2.onClick(); //������2 : ���̹�����
		
		
	}
}





























