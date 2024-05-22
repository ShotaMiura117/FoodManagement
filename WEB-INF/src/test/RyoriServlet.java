package test;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/RyoriServlet")
//@MultipartConfig(maxFileSize = 16177215)
public class RyoriServlet extends HttpServlet {
	/*
	private final String JDBC_URL = "jdbc:postgresql://52.195.46.205:5432/Food_management";
	private final String DB_USER = "postgres";
	private final String DB_PASS = "postgres";*/
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31J");
		//get values of text field
		String name = request.getParameter("name");

		int time = Integer.parseInt(request.getParameter("time"));
		//input stream of the input file
		/*InputStream inputStream = null;
		Part filePart = request.getPart("image");//obtains the upload file
		if (filePart != null) {
			inputStream = filePart.getInputStream();
		}*/

		String materials_name = request.getParameter("zairyo");
		int volume = Integer.parseInt(request.getParameter("suryo"));
		String unit = request.getParameter("tani");

		response.setCharacterEncoding("Windows-31J");
		String URL = null;

		try {
			RyoriBean rbean = new RyoriBean(name, time, materials_name, volume, unit);

			int count = RyoriDAO.insertryori(rbean);

			if (count < 1) {
				URL = "/design/error.jsp";
			} else {
				URL = "/design/ryoriKinyusucess.jsp";
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			URL = "/design/error.jsp";

		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher(URL).forward(request, response);
	}
}