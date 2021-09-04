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
public class OperationStatus implements Serializable {
	
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
	private String remark;
	public String getRemark() {
		return remark;
	}
	public void setRemark(String Remark) {
		this.remark = Remark;
	}
	
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String Status) {
		this.status = Status;
	}
	
	private String value;
	public String getValue() {
		return value;
	}
	public void setValue(String Value) {
		this.value = Value;
	}
	
	private String valueUnit;
	public String getValueUnit() {
		return valueUnit;
	}
	public void setValueUnit(String ValueUnit) {
		this.valueUnit = ValueUnit;
	}
	
	private Date time;
	public Date getTime() {
		return time;
	}
	public void setTime(Date Time) {
		this.time = Time;
	}
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = Name;
	}
	
		
	
	@ManyToOne(targetEntity=TerminalEquipment.class)
	@JoinColumn(name="belongedequipment_id",referencedColumnName="id")
	private TerminalEquipment belongedEquipment;
			
	public TerminalEquipment getBelongedEquipment() {
		return belongedEquipment;
	}
			
	public void setBelongedEquipment(TerminalEquipment BelongedEquipment) {
		this.belongedEquipment = BelongedEquipment;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OperationStatus other = (OperationStatus) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
