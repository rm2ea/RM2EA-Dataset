package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ModifyOrderingDishesMessage{
	public Integer id;
	public Integer getId() {
		return id;
	}
					
	public void setId(Integer id) {
		this.id = id;
	}
	public String dishesName;
	public String getDishesName() {
		return dishesName;
	}
					
	public void setDishesName(String dishesName) {
		this.dishesName = dishesName;
	}
}
