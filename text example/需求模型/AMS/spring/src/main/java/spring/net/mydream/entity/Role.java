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
public class Role implements Serializable {
	
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
	private Integer roleCode;
	public Integer getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(Integer RoleCode) {
		this.roleCode = RoleCode;
	}
	
	private String remark;
	public String getRemark() {
		return remark;
	}
	public void setRemark(String Remark) {
		this.remark = Remark;
	}
	
		
	
	@JsonIgnore
	@Fetch(FetchMode.SUBSELECT)
	@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="belongedRole")
	private List<User> containedUsers = new ArrayList<User>();
			
	public List<User> getContainedUsers() {
		return containedUsers;
	}
			
	public void setContainedUsers(List<User> ContainedUsers) {
		this.containedUsers = ContainedUsers;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
