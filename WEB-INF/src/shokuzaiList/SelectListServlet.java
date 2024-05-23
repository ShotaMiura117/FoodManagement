package shokuzaiList;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SelectListServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{


		HttpSession session=request.getSession();

		String forwardURL=null;

		String[] selectShokuzai =request.getParameterValues("selectS");

		SelectShokuzaiBean selects=new SelectShokuzaiBean();

		if(selectShokuzai != null){
			for(int i = 0;i<selectShokuzai.length;i++) {
				selects.setSelectShokuzai(selectShokuzai[i]);
			}

		session.setAttribute("selectShokuzai",selectShokuzai);
		forwardURL="/FoodToDish.jsp";
		}else {
		forwardURL="/ManegementList";
		}
		request.getRequestDispatcher(forwardURL).forward(request, response);
	}
}