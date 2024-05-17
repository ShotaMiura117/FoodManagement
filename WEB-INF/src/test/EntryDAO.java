package test;

import java.sql.SQLException;

public class EntryDAO {
	public static int insert(EntryBean ebean) throws SQLException {
		String sql = "INSERT INTO Shokuzai " +
				"(materials_name, item_name, expiration_date, quantity, genre_id, open_check, save_method, filling_date, unit_id, volume,shokuzai_favorite,default_volume) VALUES ("
				+
				"'" + ebean.getMaterials_name() + "', " +
				"'" + ebean.getItem_name() + "', " +
				"'" + ebean.getExpiration_date() + "', " +
				"'" + ebean.getQuantity() + "', " +
				"'" + ebean.getGenre_id() + "', " +
				"'" + ebean.getOpen_check() + "', " +
				"'" + ebean.getSave_method() + "', " +
				"'" + ebean.getFilling_date() + "', " +
				"'" + ebean.getUnit_id() + "', " +
				"'" + ebean.getVolume() + "', " +
				"'" + ebean.getShokuzai_favorite() + "', " +
				"'" + ebean.getVolume() +")";

		return DBManager.simpleUpdate(sql);

	}

}
