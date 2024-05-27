package food_management;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountBeanMapping implements ResultSetBeanMapping<AccountBean> {

		public AccountBean createFromResultSet(ResultSet rs) throws SQLException {
			AccountBean abean = new AccountBean();


			abean.setUser_id(rs.getString("user_id"));

			return abean;
		}
}
