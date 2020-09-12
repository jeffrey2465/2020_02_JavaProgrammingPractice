package sec03_map.EX07;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSummary {
	public static void main(String[] args) {
		
		//#1. HashMap �Է¼����� ��¼����� ���� �ٸ�
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("��", 30);
		hashMap.put("��", 40);
		hashMap.put("��", 50);
		hashMap.put("��", 60);
		System.out.println(hashMap.toString()); //{��=60, ��=30, ��=40, ��=50}
		
		//#2. HashTable �Է¼����� ��¼����� ���� �ٸ�
		Map<String, Integer> hashTable = new Hashtable<>();
		hashTable.put("��", 30);
		hashTable.put("��", 40);
		hashTable.put("��", 50);
		hashTable.put("��", 60);
		System.out.println(hashTable.toString()); //{��=60, ��=50, ��=40, ��=30}
		
		//#3. LinkedHashMap �Է¼����� ��¼����� �׻� ����
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("��", 30);
		linkedHashMap.put("��", 40);
		linkedHashMap.put("��", 50);
		linkedHashMap.put("��", 60);
		System.out.println(linkedHashMap.toString()); //{��=30, ��=40, ��=50, ��=60}
		
		//#4. TreeMap �Է¼����� ������� �׻� ������������ ���� (Ű��ü�� ��� �� ���ؿ� �����Ǿ�� ��)
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("��", 30);
		treeMap.put("��", 40);
		treeMap.put("��", 50);
		treeMap.put("��", 60);
		System.out.println(treeMap.toString()); //{��=60, ��=50, ��=30, ��=40}
		
	}
}	





