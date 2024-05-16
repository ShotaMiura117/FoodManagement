package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class save_Servlet extends HttpServlet {
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31J");
		String materials_name = request.getParameter("syokuzaiName");
		String item_name = request.getParameter("syouhinName");
		String expiration_date = request.getParameter("expiration_date");
		double volume = Double.parseDouble(request.getParameter("volume"));
		int unit_id = Integer.parseInt(request.getParameter("unit_id"));
		double quantity = Double.parseDouble(request.getParameter("quantity"));
		int genre_id = Integer.parseInt(request.getParameter("genre_id"));
		int open_check = Integer.parseInt(request.getParameter("open_check"));
		int save_method = Integer.parseInt(request.getParameter("save_method"));
		String filling_date = request.getParameter("filling_date");

		response.setCharacterEncoding("Windows-31J");
		PrintWriter out = response.getWriter();

		if (materials_name == null || "".equals(materials_name) || item_name == null || "".equals(item_name)) {
			out.print("商品名と食材名を入力してください。");
		} else {
			try {
				EntryBean ebean = new EntryBean(materials_name, item_name, expiration_date, volume,
						unit_id, quantity, genre_id, open_check, save_method, filling_date);

				int saveCount = EntryDAO.insert(ebean);

				RequestDispatcher rd = request.getRequestDispatcher("syouhinkinyupage.jsp");
				rd.include(request, response);
				out.print("登録を成功しました。");
			} catch (NumberFormatException e) {
				out.print("登録に失敗しました。もう一度試してください。");
				e.printStackTrace();
			} catch (SQLException e) {
				out.print("登録に失敗しました。もう一度試してください。");
				e.printStackTrace();

			}

		}

	}
}
