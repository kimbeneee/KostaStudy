package step10;

import java.text.SimpleDateFormat;

/*
 	������ ���ϸ��� ����� ���� �ð� ������ �̿��ϴ� ���� 
 	�ڹٿ����� �ð� ������ System.currentTimeMills() �޼��带 �̿��� ���Ѵ� 
 	��ȯ�Ǵ� ���� long Ÿ���̰� ���� ǥ�ؽ÷� 1970�� 1�� 1�� 0�� 0�� �������� 
 	�� �и������尡 �귶�� �� ����� �� -> ���н� �ð��̶�� �Ѵ� 
 	
 */
public class TestUnitTime {
	public static void main(String[] args) {
		//System.out.println(System.currentTimeMillis());
		//System.out.println(System.currentTimeMillis());
		long time=System.currentTimeMillis();
		SimpleDateFormat format=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");
		String nowTime=format.format(time);
		System.out.println(nowTime);
	}
}

















