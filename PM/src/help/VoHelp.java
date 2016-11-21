package help;
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
import org.hibernate.annotations.GenericGenerator;
public class VoHelp {
    private String type1;		//类型:String;Integer;VO;
    private String type2;		//类型:String;Integer;VO;
    private String name;		//属性名
    private String cnName;		//中文名称
    private String select1;		//多选1
    private Integer isEdit;		//是否可以编辑
    
	public Integer getIsEdit() {
		return isEdit;
	}
	public void setIsEdit(Integer isEdit) {
		this.isEdit = isEdit;
	}
	public String getType1() {
		return type1;
	}
	public void setType1(String type1) {
		this.type1 = type1;
	}
	public String getType2() {
		return type2;
	}
	public void setType2(String type2) {
		this.type2 = type2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCnName() {
		return cnName;
	}
	public void setCnName(String cnName) {
		this.cnName = cnName;
	}
	public String getSelect1() {
		return select1;
	}
	public void setSelect1(String select1) {
		this.select1 = select1;
	}
    
    
}
