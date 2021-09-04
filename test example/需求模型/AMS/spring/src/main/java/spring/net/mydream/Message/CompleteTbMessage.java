package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class CompleteTbMessage{
	public Integer tbId;
	public Integer getTbId() {
		return tbId;
	}
					
	public void setTbId(Integer tbId) {
		this.tbId = tbId;
	}
	public String cause;
	public String getCause() {
		return cause;
	}
					
	public void setCause(String cause) {
		this.cause = cause;
	}
	public String resolvent;
	public String getResolvent() {
		return resolvent;
	}
					
	public void setResolvent(String resolvent) {
		this.resolvent = resolvent;
	}
}
