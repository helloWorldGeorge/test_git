package cn.hero.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.hero.dao.SuperDao;
import cn.hero.service.SuperService;
@Component("implSuperService")
public class ImplSuperService implements SuperService{

	private SuperDao implSuperDao;

	public SuperDao getImplSuperDao() {
		return implSuperDao;
	}

	@Resource
	public void setImplSuperDao(SuperDao implSuperDao) {
		this.implSuperDao = implSuperDao;
	}

	public List find(String queryString)
//  Execute an HQL query.
	 {
		 return implSuperDao.find(queryString);
	 }

	public List find(String queryString, Object... values) 
	//Execute an HQL query, binding a number of values to "?" parameters in the query string.
	{
		 return implSuperDao.find(queryString, values);
	}

	public <T> T  get(Class<T> entityClass, Serializable id)
//	Return the persistent instance of the given entity class with the given identifier, or null if not found.
	{
		 return implSuperDao.get(entityClass, id);
	}

	public int getMaxResults() 
//   Return the maximum number of rows specified for this HibernateTemplate.
	{
		return implSuperDao.getMaxResults();
	}
	
	public boolean save(Object entity) 
//   Persist the given transient instance. 
	{
		return implSuperDao.save(entity);
	}
	
	public void update(Object entity)
//   Update the given persistent instance, associating it with the current Hibernate Session. 
	{
		this.implSuperDao.update(entity);
	}
	
	public void delete(Object entity) 
//   Delete the given persistent instance.
	{
		this.implSuperDao.delete(entity);
	}

	public List findListBySQL(String sql, Object[] params) {
		// TODO Auto-generated method stub
		return implSuperDao.findListBySQL(sql, params);
	}
	
	public List findEntityBySql(final String sql,final Object[] params,final Class entityArray)
	{
		return implSuperDao.findEntityBySql(sql, params, entityArray);
	}

	public void clearSeession(Object o)
	{
		implSuperDao.clearSeession(o);
	}

	public void saveOrUpdateAll(Collection entities) {
		// TODO Auto-generated method stub
		implSuperDao.saveOrUpdateAll(entities);
	}
	
	
	
}
