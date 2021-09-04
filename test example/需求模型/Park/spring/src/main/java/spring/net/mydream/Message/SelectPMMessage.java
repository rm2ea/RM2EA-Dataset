package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class SelectPMMessage{
	public Integer id;
	public Integer getId() {
		return id;
	}
					
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer org_id;
	public Integer getOrg_id() {
		return org_id;
	}
					
	public void setOrg_id(Integer org_id) {
		this.org_id = org_id;
	}
}
