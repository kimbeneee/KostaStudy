package step2;

public class ForLoopService {
	public void printInfo(String item,int count) {
		// i가 1부터 count(3) 이하일때까지 실행하면서 1씩 증가하고 반복한다  
		for(int i=1;i<=count;i++) {
			System.out.println(item+" "+i+"잔");
		}
	}
}
