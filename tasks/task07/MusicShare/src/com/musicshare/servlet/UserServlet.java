package com.musicshare.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.musicshare.service.SongService;
import com.musicshare.service.UserService;

public class UserServlet {

	 private UserService us = new UserService();
	 
	 
	 
	 public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  {
		 
			String user = request.getParameter("user");
			String pwd = request.getParameter("password");
			response.setContentType("text/html;charset=gb2312");
		    PrintWriter out = response.getWriter();
		    out.println("<HTML>");
		    out.println("<HEAD>");
		    out.println("<TITLE>Hello Servlet</TITLE>");
		    try {
				us.login(user, pwd);
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
