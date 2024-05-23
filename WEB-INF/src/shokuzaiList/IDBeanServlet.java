package shokuzaiList;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

	public class IDBeanSetServlet extends HttpServlet{
		public void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException,IOException{

			HttpSession session=request.getSession();
			String IDkey=(String)session.getAttribute("login_key");

			String forwardURL =null;

			if (IDkey !=null) {
			IDBean uID=new IDBean();
			uID.setUserID(Long.parseLong(IDkey));
			forwardURL="/shokuzaiListServlet";
			}else {
				System.out.println("ログインをやり直してください");
				session.invalidate();
				forwardURL ="/FoodManagementtop.jsp";
			}
			request.getRequestDispatcher(forwardURL).forward(request, response);
		}
}
