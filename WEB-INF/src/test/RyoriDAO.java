package test;

import java.sql.SQLException;
import java.util.List;

public class RyoriDAO {
	public static int insertryori(RyoriBean rbean) throws SQLException {
		String sql = "INSERT INTO recipe " +
				"(name, time, materials_name, volume, unit) VALUES (" +
				"'" + rbean.getName() + "', " +
				"'" + rbean.getTime() + "', " +
				"'" + rbean.getMaterials_name() + "', " +
				"'" + rbean.getVolume() + "', " +
				"'" + rbean.getUnit() + "')";

		return DBManager.simpleUpdate(sql);
	}

	public static List<RyoriBean> getRyoriList() throws SQLException{
		String sql = "SELECT name,time,materials_name,volume, unit FROM recipe";
		return DBManager.findAll(sql, new RyoriBeanMapping());
	}
}
