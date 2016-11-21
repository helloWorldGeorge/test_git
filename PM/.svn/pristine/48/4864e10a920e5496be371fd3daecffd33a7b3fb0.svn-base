package help;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.io.FileUtils;
import org.hibernate.mapping.Array;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.hero.vo.VoUser;

import com.opensymphony.xwork2.ModelDriven;

@Component
@Scope(value="prototype")
public class ActionVoHelp extends SuperAction implements ModelDriven<VoHelp>{
	private static final long serialVersionUID = 1L;
	private VoHelp voHelp = new VoHelp();
	private List<VoHelp> voHelpsPage = new ArrayList<VoHelp>();
	private Integer[] voHelpsPageCheckBoxs;
	private String packName="com\\cn";
	private String basicPath = "D:\\2-Study\\Java_Program-2015-7-3\\TPM_2015-8-3\\src\\help";
	private HashMap<String,String> fileResultPath = new HashMap<String, String>();
	private String voName;
	private String basicPath2 = "D:\\02-MyJava\\java_program3\\TPM_2015-8-16\\src";
	
	public String getPackName() {
		return packName;
	}

	public void setPackName(String packName) {
		this.packName = packName;
	}

	public String getBasicPath() {
		return basicPath;
	}

	public void setBasicPath(String basicPath) {
		this.basicPath = basicPath;
	}

	public HashMap<String, String> getFileResultPath() {
		return fileResultPath;
	}

	public void setFileResultPath(HashMap<String, String> fileResultPath) {
		this.fileResultPath = fileResultPath;
	}

	public String getBasicPath2() {
		return basicPath2;
	}

