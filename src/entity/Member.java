package entity;

public class Member {
	
	//�t�B�[���h
	private int id;
	private String name;
	private String email;
	
	//�f�t�H���g�R���X�g���N�^
	public Member() {}
	
	//�����L��R���X�g���N�^
	public Member(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	//�Q�b�^�[�Z�b�^�[
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	};
	
}
