package step5;

public class SmartPhone {
	// instance variable ( or member variable ) 
	private String model;
	private int price;//instance variable 
	public String getModel() {
		return model;
	}
	//�Ʒ� model�� �Ű�����parameter���� �������� 
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	//price �� parameter ���� local variable 
	public void setPrice(int price) {
		this.price = price;
	}
	
}
