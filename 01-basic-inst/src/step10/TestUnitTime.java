package step10;

import java.text.SimpleDateFormat;

/*
 	유일한 파일명을 만들기 위해 시간 정보를 이용하는 예제 
 	자바에서는 시간 정보를 System.currentTimeMills() 메서드를 이용해 구한다 
 	반환되는 값은 long 타입이고 세계 표준시로 1970년 1월 1일 0시 0분 기준으로 
 	몇 밀리세컨드가 흘렀는 지 기록한 값 -> 유닉스 시간이라고도 한다 
 	
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

















