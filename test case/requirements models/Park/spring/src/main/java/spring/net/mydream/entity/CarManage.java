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
public class CarManage implements Serializable {
	
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
	
	private Integer parkManageId;
	public Integer getParkManageId() {
		return parkManageId;
	}
	public void setParkManageId(Integer ParkManageId) {
		this.parkManageId = ParkManageId;
	}
	
	private String parkManageName;
	public String getParkManageName() {
		return parkManageName;
	}
	public void setParkManageName(String ParkManageName) {
		this.parkManageName = ParkManageName;
	}
	
	private String plateNumber;
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String PlateNumber) {
		this.plateNumber = PlateNumber;
	}
	
	private String gender;
	public String getGender() {
		return gender;
	}
	public void setGender(String Gender) {
		this.gender = Gender;
	}
	
	private String nickname;
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String Nickname) {
		this.nickname = Nickname;
	}
	
	private String mobile;
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String Mobile) {
		this.mobile = Mobile;
	}
	
	private String parkingLot;
	public String getParkingLot() {
		return parkingLot;
	}
	public void setParkingLot(String ParkingLot) {
		this.parkingLot = ParkingLot;
	}
	
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String Type) {
		this.type = Type;
	}
	
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String Status) {
		this.status = Status;
	}
	
	private String remark;
	public String getRemark() {
		return remark;
	}
	public void setRemark(String Remark) {
		this.remark = Remark;
	}
	
	private Date validityTime;
	public Date getValidityTime() {
		return validityTime;
	}
	public void setValidityTime(Date ValidityTime) {
		this.validityTime = ValidityTime;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarManage other = (CarManage) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
