package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class SaveCRMessage{
	public CarParkingRecord entity;
	public CarParkingRecord getEntity() {
		return entity;
	}
					
	public void setEntity(CarParkingRecord entity) {
		this.entity = entity;
	}
}
