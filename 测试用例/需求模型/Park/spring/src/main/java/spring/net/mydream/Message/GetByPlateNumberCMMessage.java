package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class GetByPlateNumberCMMessage{
	public String plateNumber;
	public String getPlateNumber() {
		return plateNumber;
	}
					
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public Integer parkManageId;
	public Integer getParkManageId() {
		return parkManageId;
	}
					
	public void setParkManageId(Integer parkManageId) {
		this.parkManageId = parkManageId;
	}
}
