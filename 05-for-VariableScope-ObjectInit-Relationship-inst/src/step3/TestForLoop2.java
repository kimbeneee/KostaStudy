package step3;

public class TestForLoop2 {
	public static void main(String[] args) {
		System.out.println("��");
		System.out.println("��");
		System.out.println("****");
		System.out.println();
		System.out.println();
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.println("  \t��");
		System.out.println("****");
		/*
		 	1	2	3	4	5
		 	1	2	3	4	5
		 	1	2	3	4	5
		 */		
		/*
		 	for(){//3�� �ݺ� 
		 		for(){//5�� �ݺ� 		 		
		 		}
		 		System.out.println();
		 	}
		 */
		int row=3;
		int col=5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				System.out.print(j+"  \t");
			}
			System.out.println();
		}
	}
}


























