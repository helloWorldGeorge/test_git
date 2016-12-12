package cn.hero.action;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.opensymphony.xwork2.ModelDriven;
import cn.hero.service.ServiceVoProTask;
import cn.hero.vo.VoProgramInfo;
import cn.hero.vo.VoUser;
import cn.hero.vo.VoProTask;

@Component
@Scope(value="prototype")
public class ActionVoProTask extends SuperAction implements ModelDriven<VoProTask>{
	private static final long serialVersionUID = 1L;
	private ServiceVoProTask implServiceVoProTask ;
	private VoProTask voProTask = new VoProTask();
	private String queryString;
	
	public ServiceVoProTask getImplServiceVoProTask() {
		return implServiceVoProTask;
	}

	@Resource
	public void setImplServiceVoProTask(ServiceVoProTask implServiceVoProTask) {
		this.implServiceVoProTask = implServiceVoProTask;
	}

	public String getQueryString() {
		return queryString;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

	public VoProTask getModel() {
		// TODO Auto-generated method stub
		return voProTask;
	}
	
	public VoUser getLoginUser()
	{
		return (VoUser) request.getSession().getAttribute("loginUser");
	}
	
	
	//1、增：前往添加
	public String gotoAddVoProTask()
	{
		//Action_gotoAddandEdit
List<VoProgramInfo> implVoPrograms = super.find("from VoProgramInfo");
request.setAttribute("implVoPrograms", implVoPrograms);
List<VoUser> implVoUsers = super.find("from VoUser");
request.setAttribute("implVoUsers", implVoUsers);
		return SUCCESS;	
	}
	
	//1、增：保存添加
	public String addVoProTask()
	{
		implServiceVoProTask.addVoProTask(voProTask,this.getLoginUser());
		return SUCCESS;
	}
		
	//2、删：删除
	public String deleteVoProTask()
	{
//		implServiceVoProTask.deleteVoProTask(voProTask,this.getLoginUser());
		return ERROR;
	}
	
	//3、改：前往编辑页面
	public String gotoEditVoProTask()
	{		
		//Action_gotoAddandEdit
List<VoProgramInfo> implVoPrograms = super.find("from VoProgramInfo");
request.setAttribute("implVoPrograms", implVoPrograms);
List<VoUser> implVoUsers = super.find("from VoUser");
request.setAttribute("implVoUsers", implVoUsers);
		voProTask = super.get(VoProTask.class, voProTask.getId());
		request.setAttribute("voProTask", voProTask);
		return SUCCESS;
	}
	//3、改：保存编辑
	public String editVoProTask()
	{
		VoProTask vc = super.get(VoProTask.class, voProTask.getId());
		implServiceVoProTask.editVoProTask(voProTask,this.getLoginUser(),"editVoProTask");		
		return SUCCESS;
	}
		
	//4、查：查看详细	
	public String getVoProTaskContents()
	{
		voProTask = super.get(VoProTask.class, voProTask.getId());		
		request.setAttribute("voProTask", voProTask);
		return SUCCESS;
	}
	
	//5、查:查询自己的内容
	public String showMyVoProTasks()
	{
		String hql = "from VoProTask vp where vp.voUser.id ="+this.getLoginUser().getId();		
		List<VoProTask> voProTasks = super.find(hql);
		request.setAttribute("voProTasks", voProTasks);
		return SUCCESS;
	}
	
	//6、查:查询所有的内容
	public String showAllVoProTasks()
	{
		List<VoProTask> voProTasks = super.find("from VoProTask");
		request.setAttribute("voProTasks", voProTasks);
		return SUCCESS;	
	}
	
	//6、查：带模糊参数查询
	public String queryVoProTask()
	{
		request.setAttribute("voProTasks", super.find("from VoProTask"));
		List<VoProTask> queryVoProTasks = implServiceVoProTask.queryVoProTask(queryString);
		request.setAttribute("voProTasks", queryVoProTasks);
		return SUCCESS;
	}
	
}
