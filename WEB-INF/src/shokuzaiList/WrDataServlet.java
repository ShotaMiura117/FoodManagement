package shokuzaiList;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WrDataServlet extends HttpServlet{
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException,IOException{

	String deVolume=request.getParameter("devolume");
	String deID=request.getParameter("devoSID");
	WrDataBean wrdatabean=new WrDataBean();
			wrdatabean.setWVolume(deVolume);
			wrdatabean.setWShokuzaiID(deID);
			String forwardURL=null;
			try {
			ShokuzaiListDAO.decrease(wrdatabean);
			forwardURL="/ManagementList";
			}catch(NumberFormatException e) {e.printStackTrace();
			e.printStackTrace();
			forwardURL="/ManagementList";
			}catch(SQLException e) {e.printStackTrace();
			e.printStackTrace();
			forwardURL="/ManagementList";
			}catch(NullPointerException e) {e.printStackTrace();
			forwardURL="/ManagementList";
			}
			request.getRequestDispatcher(forwardURL).forward(request,response);
}
}