package step4;
// ������ ���� 
public class TestOperator1 {
	public static void main(String[] args) {
		int i=7;
		int j=3;
		System.out.println(i*j);
		System.out.println(i/j);
		System.out.println(i%j);//������ 
		System.out.println(i=j);//�Ҵ� �Ǵ� ���� 
		System.out.println(i==j);//������ true, �ٸ��� false 
		boolean flag=false;
		System.out.println(flag);//false
		System.out.println(!flag);//true 
		System.out.println("*****����������******");
		int k=7;
		System.out.println(k++);//���� �� ���� 7
		System.out.println(k);//������ �� 8
		System.out.println("**�������**");
		System.out.println(k--);//���� �� ���� 8
		System.out.println(--k);//���� �� ���� 6
		System.out.println("**************");
		int money=200;
		//���� money�� 100�� ���ϰ��� �Ѵ� 
		//money=money+100;
		money+=100;//�� ������ �ٿ� ǥ���ϸ� 
		System.out.println(money);
		//���� money�� 150�� ������ �Ѵ� 
		money-=150;
		System.out.println(money);
		System.out.println("**���׿�����**");
		/*
		 	���׿���
		 	(���ǽ�) ? ��1 : ��2 ; 
		 	���ǽ��� ���̸� ��1 �� ����, �����̸� ��2�� ���� 
		 */
		int x=-10;
		int result=(x>0) ? x+1: x+2;
		System.out.println(result);
	}
}
























