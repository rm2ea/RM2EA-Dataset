package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class SavePMMessage{
	public CarParkManage entity;
	public CarParkManage getEntity() {
		return entity;
	}
					
	public void setEntity(CarParkManage entity) {
		this.entity = entity;
	}
}
