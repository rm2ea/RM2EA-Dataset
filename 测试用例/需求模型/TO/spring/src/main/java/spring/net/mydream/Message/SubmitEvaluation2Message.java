package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class SubmitEvaluation2Message{
	public Integer orderingId;
	public Integer getOrderingId() {
		return orderingId;
	}
					
	public void setOrderingId(Integer orderingId) {
		this.orderingId = orderingId;
	}
	public Integer uid;
	public Integer getUid() {
		return uid;
	}
					
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String evluation;
	public String getEvluation() {
		return evluation;
	}
					
	public void setEvluation(String evluation) {
		this.evluation = evluation;
	}
}
