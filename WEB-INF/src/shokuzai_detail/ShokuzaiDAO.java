package shokuzai_detail;

import java.sql.SQLException;
import java.util.List;

public class ShokuzaiDAO {
//	public static int insert(ShokuzaiBean sbean) throws SQLException{
//		String sql = "INSERT INTO CUSTOMER" +
//		"(NO, NAME, MONEY) VALUES(" +
//		"'" + cbean.getNo() + "'," +
//		"'" + cbean.getName() + "'," +
//		cbean.getMoney() + ")";
//		return DBManager.simpleUpdate(sql);
//	}

	public static List<ShokuzaiBean> getShokuzaiList() throws SQLException{
		String sql = "SELECT shokuzai_id, pk_id, materials_name, "
				+ "item_name, quantity, open_check, save_method,"
				+ " genre_id, filling_date, expiration_date, volume,unit_id FROM SHOKUZAI";
//		where文で食材を特定する条件を入れる

		return DBManager.findAll(sql, new ShokuzaiBeanMapping());
	}
}
