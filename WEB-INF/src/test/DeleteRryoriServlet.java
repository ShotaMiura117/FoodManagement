package test;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteRryoriServlet {
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31j");

		String name = request.getParameter("name");

		String forwardURL = null;
		String msg = null;
		if ("".equals(name) || name == null) {
			msg = "何も入力してないです。";
		}

		if (msg == null) {
			try {
				int updateCount = RyoriDAO.deleteRyoriById(name);

				if (updateCount < 1) {
					msg = "削除失敗しました";
				} else {
					msg = name + "削除しました.";
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();

			} catch (SQLException e) {
				e.printStackTrace();

			}
			request.getRequestDispatcher(forwardURL).forward(request, response);
		} else {
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("/design/ryoriZairyoKinyu.jsp").forward(request, response);
			return; // Stop further execution
		}
	}

}
