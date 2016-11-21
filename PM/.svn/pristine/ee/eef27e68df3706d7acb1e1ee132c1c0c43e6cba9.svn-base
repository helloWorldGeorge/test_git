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
		String voName = "VoZHANGTAO";
		String littleVoName = "voZHANGTAO";
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
		vohelp.setName("name");
		vohelp.setType1("String");
		vohelp.setCnName("项目名称");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("serverInfo");
		vohelp.setType1("String");
		vohelp.setStringLength(60000);
		vohelp.setCnName("服务器信息");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("backSpaceInfo");
		vohelp.setType1("String");
		vohelp.setCnName("后台信息");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("thirdPartyInfo");
		vohelp.setType1("String");
		vohelp.setCnName("第三方账户信息");
		vohelp.setIsEdit(1);
		voHelps.add(vohelp);
		
		vohelp=null;
		vohelp= new VoHelp();
		vohelp.setName("implUser");
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
