package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class EncodePswMessage{
	public String psw;
	public String getPsw() {
		return psw;
	}
					
	public void setPsw(String psw) {
		this.psw = psw;
	}
}
