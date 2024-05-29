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

public class Delete_Servlet extends HttpServlet {
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31j");

		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String URL = null;
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
				URL = "/design/RyoriDeleteSuccess.jsp";

			} else {
				URL = "/design/error.jsp";

			}

		} catch (SQLException | ClassNotFoundException e) {
			out.print("Error: " + e.toString());

			request.getRequestDispatcher(URL).forward(request, response);

		}

	}
}