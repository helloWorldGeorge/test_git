package cn.hero.action;
import help.Temp_File.VoHelp;

import java.awt.Insets;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.apache.commons.io.FileUtils;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import cn.hero.util.MyUtlis;
import cn.hero.vo.VoUser;

import com.opensymphony.xwork2.ModelDriven;
//
//@Component
//@Scope(value="prototype")
public class ActionVoHelp extends SuperAction implements ModelDriven<VoHelp>{
	private static final long serialVersionUID = 1L;
	private VoHelp voHelp;
	private List<VoHelp> voHelpsPage = new ArrayList<VoHelp>();
	private Integer[] voHelpsPageCheckBoxs;
	private String packName="cn\\hero\\";
	private String helpFilesPath = "F:\\ZHANGTAO_Test\\02-JAVA_PROJECT2\\PM\\src\\help\\Temp_File";
	private String basicPath_src = helpFilesPath.replace("\\help\\Temp_File", "");
//	D:\02-MyJava\java_program3\TPM_2015-8-16\WebRoot\WEB-INF\TPM_JSP
	private String basicPath_jsp = helpFilesPath.replace("src\\help\\Temp_File", "WebRoot\\WEB-INF\\TPM_JSP");
	private HashMap<String,List<String>> jspResultPath = new HashMap<String, List<String>>();
	private String voName;
	private String voCnName;
	private String littleVoName ;
	private String rootWebPathName;

	
	public String getRootWebPathName() {
		return rootWebPathName;
	}

	public void setRootWebPathName(String rootWebPathName) {
		this.rootWebPathName = rootWebPathName;
	}

	//1前往新增
	public String gotoAddVoHelp()
	{
		return SUCCESS;	
	}
	
