package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class EnterStoreBystoreIdMessage{
	public Integer storeId;
	public Integer getStoreId() {
		return storeId;
	}
					
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
}
