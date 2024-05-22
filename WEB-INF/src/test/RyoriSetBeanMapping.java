package test;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RyoriSetBeanMapping<T> {
	public T createFromResultSet(ResultSet rs) throws SQLException;
}
