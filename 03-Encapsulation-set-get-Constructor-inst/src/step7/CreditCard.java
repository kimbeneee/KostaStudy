package step7;

public class CreditCard {
	private String info;
	//�����ڸ� ���� ����� ��ü �����ÿ� ������ �Ҵ�ް� �Ѵ� 
	//�����ڴ� ��ü �ʱ�ȭ �۾��� �ʿ��� �� ���� ����Ѵ� 
	//�Ʒ��� ���� �ſ�ī�� ��ü�� ���鶧 �ݵ�� ���������� �Ҵ�޾Ƽ�
	//���鵵�� �������� �Ű������� �����ߴ� 
	public CreditCard(String info) {
		this.info=info;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
}
