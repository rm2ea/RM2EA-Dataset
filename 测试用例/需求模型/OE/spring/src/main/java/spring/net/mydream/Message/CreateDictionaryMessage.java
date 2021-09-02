package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class CreateDictionaryMessage{
	public Integer id;
	public Integer getId() {
		return id;
	}
					
	public void setId(Integer id) {
		this.id = id;
	}
	public String dictcode;
	public String getDictcode() {
		return dictcode;
	}
					
	public void setDictcode(String dictcode) {
		this.dictcode = dictcode;
	}
	public String dictname;
	public String getDictname() {
		return dictname;
	}
					
	public void setDictname(String dictname) {
		this.dictname = dictname;
	}
}
