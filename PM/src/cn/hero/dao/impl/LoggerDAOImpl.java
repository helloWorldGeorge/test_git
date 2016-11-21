package cn.hero.dao.impl;

import org.springframework.stereotype.Component;

import cn.hero.dao.LoggerDAO;
import cn.hero.template.MyHibernateTemplate;
import cn.hero.vo.Logger;
@Component("loggerDAOImpl")
public class LoggerDAOImpl extends MyHibernateTemplate implements LoggerDAO {

	public void saveLogger(Logger log) {
		// TODO Auto-generated method stub
        this.getHibernateTemplate().save(log);
        
	}

}
