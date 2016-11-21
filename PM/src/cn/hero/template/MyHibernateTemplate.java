package cn.hero.template;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class MyHibernateTemplate {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
   @Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	

}
