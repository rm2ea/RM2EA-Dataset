package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class SetOperationStatusMessage{
	public String name;
	public String getName() {
		return name;
	}
					
	public void setName(String name) {
		this.name = name;
	}
	public String value;
	public String getValue() {
		return value;
	}
					
	public void setValue(String value) {
		this.value = value;
	}
	public String valueUnit;
	public String getValueUnit() {
		return valueUnit;
	}
					
	public void setValueUnit(String valueUnit) {
		this.valueUnit = valueUnit;
	}
	public String status;
	public String getStatus() {
		return status;
	}
					
	public void setStatus(String status) {
		this.status = status;
	}
	public String remark;
	public String getRemark() {
		return remark;
	}
					
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer equipmentId;
	public Integer getEquipmentId() {
		return equipmentId;
	}
					
	public void setEquipmentId(Integer equipmentId) {
		this.equipmentId = equipmentId;
	}
}
