package ryoriZairyo;

import java.sql.SQLException;

import test.DBManager;

public class ryoriDAO {
	public static int insert(ryoriZairyoBean rbean) throws SQLException {
		String sql = "INSERT INTO Recipe_materials" +
				"(materials_name, volume, unit) VALUES(" +
				"'" + rbean.getMaterials_name() + "', " +
				"'" + rbean.getVolume() + "', " +
				rbean.getUnit() + ")";

		return DBManager.simpleUpdate(sql);

	}

}