	//1、增：保存添加
	public String createNewVo()
	{
		//addVoHelp_action
//		System.out.println(voHelpsPageCheckBoxs);
//		System.out.println(voHelpsPage.size());
		//1、把JSP中新增的内容都计算出来，添加到MAP：jspResultPath中。
		this.addJspList(voHelpsPage);
		//2、创建需要新增voName的内容；将需要添加的内容添加到对应VO文件中
		List<String> voTemps = this.createNewVo(voHelpsPage);
		String voTempsresultFilePath = basicPath_src+"\\"+packName+"\\vo\\"+voName+".java";
		this.createFile(voTemps,voTempsresultFilePath);
		
		//3、创建需要新增voName_Log的内容；将需要添加的内容添加到基础中，并汇总成List
		List<String> voLog = this.createNewVoLog(voHelpsPage);
		String voLogresultFilePath = basicPath_src+"\\"+packName+"\\vo\\"+voName+"_Log.java";
		this.createFile(voLog,voLogresultFilePath);
		
		//4、创建需要新增Action的内容；将需要添加的内容添加到基础中，并汇总成List
		List<String> voAction = this.createNewVoAction(voHelpsPage);
		String voActionresultFilePath = basicPath_src+"\\"+packName+"\\action\\Action"+voName+".java";
		this.createFile(voAction,voActionresultFilePath);
		
		//4.1、创建需要更新的Action_StrusXML的内容；将需要添加的内容添加到基础中，并汇总成List
		List<String> voAction_StrusXML = this.udpateAction_StrusXML(voHelpsPage);
		String voAction_StrusXMLresultFilePath = basicPath_src+"\\struts.xml";
		this.createFile(voAction_StrusXML,voAction_StrusXMLresultFilePath);
				
		
		//5、创建需要新增Service的内容；将需要添加的内容添加到基础中，并汇总成List
		List<String> voService = this.createNewVoService();
		String voServiceresultFilePath = basicPath_src+"\\"+packName+"\\service\\Service"+voName+".java";
		this.createFile(voService,voServiceresultFilePath);
		
		//6、创建需要新增implService的内容；将需要添加的内容添加到基础中，并汇总成List
		List<String> voImplService = this.createNewVoService(voHelpsPage,"//Service_saveLog",new File(helpFilesPath+"\\ImplServiceVoVerPlan.txt"));
		String voImplServiceresultFilePath = basicPath_src+"\\"+packName+"\\service\\impl\\ImplService"+voName+".java";
		this.createFile(voImplService,voImplServiceresultFilePath);
		
		//6.1、更新 需要更新的implService的内容；将需要添加的内容添加到基础中，并汇总成List
		List<String> voImplService_update = this.updateNewVoService(voHelpsPage,"//implService_queryString",new File(voImplServiceresultFilePath));
		this.createFile(voImplService_update,voImplServiceresultFilePath);
		
		
		//7、创建需要新增Add_jsp的内容；将需要添加的内容添加到基础中，并汇总成List；创建JSP的文件夹
		List<String> add_jsp = this.createNewAdd_jsp(voHelpsPage);
		File file = new File(basicPath_jsp+"\\"+voName);
		file.mkdir();
		String add_jspFilePath = basicPath_jsp+"\\"+voName+"\\"+"add"+voName+".jsp";
		this.createFile(add_jsp,add_jspFilePath);
		
		//8、创建需要新增Edit_jsp的内容；将需要添加的内容添加到基础中，并汇总成List
		List<String> edit_jsp = this.createNewEdit_jsp(voHelpsPage);
		String edit_jspFilePath = basicPath_jsp+"\\"+voName+"\\"+"edit"+voName+".jsp";
		this.createFile(edit_jsp,edit_jspFilePath);
		
		//9、创建需要新增Show_jsp的内容；将需要添加的内容添加到基础中，并汇总成List
		List<String> show_jsp_title = this.createNewShow_jsp_1();
		List<String> show_jsp_final = this.createNewShow_jsp_2(show_jsp_title);
		String show_jsp_2FilePath = basicPath_jsp+"\\"+voName+"\\"+"show"+voName+"s.jsp";
		this.createFile(show_jsp_final,show_jsp_2FilePath);
		
		System.out.println("-------------------voTemps文件---------");
		for(int i=0;i<voTemps.size();i++)
		{
			System.out.println(voTemps.get(i));
		}
		System.out.println("-------------------voLog文件---------");
		for(int i=0;i<voLog.size();i++)
		{
			System.out.println(voLog.get(i));
		}
		System.out.println("-------------------voAction文件---------");
		for(int i=0;i<voAction.size();i++)
		{
			System.out.println(voAction.get(i));
		}
		System.out.println("-------------------voService文件---------");
		for(int i=0;i<voService.size();i++)
		{
			System.out.println(voService.get(i));
		}
		
		System.out.println("-------------------add_jsp文件---------");
		for(int i=0;i<add_jsp.size();i++)
		{
			System.out.println(add_jsp.get(i));
		}
		System.out.println("-------------------edit_jsp文件---------");
		for(int i=0;i<edit_jsp.size();i++)
		{
			System.out.println(edit_jsp.get(i));
		}
		System.out.println("-------------------show_jsp_2文件---------");
		for(int i=0;i<show_jsp_final.size();i++)
		{
			System.out.println(show_jsp_final.get(i));
		}
		return SUCCESS;
	}


