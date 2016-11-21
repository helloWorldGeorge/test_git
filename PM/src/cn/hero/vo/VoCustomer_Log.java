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
public class VoCustomer_Log{
//voTmep_Log_begin
private String log_Remark;		//记录备注
@Temporal(TemporalType.DATE)
private Date log_Date;			//记录时间
@ManyToOne(cascade={javax.persistence.CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
@JoinColumn(name="log_user_id")
private VoUser log_user;			//记录创建人 
@Column(length=60000)
private Integer voCustomer_id;    //对象主键
public String getLog_Remark() {	return log_Remark;}
public void setLog_Remark(String log_Remark) {this.log_Remark = log_Remark;}
public Date getLog_Date() {return log_Date;}
public void setLog_Date(Date log_Date) {this.log_Date = log_Date;}
public VoUser getLog_user() {return log_user;}
public void setLog_user(VoUser log_user) {this.log_user = log_user;}
public Integer getVoCustomer_id() {return voCustomer_id;}
public void setVoCustomer_id(Integer voCustomer_id) {this.voCustomer_id = voCustomer_id;}
    //voTemp_begin
@Id
@GeneratedValue(generator="uid")
@GenericGenerator(name="uid",strategy="identity")
private Integer id;		//主键
private String name;		//客户名称
private String cusNumer;		//客户电话
private String cusAdress;		//客户地址
@ManyToOne(cascade={javax.persistence.CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
@JoinColumn(name="connector_id")
private VoUser connector;		//客户接口人
@ManyToOne(cascade={javax.persistence.CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
@JoinColumn(name="implUser_id")
private VoUser implUser;		//创建人
private String remark;		//客户备注
public Integer getId() {return id;}
public void setId(Integer id) {this.id = id;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public String getCusNumer() {return cusNumer;}
public void setCusNumer(String cusNumer) {this.cusNumer = cusNumer;}
public String getCusAdress() {return cusAdress;}
public void setCusAdress(String cusAdress) {this.cusAdress = cusAdress;}
public VoUser getConnector() {return connector;}
public void setConnector(VoUser connector) {this.connector = connector;}
public VoUser getImplUser() {return implUser;}
public void setImplUser(VoUser implUser) {this.implUser = implUser;}
public String getRemark() {return remark;}
public void setRemark(String remark) {this.remark = remark;}
public String toString()
{return MyUtlis.dateformat(new Date())+"@@@"+"voCustomer"+"@@@"+"id:"+this.getId()+"@@@"+"name:"+this.getName()+"@@@"+"cusNumer:"+this.getCusNumer()+"@@@"+"cusAdress:"+this.getCusAdress()+"@@@"+"connector:"+this.getConnector().getName()+"@@@"+"implUser:"+this.getImplUser().getName()+"@@@"+"remark:"+this.getRemark();}
    
	
}
