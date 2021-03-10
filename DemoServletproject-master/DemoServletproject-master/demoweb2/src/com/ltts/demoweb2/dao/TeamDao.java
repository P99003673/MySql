
package com.ltts.demoweb2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ltts.demoweb2.configure.MyConnection;
import com.ltts.demoweb2.model.Player;
import com.ltts.demoweb2.model.Team;

public class TeamDao {
	
	public boolean insertTeam(Team t) throws Exception {

	Connection mc=MyConnection.getConnection(); // TRanfers control to another 
	PreparedStatement ps=mc.prepareStatement("insert into team values(?,?,?,?)");
	ps.setInt(1, t.getTeamId());
	ps.setString(2, t.getTeamName());
	ps.setString(3, t.getOwnerName());
	ps.setString(4, t.getCoachName());
	
	return ps.execute();
	//return false;

	
}

}	
	

