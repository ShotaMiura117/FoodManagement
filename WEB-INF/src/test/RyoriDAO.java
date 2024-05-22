package test;

import java.sql.SQLException;

public class RyoriDAO {
	public static int insertryori(RyoriBean rbean) throws SQLException {
		String sql = "INSERT INTO recipe " +
				"(name, image, materials_name, volume, unit) VALUES (" +
				"'" + rbean.getName() + "', " +
				"'" + rbean.getMaterials_name() + "', " +
				"'" + rbean.getVolume() + "', " +
				"'" + rbean.getUnit() + "')";

		return DBManager.simpleUpdate(sql);
	}
}
