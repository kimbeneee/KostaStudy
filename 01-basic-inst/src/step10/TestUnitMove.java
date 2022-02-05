package step10;

import java.io.File;

/* File Move 
   1. renameTo() 를 이용해 파일 하나를 이동 
   2. 특정 디렉토리에 있는 모든 파일들을 지정한 디렉토리로 이동 	
*/
class FileMoveService {
	public void makeCreateMoveDirs() {
		// 이동시킬 디렉토리를 생성해준다
		File movieDir = new File(CommonInfo.MOVIE_PATH);
		File musicDir = new File(CommonInfo.MUSIC_PATH);
		if (movieDir.isDirectory() == false)
			movieDir.mkdirs();
		if (musicDir.isDirectory() == false)
			musicDir.mkdirs();
	}
	/**
	 * 하나의 파일을 지정한 디렉토리로 이동시키는 테스트 
	 */
	public void moveTest1() {
		makeCreateMoveDirs();
		File orgFile = new File(CommonInfo.MAKE_PATH + File.separator + "5.mp3");
		File destFile = null;
		if (orgFile.getName().endsWith(".avi")) {
			destFile = new File(CommonInfo.MOVIE_PATH + File.separator + orgFile.getName());
		} else {// mp3일때
			destFile = new File(CommonInfo.MUSIC_PATH + File.separator + orgFile.getName());
		}
		boolean flag = orgFile.renameTo(destFile);
		System.out.println("move:" + flag);
	}
	/**
	 * 특정 디렉토리(repository)에 있는 모든 파일들을 확장자별로 특정 디렉토리(movie, music)에 
	 * 이동시키는 테스트 
	 * 1. 이동시킬 디렉토리 확인 후 없으면 생성
	 * 2. repository 파일 저장 디렉토리에 파일들의 정보를 확인 
	 * 3. repository 디렉토리에 있는 파일들을 확장자별로 지정 디렉토리로 이동 테스트  
	 */
	public void moveTest2() {
		makeCreateMoveDirs();
		File orgDir=new File(CommonInfo.MAKE_PATH);
		File[] orgList=orgDir.listFiles();
		for(int i=0;i<orgList.length;i++) {
			String destPath=null;
			if(orgList[i].getName().endsWith(".avi")) {
				//System.out.println(orgList[i].getName()+" movie로 이동");
				destPath=CommonInfo.MOVIE_PATH+File.separator+orgList[i].getName();
			}else {
				//System.out.println(orgList[i].getName()+" music으로 이동");
				destPath=CommonInfo.MUSIC_PATH+File.separator+orgList[i].getName();
			}//else
			File destFile=new File(destPath);
			orgList[i].renameTo(destFile);
		}//for
	}//method
}//class

public class TestUnitMove {
	public static void main(String[] args) {
		FileMoveService service = new FileMoveService();
		//1. moveTest1() 테스트 
		//service.moveTest1();
		//2. moveTest2() 테스트 
		service.moveTest2();
	}
}









