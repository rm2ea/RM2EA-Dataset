package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class GetByPhoneMessage{
	public String phone;
	public String getPhone() {
		return phone;
	}
					
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
