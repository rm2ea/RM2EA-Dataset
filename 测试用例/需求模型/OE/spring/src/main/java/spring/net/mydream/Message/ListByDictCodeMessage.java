package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ListByDictCodeMessage{
	public String dictCode;
	public String getDictCode() {
		return dictCode;
	}
					
	public void setDictCode(String dictCode) {
		this.dictCode = dictCode;
	}
}
