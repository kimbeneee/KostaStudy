package step3;

import step2.Account;

/*
 * step3 ��Ű�� Ŭ�������� 
 * step2 ��Ű�� Ŭ������ ����� �����ؼ�
 * ���������ڸ� �׽�Ʈ �غ��� ���� 
 * 
 * import : ����Ű ctrl + shift + o 
 * import �� �ٸ� ��Ű���� Ŭ������ ����ϱ� ���ؼ� �ۼ��ϴ� ����
 */
public class TestAccessModifier2 {
	public static void main(String[] args) {
		Account a=new Account();
		System.out.println(a.no1);
		//default�� �ٸ� ��Ű�������� ���ٺҰ�
		//System.out.println(a.no2); 
		//private�� �ڽ��� Ŭ���� �������� ���ٰ����ϹǷ� ���ٺҰ�
		//System.out.println(a.no3);
		a.deposit(200);//public �̹Ƿ� �ٸ� ��Ű������ ���ٰ���
	}
}

