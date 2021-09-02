package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class SuggestByStrMessage{
	public String str;
	public String getStr() {
		return str;
	}
					
	public void setStr(String str) {
		this.str = str;
	}
}
