package test;

import java.sql.SQLException;

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

	//Delete the food by name
	public static int deleteRyoriById(String name) throws SQLException {
		String sql = "DELETE from recipe where name = '" + name + "'";

		return DBManager.simpleUpdate(sql);

	}
}
