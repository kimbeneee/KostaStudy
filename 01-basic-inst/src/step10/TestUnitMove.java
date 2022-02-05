package step10;

import java.io.File;

/* File Move 
   1. renameTo() �� �̿��� ���� �ϳ��� �̵� 
   2. Ư�� ���丮�� �ִ� ��� ���ϵ��� ������ ���丮�� �̵� 	
*/
class FileMoveService {
	public void makeCreateMoveDirs() {
		// �̵���ų ���丮�� �������ش�
		File movieDir = new File(CommonInfo.MOVIE_PATH);
		File musicDir = new File(CommonInfo.MUSIC_PATH);
		if (movieDir.isDirectory() == false)
			movieDir.mkdirs();
		if (musicDir.isDirectory() == false)
			musicDir.mkdirs();
	}
	/**
	 * �ϳ��� ������ ������ ���丮�� �̵���Ű�� �׽�Ʈ 
	 */
	public void moveTest1() {
		makeCreateMoveDirs();
		File orgFile = new File(CommonInfo.MAKE_PATH + File.separator + "5.mp3");
		File destFile = null;
		if (orgFile.getName().endsWith(".avi")) {
			destFile = new File(CommonInfo.MOVIE_PATH + File.separator + orgFile.getName());
		} else {// mp3�϶�
			destFile = new File(CommonInfo.MUSIC_PATH + File.separator + orgFile.getName());
		}
		boolean flag = orgFile.renameTo(destFile);
		System.out.println("move:" + flag);
	}
	/**
	 * Ư�� ���丮(repository)�� �ִ� ��� ���ϵ��� Ȯ���ں��� Ư�� ���丮(movie, music)�� 
	 * �̵���Ű�� �׽�Ʈ 
	 * 1. �̵���ų ���丮 Ȯ�� �� ������ ����
	 * 2. repository ���� ���� ���丮�� ���ϵ��� ������ Ȯ�� 
	 * 3. repository ���丮�� �ִ� ���ϵ��� Ȯ���ں��� ���� ���丮�� �̵� �׽�Ʈ  
	 */
	public void moveTest2() {
		makeCreateMoveDirs();
		File orgDir=new File(CommonInfo.MAKE_PATH);
		File[] orgList=orgDir.listFiles();
		for(int i=0;i<orgList.length;i++) {
			String destPath=null;
			if(orgList[i].getName().endsWith(".avi")) {
				//System.out.println(orgList[i].getName()+" movie�� �̵�");
				destPath=CommonInfo.MOVIE_PATH+File.separator+orgList[i].getName();
			}else {
				//System.out.println(orgList[i].getName()+" music���� �̵�");
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
		//1. moveTest1() �׽�Ʈ 
		//service.moveTest1();
		//2. moveTest2() �׽�Ʈ 
		service.moveTest2();
	}
}









