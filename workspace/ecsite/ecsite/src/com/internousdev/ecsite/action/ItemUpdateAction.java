package com.internousdev.ecsite.action;



import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemUpdateAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	private int id;

	private ArrayList<BuyItemDTO> list=new ArrayList<>();

	@SuppressWarnings("unchecked")
	public String execute(){

		list=(ArrayList<BuyItemDTO>) session.get("buyItemDTOList");
		String itemName=list.get(id - 1).getItemName();
		String itemPrice=list.get(id - 1).getItemPrice();
		int itemStock=list.get(id - 1).getItem_stock();

		session.put("itemName", itemName);
		session.put("itemPrice", itemPrice);
		session.put("itemStock", itemStock);

		System.out.println(itemName);

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
