package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class GetByPlateNumberCRMessage{
	public Integer plate_number;
	public Integer getPlate_number() {
		return plate_number;
	}
					
	public void setPlate_number(Integer plate_number) {
		this.plate_number = plate_number;
	}
	public Integer park_manage_id;
	public Integer getPark_manage_id() {
		return park_manage_id;
	}
					
	public void setPark_manage_id(Integer park_manage_id) {
		this.park_manage_id = park_manage_id;
	}
}
