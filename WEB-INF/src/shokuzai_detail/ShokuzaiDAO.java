package shokuzai_detail;

import java.sql.SQLException;
import java.util.List;

public class ShokuzaiDAO {

	public static int insert(ShokuzaiEditBean sebean) throws SQLException {

		//		食材テーブルを更新

		String sql = "UPDATE SHOKUZAI SET materials_name = '" + sebean.getMaterials_name() + "',"
				+ "item_name = '" + sebean.getItem_name() + "',"
				+ "quantity = '" + sebean.getQuantity() + "',"
				+ "open_check = '" + sebean.getOpen_check() + "',"
				+ "save_method = '" + sebean.getSave_method() + "',"
				+ "genre_id = '" + sebean.getGenre_id() + "',"
				+ "filling_date = '" + sebean.getFilling_date() + "',"
				+ "expiration_date = '" + sebean.getExpiration_date() + "',"
				+ "unit_id = '" + sebean.getUnit_id() + "',"
				+ "shokuzai_favorite = '" + sebean.getShokuzai_favorite() + "'"
				+ "where shokuzai_id = 1";

		return DBManager.simpleUpdate(sql);
	}

	public static List<ShokuzaiBean> getShokuzaiList() throws SQLException {

		//		食材と単位、ジャンルを取り出す
		String sql = "SELECT shokuzai.shokuzai_id, shokuzai.pk_id, shokuzai.materials_name, "
				+ "shokuzai.item_name, shokuzai.quantity, shokuzai.open_check, shokuzai.save_method,"
				+ " shokuzai.genre_id, shokuzai.filling_date, shokuzai.expiration_date,"
				+ "shokuzai.volume, shokuzai.unit_id, shokuzai.default_volume, shokuzai.shokuzai_favorite,"
				+ "genre.genre_name, unit.unit_name from shokuzai full join genre on shokuzai.genre_id = genre.genre_id right outer join unit on shokuzai.unit_id = unit.unit_id";

		//		where文を追加し、リストページでセッションに入れたshokuzai_idと一致するデータを取得
		return DBManager.findAll(sql, new ShokuzaiBeanMapping());
	}

}
