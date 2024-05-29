package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class save_Servlet extends HttpServlet {
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31J");
		String materials_name = request.getParameter("syokuzaiName");
		String item_name = request.getParameter("syouhinName");
		String expiration_date = request.getParameter("expiration_date");
		double volume = Double.parseDouble(request.getParameter("volume"));
		int unit_id = Integer.parseInt(request.getParameter("unit_id"));
		double quantity = Double.parseDouble(request.getParameter("quantity"));
		int genre_id = Integer.parseInt(request.getParameter("genre_id"));
		int open_check = Integer.parseInt(request.getParameter("open_check"));
		int save_method = Integer.parseInt(request.getParameter("save_method"));
		String filling_date = request.getParameter("filling_date");
		int shokuzai_favorite = Integer.parseInt(request.getParameter("shokuzai_favorite"));
		double default_volume = volume;

		response.setCharacterEncoding("Windows-31J");
		PrintWriter out = response.getWriter();
		String URL = null;
		try {
			EntryBean ebean = new EntryBean(materials_name, item_name, expiration_date, volume,
					unit_id, quantity, genre_id, open_check, save_method, filling_date, shokuzai_favorite,
					default_volume);

			int saveCount = EntryDAO.insert(ebean);

			if (saveCount < 1) {
				URL = "/design/tourokuError.jsp";
			} else {
				URL = "/design/tourokuSuccess.jsp";
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
			URL = "/design/tourokuError.jsp";
		} catch (SQLException e) {
			e.printStackTrace();
			URL = "/design/tourokuError.jsp";

		}
		request.getRequestDispatcher(URL).forward(request, response);

	}

}
