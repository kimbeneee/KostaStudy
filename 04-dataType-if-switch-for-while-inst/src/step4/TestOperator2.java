package step4;

public class TestOperator2 {
	/*
	 	and �� or ���� 
	 	and : ��� ������ ���϶� �� , �������� ���� & �Ǵ� &&
	 	or : ��� ������ �����϶� ���� , �������� ��  | �Ǵ� || 
	 	
	 	true && true -> true 
	 	true && false -> false 
	 	false && true -> false
	 	false && false -> false 
	 	
	 	true || true -> true 
	 	true || false -> true 
	 	false || true -> true 
	 	false || false -> false 
	 	
	 	& �� && , | �� || �� � ���̰� ������?  ��������� �������� &&�� || �� ����Ѵ� 
	 	&& �� ����ϸ� false �� ���� ����Ǹ� �� ����� false�̹Ƿ� ���� ������ �������� �ʰ� ������ ��ģ�� 
	 	|| �� ����ϸ� true�� ���� ����Ǹ� �� ����� false�̹Ƿ� �ٷ� ������ ��ġ�� true�� ��ȯ�Ѵ� 
	 	������ �׽�Ʈ �غ��� 
	 */
	public static void main(String[] args) {
		OperatorExam exam=new OperatorExam();
		System.out.println(exam.test1()&&exam.test2());
		System.out.println("**��, �Ʒ� �ڵ��� �������� ���غ���**");
		System.out.println(exam.test1()&exam.test2());
	}
}


























