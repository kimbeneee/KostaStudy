package step1;

public class TestLoop {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("****");
		//���� for ������ ������ �Ʒ� while������ �����ϰ� ������ �� ���� 
		int j=0;
		while(j<10) {
			System.out.println(j++);
		}
		System.out.println("****");
		int k=0;
		do {//do while�� ���� ���� �� ���� �˻� 
			System.out.println(k++);
		}while(k>1);
	}
}


