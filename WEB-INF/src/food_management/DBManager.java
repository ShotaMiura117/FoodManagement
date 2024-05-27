
package food_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import test.RyoriSetBeanMapping;

public class DBManager {

	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://52.195.46.205/Food_management",
					"postgres", "postgres");
			return con;
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		}
	}

	public static int simpleUpdate(String sql) throws SQLException {
		Connection con = null;
		Statement smt = null;
		try {
			con = getConnection();
			smt = con.createStatement();
			return smt.executeUpdate(sql);
		} finally {
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static <T> List<T> findAll(String sql, RyoriSetBeanMapping<T> mapping)
			throws SQLException {
		Connection con = null;
		Statement smt = null;
		try {
			con = getConnection();
			smt = con.createStatement();
			ResultSet rs = smt.executeQuery(sql);

			List<T> list = new ArrayList<T>();
			while (rs.next()) {
				T bean = mapping.createFromResultSet(rs);
				list.add(bean);
			}
			return list;
		} finally {
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
