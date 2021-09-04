package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class DropMessage{
	public Integer id;
	public Integer getId() {
		return id;
	}
					
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer parentId;
	public Integer getParentId() {
		return parentId;
	}
					
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer menuId;
	public Integer getMenuId() {
		return menuId;
	}
					
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
}
