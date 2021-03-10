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
		PreparedStatement ps=mc.prepareStatement("insert into player values(?,?,?,?,?,?,?,?,?,?,?)");
		
		ps.setString(1, p.getName());
		ps.setDate(2,(Date) p.getDateOfBirth());
		ps.setInt(3, p.getAge());
		ps.setString(4,p.getEmail());
		ps.setString(5, p.getCountry());
		ps.setString(6, p.getSkills());
		ps.setString(7, p.getBatting());
		ps.setString(8, p.getBowling());
		ps.setInt(9, p.getMatch());
		ps.setInt(10, p.getRuns());
		ps.setInt(11, p.getWickets());
		
		
		return ps.execute();
		//return false;

		
	}
	public List<Player> getAllPlayers() throws Exception{
		List<Player> li=new ArrayList<Player>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from web_player");
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Player(rs.getString(1),rs.getDate(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getInt(9),
					rs.getInt(10),rs.getInt(11)));

		}
		return li;

	}
	public Player getPlayerById(int id) throws Exception {
		Player p=new Player();
		List<Player> li=getAllPlayers();
		for(Player p1:li) {
			if(p1.getName() == name) {
				p.setName(name);
				p.setName(p1.getName());
				p.setCountry(p1.getCountry());
			}
			System.out.println(p1);
		}

		return p;
	}


}
