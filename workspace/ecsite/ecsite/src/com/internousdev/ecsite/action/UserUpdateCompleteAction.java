package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserUpdateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateCompleteAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	private UserUpdateCompleteDAO userUpdateCompleteDAO = new UserUpdateCompleteDAO();

	public String execute(){

		userUpdateCompleteDAO.userUpdateInfo(session.get("loginUserId").toString(),
				session.get("loginPassword").toString(),
				session.get("userName").toString(),
				session.get("userAddress").toString(),
				session.get("userAddress1").toString(),
				session.get("userAddress2").toString(),
				session.get("userAddress3").toString(),
				session.get("sex").toString(),
				session.get("tell").toString(),
				session.get("defaultLoginId").toString());

		String result = SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
