package shokuzaiList;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import shokuzaiList.IDBean;

	public class IDBeanSetServlet extends HttpServlet{
		public void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException,IOException{

			HttpSession session=request.getSession();
			session.setAttribute("1");


			request.getRequestDispatcher(/FoodManagement).forward(request, response);
		}
}
