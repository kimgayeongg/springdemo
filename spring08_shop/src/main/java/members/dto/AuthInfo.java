package members.dto;

//�α��� ���� �� ���� ���� ������ ���ǿ� ������ �� ���
public class AuthInfo {

	private String memberEmail;
	private String memberName;
	private String memberPass;
	
	public AuthInfo() {
	
}

	public AuthInfo(String memberEmail, String memberPass) {
		super();
		this.memberEmail = memberEmail;
		this.memberPass = memberPass;
	}

	public AuthInfo(String memberEmail, String memberName, String memberPass) {
		super();
		this.memberEmail = memberEmail;
		this.memberName = memberName;
		this.memberPass = memberPass;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getMemberPass() {
		return memberPass;
	}
	
}
