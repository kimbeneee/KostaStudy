package step4;

public class Person {
	//instance variable 
	private String name;//���� �ص� �⺻ �ʱ�ȭ , �������� null�� �ʱ�ȭ
	private String email;//���� �ص� �⺻ �ʱ�ȭ , �������� null�� �ʱ�ȭ
	//instance variable
	private int age; //���� �ص� �⺻ �ʱ�ȭ, �������� 0 �� �ʱ�ȭ 
	//parameter(�Ű�����) �� name��
	//local variable 
	public Person(String name) {
		this.name=name;
	}
	public void eat() {
		//count �� local variable 
		int count=3;
		System.out.println(count+"�κ� �Դ�");
		if(count>0) {
			int lv=1;
			System.out.println(lv);
		}
		//�Ʒ� �ڵ�� ������ ���� , ������ local variable �� ����� ������������ ��밡��
		//System.out.println(lv);
		//���� �ڵ带 �Ʒ��� ���� �����ؼ� ����ϸ� �ȴ� 
		int lv=0;
		if(count>0) {
			lv=1;
		}
		System.out.println(lv);
	}
	public void eat2() {
		//int count;//��������local variable�� ���� �Ѵ� 
		//System.out.println(count);//compile error, local variable�� ����� �ʱ�ȭ�� �ؾ� ��밡��
		int count2=0;//����� �ʱ�ȭ 
		System.out.println(count2);
	}
	public void testInit() {
		//�ν��Ͻ� ���� �ʱ�ȭ�� Ȯ�� 
		System.out.println("name:"+name);//������ , �����ڿ� ���� �ʱ�ȭ 
		System.out.println("email:"+email);//null  �⺻�ʱ�ȭ 
		System.out.println("age:"+age);//0  �⺻�ʱ�ȭ 
	}
}

























