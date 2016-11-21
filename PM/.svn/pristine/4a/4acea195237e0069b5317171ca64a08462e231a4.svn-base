package cn.hero.action;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.opensymphony.xwork2.ModelDriven;
import cn.hero.service.ServiceVoZHANGTAO;
import cn.hero.vo.VoUser;
import cn.hero.vo.VoZHANGTAO;

@Component
@Scope(value="prototype")
public class ActionVoZHANGTAO extends SuperAction implements ModelDriven<VoZHANGTAO>{
	private static final long serialVersionUID = 1L;
	private ServiceVoZHANGTAO implServiceVoZHANGTAO ;
	private VoZHANGTAO voZHANGTAO = new VoZHANGTAO();
	private String queryString;
	
	public ServiceVoZHANGTAO getImplServiceVoZHANGTAO() {
		return implServiceVoZHANGTAO;
	}

	@Resource
	public void setImplServiceVoZHANGTAO(ServiceVoZHANGTAO implServiceVoZHANGTAO) {
		this.implServiceVoZHANGTAO = implServiceVoZHANGTAO;
	}

	public String getQueryString() {
		return queryString;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

	public VoZHANGTAO getModel() {
		// TODO Auto-generated method stub
		return voZHANGTAO;
	}
	
	public VoUser getLoginUser()
	{
		return (VoUser) request.getSession().getAttribute("loginUser");
	}
	
	
	//1、增：前往添加
	public String gotoAddVoZHANGTAO()
	{
		//Action_gotoAddandEdit
List<VoUser> implUsers = super.find("from VoUser");
request.setAttribute("implUsers", implUsers);
		return SUCCESS;	
	}
	
	//1、增：保存添加
	public String addVoZHANGTAO()
	{
		implServiceVoZHANGTAO.addVoZHANGTAO(voZHANGTAO,this.getLoginUser());
		return SUCCESS;
	}
		
	//2、删：删除
	public String deleteVoZHANGTAO()
	{
//		implServiceVoZHANGTAO.deleteVoZHANGTAO(voZHANGTAO,this.getLoginUser());
		return ERROR;
	}
	
	//3、改：前往编辑页面
	public String gotoEditVoZHANGTAO()
	{		
		//Action_gotoAddandEdit
List<VoUser> implUsers = super.find("from VoUser");
request.setAttribute("implUsers", implUsers);
		voZHANGTAO = super.get(VoZHANGTAO.class, voZHANGTAO.getId());
		request.setAttribute("voZHANGTAO", voZHANGTAO);
		return SUCCESS;
	}
	//3、改：保存编辑
	public String editVoZHANGTAO()
	{
		VoZHANGTAO vc = super.get(VoZHANGTAO.class, voZHANGTAO.getId());
		implServiceVoZHANGTAO.editVoZHANGTAO(voZHANGTAO,this.getLoginUser(),"editVoZHANGTAO");		
		return SUCCESS;
	}
		
	//4、查：查看详细	
	public String getVoZHANGTAOContents()
	{
		voZHANGTAO = super.get(VoZHANGTAO.class, voZHANGTAO.getId());		
		request.setAttribute("voZHANGTAO", voZHANGTAO);
		return SUCCESS;
	}
	
	//5、查:查询自己的内容
	public String showMyVoZHANGTAOs()
	{
		String hql = "from VoZHANGTAO vp where vp.voUser.id ="+this.getLoginUser().getId();		
		List<VoZHANGTAO> voZHANGTAOs = super.find(hql);
		request.setAttribute("voZHANGTAOs", voZHANGTAOs);
		return SUCCESS;
	}
	
	//6、查:查询所有的内容
	public String showAllVoZHANGTAOs()
	{
		List<VoZHANGTAO> voZHANGTAOs = super.find("from VoZHANGTAO");
		request.setAttribute("voZHANGTAOs", voZHANGTAOs);
		return SUCCESS;	
	}
	
	//6、查：带模糊参数查询
	public String queryVoZHANGTAO()
	{
		request.setAttribute("voZHANGTAOs", super.find("from VoZHANGTAO"));
		List<VoZHANGTAO> queryVoZHANGTAOs = implServiceVoZHANGTAO.queryVoZHANGTAO(queryString);
		request.setAttribute("voZHANGTAOs", queryVoZHANGTAOs);
		return SUCCESS;
	}
	
}
