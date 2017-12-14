package com.internousdev.ecsite1.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite1.dao.BuyItemDAO;
import com.internousdev.ecsite1.dao.LoginDAO;
import com.internousdev.ecsite1.dto.BuyItemDTO;
import com.internousdev.ecsite1.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
  private String loginUserId;
  private String loginPassword;

  public Map<String,Object> session;

  private LoginDAO loginDAO=new LoginDAO();
  private LoginDTO loginDTO=new LoginDTO();
  private BuyItemDAO buyItemDAO=new BuyItemDAO();


  public String execute(){
	  String result=ERROR;
	  loginDTO=loginDAO.getLoginUserInfo(loginUserId,loginPassword);
	  session.put("loginUser",loginDTO);

	  if(((LoginDTO) session.get("loginUser")).getLoginFlg()){
		  result=SUCCESS;

		  List<BuyItemDTO> buyItemDTO=buyItemDAO.getBuyItemInfo();
		  session.put("login_user_id1",loginDTO.getLoginId());
		  session.put("id1",((BuyItemDTO) buyItemDTO).getId());
		  session.put("buyItem_name1",((BuyItemDTO) buyItemDTO).getItemName());
		  session.put("buyItem_price1",((BuyItemDTO) buyItemDTO).getItemPrice());
		  session.put("login_user_id2",loginDTO.getLoginId());
		  session.put("id2",((BuyItemDTO) buyItemDTO).getId());
		  session.put("buyItem_name2",((BuyItemDTO) buyItemDTO).getItemName());
		  session.put("buyItem_price2",((BuyItemDTO) buyItemDTO).getItemPrice());

		  return result;
	  }
	  return result;
  }

  public String getLoginUserId(){
	  return loginUserId;
  }
  public void setLoginUserId(String loginUserId){
	  this.loginUserId=loginUserId;
  }

  public String getLoginPassword(){
	  return loginPassword;
  }
  public void setLoginPassword(String loginPassword){
	  this.loginPassword=loginPassword;
  }

  @Override
  public void setSession(Map<String,Object> session){
	  this.session=session;
  }
}
