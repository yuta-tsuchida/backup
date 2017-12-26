package com.internousdev.ecsite.dto;

public class LoginDTO {

	private String loginId;

	private String loginPassword;

	private String userName;

	private String userAddress;

	private boolean loginFlg = false;

	private boolean loginMaster = false;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean getLoginFlg() {
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}

	public boolean getLoginMaster(){
		return loginMaster;
	}

	public void setLoginMaster(boolean loginMaster){
		this.loginMaster=loginMaster;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
}
