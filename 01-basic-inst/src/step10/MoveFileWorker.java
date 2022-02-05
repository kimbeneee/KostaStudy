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
	/* ���۽����� MUSIC �� MOVIE PATH�� �ش��ϴ� ���丮�� ���� 
	 * Ȯ���ڸ� �� String endsWith() �� �̿� 
	 * MAKE_PATH ( repository ) ���丮����  File listFiles():File[] 
	 * �����̵� File renameTo() �޼��带 �̿��ؼ� �̵���Ų�� 
	 */
	@Override
	public void run() {
		for(int i=0;i<moveCount;i++) {
			//7�ʰ� ���� ����ϴ� �� 5�� �̵���Ų�� 
			try {
				Thread.sleep(movePeriod);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
			moveFiles();
			System.out.println("MoveFileWorker Thread�� ���ϵ��� �̵�");
		}		
	}
	/**
	 * Ư�� ���丮(repository)�� �ִ� ��� ���ϵ��� Ȯ���ں��� Ư�� ���丮(movie, music)�� 
	 * �̵���Ű�� �׽�Ʈ 
	 * 1. �̵���ų ���丮 Ȯ�� �� ������ ����
	 * 2. repository ���� ���� ���丮�� ���ϵ��� ������ Ȯ�� 
	 * 3. repository ���丮�� �ִ� ���ϵ��� Ȯ���ں��� ���� ���丮�� �̵� �׽�Ʈ  
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
		// �̵���ų ���丮�� �������ش�
		File movieDir = new File(CommonInfo.MOVIE_PATH);
		File musicDir = new File(CommonInfo.MUSIC_PATH);
		if (movieDir.isDirectory() == false)
			movieDir.mkdirs();
		if (musicDir.isDirectory() == false)
			musicDir.mkdirs();
	}
}






