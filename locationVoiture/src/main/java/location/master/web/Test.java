package location.master.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
	PrintWriter writer = res.getWriter();
	
	writer.println("Hello World !!!");
	}

}
