package step4.method1;
/*
 * Method ���̽�����  �׽�Ʈ �ϴ� ����  
 * 1. �Ű������� ���ϰ��� ���� ��� 
 * 2. �Ű������� �ִ� ��� 
 * 3. ���ϰ��� �ִ� ��� 
 */
public class TestMethod1 {
	//���θ޼��� : ���α׷��� ������ 
	public static void main(String[] args) {
		Person p=new Person();//Person ��ü ���� 
		p.eat1();//�޼��� ȣ�� 
		p.eat2("ī��");//eat2 �޼����� �Ű�����parameter�� �˸´� ��������(argument)�� ���
		p.eat2("ġŲ");
		//���ϰ��� �ִ� �޼��带 ȣ���Ͽ� ������� ��ȯ�޾� ����غ��� 
		String result=p.eat3();
		System.out.println("main:"+result);
		//���� �� ������ �Ʒ��� ���� �Ѷ������� ǥ���� �� �ִ� 
		System.out.println("main:"+p.eat3());
	}
}