	private void createFile(List<String> voTemps, String voTempsresultFilePath) {
		FileWriter fw;
		try {
			File file = new File(voTempsresultFilePath);
			if(!file.exists()){
				file.createNewFile();
			}
			fw = new   FileWriter(file);
			BufferedWriter   bw=new   BufferedWriter(fw);   
			for(int i=0;i<voTemps.size();i++)
			{
				bw.write(voTemps.get(i)); 
				bw.newLine();
			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

	private List<String> createNewVo(List<VoHelp> voHelpsPage) {
		List<String> insertVoLines = this.getNewVo(voHelpsPage);
		File basicFile = new File(helpFilesPath+"\\VoTemp.txt");
		return getWholeFileList(basicFile,"//voTemp_begin",insertVoLines,"add");
	}
	
	private List<String> createNewVoLog(List<VoHelp> voHelpsPage2) {
		List<String> insertVoLogLines = this.getNewVoLog(voHelpsPage2);
		File basicFile = new File(basicPath_src+"\\"+packName+"\\vo\\"+voName+".java");
		return getWholeFileList(basicFile,"//voTmep_Log_begin",insertVoLogLines,"add");
//		}
	}
	
	private List<String> createNewVoAction(List<VoHelp> voHelpsPage2) {
		List<String> actionAddEditResult = this.getNewVoActionAddresult(voHelpsPage2);
		File basicFile = new File(helpFilesPath+"\\ActionVoVerPlan.txt");
		return getWholeFileList(basicFile,"//Action_gotoAddandEdit",actionAddEditResult,"add");
	}
	
	private List<String> udpateAction_StrusXML(List<VoHelp> voHelpsPage2) {
		List<String> actionAddEditResult = this.getAction_StrusXMLAddresult(voHelpsPage2);
		File basicFile = new File(basicPath_src+"\\struts.xml");
		return getWholeFileList(basicFile,"<!-- add_VoTTTTT -->",actionAddEditResult,"update");
	}
	
	private List<String> createNewVoService() {
		File testFile = new File(helpFilesPath+"\\ServiceVoVerPlan.txt");
		return getWholeFileList(testFile,null,null,"add");
	}
	
	private List<String> createNewVoService(List<VoHelp> voHelpsPage2,String tagString,File basicFile) {
		List<String> service_logResult = this.getService_logResult(voHelpsPage2);
		return getWholeFileList(basicFile,tagString,service_logResult,"add");
	}
	private List<String> updateNewVoService(List<VoHelp> voHelpsPage,String tagString, File basicFile) {
		List<String> service_logResult = this.getUpdateNewVoServiceResult(voHelpsPage);
		return getWholeFileList(basicFile,tagString,service_logResult,"add");
	}
	
	private List<String> createNewShow_jsp_1() {
		List<String> show_jsp_result_title = this.getJspResultPath().get("show_jsp_result_title");
		File testFile = new File(helpFilesPath+"\\showVoVerPlans.jsp");
		return getWholeFileList(testFile,"<!--showjsp_1-->",show_jsp_result_title,"add");
	}
	
	private List<String> createNewShow_jsp_2(List<String> lastRests) {
		List<String> show_jsp_result_values = this.getJspResultPath().get("show_jsp_result_values");
		List<String> wholeString = new ArrayList<String>();
		for(int i=0;i<lastRests.size();i++)
		{
			if(lastRests.get(i).trim().startsWith("<!--showjsp_2-->"))
			{
				wholeString.add(lastRests.get(i));
				wholeString.addAll(show_jsp_result_values);
			}else
			{
				wholeString.add(lastRests.get(i));
			}
		}
		return wholeString;
	}

	private List<String> createNewEdit_jsp(List<VoHelp> voHelpsPage2) {
		List<String> edit_jsp_result = this.getJspResultPath().get("edit_jsp_result");
		File testFile = new File(helpFilesPath+"\\editVoVerPlan.jsp");
		return getWholeFileList(testFile,"<!-- edit_jsp -->",edit_jsp_result,"add");
	}

	private List<String> createNewAdd_jsp(List<VoHelp> voHelpsPage2) {
		List<String> add_jsp_result = this.getJspResultPath().get("add_jsp_result");
		File testFile = new File(helpFilesPath+"\\addVoVerPlan.jsp");
		return getWholeFileList(testFile,"<!-- add_jsp -->",add_jsp_result,"add");
	}

	private List<String> getService_logResult(List<VoHelp> voHelpsPage2) {
		List<String> results = new ArrayList<String>();
		for(int i=0;i<voHelpsPage2.size();i++)
		{
			VoHelp vohelp = voHelpsPage2.get(i);
			if(vohelp==null||vohelp.getName()==null||vohelp.getName().trim().equals(""))
			{
				continue;
			}
			String temp1 = "voVerPlan_Log.setVoProduct(voVerPlan.getVoProduct());";
			String temp2 = temp1.replace("voVerPlan", this.setFirstLittle(voName));
			results.add(temp2.replace("VoProduct", this.setFirstBig(vohelp.getName())));
		}
		return results;
	}
	
	private List<String> getUpdateNewVoServiceResult(List<VoHelp> voHelpsPage2) {
		List<String> results = new ArrayList<String>();
		for(int i=0;i<voHelpsPage2.size();i++)
		{
			VoHelp vohelp = voHelpsPage2.get(i);
			if(vohelp==null||vohelp.getName()==null||vohelp.getName().trim().equals(""))
			{
				continue;
			}
			if(i<voHelpsPage2.size()-1)
			{
				results.add("hql.append(\""+vohelp.getName()+" like '%\"+queryString+\"%' or \");");
			}else
			{
				results.add("hql.append(\""+vohelp.getName()+" like '%\"+queryString+\"%'\");");
			}
		}
		return results;
	}
	
	private List<String> getNewVoActionAddresult(List<VoHelp> voHelpsPage2) {
		List<String> results = new ArrayList<String>();
		for(int i=0;i<voHelpsPage2.size();i++)
		{
			VoHelp vohelp = voHelpsPage2.get(i);
			if(vohelp==null||vohelp.getName()==null||vohelp.getName().trim().equals(""))
			{
				continue;
			}
			if(vohelp.getType2()!=null&&!vohelp.getType2().trim().equals("")&&vohelp.getType1().equals("VO"))
			{
				String temp1 = "List<VoUser> voUsers = super.find(\"from VoUser\");";
				String temp2 = "request.setAttribute(\"voUsers\", voUsers);";
				results.add(temp1.replace("VoUser", vohelp.getType2()).replace("voUser", vohelp.getName()));
				results.add(temp2.replace("voUser", vohelp.getName()));
			}
		}
		return results;
	}

	private List<String> getAction_StrusXMLAddresult(List<VoHelp> voHelpsPage2) {
		List<String> results = new ArrayList<String>();
		this.getLittleVoName();
		FileReader fr;
		try {
			fr = new FileReader(helpFilesPath+"\\struts_xml_temp.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				results.add(line.replace("VoTest", voName).replace("voTest", this.setFirstLittle(voName)));
			}
			br.close();
			fr.close();
			return results;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	private List<String> getNewVoLog(List<VoHelp> voHelpsPage2) {
		List<String> results = new ArrayList<String>();
//		String temp1 = "public String getHello() {return hello;}";
//		String temp2 = "public void setHello(String hello) {this.hello = hello;}";
		results.add("private String log_Remark;		//记录备注");
		results.add("@Temporal(TemporalType.DATE)");
		results.add("private Date log_Date;			//记录时间");
		results.add("@ManyToOne(cascade={javax.persistence.CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)");
		results.add("@JoinColumn(name=\"log_user_id\")");
		results.add("private VoUser log_user;			//记录创建人 ");
		results.add("@Column(length=60000)");
//		results.add("private String cpName;					//改变的属性名 ");
//		results.add("public String getCpName() {return cpName;}");
//		results.add("public void setCpName(String cpName) {this.cpName = cpName;}");
		String idType = "String";
		for(VoHelp vh:voHelpsPage2)
		{
			if("id".equals(vh.getName()))
			{
				idType = vh.getType1();
				break;
			}
		}
		results.add(("private "+idType+" voTest_id;    //对象主键").replace("voTest", this.getLittleVoName()));
		results.add("public String getLog_Remark() {	return log_Remark;}");
		results.add("public void setLog_Remark(String log_Remark) {this.log_Remark = log_Remark;}");
		results.add("public Date getLog_Date() {return log_Date;}");
		results.add("public void setLog_Date(Date log_Date) {this.log_Date = log_Date;}");
		results.add("public VoUser getLog_user() {return log_user;}");
		results.add("public void setLog_user(VoUser log_user) {this.log_user = log_user;}");
		results.add(("public "+idType+" getVoTran_id() {return voTran_id;}").replace("voTran", this.getLittleVoName()).replace("VoTran", voName));
		results.add(("public void setVoTran_id("+idType+" voTran_id) {this.voTran_id = voTran_id;}").replace("voTran", this.getLittleVoName()).replace("VoTran", voName));
		return results;
	}

	

	private List<String> getNewVo(List<VoHelp> voHelpsPage) {
		List<String> results = new ArrayList<String>();
		String temp1 = "public String getHello() {return hello;}";
		String temp2 = "public void setHello(String hello) {this.hello = hello;}";
		StringBuffer toString_String= new StringBuffer("{return MyUtlis.dateformat(new Date())+\"@@@\"+\""+littleVoName+"\"+");
		for(int i=0;i<voHelpsPage.size();i++)
		{
			
			VoHelp vohelp = voHelpsPage.get(i);
			if(vohelp==null||vohelp.getName()==null||vohelp.getName().trim().equals(""))
			{
				voHelpsPage.remove(i);
				continue;
			}
			
			if(!vohelp.getName().startsWith("backup"))
			{
				toString_String.append("\"@@@\"+");
			}
			
			if("id".equals(vohelp.getName()))
			{
				results.add("@Id");
				results.add("@GeneratedValue(generator=\"uid\")");
				if("String".equals(vohelp.getType1()))
				{
					results.add("@GenericGenerator(name=\"uid\",strategy=\"TTTTT\")".replace("TTTTT", "uuid"));
				}else
				{
					results.add("@GenericGenerator(name=\"uid\",strategy=\"TTTTT\")".replace("TTTTT", "identity"));
				}
				results.add("private "+vohelp.getType1()+" "+vohelp.getName()+";"+"		"+"//"+vohelp.getCnName());
				if(!vohelp.getName().startsWith("backup"))
				{
					toString_String.append("\""+vohelp.getName()+":\"+this."+vohelp.getName()+"+");
				}
				continue;
			}
			
			//1、创建private XXX XXX;字符串
			//1.1、如果是VO类型
			if(vohelp.getType2()!=null&&!vohelp.getType2().trim().equals(""))
			{
				results.add("@ManyToOne(cascade={javax.persistence.CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)");
				results.add("@JoinColumn(name=\""+vohelp.getName()+"_id\")");
				results.add("private "+vohelp.getType2()+" "+vohelp.getName()+";"+"		"+"//"+vohelp.getCnName());
				if(!vohelp.getName().startsWith("backup"))
				{
					toString_String.append("\""+vohelp.getName()+":\"+this."+vohelp.getName()+".getName()");
				}
			}
			//1.2、如果是字符串类型
			else if(vohelp.getType1().equals("String"))
			{
				boolean isShortString = vohelp.getStringLength()==null||vohelp.getStringLength()==0||vohelp.getStringLength()==255;
				if(!isShortString)
				{
					if(vohelp.getStringLength()>60000)
					{
						results.add("@Column(length=60000)");
					}else
					{
						results.add("@Column(length="+vohelp.getStringLength()+")");
					}
				}
				if(vohelp.getSelect1()!=null&&vohelp.getSelect1().trim().equals(""))
				{
					results.add("private "+vohelp.getType1()+" "+vohelp.getName()+";"+"		"+"//"+vohelp.getCnName()+":"+vohelp.getSelect1());
				}else
				{
					results.add("private "+vohelp.getType1()+" "+vohelp.getName()+";"+"		"+"//"+vohelp.getCnName());
				}
				if(!vohelp.getName().startsWith("backup"))
				{
					toString_String.append("\""+vohelp.getName()+":\"+this."+vohelp.getName()+"");
				}
			}
			//1.3、如果是日期类型
			else if(vohelp.getType1().equals("Date"))
			{
				results.add("@Temporal(TemporalType.DATE)");
				results.add("private "+vohelp.getType1()+" "+vohelp.getName()+";"+"		"+"//"+vohelp.getCnName());
				if(!vohelp.getName().startsWith("backup"))
				{
					toString_String.append("\""+vohelp.getName()+":\"+this."+vohelp.getName()+"");
				}
			}
			//1.4、其他类型（包括Integer）
			else
			{
				if(vohelp.getSelect1()!=null&&vohelp.getSelect1().trim().equals(""))
				{
					results.add("private "+vohelp.getType1()+" "+vohelp.getName()+";"+"		"+"//"+vohelp.getCnName()+":"+vohelp.getSelect1());
				}else
				{
					results.add("private "+vohelp.getType1()+" "+vohelp.getName()+";"+"		"+"//"+vohelp.getCnName());
				}
				if(!vohelp.getName().startsWith("backup"))
				{
					toString_String.append("\""+vohelp.getName()+":\"+this."+vohelp.getName()+"");
				}
			}
			if(i!=(voHelpsPage.size()-1))
			{
				if(!vohelp.getName().startsWith("backup"))
				{
					toString_String.append("+");
				}
			}
		}
		//2、创建set\get函数
		for(int i=0;i<voHelpsPage.size();i++)
		{
			VoHelp vohelp = voHelpsPage.get(i);
			if(vohelp.getType2()!=null&&!vohelp.getType2().trim().equals(""))
			{
				results.add(temp1.replace("hello", vohelp.getName()).replace("Hello", this.setFirstBig(vohelp.getName())).replace("String", vohelp.getType2()));
				results.add(temp2.replace("hello", vohelp.getName()).replace("Hello", this.setFirstBig(vohelp.getName())).replace("String", vohelp.getType2()));
			}else
			{
				results.add(temp1.replace("hello", vohelp.getName()).replace("Hello", this.setFirstBig(vohelp.getName())).replace("String", vohelp.getType1()));
				results.add(temp2.replace("hello", vohelp.getName()).replace("Hello", this.setFirstBig(vohelp.getName())).replace("String", vohelp.getType1()));
			}
		}
		results.add("public String toString()");
		int a =toString_String.lastIndexOf("+");
		String finaltoString="";
		if(toString_String.lastIndexOf("+")==(toString_String.length()-1))
		{
			finaltoString = toString_String.substring(0, a);
		}else
		{
			finaltoString = toString_String+"";
		}
		results.add(finaltoString+";}");
		System.out.println(toString_String+";}");
		return results;
	}
	
	private void addJspList(List<VoHelp> voHelpsPage2) {
		//<!-- add_jsp -->
		List<String> add_jsp_result =  new ArrayList<String>();
		//<!-- edit_jsp -->
		List<String> edit_jsp_result =  new ArrayList<String>();
		//<!-- show_jsp_1 --> 显示JSP：表头集合
		List<String> show_jsp_result_title =  new ArrayList<String>();
		//<!-- show_jsp_2 --> 显示JSP：参数值集合
		List<String> show_jsp_result_values =  new ArrayList<String>();
		
//1、基础JSP
		//添加JSP：VO参数的添加
		String addjspString_vo = "<s:select name=\"PPPPP.id\" list=\"%{#request.PPPPPs}\" listKey=\"id\" listValue=\"name\" label=\"CCCCC\"></s:select>";
		//添加JSP:多选值的添加
		String addjspString_dbSelect1 = "<s:set name=\"PPPPP_list\" value=\"{SSSSS}\"></s:set>";
		String addjspString_dbSelect2 = "<s:select name=\"PPPPP\" list=\"#PPPPP_list\" label=\"CCCCC\" value=\"%{#request.RRRRR.PPPPP}\"/>";
		//添加JSP:日期值的添加
		String addjspString_date = "<s:textfield name=\"PPPPP\" label=\"CCCCC\" id=\"popupDatepicker\" readonly=\"true\"/>";
		//添加JSP：普通值的添加
		String addjspString_normal = "<s:textarea cols=\"130\" rows=\"2\" name=\"PPPPP\" label=\"CCCCC\" />";
		
		//编辑JSP：选择性的编辑参数
		String editjspString_select = "<tr>" +
				"<td>CCCCC</td>" +
				"<td><span class=\"OLD_TXT\"><s:property value=\"#request.RRRRR.PPPPP\" /></span></td>" +
				"<td><s:select name=\"PPPPP.id\" list=\"#request.PPPPPs\" listKey=\"id\" listValue=\"name\" label=\"CCCCC\" value=\"%{#request.RRRRR.PPPPP.id}\"></s:select></td>" +
				"</tr>";
		//编辑JSP：日期参数
		String editjspString_date = "<tr>" +
				"<td>CCCCC<td></td>" +
				"<td><span class=\"OLD_TXT\"><s:date name=\"#request.RRRRR.PPPPP\" format=\"yyyy-MM-dd\" /></span></td>" +
				"<td><s:textfield name=\"PPPPP\" label=\"CCCCC\" id=\"popupDatepicker\" readonly=\"true\"><s:param name=\"value\" ><s:date name=\"%{#request.RRRRR.PPPPP}\" format=\"yyyy-MM-dd\" /></s:param></s:textfield></td>" +
				"</tr>";
		//编辑JSP:普通参数
		String editjspString_normal = "<tr>" +
				"<td>CCCCC</td>" +
				"<td><span class=\"OLD_TXT\"><s:property value=\"#request.RRRRR.PPPPP\" /></span></td>" +
				"<td><s:textarea cols=\"130\" rows=\"2\" name=\"PPPPP\" label=\"CCCCC\" value=\"%{#request.RRRRR.PPPPP}\"/></td>" +
				"</tr>";
		//编辑JSP:不可编辑的普通参数
		String editjspString_noEdit_normal = "<tr>" +
				"<td>CCCCC<td>" +
				"<td><span class=\"OLD_TXT\">此参数不可直接编辑</span></td>" +
				"<td><s:hidden name=\"PPPPP\" value=\"%{#request.RRRRR.PPPPP}\"/></td>" +
				"</tr>";
				
				
		//显示JSP：表头
		String showjspString_title = "<th><div align=\"center\"><span class=\"STYLE4\">product1</span></div></th>";
		//显示JSP：普通参数
		String showjspString_normal = "<td><div align=\"center\"><span class=\"STYLE4\"><s:property value=\"#RRRRR.PPPPP\" /></span></div></td>";
		//显示JSP：日期参数
		String showjspString_date = "<td><div align=\"center\"><span class=\"STYLE4\"> <s:date name=\"#RRRRR.PPPPP\" format=\"yyyy-MM-dd\" /></span></div></td>";
		
		for(int j=0;j<voHelpsPage.size();j++)
		{
			VoHelp vh = voHelpsPage.get(j);
//2、对应每个基础修改后的字符串
			//显示JSP：表头
			String showOneResult_title;
			//显示JSP：普通参数
			String showOneResult;
			
			String addOneResult;
			String editOneResult;
			
//2.1无论是什么参数，表头都是显示中文名,添加到ShowJSP
			if(vh==null||vh.getName()==null||vh.getName().trim().equals(""))
			{
				continue;
			}
			showOneResult_title = showjspString_title.replace("product1", vh.getCnName());
			show_jsp_result_title.add(showOneResult_title);
  //2.2如果是VO参数
			if(vh.getType1().equals("VO"))
			{
    //2.2.1添加到addJSP
				addOneResult = addjspString_vo.replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName());
				add_jsp_result.add(addOneResult);
    //2.2.3添加到showJSP				
				showOneResult = showjspString_normal.replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName()).replace("PPPPP", vh.getName()+".name");
				show_jsp_result_values.add(showOneResult);
	//2.2.2添加到editJSP			
				if(vh.getIsEdit()!=null&&vh.getIsEdit()==0)
				{
					edit_jsp_result.add(editjspString_noEdit_normal.replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName()));
				}else
				{
					editOneResult = editjspString_select.replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName()).replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName());
					edit_jsp_result.add(editOneResult);
				}
   //2.3如果是多选参数
			}else if(vh.getSelect1()!=null&&vh.getSelect1().contains("@"))
			{
				String[] temp4 = vh.getSelect1().split("@");
				StringBuffer temp5 = new StringBuffer();
				for(int i=0;i<temp4.length;i++)
				{
					if(temp4[i].trim().equals(""))
					{
						continue;
					}
					if(i==0)
					{
						temp5.append("'"+temp4[i]+"'");
					}else
					{
						temp5.append(",'"+temp4[i]+"'");
					}
				}
				//2.3.1添加到addJSP
				addOneResult = addjspString_dbSelect1.replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("SSSSS", temp5);
				add_jsp_result.add(addOneResult);
				addOneResult = addjspString_dbSelect2.replace("value=\"%{#request.RRRRR.PPPPP}\"", "").replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName());
				add_jsp_result.add(addOneResult);
				//2.3.2添加到showJSP
				showOneResult = showjspString_normal.replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName());
				show_jsp_result_values.add(showOneResult);
				//2.3.3添加到editJSP
				if(vh.getIsEdit()!=null&&vh.getIsEdit()==0)
				{
					editOneResult = editjspString_noEdit_normal.replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName()).replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName());
					edit_jsp_result.add(editOneResult);
				}else
				{
					editOneResult = editjspString_select.replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName()).replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName());
					edit_jsp_result.add(editOneResult);
				}
	//2.4如果是日期参数
			}else if(vh.getType1().equals("Date"))
			{
				if(!vh.getName().equals("createDate"))
				{
					addOneResult = addjspString_date.replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName());
					add_jsp_result.add(addOneResult);
				}
				if(vh.getIsEdit()!=null&&vh.getIsEdit()==0)
				{
					editOneResult = editjspString_noEdit_normal.replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName()).replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName());
					edit_jsp_result.add(editOneResult);
				}else
				{
					editOneResult = editjspString_date.replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName()).replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName());
					edit_jsp_result.add(editOneResult);
				}
				showOneResult = showjspString_date.replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName());
				show_jsp_result_values.add(showOneResult);
			}
	//2.5如果是普通参数
			else
			{
				addOneResult = addjspString_normal.replace("value=\"%{#request.RRRRR.PPPPP}\"", "").replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName());
				add_jsp_result.add(addOneResult);
				
				showOneResult = showjspString_normal.replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName());
				show_jsp_result_values.add(showOneResult);
				
				if(vh.getIsEdit()!=null&&vh.getIsEdit()==0)
				{
					editOneResult = editjspString_noEdit_normal.replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName());
					edit_jsp_result.add(editOneResult);
				}else
				{
					editOneResult = editjspString_normal.replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName()).replace("RRRRR", this.getLittleVoName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("PPPPP", vh.getName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName()).replace("CCCCC", vh.getCnName());
					edit_jsp_result.add(editOneResult);
				}
			}
		}
		jspResultPath.put("add_jsp_result", add_jsp_result);
		jspResultPath.put("edit_jsp_result", edit_jsp_result);
		jspResultPath.put("show_jsp_result_title", show_jsp_result_title);
		jspResultPath.put("show_jsp_result_values", show_jsp_result_values);
	}

	private List<String> getWholeFileList(File basicFile,String tagString,List<String> addList,String updateORadd)
	{
		List<String> voList = new ArrayList<String>();
		if(basicFile==null)
		{
			return null;
		}
		FileReader fr;
		try {
			fr = new FileReader(basicFile);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				if(tagString!=null)
				{
					//单独给VoName_Log使用
					if(tagString.startsWith("//voTmep_Log_begin"))
					{
						if(line.trim().startsWith("public class"))
						{
							voList.add(line.replace(voName, voName+"_Log"));
							continue;
						}
					}
					//所有可以共用
					if(line.trim().startsWith(tagString))
					{
						voList.add(line);
						voList.addAll(addList);
						continue;
					}
				}
				if("update".equals(updateORadd))
				{
					voList.add(line);
				}else
				{
					voList.add(line.replace("WWWWWWWW", rootWebPathName).replace("VoVVVVV", voName).replace("voVVVVV", this.setFirstLittle(voName)));
				}
			}
			br.close();
			fr.close();
			return voList;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	private String setFirstBig(String name) {
		String bigName = name.substring(0, 1).toUpperCase()+ name.substring(1);
		return bigName;
	}
	
	private String setFirstLittle(String voName2) {
		// TODO Auto-generated method stub
		if(voName2==null){
			return null;
		}
		String littleName = voName2.substring(0, 1).toLowerCase()+ voName2.substring(1);
		return littleName;
//		return null;
	}
	

	public String getVoCnName() {
		return voCnName;
	}

	public void setVoCnName(String voCnName) {
		this.voCnName = voCnName;
	}

	public String getLittleVoName() {
		return this.setFirstLittle(this.getVoName());
	}

	public void setLittleVoName(String littleVoName) {
		this.littleVoName = littleVoName;
	}

	public String getHelpFilesPath() {
		return helpFilesPath;
	}

	public void setHelpFilesPath(String helpFilesPath) {
		this.helpFilesPath = helpFilesPath;
	}

	public String getBasicPath_src() {
		return basicPath_src;
	}

	public void setBasicPath_src(String basicPath_src) {
		this.basicPath_src = basicPath_src;
	}

	public String getPackName() {
		return packName;
	}

	public void setPackName(String packName) {
		this.packName = packName;
	}

	public String getBasicPath() {
		return helpFilesPath;
	}

	public void setBasicPath(String basicPath) {
		this.helpFilesPath = basicPath;
	}

	public HashMap<String, List<String>> getJspResultPath() {
		return jspResultPath;
	}

	public void setJspResultPath(HashMap<String, List<String>> jspResultPath) {
		this.jspResultPath = jspResultPath;
	}

	public String getBasicPath2() {
		return basicPath_src;
	}

	public void setBasicPath2(String basicPath2) {
		this.basicPath_src = basicPath2;
	}

	public String getVoName() {
		return voName;
	}

	public void setVoName(String voName) {
		this.voName = voName;
	}

	public VoHelp getModel() {
		return voHelp;
	}
	
	public List<VoHelp> getVoHelpsPage() {
		return voHelpsPage;
	}

	public void setVoHelpsPage(List<VoHelp> voHelpsPage) {
		this.voHelpsPage = voHelpsPage;
	}

	public Integer[] getVoHelpsPageCheckBoxs() {
		return voHelpsPageCheckBoxs;
	}

	public void setVoHelpsPageCheckBoxs(Integer[] voHelpsPageCheckBoxs) {
		this.voHelpsPageCheckBoxs = voHelpsPageCheckBoxs;
	}
}
