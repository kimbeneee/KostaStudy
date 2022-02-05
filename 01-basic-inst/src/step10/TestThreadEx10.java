package step10;
/*  step9 예제 풀이 
 	MakerFileWorker Thread -> 파일을 생성하는 스레드 
 	지정한 수만큼 (파일 30개) 지정한 시간 간격(1초)으로 랜덤하게 
 	확장별 파일( 0.mp3 , 1.avi ) 을  생성하여 
 	CommonInfo의 MAKE_PATH(C:\\kosta215\\repository)에 저장한다  
 	
 	
 	MoveFileWorker Thread -> 파일을 확장자별로 구분하여 지정한 디렉토리로 이동시키는 스레드
 	MAKE_PATH에 저장된 파일 확장자에 따라 
 	MOVIE_PATH와 MUSIC_PATH에 이동시킨다 
 	지정한 수(5)만큼 지정한 시간간격(7초)으로 이동시킨다
 */
public class TestThreadEx10 {
	public static void main(String[] args) {
		int makeCount=30; //생성할 파일수 
		int makePeriod=1000;//1초 간격으로 생성 
		int moveCount=5;//이동시킬 작업수 
		int movePeriod=7000;//7초 간격으로 이동 
		MakeFileWorker makeWorker=new MakeFileWorker(makeCount,makePeriod);
		MoveFileWorker moveWorker=new MoveFileWorker(moveCount,movePeriod);
		new Thread(makeWorker).start();
		new Thread(moveWorker).start();
	}
}














