package step1;

public class TestReview {
	public static void main(String[] args) {
		//Market ��ü ���� 
		Market m=new Market();
		System.out.println(m.name);//null�� ���,������ �������� ������ null ���
		m.name="G����";//��ü�� name������ �����Ҵ�
		System.out.println(m.name);//G����
		//����̶�� ���ڸ� �����Ѵ� ( argument ) 
		//�Ʒ� �޼��带 ȣ���ϸ� �˻������ ���ϵȴ� 
		String searchResult=m.searchProduct("���");
		System.out.println("�˻����:"+searchResult);
	}
}
