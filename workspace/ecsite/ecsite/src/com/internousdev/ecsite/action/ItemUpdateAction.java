package com.internousdev.ecsite.action;



import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemUpdateAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	private int id;



	public String execute(){

		session.put("id", id);

		System.out.println(id);

		String result=SUCCESS;
		return result;
	}

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}



	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
