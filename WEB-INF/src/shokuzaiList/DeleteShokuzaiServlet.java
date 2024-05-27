package shokuzaiList;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteShokuzaiServlet extends HttpServlet{
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException,IOException{

	String forwardURL=null;
	try {
	String DSID =request.getParameter("DeleteSID");
	DeleteShokuzaiBean dsbean =new DeleteShokuzaiBean
			(Integer.parseInt(DSID));

		ShokuzaiListDAO.delete(dsbean);
		forwardURL="/shokuzaiList";
	} catch (SQLException e) {

		e.printStackTrace();
		forwardURL="/ShokuzaiListerror.jsp";
	}
	request.getRequestDispatcher(forwardURL).forward(request,response);

}
}
