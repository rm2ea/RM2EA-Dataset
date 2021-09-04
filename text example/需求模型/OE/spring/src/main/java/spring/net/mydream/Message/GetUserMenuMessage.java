package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class GetUserMenuMessage{
	public Integer userId;
	public Integer getUserId() {
		return userId;
	}
					
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer menuType;
	public Integer getMenuType() {
		return menuType;
	}
					
	public void setMenuType(Integer menuType) {
		this.menuType = menuType;
	}
}
