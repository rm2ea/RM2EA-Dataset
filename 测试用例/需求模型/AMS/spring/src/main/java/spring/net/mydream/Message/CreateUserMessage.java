package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class CreateUserMessage{
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
	public String password;
	public String getPassword() {
		return password;
	}
					
	public void setPassword(String password) {
		this.password = password;
	}
	public String phone;
	public String getPhone() {
		return phone;
	}
					
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer roleCode;
	public Integer getRoleCode() {
		return roleCode;
	}
					
	public void setRoleCode(Integer roleCode) {
		this.roleCode = roleCode;
	}
	public Integer departmentid;
	public Integer getDepartmentid() {
		return departmentid;
	}
					
	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}
}
