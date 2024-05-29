package shokuzaiList;

import java.sql.SQLException;
import java.util.List;

public class ShokuzaiListDAO{
	public static int decrease(WrDataBean wrdatabean) throws SQLException{
		String sql ="UPDATE SHOKUZAI SET VOLUME =VOLUME - "+wrdatabean.getWVolume()
		+" WHERE SHOKUZAI_ID = "+wrdatabean.getWShokuzaiID()+"; "
		+"DO $$ "
		+"DECLARE "
		 +"rec RECORD;"
		 +"add_count INT;"
		+" BEGIN "
		 	+"FOR REC IN SELECT SHOKUZAI_ID, VOLUME,DEFAULT_VOLUME, "
			+"QUANTITY FROM SHOKUZAI WHERE VOLUME <= 0 "
			+"LOOP "
			+"add_count := 0;"
				+"WHILE rec.VOLUME <= 0 LOOP "
				+"rec.VOLUME := rec.VOLUME +rec.DEFAULT_VOLUME;"
				+"add_count := add_count + 1 ;"
				+"END LOOP;"
			+"UPDATE SHOKUZAI "
			+"SET VOLUME = rec.VOLUME, QUANTITY = rec.QUANTITY - add_count "
			+"WHERE SHOKUZAI_ID = rec.SHOKUZAI_ID; "
			+"END LOOP;"
		+"END $$; "
		+"UPDATE SHOKUZAI SET OPEN_CHECK = CASE WHEN VOLUME = DEFAULT_VOLUME THEN 0  "
		+ "ELSE  1 END ; "
		+"DELETE FROM SHOKUZAI WHERE  QUANTITY <= 0 ; ";
		return DBManager.simpleUpdate(sql);
	}

	public static int delete(DeleteShokuzaiBean deleteshokuzaibean) throws SQLException{
		String sql="DELETE FROM SHOKUZAI WHERE Shokuzai_ID=" +deleteshokuzaibean.getDeleteShokuzaiID()+";";
		return DBManager.simpleUpdate(sql);
	}

	public static  List<ShokuzaiListBean> getShokuzaiList(IDBean uID) throws SQLException{
		String sql="SELECT SHOKUZAI_ID, MATERIALS_NAME, ITEM_NAME, EXPIRATION_DATE, VOLUME," +
				"UNIT_NAME, QUANTITY,  GENRE_NAME, OPEN_CHECK, SAVE_METHOD," +
				"FILLING_DATE , DEFAULT_VOLUME, SHOKUZAI_FAVORITE FROM "+
				"SHOKUZAI JOIN GENRE ON SHOKUZAI.GENRE_ID=GENRE.GENRE_ID JOIN UNIT ON SHOKUZAI.UNIT_ID=UNIT.UNIT_ID "
				+ "WHERE PK_ID ="+uID.getUserID()+";";
		return DBManager.findAll(sql, new ShokuzaiListBeanMapping());
	}
}