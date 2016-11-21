package cn.hero.dao.impl.dbutils;

import java.sql.SQLException;

import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.KeyedHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.springframework.stereotype.Component;
@Component
public class ImplDBUtilsDao extends DbUtilsExampleBase implements DBUtilsDao {
	
	@SuppressWarnings("deprecation")
	public Map<Object, Map<String, Object>> findKeyedHandler(String sql,Object[] parameters,String key_id)
	{
		QueryRunner run = new QueryRunner(dataSource);
		try {
			return run.query(connection, sql,parameters,new KeyedHandler(key_id));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public Object findOne(String sql,Object[] parameters)
	{
		QueryRunner run = new QueryRunner(dataSource);
		try {
			return run.query(sql, parameters,new ScalarHandler());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public List<Map<String, Object>> findMapHandler(String sql, Object[] objects,
			String string) {
		QueryRunner run = new QueryRunner(dataSource);
		try {
			return run.query(connection, sql,objects,new MapListHandler());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	
}
