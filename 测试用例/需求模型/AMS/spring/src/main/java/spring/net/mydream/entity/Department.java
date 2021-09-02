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
public class Department implements Serializable {
	
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
	
	private String contactRerson;
	public String getContactRerson() {
		return contactRerson;
	}
	public void setContactRerson(String ContactRerson) {
		this.contactRerson = ContactRerson;
	}
	
	private String principal;
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String Principal) {
		this.principal = Principal;
	}
	
	private String phone;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String Phone) {
		this.phone = Phone;
	}
	
	private String briefInfo;
	public String getBriefInfo() {
		return briefInfo;
	}
	public void setBriefInfo(String BriefInfo) {
		this.briefInfo = BriefInfo;
	}
	
	private String describeContent;
	public String getDescribeContent() {
		return describeContent;
	}
	public void setDescribeContent(String DescribeContent) {
		this.describeContent = DescribeContent;
	}
	
	private String remark;
	public String getRemark() {
		return remark;
	}
	public void setRemark(String Remark) {
		this.remark = Remark;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
