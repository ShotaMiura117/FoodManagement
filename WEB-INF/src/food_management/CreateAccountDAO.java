package food_management;

import java.sql.SQLException;

public class CreateAccountDAO {
	public static int insert(CreateAccountBean cabean) throws SQLException {

		String sql = "insert into user"
				+ "(pk_id, user_id, password) values("
				+ "'" + 1 +"', " +
				"'" + cabean.getUser_id() + "', " +
				"'" + cabean.getPassword() + ")";
				return DBManager.simpleUpdate(sql);

	}
}
