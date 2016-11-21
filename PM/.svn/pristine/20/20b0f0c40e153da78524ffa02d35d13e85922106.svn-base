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
public class VoProgramInfo_Log{
//voTmep_Log_begin
private String log_Remark;		//记录备注
@Temporal(TemporalType.DATE)
private Date log_Date;			//记录时间
@ManyToOne(cascade={javax.persistence.CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
@JoinColumn(name="log_user_id")
private VoUser log_user;			//记录创建人 
@Column(length=60000)
private Integer voProgramInfo_id;    //对象主键
public String getLog_Remark() {	return log_Remark;}
public void setLog_Remark(String log_Remark) {this.log_Remark = log_Remark;}
public Date getLog_Date() {return log_Date;}
public void setLog_Date(Date log_Date) {this.log_Date = log_Date;}
public VoUser getLog_user() {return log_user;}
public void setLog_user(VoUser log_user) {this.log_user = log_user;}
public Integer getVoProgramInfo_id() {return voProgramInfo_id;}
public void setVoProgramInfo_id(Integer voProgramInfo_id) {this.voProgramInfo_id = voProgramInfo_id;}
    //voTemp_begin
@Id
@GeneratedValue(generator="uid")
@GenericGenerator(name="uid",strategy="identity")
private Integer id;		//主键
private String name;		//项目名称
@Column(length=60000)
private String serverInfo;		//服务器信息
@Column(length=60000)
private String backSpaceInfo;		//后台信息
@Column(length=60000)
private String thirdPartyInfo;		//第三方账户信息
@ManyToOne(cascade={javax.persistence.CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
@JoinColumn(name="implUser_id")
private VoUser implUser;		//创建人
private String remark;		//备注
public Integer getId() {return id;}
public void setId(Integer id) {this.id = id;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public String getServerInfo() {return serverInfo;}
public void setServerInfo(String serverInfo) {this.serverInfo = serverInfo;}
public String getBackSpaceInfo() {return backSpaceInfo;}
public void setBackSpaceInfo(String backSpaceInfo) {this.backSpaceInfo = backSpaceInfo;}
public String getThirdPartyInfo() {return thirdPartyInfo;}
public void setThirdPartyInfo(String thirdPartyInfo) {this.thirdPartyInfo = thirdPartyInfo;}
public VoUser getImplUser() {return implUser;}
public void setImplUser(VoUser implUser) {this.implUser = implUser;}
public String getRemark() {return remark;}
public void setRemark(String remark) {this.remark = remark;}
	
}
