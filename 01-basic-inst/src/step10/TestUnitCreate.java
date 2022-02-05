package step10;

import java.io.File;
import java.io.IOException;
import java.util.Random;

//파일 생성 단위 테스트 
//총 10개의 파일을 지정한 디렉토리에 생성 
//파일명은 0~9.mp3 or avi 로 만든다 
//확장자는 랜덤하게 부여한다 
class FileService{
	public void testCreateFile() throws IOException {
		File dir=new File(CommonInfo.MAKE_PATH);
		if(dir.isDirectory()==false)
			dir.mkdirs();
		//System.out.println("저장 디렉토리 생성");
		//for loop 
		for(int i=0;i<10;i++) {
			String fileName=createFileName(i);
			File file=new File(CommonInfo.MAKE_PATH+File.separator+fileName);
			file.createNewFile();
		}
	}
	//파일명 생성해서 반환하는 메서드 
	public String createFileName(int name) {
		String fileName=null;
		Random r=new Random();
		if(r.nextBoolean())
			fileName=name+".mp3";
		else
			fileName=name+".avi";
		return fileName;
	}
}
public class TestUnitCreate {
	public static void main(String[] args) {
		FileService service=new FileService();
		try {
			service.testCreateFile();
			System.out.println("**파일 생성 단위테스트 완료!**");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}




