package sec02_interface.EX02;

interface A {}
interface B {}

//#1. �����������̽� ���
class C implements A {	
}

//#2. �����������̽� ���
class D implements A, B {
}

//#3. Ŭ������ �������̽��� �ѹ��� ��� (extends�� implements�� ������ ���� �Ұ�)
class E extends C implements A,B {
	
}

public class InheritanceOfInterface_1 {

}
