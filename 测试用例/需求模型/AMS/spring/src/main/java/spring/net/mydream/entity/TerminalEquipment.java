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
public class TerminalEquipment implements Serializable {
	
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
	
	private String address;
	public String getAddress() {
		return address;
	}
	public void setAddress(String Address) {
		this.address = Address;
	}
	
	private String description;
	public String getDescription() {
		return description;
	}
	public void setDescription(String Description) {
		this.description = Description;
	}
	
	private Integer type;
	public Integer getType() {
		return type;
	}
	public void setType(Integer Type) {
		this.type = Type;
	}
	
	private String remark;
	public String getRemark() {
		return remark;
	}
	public void setRemark(String Remark) {
		this.remark = Remark;
	}
	
		
	
	@ManyToOne(targetEntity=DeviceInfo.class)
	@JoinColumn(name="belongeddeviceinfo_id",referencedColumnName="id")
	private DeviceInfo belongedDeviceInfo;
			
	public DeviceInfo getBelongedDeviceInfo() {
		return belongedDeviceInfo;
	}
			
	public void setBelongedDeviceInfo(DeviceInfo BelongedDeviceInfo) {
		this.belongedDeviceInfo = BelongedDeviceInfo;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TerminalEquipment other = (TerminalEquipment) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
