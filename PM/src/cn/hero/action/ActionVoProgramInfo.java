package cn.hero.action;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.opensymphony.xwork2.ModelDriven;
import cn.hero.service.ServiceVoProgramInfo;
import cn.hero.vo.VoUser;
import cn.hero.vo.VoProgramInfo;

@Component
@Scope(value="prototype")
public class ActionVoProgramInfo extends SuperAction implements ModelDriven<VoProgramInfo>{
	private static final long serialVersionUID = 1L;
	private ServiceVoProgramInfo implServiceVoProgramInfo ;
	private VoProgramInfo voProgramInfo = new VoProgramInfo();
	private String queryString;
	
	public ServiceVoProgramInfo getImplServiceVoProgramInfo() {
		return implServiceVoProgramInfo;
	}

	@Resource
	public void setImplServiceVoProgramInfo(ServiceVoProgramInfo implServiceVoProgramInfo) {
		this.implServiceVoProgramInfo = implServiceVoProgramInfo;
	}

	public String getQueryString() {
		return queryString;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

	public VoProgramInfo getModel() {
		// TODO Auto-generated method stub
		return voProgramInfo;
	}
	
	public VoUser getLoginUser()
	{
		return (VoUser) request.getSession().getAttribute("loginUser");
	}
	
	
	//1、增：前往添加
	public String gotoAddVoProgramInfo()
	{
		//Action_gotoAddandEdit
List<VoUser> implUsers = super.find("from VoUser");
request.setAttribute("implUsers", implUsers);
		return SUCCESS;	
	}
	
	//1、增：保存添加
	public String addVoProgramInfo()
	{
		implServiceVoProgramInfo.addVoProgramInfo(voProgramInfo,this.getLoginUser());
		return SUCCESS;
	}
		
	//2、删：删除
	public String deleteVoProgramInfo()
	{
//		implServiceVoProgramInfo.deleteVoProgramInfo(voProgramInfo,this.getLoginUser());
		return ERROR;
	}
	
	//3、改：前往编辑页面
	public String gotoEditVoProgramInfo()
	{		
		//Action_gotoAddandEdit
List<VoUser> implUsers = super.find("from VoUser");
request.setAttribute("implUsers", implUsers);
		voProgramInfo = super.get(VoProgramInfo.class, voProgramInfo.getId());
		request.setAttribute("voProgramInfo", voProgramInfo);
		return SUCCESS;
	}
	//3、改：保存编辑
	public String editVoProgramInfo()
	{
		VoProgramInfo vc = super.get(VoProgramInfo.class, voProgramInfo.getId());
		implServiceVoProgramInfo.editVoProgramInfo(voProgramInfo,this.getLoginUser(),"editVoProgramInfo");		
		return SUCCESS;
	}
		
	//4、查：查看详细	
	public String getVoProgramInfoDetails()
	{
		voProgramInfo = super.get(VoProgramInfo.class, voProgramInfo.getId());		
		request.setAttribute("voProgramInfo", voProgramInfo);
		return SUCCESS;
	}
	
	//5、查:查询自己的内容
	public String showMyVoProgramInfos()
	{
		String hql = "from VoProgramInfo vp where vp.voUser.id ="+this.getLoginUser().getId();		
		List<VoProgramInfo> voProgramInfos = super.find(hql);
		request.setAttribute("voProgramInfos", voProgramInfos);
		return SUCCESS;
	}
	
	//6、查:查询所有的内容
	public String showAllVoProgramInfos()
	{
		List<VoProgramInfo> voProgramInfos = super.find("from VoProgramInfo");
		request.setAttribute("voProgramInfos", voProgramInfos);
		return SUCCESS;	
	}
	
	//6、查：带模糊参数查询
	public String queryVoProgramInfo()
	{
		request.setAttribute("voProgramInfos", super.find("from VoProgramInfo"));
		List<VoProgramInfo> queryVoProgramInfos = implServiceVoProgramInfo.queryVoProgramInfo(queryString);
		request.setAttribute("voProgramInfos", queryVoProgramInfos);
		return SUCCESS;
	}
	
}
