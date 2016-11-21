package cn.hero.dao.impl.dbutils;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DBUtilsDao  {
	 Map<Object, Map<String, Object>> findKeyedHandler(String sql,Object[] parameters,String key_id);
	 Object findOne(String sql,Object[] parameters);
	List<Map<String, Object>> findMapHandler(String sql,
			Object[] objects, String string);
} 
