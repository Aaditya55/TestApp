package Question4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/postdemo")
public class PostDemo extends HttpServlet {
public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		PrintWriter out = res.getWriter();
		out.println("YOU SELECTED POST TYPE REQUEST");
		out.close();
	}

}
