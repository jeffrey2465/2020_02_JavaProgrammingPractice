package sec01_list.EX02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {
	public static void main(String[] args) {
		
		//#���1. List ����Ŭ������ �����ڸ� ����Ͽ� ��ü ����
		List<Integer> aList1 = new ArrayList<>(); //capacity=10
		List<Integer> aList2 = new ArrayList<>(30); //capacity=30 size()�ʹ� ���� �ٸ� ��
		
		List<Integer> aList3 = new Vector<>(); //capacity=10
		List<Integer> aList4 = new Vector<>(30); //capacity=30 size()�ʹ� ���� �ٸ� ��
		
		List<Integer> aList5 = new LinkedList<>(); //capacity=10
		//List<Integer> aList6 = new LinkedList<>(30); //LinkedList�� ����뷮�� �����ϴ� ������ ����
		
		//#���2. Arrays Ŭ������ ���� �޼��� Ȱ�� (�������� ũ�⸦ �ٲ� �� ����)
		List<Integer> aList7 = Arrays.asList(1,2,3,4);
		List<String> aList8 = Arrays.asList("�ȳ�", "�氡");
		aList7.set(1, 7);
		aList8.set(0, "����");
		//aList7.add(5); //�Ұ���
		//aList8.remove(0); //�Ұ���
		
		System.out.println(aList7);
		System.out.println(aList8);
		
		
	}
}
