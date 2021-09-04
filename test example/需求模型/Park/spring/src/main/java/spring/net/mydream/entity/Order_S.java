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
public class Order_S implements Serializable {
	
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
	private String body;
	public String getBody() {
		return body;
	}
	public void setBody(String Body) {
		this.body = Body;
	}
	
	private String orderNo;
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String OrderNo) {
		this.orderNo = OrderNo;
	}
	
	private String totalFee;
	public String getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(String TotalFee) {
		this.totalFee = TotalFee;
	}
	
	private Integer type;
	public Integer getType() {
		return type;
	}
	public void setType(Integer Type) {
		this.type = Type;
	}
	
	private Integer parkManageId;
	public Integer getParkManageId() {
		return parkManageId;
	}
	public void setParkManageId(Integer ParkManageId) {
		this.parkManageId = ParkManageId;
	}
	
	private Integer orgId;
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer OrgId) {
		this.orgId = OrgId;
	}
	
	private String remark;
	public String getRemark() {
		return remark;
	}
	public void setRemark(String Remark) {
		this.remark = Remark;
	}
	
	private String plateNumber;
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String PlateNumber) {
		this.plateNumber = PlateNumber;
	}
	
	private Date validityTime;
	public Date getValidityTime() {
		return validityTime;
	}
	public void setValidityTime(Date ValidityTime) {
		this.validityTime = ValidityTime;
	}
	
	private Integer status;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer Status) {
		this.status = Status;
	}
	
	private Integer userCreate;
	public Integer getUserCreate() {
		return userCreate;
	}
	public void setUserCreate(Integer UserCreate) {
		this.userCreate = UserCreate;
	}
	
	private String carId;
	public String getCarId() {
		return carId;
	}
	public void setCarId(String CarId) {
		this.carId = CarId;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order_S other = (Order_S) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
