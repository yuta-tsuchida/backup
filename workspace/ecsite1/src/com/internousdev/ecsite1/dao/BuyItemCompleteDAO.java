package com.internousdev.ecsite1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite1.util.DBConnector;
import com.internousdev.ecsite1.util.DateUtil;

public class BuyItemCompleteDAO {
  private DBConnector dbConnector=new DBConnector();
  private Connection connection=dbConnector.getConnection();
  private DateUtil dateUtil=new DateUtil();

  private String sql="INSERT INTO user_buy_item_transaction(item_transaction_id,total_price,total_count,user_master_id,pay,insert_date) VALUES(?,?,?,?,?,?)";


  public void buyItemInfo(String item_transaction_id,String user_master_id,String total_price,String total_count,String pay) throws SQLException{
	  try{
		  PreparedStatement preparedStatement=connection.prepareStatement(sql);
		  preparedStatement.setString(1, item_transaction_id);
		  preparedStatement.setString(2, total_price);
		  preparedStatement.setString(3, total_count);
		  preparedStatement.setString(4, user_master_id);
		  preparedStatement.setString(5, pay);
		  preparedStatement.setString(6, dateUtil.getDate());


//		  boolean ret =
		  preparedStatement.execute();
//		  if(ret==true){
//			  System.out.println("登録成功");
//		  }else{
//			  System.out.println("登録失敗");
//		  }

//		  int ret = preparedStatement.executeUpdate();
//		  if(ret >0 ){
//			  System.out.println("登録成功");
//		  }else{
//			  System.out.println("登録失敗");
//		  }

	  }catch(Exception e){
		  e.printStackTrace();
	  }finally{
		  connection.close();
	  }
  }
}