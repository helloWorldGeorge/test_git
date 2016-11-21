package cn.hero.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface SuperService  {

	boolean save(Object entity);

	int getMaxResults();

	<T> T  get(Class<T> entityClass, Serializable id);
	
	List find(String queryString, Object... values);
	
	List find(String queryString);
	
	void update(Object entity);
	
	void delete(Object entity);
	
	List findListBySQL(final String sql, final Object[] params);
	
	void clearSeession(Object o);
	
	public void saveOrUpdateAll(Collection entities);
} 
