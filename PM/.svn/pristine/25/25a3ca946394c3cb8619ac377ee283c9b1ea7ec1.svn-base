package cn.hero.dao.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.transform.ResultTransformer;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import cn.hero.dao.SuperDao;
import cn.hero.template.MyHibernateTemplate;
@Component
public class ImplSuperDao  implements SuperDao{

	private HibernateTemplate hibernateTemplate;
	private HibernateTemplate hibernateTemplate2;

	public HibernateTemplate getHibernateTemplate2() {
		return hibernateTemplate2;
	}
	@Resource
	public void setHibernateTemplate2(HibernateTemplate hibernateTemplate2) {
		this.hibernateTemplate2 = hibernateTemplate2;
	}
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
   @Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
   public List find(String queryString)
// Execute an HQL query.
	 {
		 return hibernateTemplate.find(queryString);
	 }

	public List find(String queryString, Object... values) 
	//Execute an HQL query, binding a number of values to "?" parameters in the query string.
	{
		 return hibernateTemplate.find(queryString, values);
	}

	public <T> T  get(Class<T> entityClass, Serializable id)
//	Return the persistent instance of the given entity class with the given identifier, or null if not found.
	{
		 return hibernateTemplate.get(entityClass, id);
	}

	public int getMaxResults() 
//  Return the maximum number of rows specified for this HibernateTemplate.
	{
		return hibernateTemplate.getMaxResults();
	}
	
	public boolean save(Object entity) 
//  Persist the given transient instance. 
	{
		hibernateTemplate.save(entity);
		return true;
	}
	
	public void update(Object entity)
//  Update the given persistent instance, associating it with the current Hibernate Session. 
	{
		this.hibernateTemplate.update(entity);
	}
	
	public void delete(Object entity) 
//  Delete the given persistent instance.
	{
		this.hibernateTemplate.delete(entity);
	}
	
	public  List findListBySQL(final String sql, final Object[] params) {
		List list = this.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query query = session.createSQLQuery(sql);
						if(params!=null)
						{
							query.setProperties(params);
						}
						List list = query.list();
						return list;
					}
				});
		return list;
	}
	
	public  List findListBySQL2(final String sql, final Object[] params) {
		List list = this.getHibernateTemplate2().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query query = session.createSQLQuery(sql);
						if(params!=null)
						{
							query.setProperties(params);
						}
						List list = query.list();
						return list;
					}
				});
		return list;
	}
	
	public List findEntityBySql(final String sql,final Object[] params,final Class entityArray) {
		List list = this.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						SQLQuery sqlQuery= session.createSQLQuery(sql);
						if(entityArray!=null)
						{
							sqlQuery.addEntity(entityArray);
						}
						if(params!=null)
						{
							for(int i=0;i<params.length;i++)
							{
								sqlQuery.setParameter(i, params[i]);
							}
						}
						List list = sqlQuery.list();
						return list;
					}
				});
		return list;
	}
	
	public void clearSeession(Object o)
	{
		this.hibernateTemplate.merge(o);
//		hibernateTemplate.getFetchSize();
//		this.hibernateTemplate.refresh(o);
	}
	
	public void saveOrUpdateAll(Collection entities)
	{
		this.hibernateTemplate.saveOrUpdateAll(entities);
	}
	

} 
