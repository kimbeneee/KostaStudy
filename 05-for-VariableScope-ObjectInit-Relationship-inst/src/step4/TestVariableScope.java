package step4;

public class TestVariableScope {
	public static void main(String[] args) {
		/*
		 	Person : ������ ������ Ÿ�� 
		 	p : �������� , ���� �޼��� ���� ����Ǿ� �����Ƿ� local variable -> stack memory ������ ���� 
		 	new Person() : ��ü ���� , heap memory ������ ���� 
		 */
		Person p=new Person("������");
		p.eat();
		p.testInit();
	}
}
