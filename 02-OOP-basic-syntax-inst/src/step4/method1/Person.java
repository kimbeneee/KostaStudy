package step4.method1;

public class Person {
	/*
	 * method case 1 
	 * �Ű������� ���ϰ��� ���� �޼��� 
	 * ȣ��Ǹ� ����Ǵ� �޼��� 
	 */
	public void eat1() {
		System.out.println("�Դ�");
	}
	/*
	 * method case 2 
	 * �Ű������� ���ǵ� �޼��� , ȣ���� ������ ������(argument:��������)�� 
	 * �Ű�����(parameter)�� ���޹޴´�
	 * ���޹��� �Ű������� �����͸� �̿��ؼ� �����Ѵ� 
	 */
	public void eat2(String food) {
		System.out.println(food+" �Դ�");
	}
	/*
	 * method case 3 
	 * ���ϰ��� �����ϴ� �޼��� , ȣ���� ������ �޼��� ���� ����� ��ȯ�Ѵ�
	 * ���ϰ��� ���� ���� void ��� ���ϰ��� ������ Ÿ���� ����ؾ� �Ѵ� 
	 * ������ ����ϴ� �ڵ������ �޼��� ������ �κп� �����ؾ� �ϸ� 
	 * �޼��� ���� �ѹ��� ���డ���ϴ� 
	 */
	public String eat3() {
		System.out.println("eat3 method ����");
		return "eat3 �޼��� ������";
	}	  
}



















