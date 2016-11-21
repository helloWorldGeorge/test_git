package cn.hero.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import org.junit.Test;
import org.springframework.stereotype.Component;

public class AutoMakeClass {

	private File file;
	private FileWriter fw;
	private BufferedWriter bw;
	private String outpath = "G:\\xdser\\out\\";
	private String inputPath = "G:\\xdser\\in\\";
	
	@Test
	public void getLogMethod()
	{
		String voEX = "voPublicTran";
		List<String> largeResults = new ArrayList<String>();
		List<String> smallResults = new ArrayList<String>();
		List<String> onlyIDResults = new ArrayList<String>();
		List<String> show_jsp_CHN_Results = new ArrayList<String>();
		File testFile = new File("D:\\2-Study\\Java_Program-2015-7-3\\TPM_2015-8-3\\src\\cn\\tianyi\\lijin\\vo\\VoPublicTran.java");
		FileReader fr;
		try {
			fr = new FileReader(testFile);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				if(line.trim().startsWith("private"))
				{
					int te3 = line.trim().indexOf("//");
					int te1 = line.trim().indexOf("private");
					int te2 = line.trim().indexOf(";");
					String temp222[] = line.trim().split("//");
					String[] temp111 = line.trim().substring(te1,te2).split(";");
					String temp = temp111[0];
					while(temp.contains("  "))
					{
						temp.replace("  ", " ");
					}
					String[] temp2 = temp.split(" ");
					onlyIDResults.add(temp2[2]);
					String voString = temp2[1]+" "+temp2[2];
					String largeone = temp2[2].substring(0, 1).toUpperCase() + temp2[2].substring(1);
					largeResults.add(largeone);
					smallResults.add(voString);
					if(temp222.length>1)
					{
						show_jsp_CHN_Results.add(temp222[1]);
					}else
					{
						show_jsp_CHN_Results.add(largeone);
					}
				}else if(line.trim().startsWith("@"))
				{
					smallResults.add(line);
				}
				
			}
			String log_method_string = "voTemplate_Log.setDescrip(voTemplate.getDescrip());";
			String clone_method_string = "vt.setName(voTemplate.getName());";
			String vo_log_string = "private String name;";
			String show_jsp_string = "<td width=\"6%\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">序号</span></div></td>";
			String show_jsp_string_id ="<td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE4\"><s:property value=\"#voTemplate.verOR\"/></span></div></td>";
			String add_jsp_string ="<s:textfield name=\"voTemplate.verOR\" label=\"OR地址\" />";
			String edit_jsp_string = "<s:textfield name=\"voTemplate.verCountry\" label=\"国家\" value=\"%{#request.voTemplate.verCountry}\"/>";
			
			List<String> log_methods = new ArrayList<String>();
			List<String> cloneSelf_methods = new ArrayList<String>();
			List<String> vo_log_methods = new ArrayList<String>();
			List<String> show_jsp_string_methods = new ArrayList<String>();
			List<String> edit_jsp_string_id_methods = new ArrayList<String>();
			List<String> show_jsp_string_id_methods = new ArrayList<String>();
			List<String> add_jsp_string_methods = new ArrayList<String>();
			
			for(int i=0;i<smallResults.size();i++)
			{
				if(smallResults.get(i).trim().startsWith("@"))
				{
					vo_log_methods.add(smallResults.get(i));
				}else
				{
					String tt1 = vo_log_string.replace("String name", smallResults.get(i).trim()+"_before").replace("voTemplate", voEX);
					vo_log_methods.add(tt1);
				}
				if(i<largeResults.size())
				{
					String tt = log_method_string.replace("voTemplate", voEX).replace("Descrip", largeResults.get(i).trim());
					String tt3 = clone_method_string.replace("voTemplate", voEX).replace("Name", largeResults.get(i).trim());
					String tt4 = show_jsp_string.replace("voTemplate", voEX).replace("序号", show_jsp_CHN_Results.get(i).trim());
					String tt7 = edit_jsp_string.replace("voTemplate", voEX).replace("国家", show_jsp_CHN_Results.get(i).trim()).replace("verCountry", onlyIDResults.get(i).trim());
					String tt5 = show_jsp_string_id.replace("voTemplate", voEX).replace("verOR", onlyIDResults.get(i).trim());
					String tt6 = add_jsp_string.replace("voTemplate", voEX).replace("verOR", onlyIDResults.get(i).trim()).replace("OR地址", show_jsp_CHN_Results.get(i).trim());
					show_jsp_string_methods.add(tt4);
					show_jsp_string_id_methods.add(tt5);
					edit_jsp_string_id_methods.add(tt7);
					add_jsp_string_methods.add(tt6);
					log_methods.add(tt);
					cloneSelf_methods.add(tt3);
				}
			}
			System.out.println("-----------------log_methods-----------------------------------");
			for(int i=0;i<log_methods.size();i++)
			{
				System.out.println(log_methods.get(i));
			}
			System.out.println("-----------------cloneSelf_methods-----------------------------------");
			for(int i=0;i<cloneSelf_methods.size();i++)
			{
				System.out.println(cloneSelf_methods.get(i));
			}
			System.out.println("-----------------vo_log_methods-----------------------------------");
			for(int i=0;i<vo_log_methods.size();i++)
			{
				System.out.println(vo_log_methods.get(i));
			}
			System.out.println("-----------------show_jsp_string_methods-----------------------------------");
			for(int i=0;i<show_jsp_string_methods.size();i++)
			{
				System.out.println(show_jsp_string_methods.get(i));
			}
			
			System.out.println("-----------------show_jsp_string_id_methods-----------------------------------");
			for(int i=0;i<show_jsp_string_id_methods.size();i++)
			{
				System.out.println(show_jsp_string_id_methods.get(i));
			}
			
			System.out.println("-----------------add_jsp_string_methods-----------------------------------");
			for(int i=0;i<add_jsp_string_methods.size();i++)
			{
				System.out.println(add_jsp_string_methods.get(i));
			}
			System.out.println("-----------------edit_jsp_string_id_methods-----------------------------------");
			for(int i=0;i<edit_jsp_string_id_methods.size();i++)
			{
				System.out.println(edit_jsp_string_id_methods.get(i));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void mvcHelp() {
		String bathPath = "D:/02-MyJava/java_program3/MyERP_V1.7.4/src/com/erp";
		String domainName = "PhoneManage";

		String action_domain_Path = bathPath+"/action/Action_"
				+ domainName + ".java";
		String service_domain_Path = bathPath + "/service/Service_"
				+ domainName + ".java";
		String serviceImpl_domain_Path = bathPath + "/serviceImpl/ServiceImpl_"
				+ domainName + ".java";
		String Dao_domain_Path = bathPath + "/Dao/Dao_" + domainName + ".java";
		String DaoImpl_domain_Path = bathPath + "/DaoImpl/DaoImpl_"
				+ domainName + ".java";
		String[] path = {action_domain_Path, service_domain_Path, serviceImpl_domain_Path,
				Dao_domain_Path, DaoImpl_domain_Path };
//		String[] path2 = {service_domain_Path, serviceImpl_domain_Path,
//				Dao_domain_Path, DaoImpl_domain_Path };

		
		String action_domain_Content ="package com.erp.action;\r\n " +
				"import java.util.List;\r\n " +
				"import javax.annotation.Resource;\r\n " +
				"import org.springframework.context.annotation.Scope;\r\n " +
				"import org.springframework.stereotype.Component;\r\n " +
				"import com.erp.all_Impl.Bath.ActionImpl_Bath;\r\n " +
				"import com.erp.domain.orm.Domain_"+domainName+";\r\n " +
				"import com.erp.service.Service_"+domainName+";\r\n " +
				"import com.opensymphony.xwork2.ModelDriven;\r\n " +
				"@Component(\"action_"+domainName+"\")\r\n " +
				"@Scope(value = \"prototype\")\r\n " +
				"public class Action_"+domainName+" extends ActionImpl_Bath implements\r\n " +
				"ModelDriven<Domain_"+domainName+"> {\r\n " +
				"private Domain_"+domainName+" domain_"+domainName+" = new Domain_"+domainName+"();\r\n " +
				"private Service_"+domainName+" serviceImpl_"+domainName+";\r\n " +
				"public Service_"+domainName+" getServiceImpl_"+domainName+"() {\r\n " +
				"return serviceImpl_"+domainName+";\r\n " +
				"}\r\n " +
				"@Resource\r\n " +
				"public void setServiceImpl_"+domainName+"(Service_"+domainName+" serviceImpl_"+domainName+") {\r\n " +
				"this.serviceImpl_"+domainName+" = serviceImpl_"+domainName+";\r\n " +
				"}\r\n " +
				"@Override\r\n " +
				"public Domain_"+domainName+" getModel() {\r\n " +
				"return domain_"+domainName+";\r\n " +
				"}\r\n " +
				"public String temp() {\r\n " +
				"return SUCCESS;\r\n " +
				"}\r\n " +
				"}";
		
		
		String service_domain_Content = "package com.erp.service;\r\n public interface Service_"
				+ domainName + " { }";
		String serviceImpl_domain_Content = "package com.erp.serviceImpl;\r\n"
				+ "import javax.annotation.Resource;\r\n "
				+ "import org.springframework.stereotype.Component;\r\n "
				+ "import com.erp.dao.Dao_"+domainName+";\r\n "
				+ "import com.erp.service.Service_"+domainName+";\r\n "
				+ "@Component\r\n  "
				+ "public class ServiceImpl_"+domainName+" implements Service_"+domainName+" {\r\n "
				+ "private Dao_"+domainName+" daoImpl_"+domainName+";\r\n "
				+ "public Dao_"+domainName+" getDaoImpl_"+domainName+"() {\r\n "
				+ "return daoImpl_"+domainName+";\r\n "
				+ "}\r\n "
				+ "@Resource\r\n "
				+ "public void setDaoImpl_"+domainName+"(Dao_"+domainName+" daoImpl_"+domainName+") {\r\n "
				+ "this.daoImpl_"+domainName+" = daoImpl_"+domainName+";\r\n " 
				+ "}\r\n "
				+ "}";
		String Dao_domain_Content = "package com.erp.dao;\r\n public interface Dao_"
				+ domainName + " {}";
		String DaoImpl_domain_Content = "package com.erp.daoImpl;\r\n " +
				"import com.erp.all_Impl.Bath.DaoImpl_Bath;\r\n " +
				"import com.erp.dao.Dao_"+domainName+";\r\n " +
				"@Component\r\n "+				
				"public class DaoImpl_"+domainName+" extends DaoImpl_Bath implements Dao_"+domainName+" {\r\n " +
				" }";
//		String[] content = {service_domain_Content,
//				serviceImpl_domain_Content, Dao_domain_Content,
//				DaoImpl_domain_Content };
		String[] content = {action_domain_Content, service_domain_Content,
				serviceImpl_domain_Content, Dao_domain_Content,
				DaoImpl_domain_Content };

		for (int i = 0; i < path.length; i++) {
			try
			{
			file = new File(path[i]);
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(content[i]);
			System.out.println("д��" + i + "��");
			}catch(Exception e)
			{
				e.printStackTrace();
			}finally
			{
				try{
				bw.close();
				fw.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		System.out.println("完成！！！！");
	}
	
	@Test
	public void AutoDomain() throws Exception
	{
		String domainName1="aaaaaa";
		String domainName2="vvvvvv";
		String domainPath="D:/Java/Project/MyERP_V1.6.2/src/com/erp/domain/orm/"+domainName1+"s_"+domainName2+"s.java";
		
		String newDomainName=domainName1+"_"+domainName2;
		String newDomainContent="package com.erp.domain.orm;\r\n"
				+ "import javax.persistence.Entity;\r\n"
				+ "import javax.persistence.GeneratedValue;\r\n"
				+ "import javax.persistence.Id;\r\n"
				+ "import org.hibernate.annotations.GenericGenerator;\r\n"
				+ "@Entity\r\n"
				+ "public class "+domainName1+"s_"+domainName2+"s {\r\n"
				+ "@Id\r\n"
				+ "@GeneratedValue(generator = \"id\")\r\n"
				+ "@GenericGenerator(name = \"id\", strategy = \"assigned\")\r\n"
				+ "private int id;\r\n"
				+ "private int "+domainName1+"_id;\r\n"
				+ "private int "+domainName2+"_id;\r\n"
				+ "}";
		File file = new File(domainPath);
		
			try
			{
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				bw.write(newDomainContent);
				System.out.println("生成domain");
			}catch(Exception e)
			{
				e.printStackTrace();
			}finally
			{
				try{
				bw.close();
				fw.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
		}
			
	}