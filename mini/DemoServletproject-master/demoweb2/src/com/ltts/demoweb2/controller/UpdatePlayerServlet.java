package com.ltts.demoweb2.controller;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.demoweb2.dao.PlayerDao;
import com.ltts.demoweb2.model.Player;

/**
 * Servlet implementation class InsertPlayerServlet
 */
@WebServlet("/UpdatePlayerServlet")

public class UpdatePlayerServlet extends HttpServlet  {
	
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePlayerServlet() {
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
		
		int id=Integer.parseInt(request.getParameter("id"));
		String pname=request.getParameter("name");
		String count=request.getParameter("country");
		RequestDispatcher rd=null;
		PlayerDao po=new PlayerDao();
		try {
			po.updatePlayer(id,pname,count);
			rd=request.getRequestDispatcher("success.html");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			rd=request.getRequestDispatcher("editPlayer.jsp");
			rd.include(request, response);
			e.printStackTrace();
		}

		}
	

}

