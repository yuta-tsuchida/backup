package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.MasterDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterConfirmAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	private ArrayList<BuyItemDTO> buyItemDTOList=new ArrayList<>();
	private ArrayList<MyPageDTO> myPageDTOList=new ArrayList<>();



	@SuppressWarnings("unchecked")
	public String execute() throws SQLException{

		buyItemDTOList=(ArrayList<BuyItemDTO>) session.get("list");

		for(int i=0; i<buyItemDTOList.size(); i++){

			int count=buyItemDTOList.get(i).getCount();
			int itemStock=buyItemDTOList.get(i).getItem_stock();
			int id=buyItemDTOList.get(i).getId();
			int totalCount=buyItemDTOList.get(i).getTotal_count();
			String itemName=buyItemDTOList.get(i).getItemName();

			String c=String.valueOf(totalCount);
			MyPageDTO myPageDTO=new MyPageDTO();
			myPageDTO.setItemName(itemName);
			myPageDTO.setTotalCount(c);

			myPageDTOList.add(myPageDTO);




		MasterDAO masterDAO=new MasterDAO();
		masterDAO.itemInfo(totalCount,id);
		}

		String result=SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
