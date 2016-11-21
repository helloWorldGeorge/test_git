package cn.hero.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
public interface SuperDao  {
	boolean save(Object entity);

	int getMaxResults();

	<T> T  get(Class<T> entityClass, Serializable id);
	
	List find(String queryString, Object... values);
	
	List find(String queryString);
	
	void update(Object entity);
	
	void delete(Object entity);
	
	List findListBySQL(final String sql, final Object[] params);
	
	List findListBySQL2(final String sql, final Object[] params);
	
	List findEntityBySql(final String sql,final Object[] params,final Class entityArray);
	
	public void clearSeession(Object o);
	
	public void saveOrUpdateAll(Collection entities);
} 
