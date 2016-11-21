package cn.hero.action;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.opensymphony.xwork2.ModelDriven;

import cn.hero.service.ServiceVoUser;
import cn.hero.vo.VoUser;

@Component
@Scope(value="prototype")
public class ActionVoUser extends SuperAction implements ModelDriven<VoUser>{
	private static final long serialVersionUID = 1L;
	private ServiceVoUser implServiceVoUser ;
	private VoUser voUser = new VoUser();
	private String queryString;
	public ServiceVoUser getImplServiceVoUser() {
		return implServiceVoUser;
	}

	@Resource
	public void setImplServiceVoUser(ServiceVoUser implServiceVoUser) {
		this.implServiceVoUser = implServiceVoUser;
	}

	public String getQueryString() {
		return queryString;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

	public VoUser getModel() {
		// TODO Auto-generated method stub
		return voUser;
	}
	
	public VoUser getLoginUser()
	{
		return (VoUser) request.getSession().getAttribute("loginUser");
	}
	
	
//	1、增：前往添加
	public String gotoAddVoUser()
	{
//		List<VoUser> voUsers = super.find("from VoUser");
//		request.setAttribute("voUsers", voUsers);
		return SUCCESS;
	}
	
	//1、增：保存添加
	public String addVoUser()
	{
		implServiceVoUser.addVoUser(voUser);
		return SUCCESS;
	}
		
	//2、删：删除
	public String deletetVoUser()
	{
		implServiceVoUser.deleteVoUser(voUser,this.getLoginUser());
		return ERROR;
	}
	
	//3、改：前往编辑页面
	public String gotoEditVoUser()
	{		
		VoUser voUser2 = super.get(VoUser.class, voUser.getId());
		request.setAttribute("voUser", voUser2);
		return SUCCESS;
	}
	//3、改：保存编辑
	public String editVoUser()
	{
		implServiceVoUser.editVoUser(voUser,this.getLoginUser());		
		return SUCCESS;
	}
		
	//4、查：查看详细	
	public String getVoUserDetails()
	{
		voUser = super.get(VoUser.class, voUser.getId());
		request.setAttribute("voUser", voUser);
		return SUCCESS;
	}
	
	//5、查:查询内容
	public String showAllVoUsers()
	{
		List<VoUser> voUsers = super.find("from VoUser");
		request.setAttribute("voUsers", voUsers);
		return SUCCESS;
	}
	
	//6、查：带模糊参数查询
	public String queryVoUser()
	{
		request.setAttribute("voUsers", super.find("from VoUser"));
		return SUCCESS;
	}
	
	//7、登入
	public String login()
	{
//		1、judge the user name and password is fixed with the table.
//		If yes,save it in seesion
		VoUser loginUser = implServiceVoUser.login(voUser);
		if(loginUser==null)
		{
			return ERROR;
		}
		loginUser.setPassword(null);
		request.getSession().setAttribute("loginUser", loginUser);
		
////		2、get privileges with user,then save it in session
//		VoPrivilege pris = implServiceTPM.getPrisByUser(loginUser);
//		request.getSession().setAttribute("pris", pris);
		
//		3、get the version plan
//		String hql = "from VoVerPlan as vp where vp.vpImpl_user.id = "+loginUser.getId() + " and verStatue !='Finished'";
//		List<VoVerPlan> voVerPlans = super.find(hql);
//		request.setAttribute("voVerPlans", voVerPlans);
//		List<VoProduct> voProducts= super.find("from VoProduct");
//		request.setAttribute("voProducts", voProducts);
		return SUCCESS;
	}
}