	public void setBasicPath2(String basicPath2) {
		this.basicPath2 = basicPath2;
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
	
	public VoHelp getVoHelp() {
		return voHelp;
	}

	public void setVoHelp(VoHelp voHelp) {
		this.voHelp = voHelp;
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

	//1、增：前往添加
	public String gotoAddVoHelp()
	{
		return SUCCESS;	
	}
	
	//1、增：保存添加
	public String createNewVo()
	{
		//addVoHelp_action
		System.out.println(voHelpsPageCheckBoxs);
		System.out.println(voHelpsPage.size());
		List<String> voTemps = this.createNewVo(voHelpsPage,voHelpsPageCheckBoxs);
		List<String> voLog = this.createNewVoLog(voHelpsPage,voHelpsPageCheckBoxs,null);
		List<String> voAction = this.createNewVoAction(voHelpsPage,voHelpsPageCheckBoxs);
		List<String> voService = this.createNewVoService(voHelpsPage,voHelpsPageCheckBoxs);
		
		System.out.println("-------------------voTemps---------");
		for(int i=0;i<voTemps.size();i++)
		{
			System.out.println(voTemps.get(i));
		}
		System.out.println("-------------------voLog---------");
		for(int i=0;i<voLog.size();i++)
		{
			System.out.println(voLog.get(i));
		}
		System.out.println("-------------------voAction---------");
		for(int i=0;i<voAction.size();i++)
		{
			System.out.println(voAction.get(i));
		}
		System.out.println("-------------------voService---------");
		for(int i=0;i<voService.size();i++)
		{
			System.out.println(voService.get(i));
		}
		return SUCCESS;
	}

	private List<String> createNewVoService(List<VoHelp> voHelpsPage2,
			Integer[] voHelpsPageCheckBoxs2) {

		List<String> service_logResult = this.getService_logResult(voHelpsPage2,voHelpsPageCheckBoxs2);
		File testFile = new File(basicPath+"\\ActionVoVerPlan.txt");
		try {
			String resultFilePath = basicPath2+"\\"+packName+"\\Action_"+voName+".java";
			FileUtils.copyFile(testFile, new File(resultFilePath));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		List<String> voList = new ArrayList<String>();
		FileReader fr;
		try {
			fr = new FileReader(testFile);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				if(line.trim().startsWith("//Service_saveLog"))
				{
					voList.add(line);
					voList.addAll(service_logResult);
					continue;
				}
				voList.add(line.replace("VoVerPlan", voName).replace("voVerPlan", this.setFirstLittle(voName)));
			}
			br.close();
			fr.close();
			return voList;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private List<String> getService_logResult(List<VoHelp> voHelpsPage2,
			Integer[] voHelpsPageCheckBoxs2) {
		List<String> results = new ArrayList<String>();
		for(int i=0;i<voHelpsPageCheckBoxs2.length;i++)
		{
			VoHelp vohelp = voHelpsPage2.get(voHelpsPageCheckBoxs2[i]);
			if(vohelp==null||vohelp.getName()==null||vohelp.getName().trim().equals(""))
			{
				continue;
			}
//			voVerPlan_Log.setVoProduct(voVerPlan.getVoProduct());
			String temp1 = "voVerPlan_Log.setVoProduct(voVerPlan.getVoProduct());";
			results.add(temp1.replace("voVerPlan", this.setFirstLittle(voName).replace("VoProduct", this.setFirstBig(vohelp.getName()))));
		}
		return results;
	}

	private String setFirstBig(String name) {
		String bigName = name.substring(0, 1).toUpperCase()+ name.substring(1);
		return bigName;
	}

	private List<String> createNewVoAction(List<VoHelp> voHelpsPage2,
			Integer[] voHelpsPageCheckBoxs2) {
		List<String> actionAddEditResult = this.getNewVoActionAddresult(voHelpsPage2,voHelpsPageCheckBoxs2);
		File testFile = new File(basicPath+"\\ActionVoVerPlan.txt");
		try {
			String resultFilePath = basicPath2+"\\"+packName+"\\Action_"+voName+".java";
			FileUtils.copyFile(testFile, new File(resultFilePath));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		List<String> voList = new ArrayList<String>();
		FileReader fr;
		try {
			fr = new FileReader(testFile);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				if(line.trim().startsWith("//Action_gotoAddandEdit"))
				{
					voList.add(line);
					voList.addAll(actionAddEditResult);
					continue;
				}
				voList.add(line.replace("VoVerPlan", voName).replace("voVerPlan", this.setFirstLittle(voName)));
			}
			br.close();
			fr.close();
			return voList;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private String setFirstLittle(String voName2) {
		// TODO Auto-generated method stub
		String littleName = voName2.substring(0, 1).toLowerCase()+ voName2.substring(1);
		return littleName;
	}

	private List<String> getNewVoActionAddresult(List<VoHelp> voHelpsPage2,Integer[] voHelpsPageCheckBoxs2) {
		List<String> results = new ArrayList<String>();
		for(int i=0;i<voHelpsPageCheckBoxs2.length;i++)
		{
			VoHelp vohelp = voHelpsPage2.get(voHelpsPageCheckBoxs2[i]);
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

	private List<String> createNewVoLog(List<VoHelp> voHelpsPage2,Integer[] voHelpsPageCheckBoxs2,File voFile) {
		List<String> insertVoLogLines = this.getNewVoLog(voHelpsPage2,voHelpsPageCheckBoxs2);
		File testFile = voFile;
		try {
			String resultFilePath = basicPath2+"\\"+packName+"\\Log_"+voName+".java";
			FileUtils.copyFile(testFile, new File(resultFilePath));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		List<String> voList = new ArrayList<String>();
		FileReader fr;
		try {
			fr = new FileReader(testFile);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				
				if(line.trim().startsWith("//voTemp_begin"))
				{
					voList.add(line);
					voList.addAll(insertVoLogLines);
					continue;
				}
				voList.add(line);
			}
			br.close();
			fr.close();
			return voList;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private List<String> getNewVoLog(List<VoHelp> voHelpsPage2,
			Integer[] voHelpsPageCheckBoxs2) {
		List<String> results = new ArrayList<String>();
		String temp = "private String voVerPlan_id;			//对象主键";
		results.add(temp.replace("voVerPlan", this.setFirstLittle(voName)));
		results.add("private String Log_Remark;		//记录备注");
		results.add("@Temporal(TemporalType.DATE)");
		results.add("private Date Log_Date;			//记录时间");
		results.add("@ManyToOne(cascade={javax.persistence.CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)");
		results.add("@JoinColumn(name=\"Log_user_id\")");
		results.add("private VoUser voProduct_Log_user;			//记录创建人 ");
		return results;
	}

	private List<String> createNewVo(List<VoHelp> voHelpsPage2,Integer[] voHelpsPageCheckBoxs2) {
		List<String> insertVoLines = this.getNewVo(voHelpsPage2,voHelpsPageCheckBoxs2);
		File testFile = new File(basicPath+"\\VoTemp.txt");
		try {
			String resultFilePath = basicPath2+"\\"+packName+"\\"+voName+".java";
			FileUtils.copyFile(testFile, new File(resultFilePath));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		List<String> voList = new ArrayList<String>();
		FileReader fr;
		try {
			fr = new FileReader(testFile);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				if(line.trim().startsWith("//voTemp_begin"))
				{
					voList.add(line);
					voList.addAll(insertVoLines);
					continue;
				}
				voList.add(line.replace("VoTemp", voName).replace("voTemp", this.setFirstLittle(voName)));
			}
			br.close();
			fr.close();
			return voList;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private List<String> getNewVo(List<VoHelp> voHelpsPage2,
			Integer[] voHelpsPageCheckBoxs2) {
		List<String> results = new ArrayList<String>();
		for(int i=0;i<voHelpsPageCheckBoxs2.length;i++)
		{
			VoHelp vohelp = voHelpsPage2.get(voHelpsPageCheckBoxs2[i]);
			if(vohelp==null||vohelp.getName()==null||vohelp.getName().trim().equals(""))
			{
				continue;
			}
			String line;
			if(vohelp.getType2()!=null||!vohelp.getType2().trim().equals(""))
			{
				results.add("@ManyToOne(cascade={javax.persistence.CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)");
				results.add("@JoinColumn(name='"+vohelp.getName()+"_vp_id')");
				results.add("private "+vohelp.getType2()+" "+vohelp.getName());
			}else
			{
				if(vohelp.getName().equals("id"))
				{
					results.add("@Id");
					results.add("@GeneratedValue(generator='uid')");
					results.add("@GenericGenerator(name='uid',strategy='uuid')");
					results.add("private "+vohelp.getType1()+" "+vohelp.getName());
				}else if(vohelp.getType1().equals("String"))
				{
					results.add("@Column(length=60000)");
					results.add("private "+vohelp.getType1()+" "+vohelp.getName());
				}else if(vohelp.getType1().equals("Date"))
				{
					results.add("@Temporal(TemporalType.DATE)");
					results.add("private "+vohelp.getType1()+" "+vohelp.getName());
				}
			}
		}
		return results;
	}
	
	
}
