package cn.hero.vo;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import cn.hero.util.MyUtlis;
import org.hibernate.annotations.GenericGenerator;
@Entity
public class VoProTask_Log{
//voTmep_Log_begin
private String log_Remark;		//记录备注
@Temporal(TemporalType.DATE)
private Date log_Date;			//记录时间
@ManyToOne(cascade={javax.persistence.CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
@JoinColumn(name="log_user_id")
private VoUser log_user;			//记录创建人 
@Column(length=60000)
private Integer voProTask_id;    //对象主键
public String getLog_Remark() {	return log_Remark;}
public void setLog_Remark(String log_Remark) {this.log_Remark = log_Remark;}
public Date getLog_Date() {return log_Date;}
public void setLog_Date(Date log_Date) {this.log_Date = log_Date;}
public VoUser getLog_user() {return log_user;}
public void setLog_user(VoUser log_user) {this.log_user = log_user;}
public Integer getVoProTask_id() {return voProTask_id;}
public void setVoProTask_id(Integer voProTask_id) {this.voProTask_id = voProTask_id;}
    //voTemp_begin
@Id
@GeneratedValue(generator="uid")
@GenericGenerator(name="uid",strategy="identity")
private Integer id;		//主键
@ManyToOne(cascade={javax.persistence.CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
@JoinColumn(name="implVoProgram_id")
private VoProgramInfo implVoProgram;		//项目名称
@Column(length=10000)
private String name;		//标题
private String taskStatue;		//状态
@Column(length=60000)
private String details;		//详细
@Temporal(TemporalType.DATE)
private Date subDate;		//提交日期
@Temporal(TemporalType.DATE)
private Date planStartDate;		//计划开始日期
@Temporal(TemporalType.DATE)
private Date actualStartDate;		//实际开始日期
@Temporal(TemporalType.DATE)
private Date planEndDate;		//计划结束日期
@Temporal(TemporalType.DATE)
private Date actualEndDate;		//实际结束日期
private String taskStyle;		//类型
private String questionStyle;		//问题类型
private String questionModule;		//问题所属模块
private String taskDifficulty;		//事务难度
private String questionDeal;		//解决方案
private Integer evaluateHours;		//工时评估
private String picturePath;		//图片
private String attachmentPath;		//附件
private String isUpdatePoint;		//升级关注点
@ManyToOne(cascade={javax.persistence.CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
@JoinColumn(name="implVoUser_id")
private VoUser implVoUser;		//创建人
private String remark;		//备注
public Integer getId() {return id;}
public void setId(Integer id) {this.id = id;}
public VoProgramInfo getImplVoProgram() {return implVoProgram;}
public void setImplVoProgram(VoProgramInfo implVoProgram) {this.implVoProgram = implVoProgram;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public String getTaskStatue() {return taskStatue;}
public void setTaskStatue(String taskStatue) {this.taskStatue = taskStatue;}
public String getDetails() {return details;}
public void setDetails(String details) {this.details = details;}
public Date getSubDate() {return subDate;}
public void setSubDate(Date subDate) {this.subDate = subDate;}
public Date getPlanStartDate() {return planStartDate;}
public void setPlanStartDate(Date planStartDate) {this.planStartDate = planStartDate;}
public Date getActualStartDate() {return actualStartDate;}
public void setActualStartDate(Date actualStartDate) {this.actualStartDate = actualStartDate;}
public Date getPlanEndDate() {return planEndDate;}
public void setPlanEndDate(Date planEndDate) {this.planEndDate = planEndDate;}
public Date getActualEndDate() {return actualEndDate;}
public void setActualEndDate(Date actualEndDate) {this.actualEndDate = actualEndDate;}
public String getTaskStyle() {return taskStyle;}
public void setTaskStyle(String taskStyle) {this.taskStyle = taskStyle;}
public String getQuestionStyle() {return questionStyle;}
public void setQuestionStyle(String questionStyle) {this.questionStyle = questionStyle;}
public String getQuestionModule() {return questionModule;}
public void setQuestionModule(String questionModule) {this.questionModule = questionModule;}
public String getTaskDifficulty() {return taskDifficulty;}
public void setTaskDifficulty(String taskDifficulty) {this.taskDifficulty = taskDifficulty;}
public String getQuestionDeal() {return questionDeal;}
public void setQuestionDeal(String questionDeal) {this.questionDeal = questionDeal;}
public Integer getEvaluateHours() {return evaluateHours;}
public void setEvaluateHours(Integer evaluateHours) {this.evaluateHours = evaluateHours;}
public String getPicturePath() {return picturePath;}
public void setPicturePath(String picturePath) {this.picturePath = picturePath;}
public String getAttachmentPath() {return attachmentPath;}
public void setAttachmentPath(String attachmentPath) {this.attachmentPath = attachmentPath;}
public String getIsUpdatePoint() {return isUpdatePoint;}
public void setIsUpdatePoint(String isUpdatePoint) {this.isUpdatePoint = isUpdatePoint;}
public VoUser getImplVoUser() {return implVoUser;}
public void setImplVoUser(VoUser implVoUser) {this.implVoUser = implVoUser;}
public String getRemark() {return remark;}
public void setRemark(String remark) {this.remark = remark;}
public String toString()
{return MyUtlis.dateformat(new Date())+"@@@"+"voProTask"+"@@@"+"id:"+this.id+"@@@"+"implVoProgram:"+this.implVoProgram.getName()+"@@@"+"name:"+this.name+"@@@"+"taskStatue:"+this.taskStatue+"@@@"+"details:"+this.details+"@@@"+"subDate:"+this.subDate+"@@@"+"planStartDate:"+this.planStartDate+"@@@"+"actualStartDate:"+this.actualStartDate+"@@@"+"planEndDate:"+this.planEndDate+"@@@"+"actualEndDate:"+this.actualEndDate+"@@@"+"taskStyle:"+this.taskStyle+"@@@"+"questionStyle:"+this.questionStyle+"@@@"+"questionModule:"+this.questionModule+"@@@"+"taskDifficulty:"+this.taskDifficulty+"@@@"+"questionDeal:"+this.questionDeal+"@@@"+"evaluateHours:"+this.evaluateHours+"@@@"+"picturePath:"+this.picturePath+"@@@"+"attachmentPath:"+this.attachmentPath+"@@@"+"isUpdatePoint:"+this.isUpdatePoint+"@@@"+"implVoUser:"+this.implVoUser.getName()+"@@@"+"remark:"+this.remark;}
    
	
}
