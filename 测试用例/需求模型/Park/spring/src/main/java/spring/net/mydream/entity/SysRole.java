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
public class SysRole implements Serializable {
	
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
	
	private String roleSign;
	public String getRoleSign() {
		return roleSign;
	}
	public void setRoleSign(String RoleSign) {
		this.roleSign = RoleSign;
	}
	
	private String remark;
	public String getRemark() {
		return remark;
	}
	public void setRemark(String Remark) {
		this.remark = Remark;
	}
	
	private String userIdCreate;
	public String getUserIdCreate() {
		return userIdCreate;
	}
	public void setUserIdCreate(String UserIdCreate) {
		this.userIdCreate = UserIdCreate;
	}
	
		
	
	
	@JsonIgnore	
	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "linked_menu_id")
	private SysMenu linkedMenu;
			
	public SysMenu getLinkedMenu() {
		return linkedMenu;
	}
			
	public void setLinkedMenu(SysMenu LinkedMenu) {
		this.linkedMenu = LinkedMenu;
	}
		
	
	@ManyToOne(targetEntity=SysUser.class)
	@JoinColumn(name="linkeduser_id",referencedColumnName="id")
	private SysUser linkedUser;
			
	public SysUser getLinkedUser() {
		return linkedUser;
	}
			
	public void setLinkedUser(SysUser LinkedUser) {
		this.linkedUser = LinkedUser;
	}
		
	
	
	@OneToOne(cascade = CascadeType.REFRESH, mappedBy = "belongedRole")
	private SysOrg linkedOrg;
			
	public SysOrg getLinkedOrg() {
		return linkedOrg;
	}
			
	public void setLinkedOrg(SysOrg LinkedOrg) {
		this.linkedOrg = LinkedOrg;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SysRole other = (SysRole) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
