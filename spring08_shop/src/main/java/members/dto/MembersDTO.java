package members.dto;

import common.exception.WrongEmailPasswordException;

public class MembersDTO {
	private String memberEmail; // �̸���
	private String memberPass; // ��й�ȣ
	private String memberName; // �̸�
	private String memberPhone;// ��ȭ��ȣ
	private int memberType; // ȸ������ �Ϲ�ȸ�� 1, ������ 2
	private boolean rememberEmail; // �ڵ� �α���

	public MembersDTO() {

	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPass() {
		return memberPass;
	}

	public void setMemberPass(String memberPass) {
		this.memberPass = memberPass;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public int getMemberType() {
		return memberType;
	}

	public void setMemberType(int memberType) {
		this.memberType = memberType;
	}

	public boolean isRememberEmail() {
		return rememberEmail;
	}

	public void setRememberEmail(boolean rememberEmail) {
		this.rememberEmail = rememberEmail;
	}

	public boolean mathPassword(String memberPass) {
		return this.memberPass.equals(memberPass);
	}

	public void changePassword(String oldPassword, String newPassword) {
		if (!memberPass.equals(oldPassword))// table���� ������ ��й�ȣ�� ���� ��и�ȣ�� ��//�������� �ƴ��� �����ϴ°�
			throw new WrongEmailPasswordException();
		this.memberPass = newPassword; //this table���� ������ ��й�ȣ �� ���ο� ��й�ȣ�� �־���
	}
}
