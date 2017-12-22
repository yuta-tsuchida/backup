package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class ItemDeleteCompleteDAO {

	private DBConnector db=new DBConnector();

	private Connection con=db.getConnection();

	private String sql="DELETE FROM item_info_transaction WHERE id = ?";

	public void itemDeleteInfo(int id) throws SQLException{

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}
}
