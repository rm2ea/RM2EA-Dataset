package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class BacktransmitMessage{
	public Integer tbId;
	public Integer getTbId() {
		return tbId;
	}
					
	public void setTbId(Integer tbId) {
		this.tbId = tbId;
	}
	public String rejectCause;
	public String getRejectCause() {
		return rejectCause;
	}
					
	public void setRejectCause(String rejectCause) {
		this.rejectCause = rejectCause;
	}
}
