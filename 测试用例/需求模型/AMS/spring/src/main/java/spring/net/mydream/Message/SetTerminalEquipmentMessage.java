package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class SetTerminalEquipmentMessage{
	public String name;
	public String getName() {
		return name;
	}
					
	public void setName(String name) {
		this.name = name;
	}
	public String address;
	public String getAddress() {
		return address;
	}
					
	public void setAddress(String address) {
		this.address = address;
	}
	public String description;
	public String getDescription() {
		return description;
	}
					
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer type;
	public Integer getType() {
		return type;
	}
					
	public void setType(Integer type) {
		this.type = type;
	}
	public String remark;
	public String getRemark() {
		return remark;
	}
					
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer deviceInfoId;
	public Integer getDeviceInfoId() {
		return deviceInfoId;
	}
					
	public void setDeviceInfoId(Integer deviceInfoId) {
		this.deviceInfoId = deviceInfoId;
	}
}
