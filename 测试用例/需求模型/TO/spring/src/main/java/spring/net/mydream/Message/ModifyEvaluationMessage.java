package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ModifyEvaluationMessage{
	public Integer id;
	public Integer getId() {
		return id;
	}
					
	public void setId(Integer id) {
		this.id = id;
	}
	public String anonymity;
	public String getAnonymity() {
		return anonymity;
	}
					
	public void setAnonymity(String anonymity) {
		this.anonymity = anonymity;
	}
}
