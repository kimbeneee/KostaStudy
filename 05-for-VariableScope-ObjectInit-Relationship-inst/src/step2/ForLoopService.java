package step2;

public class ForLoopService {
	public void printInfo(String item,int count) {
		// i�� 1���� count(3) �����϶����� �����ϸ鼭 1�� �����ϰ� �ݺ��Ѵ�  
		for(int i=1;i<=count;i++) {
			System.out.println(item+" "+i+"��");
		}
	}
}
