package cn.hero.test;

import help.Temp_File.VoHelp;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import cn.hero.action.ActionVoHelp;

public class Demo2 {
	@Test
	public void testSSHhelp()
	{
		List<VoHelp> voHelps = new ArrayList<VoHelp>();
		String voPath = "";
		String voName = "VoProTask";
		String littleVoName = "voProTask";
		String rootWebPathName = "PM";			//系统的地址根域名  localhost:8080/PM/addXXX。action
		VoHelp vohelp;
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("id");
		vohelp.setType1("Integer");
		vohelp.setCnName("主键");
		vohelp.setIsEdit(0);
		voHelps.add(vohelp);

		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("implVoProgram");
		vohelp.setType1("VO");
		vohelp.setType2("VoProgramInfo");
		vohelp.setCnName("项目名称");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("name");
		vohelp.setType1("String");
		vohelp.setStringLength(10000);
		vohelp.setCnName("标题");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("taskStatue");
		vohelp.setType1("String");
		vohelp.setCnName("状态");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("details");
		vohelp.setType1("String");
		vohelp.setStringLength(60000);
		vohelp.setCnName("详细");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("subDate");
		vohelp.setType1("Date");
		vohelp.setCnName("提交日期");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("planStartDate");
		vohelp.setType1("Date");
		vohelp.setCnName("计划开始日期");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("actualStartDate");
		vohelp.setType1("Date");
		vohelp.setCnName("实际开始日期");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("planEndDate");
		vohelp.setType1("Date");
		vohelp.setCnName("计划结束日期");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("actualEndDate");
		vohelp.setType1("Date");
		vohelp.setCnName("实际结束日期");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("taskStyle");
		vohelp.setType1("String");
		vohelp.setCnName("类型");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("questionStyle");
		vohelp.setType1("String");
		vohelp.setCnName("问题类型");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("questionModule");
		vohelp.setType1("String");
		vohelp.setCnName("问题所属模块");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("taskDifficulty");
		vohelp.setType1("String");
		vohelp.setCnName("事务难度");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("questionDeal");
		vohelp.setType1("String");
		vohelp.setCnName("解决方案");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("evaluateHours");
		vohelp.setType1("Integer");
		vohelp.setCnName("工时评估");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("picturePath");
		vohelp.setType1("String");
		vohelp.setCnName("图片");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("attachmentPath");
		vohelp.setType1("String");
		vohelp.setCnName("附件");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("isUpdatePoint");
		vohelp.setType1("String");
		vohelp.setCnName("升级关注点");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("implVoUser");
		vohelp.setType1("VO");
		vohelp.setType2("VoUser");
		vohelp.setCnName("创建人");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("remark");
		vohelp.setType1("String");
		vohelp.setCnName("备注");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		//开始自己的参数
		
		//结束	
		
		ActionVoHelp ac = new ActionVoHelp();
		ac.setVoHelpsPage(voHelps);
		ac.setVoName(voName);
		ac.setLittleVoName(littleVoName);
		ac.setRootWebPathName(rootWebPathName);
		ac.createNewVo();
		
	}
	
	@Test
	public void updateUsers()
	{
		
	}
}
