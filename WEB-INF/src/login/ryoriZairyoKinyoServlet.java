package login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ryoriZairyo.ryoriDAO;
import ryoriZairyo.ryoriZairyoBean;

public class ryoriZairyoKinyoServlet {
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31J");
		String material_name = request.getParameter("zairyo");
		double volume = Double.parseDouble(request.getParameter("suryo"));
		String unit = request.getParameter("tani");

		String forwardURL = null;
		try {
			ryoriZairyoBean rbean = new ryoriZairyoBean(material_name, volume, unit);

			int saveCount = ryoriDAO.insert(rbean);

			if (saveCount < 1) {
				forwardURL = "";
			} else {
				forwardURL = "";
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			forwardURL = "";

		} catch (SQLException e) {
			e.printStackTrace();
			forwardURL = "";
		}
		request.getRequestDispatcher(forwardURL).forward(request, response);

	}

}
