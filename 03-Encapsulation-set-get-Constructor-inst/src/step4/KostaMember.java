package step4;

public class KostaMember {
	private String id;
	private String password;
	public void setId(String id) {
		//this�� ���� ��ü�� ����Ų��  this.id �� �ν��Ͻ� ���� id �̰� id �� �Ű����� id�̴�
		//�Ű����� id�� �ν��Ͻ����� id�� �����ϱ� ���� this java keyword�� ����Ѵ� 
		this.id=id;
	}
	public String getId() {
		return id;
	}
	//password�� ���� setter �� getter�� �����غ��� 
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
}
