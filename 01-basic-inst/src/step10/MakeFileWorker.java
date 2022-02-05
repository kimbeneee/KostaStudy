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
	/* 시작시점에 MAKE PATH에 해당하는 디렉토리를 생성 
	 * 
	 * 파일 생성  File class의 createNewFile() 
	 * 확장자를 랜덤 ( .mp3 or .avi ) -> Random class의 nextBoolean() : true or false 
	 * 파일명은 단순하게 0.mp3 ~~~ 29.avi 로 처리한다 
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
			System.out.println(fileName+" 생성 - MakeFileWorker Thread");
			Thread.sleep(makePeriod);
		}
	}
	//파일명 생성해서 반환하는 메서드 
	//중복된 파일명을 방지하기 위해 파일명에 시간정보를 추가한다 
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












