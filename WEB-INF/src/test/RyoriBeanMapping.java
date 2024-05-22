package test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RyoriBeanMapping implements RyoriSetBeanMapping<RyoriBean> {

	public RyoriBean createFromResultSet(ResultSet rs) throws SQLException {
		RyoriBean rbean = new RyoriBean();
		rbean.setName(rs.getString("name"));
		rbean.setTime(rs.getInt("time"));
		rbean.setMaterials_name(rs.getString("zairyo"));
		rbean.setVolume(rs.getInt("suryo"));
		rbean.setUnit(rs.getString("tani"));
		return rbean;
	}

}
