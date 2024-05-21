package shokuzai_detail;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShokuzaiEditServlet extends HttpServlet {
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31j");

		String materials_name = request.getParameter("syouhinName");
		String item_name = request.getParameter("syokuzaiName");
		String quantity = request.getParameter("quantity");
		String open_check = request.getParameter("open_check");
		String save_method = request.getParameter("save_method");
		String genre_id = request.getParameter("genre_id");
		String filling_date = request.getParameter("filling_date");
		String expiration_date = request.getParameter("expiration_date");
		double volume = Double.parseDouble(request.getParameter("volume"));
		int unit_id = Integer.parseInt(request.getParameter("unit_id"));
		int shokuzai_favorite = Integer.parseInt(request.getParameter("favorite"));

		String forwardURL = null;

		try {
			ShokuzaiEditBean sebean = new ShokuzaiEditBean(materials_name, item_name,
					Double.parseDouble(quantity), Integer.parseInt(open_check), Integer.parseInt(save_method),
					Integer.parseInt(genre_id), filling_date, expiration_date,
					volume, unit_id, shokuzai_favorite);
			int updateCount = ShokuzaiDAO.insert(sebean);

			if (updateCount < 1) {
				forwardURL = "/test_shokuzai_detail/testerror.jsp";
			} else {
				forwardURL = "/test_shokuzai_detail/testEditSuccess.jsp";
				System.out.println("食材情報を更新しました");

			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			forwardURL = "/test_shokuzai_detail/testerror.jsp";
		} catch (SQLException e) {
			e.printStackTrace();
			forwardURL = "/test_shokuzai_detail/testerror.jsp";
		}
		request.getRequestDispatcher(forwardURL).forward(request, response);
	}
}
