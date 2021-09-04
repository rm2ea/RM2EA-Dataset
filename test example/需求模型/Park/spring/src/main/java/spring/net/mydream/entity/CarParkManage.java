package spring.net.mydream.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.FetchType;
import java.util.ArrayList;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import java.util.Date;
import java.util.List;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;

@Entity
public class CarParkManage implements Serializable {
	
	/* all primary attributes */
	@Id  // 主键
	@GeneratedValue(strategy=GenerationType.IDENTITY) // 自增长策略
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = Name;
	}
	
	private Integer orgId;
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer OrgId) {
		this.orgId = OrgId;
	}
	
	private String orgName;
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String OrgName) {
		this.orgName = OrgName;
	}
	
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String Status) {
		this.status = Status;
	}
	
	private String parkingSpaceNumber;
	public String getParkingSpaceNumber() {
		return parkingSpaceNumber;
	}
	public void setParkingSpaceNumber(String ParkingSpaceNumber) {
		this.parkingSpaceNumber = ParkingSpaceNumber;
	}
	
	private String freeTime;
	public String getFreeTime() {
		return freeTime;
	}
	public void setFreeTime(String FreeTime) {
		this.freeTime = FreeTime;
	}
	
	private String timeUnit;
	public String getTimeUnit() {
		return timeUnit;
	}
	public void setTimeUnit(String TimeUnit) {
		this.timeUnit = TimeUnit;
	}
	
	private String unitCost;
	public String getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(String UnitCost) {
		this.unitCost = UnitCost;
	}
	
	private String maxMoney;
	public String getMaxMoney() {
		return maxMoney;
	}
	public void setMaxMoney(String MaxMoney) {
		this.maxMoney = MaxMoney;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarParkManage other = (CarParkManage) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
