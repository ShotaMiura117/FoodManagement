package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RyoriServlet extends HttpServlet {
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31J");
		String materials_name = request.getParameter("zairyo");
		double volume = Double.parseDouble(request.getParameter("suryo"));
		String unit_id = request.getParameter("tani");
		//String forwardURL = null;
		PrintWriter out = response.getWriter();
		try {
			RyoriBean rbean = new RyoriBean(materials_name, volume, unit_id);
			int updateCount = RyoriDAO.insert1(rbean);
			if (updateCount < 1) {
				out.print("エラー");
			} else {
				out.print("成功");

			}
		} catch (NumberFormatException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
}

