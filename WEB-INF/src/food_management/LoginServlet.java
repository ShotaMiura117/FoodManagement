package food_management;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("email");
        String password = request.getParameter("password");

        // 入力情報を表示させて確認
		response.setCharacterEncoding("Windows-31J");
		PrintWriter out = response.getWriter();
		out.println("ログインしました<br>");
		out.println("入力された情報を表示します<br>");
		out.println("ID : " + id + "    PASSWORD : " + password);

		response.sendRedirect("design/failure.jsp");


        // 入力されたidとパスワードを検証する
        /*
        if ("admin".equals(id) && "admin".equals(password))
        {
            response.sendRedirect("design/success.jsp");
        }
        else
        {
            response.sendRedirect("design/failure.jsp");
        }
        */
    }
}

/*
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		request.setCharacterEncoding("Windows-31J");

		String id = request.getParameter("email");
		String password = request.getParameter("password");


		response.setCharacterEncoding("Windows-31J");
		PrintWriter out = response.getWriter();
		out.println("ログインしました<br>");
		out.println("入力された情報を表示します<br>");
		out.println("ID : " + id + "    PASSWORD : " + password);


	}

}
*/
