package step2;

public class Account {
	//���������� �׽�Ʈ�� ���� 3���� ������ �����Ѵ� 
	public int no1;//���� ���� ���� ����������, �ٸ� ��Ű�������� ���ٰ���
	int no2;//default ����������, ���� ��Ű���������� ���ٰ��� 
	private int no3;//���� ���� ���� ����������, �ڽ��� Ŭ������������ ���ٰ���
	
	public void deposit(int money) {
		System.out.println(no3+" ���� "+money+" �Ա�ó��");
	}
}
