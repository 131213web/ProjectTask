package com.musicshare.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.musicshare.dao.SongDao;
import com.musicshare.service.SongService;



public class SongServlet extends HttpServlet{

	private SongService ss = new SongService();
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  {
	    response.setContentType("text/html;charset=gb2312");
	    //SongDao songDao =  request.getParameter("song");
	    String name = request.getParameter("name");
	    PrintWriter out = response.getWriter();
	    out.println("<HTML>");
	    out.println("<HEAD>");
	    out.println("<TITLE>Hello Servlet</TITLE>");
	    out.println("</HEAD>");
	    out.println("<BODY>");
	    
	    try {
			ss.findSong(name);
			out.println("<B>查找成功</B>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.println("<B>没有找到匹配项</B>");
		}
	    out.println("</BODY>");
	    out.println("</HTML>");
	    out.close();
}  

}
