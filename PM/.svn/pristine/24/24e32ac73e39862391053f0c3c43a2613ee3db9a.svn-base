package cn.hero.vo;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class VoUser_Log {
	@Id
	@GeneratedValue(generator="uid")
	@GenericGenerator(name="uid",strategy="uuid")
	private String id;
	private String voUser_Log_Remark;		//记录备注
	@Temporal(TemporalType.DATE)
	private Date voUser_Log_Date;			//记录时间
	private int Log_user_id;			//记录创建人 

	private int voUser_id;				//对应用户id
	public String getId() {
		return id;
	}
	private String loginName;				//自定义登入名
    private String name;					//字母用户名
    private String motherLanguageName;					//母语名
    private String password;				//用户密码
	private String groupID;					//群组
	private String leaderName;
	
	
	public int getLog_user_id() {
		return Log_user_id;
	}
	public void setLog_user_id(int log_user_id) {
		Log_user_id = log_user_id;
	}
	public int getVoUser_id() {
		return voUser_id;
	}
	public void setVoUser_id(int voUser_id) {
		this.voUser_id = voUser_id;
	}
	public String getMotherLanguageName() {
		return motherLanguageName;
	}
	public void setMotherLanguageName(String motherLanguageName) {
		this.motherLanguageName = motherLanguageName;
	}
	public String getGroupID() {
		return groupID;
	}
	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}
	public String getLeaderName() {
		return leaderName;
	}
	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getVoUser_Log_Remark() {
		return voUser_Log_Remark;
	}
	public void setVoUser_Log_Remark(String voUser_Log_Remark) {
		this.voUser_Log_Remark = voUser_Log_Remark;
	}
	public Date getVoUser_Log_Date() {
		return voUser_Log_Date;
	}
	public void setVoUser_Log_Date(Date voUser_Log_Date) {
		this.voUser_Log_Date = voUser_Log_Date;
	}

}
