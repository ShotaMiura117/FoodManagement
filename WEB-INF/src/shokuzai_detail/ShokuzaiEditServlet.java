package shokuzai_detail;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShokuzaiEditServlet extends HttpServlet {
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31j");
		HttpSession session = request.getSession();

		//		食材詳細で生成したセッションの食材IDを取得
		int shokuzai_id = (int) session.getAttribute("shokuzai_id");

		//		編集ページに入力された情報を取得
		String materials_name = request.getParameter("materials_name");
		String item_name = request.getParameter("item_name");
		double quantity = Double.parseDouble(request.getParameter("quantity"));
		int open_check = Integer.parseInt(request.getParameter("open_check"));
		int save_method = Integer.parseInt(request.getParameter("save_method"));
		int genre_id = Integer.parseInt(request.getParameter("genre_id"));
		String filling_date = request.getParameter("filling_date");
		String expiration_date = request.getParameter("expiration_date");
		double volume = Double.parseDouble(request.getParameter("volume"));
		int unit_id = Integer.parseInt(request.getParameter("unit_id"));
		int shokuzai_favorite = Integer.parseInt(request.getParameter("favorite"));

		String forwardURL = null;

		//		beanに登録
		try {
			ShokuzaiEditBean sebean = new ShokuzaiEditBean(shokuzai_id, materials_name, item_name,
					quantity, open_check, save_method,
					genre_id, filling_date, expiration_date,
					volume, unit_id, shokuzai_favorite);
			int updateCount = ShokuzaiDAO.insert(sebean);

			if (updateCount < 1) {
				forwardURL = "/test_shokuzai_detail/testerror.jsp";
			} else {
				forwardURL = "/test_shokuzai_detail/testEditSuccess.jsp";
				System.out.println("食材情報を更新しました");			}
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
