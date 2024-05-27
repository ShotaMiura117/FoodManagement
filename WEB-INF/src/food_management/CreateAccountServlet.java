package food_management;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateAccountServlet extends HttpServlet {


	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31j");

//		アカウント作成ページに入力された情報を取得

		String user_id = request.getParameter("user_id");
		String password = request.getParameter("password");

//		アカウント作成毎にpk_idが+1されるようにする
//		pk_id(主キー)はinsertすると勝手に+1される
//		サーブレット側で処理する必要は無い



//		session（またはアプリケーションスコープ）にpk_idを入れてアカウント作成時に初期値として代入

		String forwardURL = null;

		//		beanに登録
		try {
			CreateAccountBean cabean = new CreateAccountBean(user_id, password);

			int updateCount = CreateAccountDAO.insert(cabean);

			if (updateCount < 1) {
				forwardURL = "/test_shokuzai_detail/createError.jsp";
				System.out.println("アカウントを作成できませんでした");

			} else {
				forwardURL = "/test_shokuzai_detail/createAccount.jsp";
				System.out.println("アカウントを作成しました");			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			forwardURL = "/test_shokuzai_detail/createError.jsp";
			System.out.println("なんばーえくせぷしょん");

		} catch (SQLException e) {
			e.printStackTrace();
			forwardURL = "/test_shokuzai_detail/createError.jsp";

		}
		request.getRequestDispatcher(forwardURL).forward(request, response);
	}
}


