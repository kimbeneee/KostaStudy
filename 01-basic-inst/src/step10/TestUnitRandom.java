package step10;

import java.util.Random;

// Random 의 nextBoolean() 테스트 
public class TestUnitRandom {
	public static void main(String[] args) {
		Random r=new Random();
		System.out.println(r.nextBoolean());
		System.out.println(r.nextBoolean());
		System.out.println(r.nextBoolean());
	}
}
