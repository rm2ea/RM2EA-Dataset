package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ListByDictCodeAndNameMessage{
	public String dictCode;
	public String getDictCode() {
		return dictCode;
	}
					
	public void setDictCode(String dictCode) {
		this.dictCode = dictCode;
	}
	public String dictDataName;
	public String getDictDataName() {
		return dictDataName;
	}
					
	public void setDictDataName(String dictDataName) {
		this.dictDataName = dictDataName;
	}
}
