package food_management;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ShokuzaiBeanMapping implements ResultSetBeanMapping<ShokuzaiBean> {

	public ShokuzaiBean createFromResultSet(ResultSet rs) throws SQLException {
		ShokuzaiBean sbean = new ShokuzaiBean();

		sbean.setShokuzai_id(rs.getInt("shokuzai_id"));
		sbean.setPk_id(rs.getInt("pk_id"));
		sbean.setMaterials_name(rs.getString("materials_name"));
		sbean.setItem_name(rs.getString("Item_name"));
		sbean.setQuantity(rs.getInt("quantity"));
		sbean.setOpen_check(rs.getInt("open_check"));
		sbean.setSave_method(rs.getInt("save_method"));
		sbean.setGenre_id(rs.getInt("genre_id"));
		sbean.setFilling_date(rs.getString("filling_date"));
		sbean.setExpiration_date(rs.getString("expiration_date"));
		sbean.setVolume(rs.getInt("volume"));
		sbean.setUnit_id(rs.getInt("unit_id"));
		sbean.setDefault_volume(rs.getDouble("default_volume"));
		sbean.setShokuzai_favorite(rs.getInt("shokuzai_favorite"));
		sbean.setUnit_name(rs.getString("unit_name"));
		sbean.setGenre_name(rs.getString("genre_name"));
		return sbean;
	}
}

