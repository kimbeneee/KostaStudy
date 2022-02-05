package step10;

import java.io.File;
import java.io.IOException;
import java.util.Random;

//���� ���� ���� �׽�Ʈ 
//�� 10���� ������ ������ ���丮�� ���� 
//���ϸ��� 0~9.mp3 or avi �� ����� 
//Ȯ���ڴ� �����ϰ� �ο��Ѵ� 
class FileService{
	public void testCreateFile() throws IOException {
		File dir=new File(CommonInfo.MAKE_PATH);
		if(dir.isDirectory()==false)
			dir.mkdirs();
		//System.out.println("���� ���丮 ����");
		//for loop 
		for(int i=0;i<10;i++) {
			String fileName=createFileName(i);
			File file=new File(CommonInfo.MAKE_PATH+File.separator+fileName);
			file.createNewFile();
		}
	}
	//���ϸ� �����ؼ� ��ȯ�ϴ� �޼��� 
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
			System.out.println("**���� ���� �����׽�Ʈ �Ϸ�!**");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}




