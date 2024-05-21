package test;

import java.sql.SQLException;

public class RyoriDAO {
	public static int insert1(RyoriBean rbean) throws SQLException{
		String sql = "INSERT INTO recipe_materials" +
					"(materials_name,volume,unit_id) VALUES(" +
					"'" + rbean.getMaterials_name() + "', " +
					"'" + rbean.getVolume() + "', " +
					rbean.getUnit_id() + "')";

		return DBManager.simpleUpdate(sql);
	}

}
