package step7;

public class TestConstructor2 {
	public static void main(String[] args) {
		String info="������ ��������";
		CreditCard card=new CreditCard(info);
		System.out.println(card.getInfo());
	}
}
