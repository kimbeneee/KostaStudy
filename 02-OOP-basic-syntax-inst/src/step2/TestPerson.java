package step2;
/*
 * Person class�� �̿��� Person ��ü(Object) �� ������ ������ �޼��带 �׽�Ʈ�ϴ� ������ ���� Ŭ���� 
 */
public class TestPerson {
	public static void main(String[] args) {
		/* ��ü ������ ���� �ڵ���� 
		 * Person : Ŭ�������̰� ������ ������ Ÿ���̴� 
		 * p : ���� , �������� , ��ü�� �����ϱ� ���� �ּҰ��� �����ϴ� ���� 
		 * = : assign �Ҵ� 
		 * new : ��ü ������ ���� �ڹ� Ű���� 
		 * Person() : ������ constructor 
		 */
		Person p=new Person();
		// ��ü�� ���(�Ӽ��� ���)�� ������ ������ ��������.�Ӽ� �Ǵ� ��������.�޼���()  �������� ������ �����Ѵ� 
		System.out.println(p.name);//��ü�� �Ӽ�(����)�� ������ ���� ��� 
		//��ü�� ��� , �޼��带 ȣ���ؼ� ���� 
		p.eat();
		//���� �� �Ӽ����� ���Ҵ� 
		p.name="�̰���";
		System.out.println(p.name);
		p.eat();
	}
}













