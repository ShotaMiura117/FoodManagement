package shokuzaiList;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		if (session != null) {
			session.invalidate();
		}
		response.sendRedirect("shokuzaiListtest/logout.jsp");

		System.out.println("ログアウトしました。");
		System.out.println("<a herf=\"Foodmanagementtop.jsp\">");

	}
}
