package step3;

public class TestReferenceDataType {
	public static void main(String[] args) {
		//�Ʒ��� ������ �Ű�����parameter ����Ʈ�� �˸´� 
		//���� argument �� �������� �ʾ����Ƿ� error 
		//Person p=new Person();
		Person p; //���� Person ������ Ÿ�� , p �� �������� 
		//��ü ���� ( heap ������ ��ü ���� , �ּҰ� ��ȯ ) 
		//p ���������� �ּҰ� �Ҵ� 
		p=new Person("������",100);
		System.out.println(p);//�ּҰ� Ȯ�� 
		System.out.println(p.getMoney());//���������� ��ü�� ���� 
		p.setMoney(200);
		System.out.println(p.getMoney());
		System.out.println(p.getName());
		Person p2=new Person("�����",200);
		System.out.println(p2);
		//p2 ��ü�� �ּҰ��� p ���������� �Ҵ�, ������ ��ü�� ����  
		p=p2;
		System.out.println("**�����غ���**");
		System.out.println(p.getName());
		System.out.println(p2.getName());
	}
}













