package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class AllocationMessage{
	public Integer userId;
	public Integer getUserId() {
		return userId;
	}
					
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer tbId;
	public Integer getTbId() {
		return tbId;
	}
					
	public void setTbId(Integer tbId) {
		this.tbId = tbId;
	}
}
