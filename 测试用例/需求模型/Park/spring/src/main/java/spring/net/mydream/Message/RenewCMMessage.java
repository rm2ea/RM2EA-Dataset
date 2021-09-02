package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class RenewCMMessage{
	public Integer oId;
	public Integer getOId() {
		return oId;
	}
					
	public void setOId(Integer oId) {
		this.oId = oId;
	}
	public Integer carId;
	public Integer getCarId() {
		return carId;
	}
					
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	public Integer userid;
	public Integer getUserid() {
		return userid;
	}
					
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
}
