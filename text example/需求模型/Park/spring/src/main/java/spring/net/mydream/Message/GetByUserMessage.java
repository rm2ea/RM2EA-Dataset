package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class GetByUserMessage{
	public String username;
	public String getUsername() {
		return username;
	}
					
	public void setUsername(String username) {
		this.username = username;
	}
}
