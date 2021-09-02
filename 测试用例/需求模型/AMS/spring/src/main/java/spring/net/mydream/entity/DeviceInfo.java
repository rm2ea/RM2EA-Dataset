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
public class DeviceInfo implements Serializable {
	
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
	
	private String brand;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String Brand) {
		this.brand = Brand;
	}
	
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String Type) {
		this.type = Type;
	}
	
	private String address;
	public String getAddress() {
		return address;
	}
	public void setAddress(String Address) {
		this.address = Address;
	}
	
	private String adminName;
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String AdminName) {
		this.adminName = AdminName;
	}
	
	private String contactsName;
	public String getContactsName() {
		return contactsName;
	}
	public void setContactsName(String ContactsName) {
		this.contactsName = ContactsName;
	}
	
	private Integer status;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer Status) {
		this.status = Status;
	}
	
	private String remark;
	public String getRemark() {
		return remark;
	}
	public void setRemark(String Remark) {
		this.remark = Remark;
	}
	
		
	
	@ManyToOne(targetEntity=DeviceLocationGroup.class)
	@JoinColumn(name="belongeddlg_id",referencedColumnName="id")
	private DeviceLocationGroup belongedDLG;
			
	public DeviceLocationGroup getBelongedDLG() {
		return belongedDLG;
	}
			
	public void setBelongedDLG(DeviceLocationGroup BelongedDLG) {
		this.belongedDLG = BelongedDLG;
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
		
	
	@ManyToOne(targetEntity=DeviceAssociationGroup.class)
	@JoinColumn(name="belongeddag_id",referencedColumnName="id")
	private DeviceAssociationGroup belongedDAG;
			
	public DeviceAssociationGroup getBelongedDAG() {
		return belongedDAG;
	}
			
	public void setBelongedDAG(DeviceAssociationGroup BelongedDAG) {
		this.belongedDAG = BelongedDAG;
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
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeviceInfo other = (DeviceInfo) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
