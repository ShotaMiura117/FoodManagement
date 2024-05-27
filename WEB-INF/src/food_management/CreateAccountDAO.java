package food_management;

import java.sql.SQLException;

public class CreateAccountDAO {
	public static int insert(CreateAccountBean cabean) throws SQLException {

		String sql = "insert into users"
				+ "(user_id, password) values("
				+ "'" + cabean.getUser_id() + "', " +
				"'" + cabean.getPassword() + "')";
				return DBManager.simpleUpdate(sql);

	}
}
