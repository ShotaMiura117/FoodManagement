package shokuzaiList;

import java.sql.ResultSet;
import java.sql.SQLException;
public class ShokuzaiListBeanMapping implements ResultSetBeanMapping<ShokuzaiListBean>{
	public ShokuzaiListBean createFromResultSet(ResultSet rs) throws SQLException{
		ShokuzaiListBean shokuzaiListbean=new ShokuzaiListBean();
		shokuzaiListbean.setShokuzaiID(rs.getInt("SHOKUZAI_ID"));
		shokuzaiListbean.setName(rs.getString("MATERIALS_NAME"));
		shokuzaiListbean.setItem(rs.getString("ITEM_NAME"));
		shokuzaiListbean.setVolume(rs.getDouble("VOLUME"));
		shokuzaiListbean.setUnit(rs.getString("UNIT_NAME"));
		shokuzaiListbean.setQuantity(rs.getDouble("QUANTITY"));
		shokuzaiListbean.setGenre(rs.getString("GENRE_NAME"));
		shokuzaiListbean.setOpen(rs.getInt("OPEN_CHECK"));
		shokuzaiListbean.setSave(rs.getInt("SAVE_METHOD"));
		shokuzaiListbean.setFilling(rs.getDate("FILLING_DATE"));
		shokuzaiListbean.setExpiration(rs.getDate("EXPIRATION_DATE"));
		shokuzaiListbean.setSFavorite(rs.getInt("SHOKUZAI_FAVORITE"));
		shokuzaiListbean.setDefaVolume(rs.getDouble("DEFAULT_VOLUME"));
		return shokuzaiListbean;
	}

}
