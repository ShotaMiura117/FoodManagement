package food_management;

import java.sql.SQLException;
import java.util.List;

public class CreateAccountDAO {
	public static int insert(CreateAccountBean cabean) throws SQLException {

		String sql = "insert into users"
				+ "(user_id, password) values("
				+ "'" + cabean.getUser_id() + "', " +
				"'" + cabean.getPassword() + "')";
		return DBManager.simpleUpdate(sql);

	}

	public static List<AccountBean> getAccountList() throws SQLException {

		String sql = "SELECT user_id from users";



		return DBManager.findAll(sql, new AccountBeanMapping());
	}

}
