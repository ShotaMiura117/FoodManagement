package test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ResultServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String forwardURL = null;

		try {
			List<RyoriBean> ryoriList = RyoriDAO.getRyoriList();
			request.setAttribute("ryoriList", ryoriList);
			forwardURL = "/design/ryoriZairyoKinyu.jsp";
		} catch (SQLException e) {
			e.printStackTrace();
			forwardURL = "/design/error.jsp";
		}
		request.getRequestDispatcher(forwardURL).forward(request, response);
	}


}
