package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ExportDataCMMessage{
	public Double orgId;
	public Double getOrgId() {
		return orgId;
	}
					
	public void setOrgId(Double orgId) {
		this.orgId = orgId;
	}
	public Double parkManageId;
	public Double getParkManageId() {
		return parkManageId;
	}
					
	public void setParkManageId(Double parkManageId) {
		this.parkManageId = parkManageId;
	}
}
