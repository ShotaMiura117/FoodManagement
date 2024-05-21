package shokuzai_detail;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShokuzaiDetailServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String forwardURL = null;
		try {
			List<ShokuzaiBean> shokuzaiList = ShokuzaiDAO.getShokuzaiList();
			request.setAttribute("shokuzaiList", shokuzaiList);

			//			正式なurl
			//						forwardURL = "/design/syohinsyosai.jsp";

			//			ShokuzaiDetailテスト用
			forwardURL = "test_shokuzai_detail/shokuzaiDetail.jsp";

		} catch (SQLException e) {
			e.printStackTrace();
			forwardURL = "/test_shokuzai_detail/testerror.jsp";
			//			↑詳細ページが無い時に表示するjsp（食品詳細が無いとはありえないと思うが、、）
		}

		request.getRequestDispatcher(forwardURL).forward(request, response);
	}

}
