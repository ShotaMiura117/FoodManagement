package test;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RyoriServlet extends HttpServlet {

	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31J");
		//get values of text field
		String name = request.getParameter("name");
		int time = Integer.parseInt(request.getParameter("time"));
		String materials_name = request.getParameter("zairyo");
		int volume = Integer.parseInt(request.getParameter("suryo"));
		String unit = request.getParameter("tani");

		String URL = null;

		try {
			RyoriBean rbean = new RyoriBean(name, time, materials_name, volume, unit);

			int count = RyoriDAO.insertryori(rbean);

			if (count < 1) {
				URL = "/design/error.jsp";
			} else {
				URL = "/design/sucess.jsp";
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			URL = "/design/error.jsp";

		} catch (SQLException e) {
			e.printStackTrace();
			URL = "/design/error.jsp";
		}
		request.getRequestDispatcher(URL).forward(request, response);

	}

}