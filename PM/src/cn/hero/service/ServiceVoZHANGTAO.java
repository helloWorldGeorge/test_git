package cn.hero.service;

import cn.hero.vo.VoUser;
import cn.hero.vo.VoZHANGTAO;
import java.util.List;

public interface ServiceVoZHANGTAO  {

	void addVoZHANGTAO(VoZHANGTAO voZHANGTAO, VoUser voUser);

	void deleteVoZHANGTAO(VoZHANGTAO voZHANGTAO, VoUser voUser);

	void editVoZHANGTAO(VoZHANGTAO voZHANGTAO, VoUser voUser,String editString);
	
	List<VoZHANGTAO> queryVoZHANGTAO(String queryString);

} 
