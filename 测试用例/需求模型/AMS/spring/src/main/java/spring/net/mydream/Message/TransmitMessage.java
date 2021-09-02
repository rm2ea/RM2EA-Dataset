package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class TransmitMessage{
	public Integer departId;
	public Integer getDepartId() {
		return departId;
	}
					
	public void setDepartId(Integer departId) {
		this.departId = departId;
	}
	public Integer tbId;
	public Integer getTbId() {
		return tbId;
	}
					
	public void setTbId(Integer tbId) {
		this.tbId = tbId;
	}
}
