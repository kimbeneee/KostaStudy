package step5;

public class TestVariableScope2 {
	public static void main(String[] args) {
		//sp�� ������������ local variable-> stack memory ������ ���� 
		SmartPhone sp=new SmartPhone();
		System.out.println(sp.getModel());//null
		System.out.println(sp.getPrice());//0 
	}
}
