package step5;

public class TestIf {
	public static void main(String[] args) {
		//���ǹ� if , else if , else 
		int age=-16;
		if(age>19) { // ���ǹ����� �߰�ȣ�� ���������϶� �ʼ����̰� ���ǹ��� ���๮�� �Ѷ����̸� �������� 
			System.out.println(age+"�� �����Դϴ�");
		}else if(age>0){
			System.out.println(age+"�� �̼����Դϴ�");
		}else {//0�� �����̸� ( ������ )
			System.out.println("�߸��� �Է°��Դϴ�");
		}
	}
}
