package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class SubmitOrderingMessage{
	public Integer storeId;
	public Integer getStoreId() {
		return storeId;
	}
					
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	public Integer customerid;
	public Integer getCustomerid() {
		return customerid;
	}
					
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}
	public Integer dishesid;
	public Integer getDishesid() {
		return dishesid;
	}
					
	public void setDishesid(Integer dishesid) {
		this.dishesid = dishesid;
	}
}
