package step7;
/*
 *  �ڵ� ���� ����� �����غ��� 
 */
public class TestObjectInit2 {
	public static void main(String[] args) {
		ObjectInitExam exam=new ObjectInitExam();
		Food f=new Food("Į����",7000);		
		// Į���� 7000 ������ ���� ��ü�� �ּҰ��� 
		// pass1 �޼����� ���ڰ����� �����Ѵ� 
		exam.pass1(f);
		System.out.println(f.getName()+" "+f.getPrice());
		exam.pass2(f);
		System.out.println(f.getName()+" "+f.getPrice());
	}
}
