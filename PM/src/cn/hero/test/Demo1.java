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
import cn.hero.util.ExcelOprator;
import cn.hero.util.MyUtlis;
import cn.hero.vo.VoProTask;
import cn.hero.vo.VoProgramInfo;
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
	public void insertDate()
	{
		VoProTask vpt = new VoProTask();
		VoProgramInfo vpi = new VoProgramInfo();
		System.out.println("ok");
		ExcelOprator eo = new ExcelOprator();
		String temp[][] = eo.readExcel(0, 0, false);
		for(int i=1;i<temp.length;i++)
		{
			String colString0 = temp[i][0];
			String colString1 = temp[i][1];
			String colString2 = temp[i][2];
			String colString3 = temp[i][3];
			String colString4 = temp[i][4];
			String colString5 = temp[i][5];
			String colString6 = temp[i][6];
			String colString7 = temp[i][7];
			String colString8 = temp[i][8];
			String colString9 = temp[i][9];
			String colString10 = temp[i][10];
			String colString11 = temp[i][11];
			String colString12 = temp[i][12];
			String colString13 = temp[i][13];
			String colString14 = temp[i][14];
			String colString15 = temp[i][15];
			String colString16 = temp[i][16];
			String colString17 = temp[i][17];
			String colString18 = temp[i][18];
			String colString19 = temp[i][19];
//			String colString20 = temp[i][20];
//			String colString21 = temp[i][21];
//			String colString22 = temp[i][22];
//			String colString23 = temp[i][23];
//			String colString24 = temp[i][24];
//			String colString25 = temp[i][25];
//			String colString26 = temp[i][26];
//			String colString27 = temp[i][27];
//			String colString28 = temp[i][28];
//			String colString29 = temp[i][29];
//			String colString30 = temp[i][30];
//			String colString31 = temp[i][31];
//			String colString32 = temp[i][32];
//			String colString33 = temp[i][33];
//			String colString34 = temp[i][34];
//			String colString35 = temp[i][35];
//			String colString36 = temp[i][36];
//			String colString37 = temp[i][37];
//			String colString38 = temp[i][38];
//			String colString39 = temp[i][39];
//			String colString40 = temp[i][40];
			if(colString1!=null)
			{
				if(colString1.contains("天津"))
				{
					vpi.setId(2);
					vpt.setImplVoProgram(vpi);
				}else if(colString1.contains("龙湾"))
				{
					vpi.setId(5);
					vpt.setImplVoProgram(vpi);
				}else if(colString1.contains("泉州"))
				{
					vpi.setId(4);
					vpt.setImplVoProgram(vpi);
				}else if(colString1.contains("佛山"))
				{
					vpi.setId(3);
					vpt.setImplVoProgram(vpi);
				}else if(colString1.contains("镇江"))
				{
					vpi.setId(6);
					vpt.setImplVoProgram(vpi);
				}
				
			}
				vpt.setTaskStatue(colString2);
				
				vpt.setName(MyUtlis.autoCutString(colString3, 30));
				
				VoUser vu = new VoUser();
				vu.setId(1);
				vpt.setImplVoUser(vu);
				
				vpt.setSubDate(MyUtlis.stringToDate(colString5));
				
				vpt.setQuestionStyle(colString6);
				
				vpt.setPlanEndDate(MyUtlis.stringToDate(colString7));
				
				vpt.setRemark(MyUtlis.autoCutString(colString8, 30));
				
				vpt.setTaskStyle(colString9);
				
				vpt.setTaskDifficulty(colString10);
				
				vpt.setQuestionModule(colString12);
				
				vpt.setActualEndDate(MyUtlis.stringToDate(colString13));
				
				vpt.setDetails(MyUtlis.autoCutString(colString16, 30));
				
				if(colString17!=null)
				{
					vpt.setEvaluateHours(Integer.valueOf(colString17));
				}
				
				vpt.setQuestionDeal(colString18);
				
				vpt.setIsUpdatePoint(colString19);
				
				implSuperDao.save(vpt);
				
				System.out.println("已保存第" + i+"行");
			}
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
