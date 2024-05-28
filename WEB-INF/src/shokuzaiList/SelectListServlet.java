package shokuzaiList;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SelectListServlet extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{


		HttpSession session=request.getSession();

		String forwardURL=null;

		String[] sShokuzai =request.getParameterValues("selectShokuzai");

		SelectShokuzaiBean selects=new SelectShokuzaiBean();

		if(sShokuzai != null){
			String selShokuzai= String.join (", ",sShokuzai);
			selects.setSelectShokuzai(selShokuzai);
		session.setAttribute("selects",selects);
		forwardURL="/shokuzaiListtest/FoodList.jsp";
		}else {
		forwardURL="/ManagementList";
		}
		request.getRequestDispatcher(forwardURL).forward(request, response);
	}
}