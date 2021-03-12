package com.ltts.demoweb2.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.demoweb2.configure.MyConnection;
import com.ltts.demoweb2.model.Player;

public class PlayerDao {
	
	public boolean insertPlayer(Player p) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into player values(?,?,?,?,?,?,?,?,?,?,?,?)");
		
		ps.setInt(1,p.getPlayerId());
		ps.setString(2, p.getName());
		ps.setDate(3,(Date) p.getDateOfBirth());
		ps.setInt(4, p.getAge());
		ps.setString(5,p.getEmail());
		ps.setString(6, p.getCountry());
		ps.setString(7, p.getSkills());
		ps.setString(8, p.getBatting());
		ps.setString(9, p.getBowling());
		ps.setInt(10, p.getMatch());
		ps.setInt(11, p.getRuns());
		ps.setInt(12, p.getWickets());
		
		
		return ps.execute();
		//return false;

		
	}
	public List<Player> getAllPlayers() throws Exception{
		List<Player> li=new ArrayList<Player>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from player");
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Player(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getInt(4),
					rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),
					rs.getInt(11),rs.getInt(12)));

		}
		return li;

	}
	public Player getPlayerById(int id) throws Exception {
		Player p=new Player();
		List<Player> li=getAllPlayers();
		for(Player p1:li) {
			if(p1.getPlayerId() == id) {
				p.setPlayerId(id);
				p.setName(p1.getName());
				p.setCountry(p1.getCountry());
			}
		}
		
		return p;
	}
	
	public Boolean updatePlayer(int id,String name,String count) throws Exception
	{
		Connection mc=MyConnection.getConnection();
		PreparedStatement ps=mc.prepareStatement("UPDATE player SET playername=?,country=? where playerid=?");
		ps.setString(1,name);
		ps.setString(2, count);
		ps.setInt(3,id);
		Boolean b=ps.execute();
		return b;
	}




}
