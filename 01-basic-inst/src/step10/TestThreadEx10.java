package step10;
/*  step9 ���� Ǯ�� 
 	MakerFileWorker Thread -> ������ �����ϴ� ������ 
 	������ ����ŭ (���� 30��) ������ �ð� ����(1��)���� �����ϰ� 
 	Ȯ�庰 ����( 0.mp3 , 1.avi ) ��  �����Ͽ� 
 	CommonInfo�� MAKE_PATH(C:\\kosta215\\repository)�� �����Ѵ�  
 	
 	
 	MoveFileWorker Thread -> ������ Ȯ���ں��� �����Ͽ� ������ ���丮�� �̵���Ű�� ������
 	MAKE_PATH�� ����� ���� Ȯ���ڿ� ���� 
 	MOVIE_PATH�� MUSIC_PATH�� �̵���Ų�� 
 	������ ��(5)��ŭ ������ �ð�����(7��)���� �̵���Ų��
 */
public class TestThreadEx10 {
	public static void main(String[] args) {
		int makeCount=30; //������ ���ϼ� 
		int makePeriod=1000;//1�� �������� ���� 
		int moveCount=5;//�̵���ų �۾��� 
		int movePeriod=7000;//7�� �������� �̵� 
		MakeFileWorker makeWorker=new MakeFileWorker(makeCount,makePeriod);
		MoveFileWorker moveWorker=new MoveFileWorker(moveCount,movePeriod);
		new Thread(makeWorker).start();
		new Thread(moveWorker).start();
	}
}














