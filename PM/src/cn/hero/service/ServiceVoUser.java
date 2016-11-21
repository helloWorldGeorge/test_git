package cn.hero.service;

import cn.hero.vo.VoUser;

public interface ServiceVoUser  {

	void addVoUser(VoUser voUser);

	void deleteVoUser(VoUser voUser, VoUser voUser2);

	void editVoUser(VoUser voUser,VoUser voUser2);

	public VoUser login(VoUser user);
} 
