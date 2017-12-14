package com.internousdev.ecsite1.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite1.dao.MyPageDAO;
import com.internousdev.ecsite1.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware {
  public Map<String,Object> session;

  private MyPageDAO myPageDAO=new MyPageDAO();

  public ArrayList<MyPageDTO> myPageList=new ArrayList<MyPageDTO>();

  private String deleteFlg;
  private String message;



  /**
   * 商品履歴取得メソッド
   */

  public String execute() throws SQLException{
	  if(!session.containsKey("id")){
		  return ERROR;
	  }
System.out.println(deleteFlg);
	  if(deleteFlg==null){
		  String item_transaction_id=session.get("id").toString();
		  String user_master_id=session.get("login_user_id").toString();
		  System.out.println(item_transaction_id);
		  System.out.println(user_master_id);

		  myPageList=myPageDAO.getMyPageUserInfo(item_transaction_id,user_master_id);

		  Iterator<MyPageDTO> iterator=myPageList.iterator();
		  if(!(iterator.hasNext())){
			  myPageList=null;
		  }
	  }else if(deleteFlg.equals("1")){
		  delete();
	  }
	  String result=SUCCESS;
	  return result;
  }

  /**
   * 商品履歴削除
   */

  public void delete() throws SQLException{
	  String item_transaction_id=session.get("id").toString();
	  String user_master_id=session.get("login_user_id").toString();

	  int res=myPageDAO.buyItemHistoryDelete(item_transaction_id,user_master_id);

	  if(res>0){
		  myPageList=null;
		  setMessage("商品情報を正しく削除しました。");
	  }else if(res==0){
		  setMessage("商品情報の削除に失敗しました。");
	  }
  }

  public String getDeleteFlg(){
	  return deleteFlg;
  }
  public void setDeleteFlg(String deleteFlg){
	  this.deleteFlg=deleteFlg;
  }

  @Override
  public void setSession(Map<String,Object> session){
	  this.session=session;
  }
  public String getMessage(){
	  return message;
  }
  public void setMessage(String message){
	  this.message=message;
  }
}
