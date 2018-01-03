package com.internousdev.ecsite.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemSearchDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemSearchAction extends ActionSupport implements SessionAware {

	/**
	 * 検索ワード
	 */
	private String searchWord;

	public Map<String, Object> session;

	/**
	 * 検索結果格納List
	 */
	private List<BuyItemDTO> buyItemDTOList;

	/**
	 * 検索結果取得
	 */
	private ItemSearchDAO itemSearchDAO = new ItemSearchDAO();

	/**
	 * 実行メソッド
	 *
	 */
	@SuppressWarnings("unchecked")
	public String execute(){

		String result = ERROR;


		 //ワードを入力した時のみ実行
		if(searchWord.equals("")){

			result = ERROR;
			buyItemDTOList =(List<BuyItemDTO>) session.get("buyItemDTOList");

		}else{

			buyItemDTOList = itemSearchDAO.getItemInfo(searchWord);

			if(buyItemDTOList != null){
				session.put("buyItemDTOList", buyItemDTOList);

				result = SUCCESS;
			}else{
				result = ERROR;
				buyItemDTOList =(List<BuyItemDTO>) session.get("buyItemDTOList");
			}
		}

		return result;
	}


	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}


	public List<BuyItemDTO> getBuyItemDTOList(){
		return buyItemDTOList;
	}

	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList){
		this.buyItemDTOList=buyItemDTOList;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session=session;
	}
}
