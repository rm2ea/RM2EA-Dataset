package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ToMenuTreeMessage{
	public List ms;
	public List getMs() {
		return ms;
	}
					
	public void setMs(List ms) {
		this.ms = ms;
	}
	public Integer parentId;
	public Integer getParentId() {
		return parentId;
	}
					
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
}
