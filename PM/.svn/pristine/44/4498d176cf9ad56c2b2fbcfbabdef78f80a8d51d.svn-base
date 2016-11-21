package cn.hero.service.impl;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.hero.dao.DaoVoUser;
import cn.hero.service.ServiceVoUser;
import cn.hero.vo.VoUser;
import cn.hero.vo.VoUser_Log;

@Component()
public class ImplServiceVoUser extends ImplSuperService implements ServiceVoUser{
//	implements ServiceVoUser
	private DaoVoUser implDaoVoUser;
	public DaoVoUser getImplDaoVoUser() {
		return implDaoVoUser;
	}
	@Resource
	public void setImplDaoVoUser(DaoVoUser implDaoVoUser) {
		this.implDaoVoUser = implDaoVoUser;
	}
	
	@Transactional
	public void addVoUser(VoUser voUser) {
		System.out.println(voUser.toString());
		super.save(voUser);
		this.saveLog(voUser,"addVoUser",null);
	}
	
	@Transactional
	public void deleteVoUser(VoUser voUser,VoUser loginUser) {
		this.saveLog(voUser, "deleteVoUser",loginUser);
		super.delete(voUser);
	}
	
	@Transactional
	public void editVoUser(VoUser voUser,VoUser  loginUser) {
		// TODO Auto-generated method stub
		super.update(voUser);
		this.saveLog(voUser,"editVoUser",loginUser);
	}
	
	private void saveLog(VoUser voUser,String voUser_Log_Remark,VoUser loginUser) {
		// TODO Auto-generated method stub
		VoUser_Log voUser_Log = new VoUser_Log();
		if(voUser == null)
		{
			voUser = new VoUser();
		}
		voUser_Log.setVoUser_Log_Date(new Date());
		voUser_Log.setVoUser_Log_Remark(voUser_Log_Remark);
		if(loginUser!=null)
		{
			voUser_Log.setLog_user_id(loginUser.getId());
		}
		voUser_Log.setVoUser_id(voUser.getId());
		voUser_Log.setGroupID(voUser.getGroupID());
		voUser_Log.setLoginName(voUser.getLoginName());
		voUser_Log.setName(voUser.getName());
		voUser_Log.setPassword(voUser.getPassword());
		super.save(voUser_Log);
	}
	
	public VoUser login(VoUser user) {
		// TODO Auto-generated method stub
		List<VoUser> temps =  super.find("from VoUser where loginName = '"+user.getName() + "' or name = '"+user.getName()+"' and password='" +user.getPassword()+"'");
		if(temps==null||temps.size()==0)
		{
			return null;
		}
		return temps.get(0);
	}
}
