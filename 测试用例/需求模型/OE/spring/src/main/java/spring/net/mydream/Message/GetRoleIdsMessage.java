package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class GetRoleIdsMessage{
	public Integer userid;
	public Integer getUserid() {
		return userid;
	}
					
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
}
