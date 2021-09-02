package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ToEvaluateStoreMessage{
	public Integer orderingId;
	public Integer getOrderingId() {
		return orderingId;
	}
					
	public void setOrderingId(Integer orderingId) {
		this.orderingId = orderingId;
	}
}
