package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class UpdatePwdMessage{
	public Integer id;
	public Integer getId() {
		return id;
	}
					
	public void setId(Integer id) {
		this.id = id;
	}
	public String pwd;
	public String getPwd() {
		return pwd;
	}
					
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
