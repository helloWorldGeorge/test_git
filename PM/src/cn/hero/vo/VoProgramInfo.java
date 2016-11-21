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
public class VoProgramInfo{
//voTmep_Log_begin
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
