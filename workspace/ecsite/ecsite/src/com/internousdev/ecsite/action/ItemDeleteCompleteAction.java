package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemDeleteCompleteDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDeleteCompleteAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	public String execute() throws SQLException{

		@SuppressWarnings("unchecked")
		List<String> id=(List<String>) session.get("idList");
		for(int i=0; i<id.size(); i++){
			@SuppressWarnings("unchecked")
			List<BuyItemDTO> list=(List<BuyItemDTO>) session.get("itemDeleteList");
			int itemId=list.get(i).getId();

			ItemDeleteCompleteDAO dao=new ItemDeleteCompleteDAO();
			dao.itemDeleteInfo(itemId);
		}
		String result=SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
