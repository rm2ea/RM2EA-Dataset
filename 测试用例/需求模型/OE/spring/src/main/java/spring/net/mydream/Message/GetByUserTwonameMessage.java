package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class GetByUserTwonameMessage{
	public String usertwoname;
	public String getUsertwoname() {
		return usertwoname;
	}
					
	public void setUsertwoname(String usertwoname) {
		this.usertwoname = usertwoname;
	}
}
