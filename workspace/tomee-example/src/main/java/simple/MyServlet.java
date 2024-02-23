package simple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("In MyServlet.doGet()");
		ServletConfig sc = getServletConfig();
		String param = sc.getInitParameter("SimpleServletInitParam");
		PrintWriter out = resp.getWriter();
		out.println("This is the response from my servlet. My init param is " + param);
		out.flush();
	}
}
