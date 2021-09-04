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
public class CarParkingRecord implements Serializable {
	
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
	private String orderNo;
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String OrderNo) {
		this.orderNo = OrderNo;
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
	
	private Integer type;
	public Integer getType() {
		return type;
	}
	public void setType(Integer Type) {
		this.type = Type;
	}
	
	private String gmtInto;
	public String getGmtInto() {
		return gmtInto;
	}
	public void setGmtInto(String GmtInto) {
		this.gmtInto = GmtInto;
	}
	
	private String gmtOut;
	public String getGmtOut() {
		return gmtOut;
	}
	public void setGmtOut(String GmtOut) {
		this.gmtOut = GmtOut;
	}
	
	private String cost;
	public String getCost() {
		return cost;
	}
	public void setCost(String Cost) {
		this.cost = Cost;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarParkingRecord other = (CarParkingRecord) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
