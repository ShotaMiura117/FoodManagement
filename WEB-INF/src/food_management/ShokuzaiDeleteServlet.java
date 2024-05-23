package food_management;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShokuzaiDeleteServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31j");
		HttpSession session = request.getSession();

		//		食材詳細で生成したセッションの食材IDを取得
		int shokuzai_id = (int) session.getAttribute("shokuzai_id");
		System.out.println(shokuzai_id);

		String forwardURL = null;

		try {

			int updateCount = ShokuzaiDAO.delete(shokuzai_id);

			if (updateCount < 1) {
				forwardURL = "/test_shokuzai_detail/testerror.jsp";
				System.out.println("削除失敗");
			} else {
				forwardURL = "/test_shokuzai_detail/deleteFinish.jsp";
				System.out.println("食材データを削除しました");
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
