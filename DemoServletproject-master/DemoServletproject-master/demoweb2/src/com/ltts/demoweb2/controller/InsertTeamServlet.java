package com.ltts.demoweb2.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.demoweb2.dao.PlayerDao;
import com.ltts.demoweb2.dao.TeamDao;
import com.ltts.demoweb2.model.Team;

/**
 * Servlet implementation class InsertTeamServlet1
 */
@WebServlet("/InsertTeamServlet")
public class InsertTeamServlet  extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertTeamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out = response.getWriter();
		
		int tno=Integer.parseInt(request.getParameter("tid"));
		String tname=request.getParameter("tname");
		String ownerName=request.getParameter("owner");
		String coachName=request.getParameter("coach");
		
		Team t = new Team(tno, tname, ownerName, coachName);
		System.out.println("Inside Servlet: " +t);
		TeamDao pd=new TeamDao();
		boolean b=false;
//		try {
//			b=pd.insertTeam(t); // Control TRanfers to Dao file
//			System.out.println("Successfully Inserted...");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		RequestDispatcher rd=null;
		try {
			b=pd.insertTeam(t); // Control TRanfers to Dao file
			rd=request.getRequestDispatcher("success.html");
			rd.forward(request, response);
			//System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.write("Already Player id Used: "+e);
			rd=request.getRequestDispatcher("addplayer.html");
			rd.include(request, response);
			e.printStackTrace();
		}
	}

 
	
	
	
}
