package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ModifyDepartmentMessage{
	public Integer id;
	public Integer getId() {
		return id;
	}
					
	public void setId(Integer id) {
		this.id = id;
	}
	public String name;
	public String getName() {
		return name;
	}
					
	public void setName(String name) {
		this.name = name;
	}
	public String contactRerson;
	public String getContactRerson() {
		return contactRerson;
	}
					
	public void setContactRerson(String contactRerson) {
		this.contactRerson = contactRerson;
	}
	public String principal;
	public String getPrincipal() {
		return principal;
	}
					
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String phone;
	public String getPhone() {
		return phone;
	}
					
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String briefInfo;
	public String getBriefInfo() {
		return briefInfo;
	}
					
	public void setBriefInfo(String briefInfo) {
		this.briefInfo = briefInfo;
	}
	public String describeContent;
	public String getDescribeContent() {
		return describeContent;
	}
					
	public void setDescribeContent(String describeContent) {
		this.describeContent = describeContent;
	}
	public String remark;
	public String getRemark() {
		return remark;
	}
					
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
