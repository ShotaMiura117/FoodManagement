package food_management;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

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


		String forwardURL = null;
		boolean id_check = true;

		try {
			List<AccountBean> accountList = CreateAccountDAO.getAccountList();

//			ユーザー名が一致していたらfalse
			for (int i = 0; i < accountList.size(); i++) {
				AccountBean abean = accountList.get(i);

				if (abean.getUser_id().equals(user_id)) {
					System.out.println("id一致：" + abean.getUser_id());
					id_check = false;
					break;
				}
			}

//			id_checkがtrueならcabeanを作ってアカウント登録

			if (id_check) {
			CreateAccountBean cabean = new CreateAccountBean(user_id, password);

			int updateCount = CreateAccountDAO.insert(cabean);

				if (updateCount < 1) {
					forwardURL = "/test_shokuzai_detail/createError.jsp";
					System.out.println("アカウントを作成できませんでした");

					} else {
						forwardURL = "/test_shokuzai_detail/createAccount.jsp";
						System.out.println("アカウントを作成しました");
						}

			} else {
				forwardURL = "/test_shokuzai_detail/checkID.jsp";
				System.out.println("既に使用されているユーザー名です。");
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
			forwardURL = "/test_shokuzai_detail/createError.jsp";

		} catch (SQLException e) {
			e.printStackTrace();
			forwardURL = "/test_shokuzai_detail/createError.jsp";

		}
		request.getRequestDispatcher(forwardURL).forward(request, response);
	}


}


