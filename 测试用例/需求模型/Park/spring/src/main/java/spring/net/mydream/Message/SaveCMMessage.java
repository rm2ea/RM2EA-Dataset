package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class SaveCMMessage{
	public String description;
	public String getDescription() {
		return description;
	}
					
	public void setDescription(String description) {
		this.description = description;
	}
	public String name;
	public String getName() {
		return name;
	}
					
	public void setName(String name) {
		this.name = name;
	}
	public Integer org_id;
	public Integer getOrg_id() {
		return org_id;
	}
					
	public void setOrg_id(Integer org_id) {
		this.org_id = org_id;
	}
	public Integer park_manage_id;
	public Integer getPark_manage_id() {
		return park_manage_id;
	}
					
	public void setPark_manage_id(Integer park_manage_id) {
		this.park_manage_id = park_manage_id;
	}
}
