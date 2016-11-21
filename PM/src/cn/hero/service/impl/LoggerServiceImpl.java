package cn.hero.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.hero.dao.LoggerDAO;
import cn.hero.service.LoggerService;
import cn.hero.vo.Logger;
@Component("loggerServiceImpl")
public class LoggerServiceImpl implements LoggerService {
    private LoggerDAO loggerDAOImpl;
    
    
	public LoggerDAO getLoggerDAOImpl() {
		return loggerDAOImpl;
	}
    @Resource
	public void setLoggerDAOImpl(LoggerDAO loggerDAOImpl) {
		this.loggerDAOImpl = loggerDAOImpl;
	}

	public void saveLogger(Logger log) {
		this.loggerDAOImpl.saveLogger(log);

	}

}
