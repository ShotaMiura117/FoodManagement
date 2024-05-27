package shokuzai_detail;

import java.sql.SQLException;
import java.util.List;

public class ShokuzaiDAO {

	public static int insert(ShokuzaiEditBean sebean) throws SQLException {

//		賞味期限を記入必須にするなら18行目までの処理は消して良い
//		String expiration_date;
//		if (sebean.getExpiration_date().equals("null")) {
//			expiration_date = null;
//		} else {
//			expiration_date = sebean.getExpiration_date();
//		}
//		expiration_date = sebean.getExpiration_date();


		//		食材テーブルを更新
		String sql = "UPDATE SHOKUZAI SET materials_name = '" + sebean.getMaterials_name() + "',"
				+ "item_name = '" + sebean.getItem_name() + "',"
				+ "quantity = '" + sebean.getQuantity() + "',"
				+ "open_check = '" + sebean.getOpen_check() + "',"
				+ "save_method = '" + sebean.getSave_method() + "',"
				+ "genre_id = '" + sebean.getGenre_id() + "',"
				+ "filling_date = '" + sebean.getFilling_date() + "',"
								+ "expiration_date = '" + sebean.getExpiration_date() + "',"
//				+ "expiration_date = expiration_date,"
				+ "volume = '" + sebean.getVolume() + "',"
				+ "unit_id = '" + sebean.getUnit_id() + "',"
				+ "shokuzai_favorite = '" + sebean.getShokuzai_favorite() + "'"
				+ "where shokuzai_id = '" + sebean.getShokuzai_id() + "'";

		return DBManager.simpleUpdate(sql);
	}

	public static List<ShokuzaiBean> getShokuzaiList() throws SQLException {

		//		食材と単位、ジャンルを取り出す
		String sql = "SELECT shokuzai.shokuzai_id, shokuzai.pk_id, shokuzai.materials_name, "
				+ "shokuzai.item_name, shokuzai.quantity, shokuzai.open_check, shokuzai.save_method,"
				+ " shokuzai.genre_id, shokuzai.filling_date, shokuzai.expiration_date,"
				+ "shokuzai.volume, shokuzai.unit_id, shokuzai.default_volume, shokuzai.shokuzai_favorite,"
				+ "genre.genre_name, unit.unit_name from shokuzai full join genre on shokuzai.genre_id = genre.genre_id"
				+ " right outer join unit on shokuzai.unit_id = unit.unit_id"
				+ " where shokuzai_id = 123";

		//		リストページと結合後、
		//		where句をセッションから取得したshokuzai_idで指定する

		return DBManager.findAll(sql, new ShokuzaiBeanMapping());
	}

		//		食材データ削除
	public static int delete(int shokuzai_id) throws SQLException {
		String sql = "DELETE from shokuzai where shokuzai_id = '" + shokuzai_id + "'";

		return DBManager.simpleUpdate(sql);

	}

}
