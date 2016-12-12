package cn.hero.service.impl;
import java.util.Date;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import cn.hero.service.ServiceVoProTask;
import cn.hero.vo.VoUser;
import cn.hero.vo.VoProTask;
import cn.hero.vo.VoProTask_Log;
import java.util.List;

@Component
public class ImplServiceVoProTask extends ImplSuperService implements ServiceVoProTask{
	
	@Transactional
	public void addVoProTask(VoProTask voProTask,VoUser voUser) {
		super.save(voProTask);
		this.saveLog(voProTask,"addVoProTask",voUser);
	}
	
	@Transactional
	public void deleteVoProTask(VoProTask voProTask,VoUser voUser) {
		this.saveLog(voProTask, "deleteVoProTask", voUser);
		super.delete(voProTask);
	}
	
	@Transactional
	public void editVoProTask(VoProTask  voProTask,VoUser voUser,String editString) {
		super.update(voProTask);
		this.saveLog(voProTask,editString,voUser);
	}
	
	private void saveLog(VoProTask voProTask,String log_Remark,VoUser voUser) {
		VoProTask_Log voProTask_Log = new VoProTask_Log();	
		if(voProTask==null)
		{
			voProTask = new VoProTask();
		}
		voProTask_Log.setLog_Remark(log_Remark);
		voProTask_Log.setLog_Date(new Date());
		voProTask_Log.setLog_user(voUser);
		voProTask_Log.setVoProTask_id(voProTask.getId());
		//Service_saveLog
voProTask_Log.setId(voProTask.getId());
voProTask_Log.setImplVoProgram(voProTask.getImplVoProgram());
voProTask_Log.setName(voProTask.getName());
voProTask_Log.setTaskStatue(voProTask.getTaskStatue());
voProTask_Log.setDetails(voProTask.getDetails());
voProTask_Log.setSubDate(voProTask.getSubDate());
voProTask_Log.setPlanStartDate(voProTask.getPlanStartDate());
voProTask_Log.setActualStartDate(voProTask.getActualStartDate());
voProTask_Log.setPlanEndDate(voProTask.getPlanEndDate());
voProTask_Log.setActualEndDate(voProTask.getActualEndDate());
voProTask_Log.setTaskStyle(voProTask.getTaskStyle());
voProTask_Log.setQuestionStyle(voProTask.getQuestionStyle());
voProTask_Log.setQuestionModule(voProTask.getQuestionModule());
voProTask_Log.setTaskDifficulty(voProTask.getTaskDifficulty());
voProTask_Log.setQuestionDeal(voProTask.getQuestionDeal());
voProTask_Log.setEvaluateHours(voProTask.getEvaluateHours());
voProTask_Log.setPicturePath(voProTask.getPicturePath());
voProTask_Log.setAttachmentPath(voProTask.getAttachmentPath());
voProTask_Log.setIsUpdatePoint(voProTask.getIsUpdatePoint());
voProTask_Log.setImplVoUser(voProTask.getImplVoUser());
voProTask_Log.setRemark(voProTask.getRemark());
		super.save(voProTask_Log);
	}
	
	public List<VoProTask> queryVoProTask(String queryString) {
		if(queryString==null || "".equals(queryString.trim()))
		{
			return null;
		}
		StringBuffer hql=new StringBuffer("from VoProTask where ");
		//implService_queryString
hql.append("id like '%"+queryString+"%' or ");
hql.append("implVoProgram like '%"+queryString+"%' or ");
hql.append("name like '%"+queryString+"%' or ");
hql.append("taskStatue like '%"+queryString+"%' or ");
hql.append("details like '%"+queryString+"%' or ");
hql.append("subDate like '%"+queryString+"%' or ");
hql.append("planStartDate like '%"+queryString+"%' or ");
hql.append("actualStartDate like '%"+queryString+"%' or ");
hql.append("planEndDate like '%"+queryString+"%' or ");
hql.append("actualEndDate like '%"+queryString+"%' or ");
hql.append("taskStyle like '%"+queryString+"%' or ");
hql.append("questionStyle like '%"+queryString+"%' or ");
hql.append("questionModule like '%"+queryString+"%' or ");
hql.append("taskDifficulty like '%"+queryString+"%' or ");
hql.append("questionDeal like '%"+queryString+"%' or ");
hql.append("evaluateHours like '%"+queryString+"%' or ");
hql.append("picturePath like '%"+queryString+"%' or ");
hql.append("attachmentPath like '%"+queryString+"%' or ");
hql.append("isUpdatePoint like '%"+queryString+"%' or ");
hql.append("implVoUser like '%"+queryString+"%' or ");
hql.append("remark like '%"+queryString+"%'");
		return super.find(hql.toString());
	}
}
