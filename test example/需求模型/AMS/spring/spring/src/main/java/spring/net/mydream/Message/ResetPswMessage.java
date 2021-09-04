package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;

public class ResetPswMessage{
	public Integer id;
	public Integer getId() {
		return id;
	}
					
	public void setId(Integer id) {
		this.id = id;
	}
	public String newpwd;
	public String getNewpwd() {
		return newpwd;
	}
					
	public void setNewpwd(String newpwd) {
		this.newpwd = newpwd;
	}
	public String oldpwd;
	public String getOldpwd() {
		return oldpwd;
	}
					
	public void setOldpwd(String oldpwd) {
		this.oldpwd = oldpwd;
	}
}
