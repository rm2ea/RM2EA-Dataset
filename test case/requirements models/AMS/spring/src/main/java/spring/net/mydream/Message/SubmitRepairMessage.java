package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class SubmitRepairMessage{
	public Integer departmentid;
	public Integer getDepartmentid() {
		return departmentid;
	}
					
	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}
	public Integer assignDepartId;
	public Integer getAssignDepartId() {
		return assignDepartId;
	}
					
	public void setAssignDepartId(Integer assignDepartId) {
		this.assignDepartId = assignDepartId;
	}
	public String repairName;
	public String getRepairName() {
		return repairName;
	}
					
	public void setRepairName(String repairName) {
		this.repairName = repairName;
	}
	public String phone;
	public String getPhone() {
		return phone;
	}
					
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String place;
	public String getPlace() {
		return place;
	}
					
	public void setPlace(String place) {
		this.place = place;
	}
	public Integer repairsStatus;
	public Integer getRepairsStatus() {
		return repairsStatus;
	}
					
	public void setRepairsStatus(Integer repairsStatus) {
		this.repairsStatus = repairsStatus;
	}
	public String deviceId;
	public String getDeviceId() {
		return deviceId;
	}
					
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String describeContent;
	public String getDescribeContent() {
		return describeContent;
	}
					
	public void setDescribeContent(String describeContent) {
		this.describeContent = describeContent;
	}
	public Integer failureTypeId;
	public Integer getFailureTypeId() {
		return failureTypeId;
	}
					
	public void setFailureTypeId(Integer failureTypeId) {
		this.failureTypeId = failureTypeId;
	}
}
