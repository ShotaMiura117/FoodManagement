package food_management;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

	public class TESTServlet extends HttpServlet{
		public void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException,IOException{

			HttpSession session=request.getSession();
			session.setAttribute("login_key", (long) 4);


			request.getRequestDispatcher("/ManagementList").forward(request, response);
		}
}
