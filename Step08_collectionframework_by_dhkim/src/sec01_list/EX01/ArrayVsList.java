package sec01_list.EX01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsList {
	public static void main(String[] args) {
		
		//#1. �迭
		String[] array = new String[] {"��", "��", "��", "��", "��", "��", "��"};
		System.out.println(array.length);
		array[2]=null;
		array[5]=null;
		
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		System.out.println();
		
		//#2. List
		List<String> aList = new ArrayList<>();
		System.out.println(aList.size()); //�������� ���� ���ϱ� 
		aList.add("��"); 		aList.add("��");
		aList.add("��"); 		aList.add("��");
		aList.add("��"); 		aList.add("��");
		aList.add("��");
		System.out.println(aList.size()); //�������� ���� ���ϱ�
		
		aList.remove("��");
		aList.remove("��");
		System.out.println(aList.size()); //�������� ���� ���ϱ�
		System.out.println(aList);
		
	}
}
