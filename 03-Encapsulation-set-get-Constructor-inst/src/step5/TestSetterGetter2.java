package step5;

public class TestSetterGetter2 {
	public static void main(String[] args) {
		Person p=new Person();
		//setter getter�� tool�� ����� ���� 
		//Ȱ���غ��� 
		p.setAddress("������");
		p.setId("tico99");
		p.setNickName("�����");
		p.setMoney(100);
		p.setName("������");
		System.out.println(p.getAddress()+" "+p.getId()+" "
		+p.getNickName()+" "+p.getMoney()+" "+p.getName());
	}
}
