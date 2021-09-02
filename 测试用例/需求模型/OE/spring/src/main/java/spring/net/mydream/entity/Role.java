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
	private String roleName;
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String RoleName) {
		this.roleName = RoleName;
	}
	
	private String roleCode;
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String RoleCode) {
		this.roleCode = RoleCode;
	}
	
	private String comments;
	public String getComments() {
		return comments;
	}
	public void setComments(String Comments) {
		this.comments = Comments;
	}
	
	private String createTime;
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String CreateTime) {
		this.createTime = CreateTime;
	}
	
	private String updateTime;
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String UpdateTime) {
		this.updateTime = UpdateTime;
	}
	
		
	
	
	@JsonIgnore	
	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "roleto_menu_id")
	private Menu roletoMenu;
			
	public Menu getRoletoMenu() {
		return roletoMenu;
	}
			
	public void setRoletoMenu(Menu RoletoMenu) {
		this.roletoMenu = RoletoMenu;
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
