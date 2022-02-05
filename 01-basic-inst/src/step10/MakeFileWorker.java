package step10;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class MakeFileWorker implements Runnable{
	private int makeCount;
	private int makePeriod;
	
	public MakeFileWorker(int makeCount, int makePeriod) {
		super();
		this.makeCount = makeCount;
		this.makePeriod = makePeriod;
	}
	/* ���۽����� MAKE PATH�� �ش��ϴ� ���丮�� ���� 
	 * 
	 * ���� ����  File class�� createNewFile() 
	 * Ȯ���ڸ� ���� ( .mp3 or .avi ) -> Random class�� nextBoolean() : true or false 
	 * ���ϸ��� �ܼ��ϰ� 0.mp3 ~~~ 29.avi �� ó���Ѵ� 
	 */
	@Override
	public void run() {
		try {
			createFile();
		} catch (IOException | InterruptedException e) {			
			e.printStackTrace();
		}		
	}
	public void createFile() throws IOException, InterruptedException {
		File dir=new File(CommonInfo.MAKE_PATH);
		if(dir.isDirectory()==false)
			dir.mkdirs();
		for(int i=0;i<makeCount;i++) {
			String fileName=createFileName(i);
			File file=new File(CommonInfo.MAKE_PATH+File.separator+fileName);
			file.createNewFile();
			System.out.println(fileName+" ���� - MakeFileWorker Thread");
			Thread.sleep(makePeriod);
		}
	}
	//���ϸ� �����ؼ� ��ȯ�ϴ� �޼��� 
	//�ߺ��� ���ϸ��� �����ϱ� ���� ���ϸ� �ð������� �߰��Ѵ� 
	public String createFileName(int name) {
		String fileName=null;
		long time=System.currentTimeMillis();
		Random r=new Random();
		if(r.nextBoolean())
			fileName=name+"_"+time+".mp3";
		else
			fileName=name+"_"+time+".avi";
		return fileName;
	}
}












