package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class CreateDeviceInfoMessage{
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
	public String brand;
	public String getBrand() {
		return brand;
	}
					
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String type;
	public String getType() {
		return type;
	}
					
	public void setType(String type) {
		this.type = type;
	}
	public String address;
	public String getAddress() {
		return address;
	}
					
	public void setAddress(String address) {
		this.address = address;
	}
	public String adminName;
	public String getAdminName() {
		return adminName;
	}
					
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String contactsName;
	public String getContactsName() {
		return contactsName;
	}
					
	public void setContactsName(String contactsName) {
		this.contactsName = contactsName;
	}
	public String remark;
	public String getRemark() {
		return remark;
	}
					
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
