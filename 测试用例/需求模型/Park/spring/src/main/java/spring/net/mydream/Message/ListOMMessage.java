package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ListOMMessage{
	public Order_S order;
	public Order_S getOrder() {
		return order;
	}
					
	public void setOrder(Order_S order) {
		this.order = order;
	}
}
