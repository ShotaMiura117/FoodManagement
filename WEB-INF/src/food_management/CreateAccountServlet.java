package food_management;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateAccountServlet {
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31j");

//		アカウント作成ページに入力された情報を取得

		String user_id = request.getParameter("user_id");
		String password = request.getParameter("password");
		long pk_id = 1;


		String forwardURL = null;

		//		beanに登録
		try {
			CreateAccountBean cabean = new CreateAccountBean(pk_id, user_id, password);

			int updateCount = CreateAccountDAO.insert(cabean);

			if (updateCount < 1) {
				forwardURL = "/test_shokuzai_detail/testerror.jsp";
			} else {
				forwardURL = "/test_shokuzai_detail/createAccount.jsp";
				System.out.println("アカウントを作成しました");			}
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


