package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDeleteAction extends ActionSupport implements SessionAware {

	private List<String> idList;

	public Map<String,Object> session;

	private ArrayList<BuyItemDTO> itemDeleteList=new ArrayList<>();

	@SuppressWarnings("unchecked")
	public String execute(){

		System.out.println(idList);
		System.out.println(idList.size());

		session.put("idList", idList);
		session.put("idListSize", idList.size());

		for(int i=0; i<idList.size(); i++){
			List<BuyItemDTO> list=(ArrayList<BuyItemDTO>) session.get("buyItemDTOList");
			int id=Integer.parseInt(idList.get(i));
			String itemName=list.get(id - 1).getItemName();
			String itemPrice=list.get(id - 1).getItemPrice();
			int itemStock=list.get(id - 1).getItem_stock();

			System.out.println(itemName);

			BuyItemDTO dto=new BuyItemDTO();
			dto.setId(id);
			dto.setItemName(itemName);
			dto.setItemPrice(itemPrice);
			dto.setItem_stock(itemStock);
			itemDeleteList.add(dto);
			session.put("itemDeleteList", itemDeleteList);
		}


		String result=SUCCESS;
		return result;
	}

	public List<String> getId(){
		return idList;
	}

	public void setId(List<String> idList){
		this.idList=idList;
	}

	public ArrayList<BuyItemDTO> getItemDeleteList(){
		return itemDeleteList;
	}
	public void setItemDeleteList(ArrayList<BuyItemDTO> itemDeleteList){
		this.itemDeleteList=itemDeleteList;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
