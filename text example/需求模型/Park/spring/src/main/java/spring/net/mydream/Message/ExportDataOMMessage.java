package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ExportDataOMMessage{
	public String orgId;
	public String getOrgId() {
		return orgId;
	}
					
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String parkManageId;
	public String getParkManageId() {
		return parkManageId;
	}
					
	public void setParkManageId(String parkManageId) {
		this.parkManageId = parkManageId;
	}
}
