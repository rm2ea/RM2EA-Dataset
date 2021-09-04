package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;

public class FreezeAMessage{
	public Integer id;
	public Integer getId() {
		return id;
	}
					
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer state;
	public Integer getState() {
		return state;
	}
					
	public void setState(Integer state) {
		this.state = state;
	}
}
