package test;

import java.sql.SQLException;

public class EntryDAO {
	public static int insert(EntryBean ebean) throws SQLException {
		String sql = "INSERT INTO Shokuzai " +
				"(pk_id, materials_name, item_name, expiration_date, quantity, genre_id, open_check, save_method, filling_date, unit_id, volume,default_volume,shokuzai_favorite) VALUES ("
				+
				"'" + 4 + "', " +
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
				"'" + ebean.getDefault_volume() + "', " +
					ebean.getShokuzai_favorite() + ")";

		return DBManager.simpleUpdate(sql);

	}

}
