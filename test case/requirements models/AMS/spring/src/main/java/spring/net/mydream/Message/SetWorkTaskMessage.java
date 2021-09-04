package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class SetWorkTaskMessage{
	public String staffName;
	public String getStaffName() {
		return staffName;
	}
					
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String adminName;
	public String getAdminName() {
		return adminName;
	}
					
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String phone;
	public String getPhone() {
		return phone;
	}
					
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String section;
	public String getSection() {
		return section;
	}
					
	public void setSection(String section) {
		this.section = section;
	}
	public String remark;
	public String getRemark() {
		return remark;
	}
					
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
