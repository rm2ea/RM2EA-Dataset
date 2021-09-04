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
public class TbRepair implements Serializable {
	
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
	private String repairName;
	public String getRepairName() {
		return repairName;
	}
	public void setRepairName(String RepairName) {
		this.repairName = RepairName;
	}
	
	private String phone;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String Phone) {
		this.phone = Phone;
	}
	
	private String place;
	public String getPlace() {
		return place;
	}
	public void setPlace(String Place) {
		this.place = Place;
	}
	
	private Integer repairsStatus;
	public Integer getRepairsStatus() {
		return repairsStatus;
	}
	public void setRepairsStatus(Integer RepairsStatus) {
		this.repairsStatus = RepairsStatus;
	}
	
	private String deviceId;
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String DeviceId) {
		this.deviceId = DeviceId;
	}
	
	private Integer status;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer Status) {
		this.status = Status;
	}
	
	private String describeContent;
	public String getDescribeContent() {
		return describeContent;
	}
	public void setDescribeContent(String DescribeContent) {
		this.describeContent = DescribeContent;
	}
	
	private Integer score;
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer Score) {
		this.score = Score;
	}
	
	private String remark;
	public String getRemark() {
		return remark;
	}
	public void setRemark(String Remark) {
		this.remark = Remark;
	}
	
	private Date time;
	public Date getTime() {
		return time;
	}
	public void setTime(Date Time) {
		this.time = Time;
	}
	
		
	
	@ManyToOne(targetEntity=User.class)
	@JoinColumn(name="belongeduser_id",referencedColumnName="id")
	private User belongedUser;
			
	public User getBelongedUser() {
		return belongedUser;
	}
			
	public void setBelongedUser(User BelongedUser) {
		this.belongedUser = BelongedUser;
	}
		
	
	@ManyToOne(targetEntity=Department.class)
	@JoinColumn(name="belongeddepartment_id",referencedColumnName="id")
	private Department belongedDepartment;
			
	public Department getBelongedDepartment() {
		return belongedDepartment;
	}
			
	public void setBelongedDepartment(Department BelongedDepartment) {
		this.belongedDepartment = BelongedDepartment;
	}
		
	
	
	@JsonIgnore	
	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "assoicated_t_r_e_id")
	private TbRepairExtra assoicatedTRE;
			
	public TbRepairExtra getAssoicatedTRE() {
		return assoicatedTRE;
	}
			
	public void setAssoicatedTRE(TbRepairExtra AssoicatedTRE) {
		this.assoicatedTRE = AssoicatedTRE;
	}
		
	
	@ManyToOne(targetEntity=EquipmentFailureType.class)
	@JoinColumn(name="belongedeft_id",referencedColumnName="id")
	private EquipmentFailureType belongedEFT;
			
	public EquipmentFailureType getBelongedEFT() {
		return belongedEFT;
	}
			
	public void setBelongedEFT(EquipmentFailureType BelongedEFT) {
		this.belongedEFT = BelongedEFT;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TbRepair other = (TbRepair) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
