package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class SelectRoleAndAuthMessage{
	public Integer userId;
	public Integer getUserId() {
		return userId;
	}
					
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
