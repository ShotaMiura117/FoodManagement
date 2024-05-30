package food_management;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FoodlistServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException{

	String[] selectShokuzai =request.getParameterValues("selectShokuzai");
		if(selectShokuzai==null|| selectShokuzai.length==0) {request.getRequestDispatcher("/ManagementList").forward(request, response);
		return;
		}
		Connection con =null;
		PreparedStatement psmt=null;
		ResultSet rs=null;
		List<SelectShokuzaiBean> foodList=new ArrayList<>();
		try {
			Class.forName("org.postgresql.Driver");
			con= DriverManager.getConnection(
					//"jdbc:postgresql://localhost:5432/serversidedb",
					"jdbc:postgresql://52.195.46.205/Food_management",
					"postgres","postgres");
		StringBuilder sql=new StringBuilder("SELECT DISTINCT F.FOOD_ID, F.NAME "
				+"FROM FOOD F JOIN FOOD_MATERIALS FM ON F.FOOD_ID = FM.FOOD_ID "
				+"WHERE FM.MATERIALS_NAME IN (");
		for(int i =0; i < selectShokuzai.length;i++) {sql.append("?");
		if(i<selectShokuzai.length -1) {sql.append(",");
		}
		}
		sql.append(")"+"GROUP BY F.FOOD_ID HAVING COUNT(DISTINCT FM.MATERIALS_NAME)= ?");

		psmt=con.prepareStatement(sql.toString());
		for(int i=0 ;i<selectShokuzai.length;i++) {
			psmt.setString(i+1,selectShokuzai[i]);
		}
		psmt.setInt(selectShokuzai.length +1, selectShokuzai.length);
		rs=psmt.executeQuery();

		while(rs.next()) {SelectShokuzaiBean food= new SelectShokuzaiBean(rs.getInt("FOOD_ID"),
		rs.getString("NAME"));foodList.add(food);
		}

		request.setAttribute("foodList", foodList);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/design/FoodList.jsp");

		dispatcher.forward(request,response);

		}catch (Exception e) {e.printStackTrace();}finally {
			try { if(rs !=null) rs.close();
		}catch(Exception e) {e.printStackTrace();}
			try {if(psmt !=null)psmt.close();
		}catch(Exception e) {e.printStackTrace();}
			try {if(con !=null)con.close();
		}catch(Exception e) {e.printStackTrace();}
			}
		}
		}