package food_management;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShokuzaiListgetServlet extends HttpServlet{



public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException,IOException{
	HttpSession session=request.getSession();
	Long IDkey=(Long)session.getAttribute("login_key");

	String forwardURL =null;
	try {
	if (IDkey !=null) {
	IDBean uID=new IDBean();
	uID.setUserID(IDkey);


	List<ShokuzaiListBean> shokuzaiList = ShokuzaiListDAO.getShokuzaiList(uID);
	request.setAttribute("shokuzaiList",shokuzaiList);
	forwardURL="/design/ManagementListpage.jsp";
	}else{
		session.invalidate();
		forwardURL ="/design/listerror.jsp";
		}}catch(SQLException e) {
			e.printStackTrace();
		forwardURL ="/design/listerror.jsp";
	};

request.getRequestDispatcher(forwardURL).forward(request, response);
	}
}
