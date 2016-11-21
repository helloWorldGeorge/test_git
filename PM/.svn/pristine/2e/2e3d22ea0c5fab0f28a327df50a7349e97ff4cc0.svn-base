package cn.hero.service.impl;
import java.util.Date;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import cn.hero.service.ServiceVoZHANGTAO;
import cn.hero.vo.VoUser;
import cn.hero.vo.VoZHANGTAO;
import cn.hero.vo.VoZHANGTAO_Log;
import java.util.List;

@Component
public class ImplServiceVoZHANGTAO extends ImplSuperService implements ServiceVoZHANGTAO{
	
	@Transactional
	public void addVoZHANGTAO(VoZHANGTAO voZHANGTAO,VoUser voUser) {
		super.save(voZHANGTAO);
		this.saveLog(voZHANGTAO,"addVoZHANGTAO",voUser);
	}
	
	@Transactional
	public void deleteVoZHANGTAO(VoZHANGTAO voZHANGTAO,VoUser voUser) {
		this.saveLog(voZHANGTAO, "deleteVoZHANGTAO", voUser);
		super.delete(voZHANGTAO);
	}
	
	@Transactional
	public void editVoZHANGTAO(VoZHANGTAO  voZHANGTAO,VoUser voUser,String editString) {
		super.update(voZHANGTAO);
		this.saveLog(voZHANGTAO,editString,voUser);
	}
	
	private void saveLog(VoZHANGTAO voZHANGTAO,String log_Remark,VoUser voUser) {
		VoZHANGTAO_Log voZHANGTAO_Log = new VoZHANGTAO_Log();	
		if(voZHANGTAO==null)
		{
			voZHANGTAO = new VoZHANGTAO();
		}
		voZHANGTAO_Log.setLog_Remark(log_Remark);
		voZHANGTAO_Log.setLog_Date(new Date());
		voZHANGTAO_Log.setLog_user(voUser);
		voZHANGTAO_Log.setVoZHANGTAO_id(voZHANGTAO.getId());
		//Service_saveLog
voZHANGTAO_Log.setId(voZHANGTAO.getId());
voZHANGTAO_Log.setName(voZHANGTAO.getName());
voZHANGTAO_Log.setServerInfo(voZHANGTAO.getServerInfo());
voZHANGTAO_Log.setBackSpaceInfo(voZHANGTAO.getBackSpaceInfo());
voZHANGTAO_Log.setThirdPartyInfo(voZHANGTAO.getThirdPartyInfo());
voZHANGTAO_Log.setImplUser(voZHANGTAO.getImplUser());
voZHANGTAO_Log.setRemark(voZHANGTAO.getRemark());
		super.save(voZHANGTAO_Log);
	}
	
	public List<VoZHANGTAO> queryVoZHANGTAO(String queryString) {
		if(queryString==null || "".equals(queryString.trim()))
		{
			return null;
		}
		StringBuffer hql=new StringBuffer("from VoZHANGTAO where ");
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
