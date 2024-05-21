package shokuzai_detail;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShokuzaiDetailServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String forwardURL = null;
		try {
			List<ShokuzaiBean> shokuzaiList = ShokuzaiDAO.getShokuzaiList();

			//			セッションに格納
			request.setAttribute("shokuzaiList", shokuzaiList);

			//			 食材リストの(1)番目をShokuzaibeanにセット
			ShokuzaiBean sbean = shokuzaiList.get(1);

			//			食材beanのデータをセッションに追加
			HttpSession session = request.getSession();
			session.setAttribute("item_name", sbean.getItem_name());
			session.setAttribute("materials_name", sbean.getMaterials_name());
			session.setAttribute("quantity", sbean.getQuantity());
			session.setAttribute("open_check", sbean.getOpen_check());
			session.setAttribute("save_method", sbean.getSave_method());
			session.setAttribute("genre_id", sbean.getGenre_id());
			session.setAttribute("filling_date", sbean.getFilling_date());
			session.setAttribute("expiration_date", sbean.getExpiration_date());
			session.setAttribute("volume", sbean.getVolume());
			session.setAttribute("unit_id", sbean.getUnit_id());
			session.setAttribute("favorite", sbean.getShokuzai_favorite());


			//			ShokuzaiDetailテスト
			forwardURL = "test_shokuzai_detail/shokuzaiDetail.jsp";

		} catch (SQLException e) {
			e.printStackTrace();
			forwardURL = "/test_shokuzai_detail/testerror.jsp";
			//			↑詳細ページが無い時に表示するjsp（食品詳細が無いとはありえないと思うが、、）
		}

		request.getRequestDispatcher(forwardURL).forward(request, response);
	}

}
