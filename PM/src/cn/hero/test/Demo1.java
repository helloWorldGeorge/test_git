package cn.hero.test;


import help.Temp_File.VoHelp;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.hero.action.ActionVoHelp;
import cn.hero.dao.SuperDao;
import cn.hero.dao.impl.ImplSuperDao;
import cn.hero.dao.impl.dbutils.ImplDBUtilsDao;
import cn.hero.service.ServiceVoUser;
import cn.hero.template.MyUtils;
import cn.hero.vo.VoUser;

public class Demo1 {

	public SuperDao implSuperDao;
	public ServiceVoUser implServiceVoUser;
//	public ServiceVoKeyDetail implServiceVoKeyDetail;
	
	@Before
	public void before()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	    implServiceVoUser = (ServiceVoUser) ctx.getBean("implServiceVoUser");
		implSuperDao = (SuperDao) ctx.getBean("implSuperDao");
//		implServiceVoKeyDetail = (ServiceVoKeyDetail) ctx.getBean("implServiceVoKeyDetail");
	}
	
	@Test
	public void testMethod()
	{
		System.out.println("进去了");
	}
	
	@Test
	public void testlogsystem()
	{
		System.out.println("测试Log系统");
		VoUser vu = new VoUser();
		vu.setName("testlog");
		vu.setPassword("hello");
		implServiceVoUser.addVoUser(vu);
		
	}
}
