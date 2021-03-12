package com.ltts.demoweb2.controller;

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
@WebServlet("/InsertPlayerServlet")
public class InsertPlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertPlayerServlet() {
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
		int no=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		//Date date=Date.valueOf(request.getParameter(date));
		String dob=request.getParameter("dob");
		
		Date date = Date.valueOf(dob);
		int age=Integer.parseInt(request.getParameter("age"));
		String email=request.getParameter("email");
		String country=request.getParameter("country");
		String skills=request.getParameter("skills");
		String batting=request.getParameter("bat_style");
		String bowling=request.getParameter("bowl_style");
		int match=Integer.parseInt(request.getParameter("match"));
		int run=Integer.parseInt(request.getParameter("run"));
		int wicket=Integer.parseInt(request.getParameter("wickets"));
		Player p=new Player(no,name,date,age,email,country,skills,batting,bowling,match,
				run,wicket);
		System.out.println("Inside Servlet: "+p);
		PlayerDao pd=new PlayerDao();
		boolean b=false;
		try {
			b=pd.insertPlayer(p); // Control TRanfers to Dao file
			System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
