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
public class SysOrg implements Serializable {
	
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
	private Integer parentId;
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer ParentId) {
		this.parentId = ParentId;
	}
	
	private String code;
	public String getCode() {
		return code;
	}
	public void setCode(String Code) {
		this.code = Code;
	}
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = Name;
	}
	
	private String full_name;
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String Full_name) {
		this.full_name = Full_name;
	}
	
	private String director;
	public String getDirector() {
		return director;
	}
	public void setDirector(String Director) {
		this.director = Director;
	}
	
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String Email) {
		this.email = Email;
	}
	
	private String phone;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String Phone) {
		this.phone = Phone;
	}
	
	private String address;
	public String getAddress() {
		return address;
	}
	public void setAddress(String Address) {
		this.address = Address;
	}
	
	private Integer order_num;
	public Integer getOrder_num() {
		return order_num;
	}
	public void setOrder_num(Integer Order_num) {
		this.order_num = Order_num;
	}
	
	private Integer status;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer Status) {
		this.status = Status;
	}
	
	private String parentName;
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String ParentName) {
		this.parentName = ParentName;
	}
	
		
	
	
	@JsonIgnore	
	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "belonged_role_id")
	private SysRole belongedRole;
			
	public SysRole getBelongedRole() {
		return belongedRole;
	}
			
	public void setBelongedRole(SysRole BelongedRole) {
		this.belongedRole = BelongedRole;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SysOrg other = (SysOrg) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
