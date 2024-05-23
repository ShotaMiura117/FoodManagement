package shokuzaiList;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShokuzaiListServlet extends HttpServlet{


public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException,IOException{
	String forwardURL =null;
	try {
	List<ShokuzaiListBean> shokuzaiList = ShokuzaiListDAO.getShokuzaiList();
	request.setAttribute("shokuzaiList",shokuzaiList);
	forwardURL="/ManagementListpage.jsp";
	}catch(SQLException e) {
		forwardURL ="/listerror.jsp";
	}
	request.getRequestDispatcher(forwardURL).forward(request, response);
}
}
