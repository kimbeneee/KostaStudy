package step2;
/*
 * ���� ������ �׽�Ʈ 
 */
public class TestAccessModifier {
	public static void main(String[] args) {
		Account a=new Account();
		//public �� �����ؼ� ����غ��� 
		System.out.println(a.no1);//�������̹Ƿ� 0���� �ʱ�ȭ
		a.no1=1111;//�Ҵ�
		System.out.println(a.no1);//1111
		//default �� �����غ��� 
		a.no2=2222; // ������ ��Ű���̹Ƿ� ���� ���� 
		System.out.println(a.no2);
		//private�� �����غ��� 
		//private�� �ٸ� Ŭ�������� ���ٺҰ��ϹǷ� �Ʒ� �ڵ�� 
		//compile error�� ���� 
		//a.no3=3333;
	}
}
