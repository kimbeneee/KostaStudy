package step10;

import java.io.File;

public class MoveFileWorker implements Runnable{
	private int moveCount;
	private int movePeriod;
	
	public MoveFileWorker(int moveCount, int movePeriod) {
		super();
		this.moveCount = moveCount;
		this.movePeriod = movePeriod;
	}
	/* 시작시점에 MUSIC 과 MOVIE PATH에 해당하는 디렉토리를 생성 
	 * 확장자를 비교 String endsWith() 를 이용 
	 * MAKE_PATH ( repository ) 디렉토리에서  File listFiles():File[] 
	 * 파일이동 File renameTo() 메서드를 이용해서 이동시킨다 
	 */
	@Override
	public void run() {
		for(int i=0;i<moveCount;i++) {
			//7초간 먼저 대기하다 총 5번 이동시킨다 
			try {
				Thread.sleep(movePeriod);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
			moveFiles();
			System.out.println("MoveFileWorker Thread가 파일들을 이동");
		}		
	}
	/**
	 * 특정 디렉토리(repository)에 있는 모든 파일들을 확장자별로 특정 디렉토리(movie, music)에 
	 * 이동시키는 테스트 
	 * 1. 이동시킬 디렉토리 확인 후 없으면 생성
	 * 2. repository 파일 저장 디렉토리에 파일들의 정보를 확인 
	 * 3. repository 디렉토리에 있는 파일들을 확장자별로 지정 디렉토리로 이동 테스트  
	 */
	public void moveFiles() {
		makeCreateMoveDirs();
		File orgDir=new File(CommonInfo.MAKE_PATH);
		File[] orgList=orgDir.listFiles();
		for(int i=0;i<orgList.length;i++) {
			String destPath=null;
			if(orgList[i].getName().endsWith(".avi")) {				
				destPath=CommonInfo.MOVIE_PATH+File.separator+orgList[i].getName();
			}else {				
				destPath=CommonInfo.MUSIC_PATH+File.separator+orgList[i].getName();
			}//else
			File destFile=new File(destPath);
			orgList[i].renameTo(destFile);
		}//for
	}//method
	public void makeCreateMoveDirs() {
		// 이동시킬 디렉토리를 생성해준다
		File movieDir = new File(CommonInfo.MOVIE_PATH);
		File musicDir = new File(CommonInfo.MUSIC_PATH);
		if (movieDir.isDirectory() == false)
			movieDir.mkdirs();
		if (musicDir.isDirectory() == false)
			musicDir.mkdirs();
	}
}






