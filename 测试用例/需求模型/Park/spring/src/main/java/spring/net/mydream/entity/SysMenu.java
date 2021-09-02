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
public class SysMenu implements Serializable {
	
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
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = Name;
	}
	
	private String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String Url) {
		this.url = Url;
	}
	
	private String perms;
	public String getPerms() {
		return perms;
	}
	public void setPerms(String Perms) {
		this.perms = Perms;
	}
	
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String Type) {
		this.type = Type;
	}
	
	private String icon;
	public String getIcon() {
		return icon;
	}
	public void setIcon(String Icon) {
		this.icon = Icon;
	}
	
	private String parentName;
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String ParentName) {
		this.parentName = ParentName;
	}
	
	private String isParent;
	public String getIsParent() {
		return isParent;
	}
	public void setIsParent(String IsParent) {
		this.isParent = IsParent;
	}
	
		
	
	
	@OneToOne(cascade = CascadeType.REFRESH, mappedBy = "linkedMenu")
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
		SysMenu other = (SysMenu) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
