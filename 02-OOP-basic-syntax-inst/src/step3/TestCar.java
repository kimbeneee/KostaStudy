package step3;

public class TestCar {
	public static void main(String[] args) {
		//Car ��ü ���� 
		Car c=new Car();
		//Car ��ü�� price ������ 2000 �� �Ҵ� 
		c.price=2000;
		System.out.println(c.price);//�Ҵ��� Car ��ü�� price �Ӽ����� ��� 
		c.model="K5";
		System.out.println(c.model);
		c.go(); // 2000 ���� K5 ���� 
	}
}
