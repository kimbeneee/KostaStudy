package step6;

public class MyDate {
	private int month=1;

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		//�Ű������� 1~12���� �϶��� �ν��Ͻ� ������ ���� �Ҵ��ϰ� 
		//�ƴϸ� �߸��� �Է°��Դϴٸ� ����ϰ� �Ҵ��Ű�� �ʴ´� 
		if(month>=1&&month<=12)
			this.month = month;
		else
			System.out.println(month+"���� �߸��� �Է°��Դϴ�");
	}	
}
