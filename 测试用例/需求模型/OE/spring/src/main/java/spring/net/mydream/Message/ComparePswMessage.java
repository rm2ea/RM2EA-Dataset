package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ComparePswMessage{
	public String dbPsw;
	public String getDbPsw() {
		return dbPsw;
	}
					
	public void setDbPsw(String dbPsw) {
		this.dbPsw = dbPsw;
	}
	public String inputPsw;
	public String getInputPsw() {
		return inputPsw;
	}
					
	public void setInputPsw(String inputPsw) {
		this.inputPsw = inputPsw;
	}
}
