package step1;// ��Ű�� : Ŭ�������� ���丮���� �з��Ͽ� ���� 

// public : ���� ���� ���� ���������� access modifier 
public class Market {
	/*
	 *  �ν��Ͻ� ���� instance variable -> ��ü�� �Ӽ� ������ �����ϴ� ���� 
	 *  String : ���ڿ� ������ Ÿ�� 
	 */
	String name;
	/*
	 * �޼��� : ��ü�� ����� ���� 
	 * keyword : �Ű����� parameter 
	 * return �� ������ ȣ���� ������ ��ȯ�ϱ� ���� ����ϴ� �ڹ� ����� 
	 */
	public String searchProduct(String keyword) {
		System.out.println("DB���� ������ ��ȸ..");
		return name+":"+keyword+" ��ǰ�˻����->�����,�Ŷ��";
	}
}
