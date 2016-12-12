package cn.hero.service;

import cn.hero.vo.VoUser;
import cn.hero.vo.VoProTask;
import java.util.List;

public interface ServiceVoProTask  {

	void addVoProTask(VoProTask voProTask, VoUser voUser);

	void deleteVoProTask(VoProTask voProTask, VoUser voUser);

	void editVoProTask(VoProTask voProTask, VoUser voUser,String editString);
	
	List<VoProTask> queryVoProTask(String queryString);

} 
