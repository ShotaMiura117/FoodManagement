package food_management;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		request.setCharacterEncoding("Windows-31J");

		String id = request.getParameter("id");
		String password = request.getParameter("password");

		/*
		response.setCharacterEncoding("Windows-31J");
		PrintWriter out = response.getWriter();
		out.println("���O�C�����܂���<br>");
		out.println("���͂��ꂽ����\�����܂�<br>");
		out.println("ID : " + id + "    PASSWORD : " + password);
		*/
	}

}
