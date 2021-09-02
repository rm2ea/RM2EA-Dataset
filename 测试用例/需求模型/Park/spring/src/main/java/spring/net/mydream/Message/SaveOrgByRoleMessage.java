package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class SaveOrgByRoleMessage{
	public Integer roleId;
	public Integer getRoleId() {
		return roleId;
	}
					
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
}
