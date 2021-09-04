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
public class SysUser implements Serializable {
	
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
	private Integer orgId;
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer OrgId) {
		this.orgId = OrgId;
	}
	
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String Username) {
		this.username = Username;
	}
	
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String Password) {
		this.password = Password;
	}
	
	private String nickname;
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String Nickname) {
		this.nickname = Nickname;
	}
	
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String Email) {
		this.email = Email;
	}
	
	private String mobile;
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String Mobile) {
		this.mobile = Mobile;
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
	
	private String avatar_status;
	public String getAvatar_status() {
		return avatar_status;
	}
	public void setAvatar_status(String Avatar_status) {
		this.avatar_status = Avatar_status;
	}
	
	private String orgName;
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String OrgName) {
		this.orgName = OrgName;
	}
	
		
	
	@JsonIgnore
	@Fetch(FetchMode.SUBSELECT)
	@OneToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER,mappedBy="linkedUser")
	private List<SysRole> linkedRole = new ArrayList<SysRole>();
			
	public List<SysRole> getLinkedRole() {
		return linkedRole;
	}
			
	public void setLinkedRole(List<SysRole> LinkedRole) {
		this.linkedRole = LinkedRole;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SysUser other = (SysUser) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
