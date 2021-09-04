package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class DeliveryConfirmineMessage{
	public Integer customerId;
	public Integer getCustomerId() {
		return customerId;
	}
					
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
}
