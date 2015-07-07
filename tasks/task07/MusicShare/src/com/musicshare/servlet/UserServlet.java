package com.musicshare.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.musicshare.service.SongService;
import com.musicshare.service.UserService;
import com.musicshare.bean.User;

public class UserServlet {

	 private UserService us = new UserService();
	 
	 
	 
	 public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  {
		 
			String name = request.getParameter("username");
			String pwd = request.getParameter("password");
			String email = request.getParameter("email");
			String phone = request.getParameter("phone");
			String sex = request.getParameter("sex");
			
			if(name==null || name.equals("") || pwd==null || pwd.equals("") ||
					email==null || email.equals("") || phone==null || phone.equals("") || sex==null || sex.equals(""))
				;
			
			User user = new User();
			Date date = new Date();
			
			response.setContentType("text/html;charset=utf-8");
			
			
			
			
		    PrintWriter out = response.getWriter();
		    out.println("<HTML>");
		    out.println("<HEAD>");
		    out.println("<TITLE>Hello Servlet</TITLE>");
		    try {
				us.login(name, pwd);
				out.println("<B>登陆成功</B>");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				out.println("<B>用户名或密码有误</B>");
			}
		    out.println("</HEAD>");
		    out.println("<BODY>");
		    out.println("</BODY>");
		    out.println("</HTML>");
		    out.close();
	} 
	 
	
	 
}
