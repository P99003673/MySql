package com.ltts.demoweb2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ltts.demoweb2.configure.MyConnection;
import com.ltts.demoweb2.model.Auction;
import com.ltts.demoweb2.model.Player;
import com.ltts.demoweb2.model.Team;

public class AuctionDao {
	
	public boolean insertAuction(Auction a) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into auction values(?,?,?)");
		ps.setInt(1, a.getAuctionId());
		ps.setString(2, a.getPlayerName());
		ps.setInt(3, a.getPrice());
		
		
		return ps.execute();
		//return false;

		
	}
	

}
