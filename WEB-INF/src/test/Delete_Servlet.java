package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Delete_Servlet")
public class Delete_Servlet extends HttpServlet {
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31j");

		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String errorMsg = null;
		String URL = null;

		if (name != null && !name.isEmpty()) {
			Connection con1 = null;
			PreparedStatement pst = null;

			try {
				Class.forName("org.postgresql.Driver");
				con1 = DriverManager.getConnection(
						"jdbc:postgresql://52.195.46.205:5432/Food_management",
						"postgres", "postgres");

				String sql = "DELETE FROM recipe WHERE name = ?";
				pst = con1.prepareStatement(sql);
				pst.setString(1, name);

				int rowsAffected = pst.executeUpdate();
				if (rowsAffected > 0) {
					URL = "/design/FoodDelete.jsp";
					out.print("Your data has been deleted");
				} else {
					URL = "/design/FoodNotDeleted.jsp";
					out.print("No data found with the given name");
				}

			} catch (SQLException | ClassNotFoundException e) {
				out.print("Error: " + e.toString());
			}
		} else {
			errorMsg = "未入力です。";
			request.setAttribute("errorMsg", errorMsg);
		}
		request.getRequestDispatcher(URL).forward(request, response);

	}
}