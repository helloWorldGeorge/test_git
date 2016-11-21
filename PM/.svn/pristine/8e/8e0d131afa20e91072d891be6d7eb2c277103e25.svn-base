package cn.hero.service.impl;
import java.util.Date;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import cn.hero.service.ServiceVoProgramInfo;
import cn.hero.vo.VoUser;
import cn.hero.vo.VoProgramInfo;
import cn.hero.vo.VoProgramInfo_Log;
import java.util.List;

@Component
public class ImplServiceVoProgramInfo extends ImplSuperService implements ServiceVoProgramInfo{
	
	@Transactional
	public void addVoProgramInfo(VoProgramInfo voProgramInfo,VoUser voUser) {
		super.save(voProgramInfo);
		this.saveLog(voProgramInfo,"addVoProgramInfo",voUser);
	}
	
	@Transactional
	public void deleteVoProgramInfo(VoProgramInfo voProgramInfo,VoUser voUser) {
		this.saveLog(voProgramInfo, "deleteVoProgramInfo", voUser);
		super.delete(voProgramInfo);
	}
	
	@Transactional
	public void editVoProgramInfo(VoProgramInfo  voProgramInfo,VoUser voUser,String editString) {
		super.update(voProgramInfo);
		this.saveLog(voProgramInfo,editString,voUser);
	}
	
	private void saveLog(VoProgramInfo voProgramInfo,String log_Remark,VoUser voUser) {
		VoProgramInfo_Log voProgramInfo_Log = new VoProgramInfo_Log();	
		if(voProgramInfo==null)
		{
			voProgramInfo = new VoProgramInfo();
		}
		voProgramInfo_Log.setLog_Remark(log_Remark);
		voProgramInfo_Log.setLog_Date(new Date());
		voProgramInfo_Log.setLog_user(voUser);
		voProgramInfo_Log.setVoProgramInfo_id(voProgramInfo.getId());
		//Service_saveLog
voProgramInfo_Log.setId(voProgramInfo.getId());
voProgramInfo_Log.setName(voProgramInfo.getName());
voProgramInfo_Log.setServerInfo(voProgramInfo.getServerInfo());
voProgramInfo_Log.setBackSpaceInfo(voProgramInfo.getBackSpaceInfo());
voProgramInfo_Log.setThirdPartyInfo(voProgramInfo.getThirdPartyInfo());
voProgramInfo_Log.setImplUser(voProgramInfo.getImplUser());
voProgramInfo_Log.setRemark(voProgramInfo.getRemark());
		super.save(voProgramInfo_Log);
	}
	
	public List<VoProgramInfo> queryVoProgramInfo(String queryString) {
		if(queryString==null || "".equals(queryString.trim()))
		{
			return null;
		}
		StringBuffer hql=new StringBuffer("from VoProgramInfo where ");
		//implService_queryString
hql.append("id like '%"+queryString+"%' or ");
hql.append("name like '%"+queryString+"%' or ");
hql.append("serverInfo like '%"+queryString+"%' or ");
hql.append("backSpaceInfo like '%"+queryString+"%' or ");
hql.append("thirdPartyInfo like '%"+queryString+"%' or ");
hql.append("implUser like '%"+queryString+"%' or ");
hql.append("remark like '%"+queryString+"%'");
		return super.find(hql.toString());
	}
}
