package shokuzai_detail;

import java.sql.SQLException;
import java.util.List;

public class ShokuzaiDAO {

	public static int insert(ShokuzaiEditBean sebean) throws SQLException {

//		SQL文で構文エラーになる

				String sql = "UPDATA SHOKUZAI SET materials_name = '" + sebean.getMaterials_name() + "',"
						+ "item_name = '" + sebean.getItem_name() + "', +quantity = '" + sebean.getQuantity() + "'"
								+ "open_check = '" + sebean.getOpen_check() + "',"
								+ "save_method = '" + sebean.getSave_method() +"'"
								+ "genre_id = '" + sebean.getGenre_id() + "',"
								+ "filling_date = '" + sebean.getFilling_date() + "',"
								+ "expiration_date = '" + sebean.getExpiration_date() + "',"
								+ "unit_id = '" + sebean.getUnit_id() + "',"
								+ "shokuzai_favorite = '" + sebean.getShokuzai_favorite() + "'"
								+ "where shokuzai_id = 1";


		//sql文テンプレート
//		String sql = "update shokuzai set materials_name = 'hoge-hoge', item_name = 'ほげほげ',"
//				+ "quantity = 50, open_check = 1, save_method = 2, genre_id = 6, filling_date = '2024-05-20',"
//				+ "expiration_date = '2024-06-29', volume = 32, unit_id = 1,"
//				+ "shokuzai_favorite = 1 where shokuzai_id = 63";

		return DBManager.simpleUpdate(sql);
	}

	public static List<ShokuzaiBean> getShokuzaiList() throws SQLException {

		//		shokuzaiテーブルだけを取り出す
		//		String sql = "SELECT shokuzai_id, pk_id, materials_name, "
		//				+ "item_name, quantity, open_check, save_method,"
		//				+ " genre_id, filling_date, expiration_date, volume, unit_id FROM SHOKUZAI";

		//		食材と単位、ジャンルを取り出す
		String sql = "SELECT shokuzai.shokuzai_id, shokuzai.pk_id, shokuzai.materials_name, "
				+ "shokuzai.item_name, shokuzai.quantity, shokuzai.open_check, shokuzai.save_method,"
				+ " shokuzai.genre_id, shokuzai.filling_date, shokuzai.expiration_date,"
				+ "shokuzai.volume, shokuzai.unit_id, shokuzai.default_volume, shokuzai.shokuzai_favorite,"
				+ "genre.genre_name, unit.unit_name from shokuzai full join genre on shokuzai.genre_id = genre.genre_id right outer join unit on shokuzai.unit_id = unit.unit_id";

		return DBManager.findAll(sql, new ShokuzaiBeanMapping());
	}

}
