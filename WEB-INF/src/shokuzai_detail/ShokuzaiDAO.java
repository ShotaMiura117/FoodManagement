package shokuzai_detail;

import java.sql.SQLException;
import java.util.List;

public class ShokuzaiDAO {

	public static List<ShokuzaiBean> getShokuzaiList() throws SQLException{

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



//		食材テーブルとジャンル名、単位を取り出す　*でエラーになってしまう
//		String sql = "select shokuzai.\\*, "
//				+ "genre.genre_name, unit.unit_name from shokuzai"
//				+ "full join genre on shokuzai.genre_id = genre.genre_id"
//				+ "right outer join unit on shokuzai.unit_id = unit.unit_id";


//
//		String sql = "SELECT shokuzai.shokuzai_id, shokuzai.pk_id, shokuzai.materials_name,"
//				+ "shokuzai.item_name, shokuzai.quantity, shokuzai.open_check, shokuzai.save_method,"
//				+ "shokuzai.genre_id, shokuzai.filling_date, shokuzai.expiration_date,"
//				+ "shokuzai.volume, shokuzai.unit_id, shokuzai.default_volume, shokuzai.shokuzai_favorite,"
//				+ "genre.genre_name, unit.unit_name from shokuzai, genre, unit"
//				+ "where shokuzai.genre_id = genre.genre_id and"
//				+ "shokuzai.unit_id = unit.unit_id ";



		return DBManager.findAll(sql, new ShokuzaiBeanMapping());
	}
}
