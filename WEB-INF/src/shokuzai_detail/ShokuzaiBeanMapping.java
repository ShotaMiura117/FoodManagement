package shokuzai_detail;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ShokuzaiBeanMapping implements ResultSetBeanMapping<ShokuzaiBean> {

	public ShokuzaiBean createFromResultSet(ResultSet rs) throws SQLException {
		ShokuzaiBean sbean = new ShokuzaiBean();

		sbean.setShokuzai_id(rs.getInt("shokuzai_id"));
		sbean.setPk_id(rs.getInt("pk_id"));
		sbean.setMaterials_name(rs.getString("materials_name"));
//		sbean.setItem_name(rs.getString("Item_name"));
//		sbean.setQuantity(rs.getString("quantity"));
//		sbean.setOpen_check(rs.getString("open_check"));
//		sbean.setSave_method(rs.getString("save_method"));
//		sbean.setGenre_id(rs.getString("genre_id"));
//		sbean.setFilling_date(rs.getString("filling_date"));
//		sbean.setExpiration_date(rs.getString("expiration_date"));
//		sbean.setVolume(rs.getString("expiration_date"));
//		sbean.setUnit_id(rs.getString("unit_id"));
		return sbean;
	}
}

