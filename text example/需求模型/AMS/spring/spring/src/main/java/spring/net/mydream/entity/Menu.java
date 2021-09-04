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
public class Menu implements Serializable {
	
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
	private String parentId;
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String ParentId) {
		this.parentId = ParentId;
	}
	
	private String menuName;
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String MenuName) {
		this.menuName = MenuName;
	}
	
	private String menuIcon;
	public String getMenuIcon() {
		return menuIcon;
	}
	public void setMenuIcon(String MenuIcon) {
		this.menuIcon = MenuIcon;
	}
	
	private String iconColor;
	public String getIconColor() {
		return iconColor;
	}
	public void setIconColor(String IconColor) {
		this.iconColor = IconColor;
	}
	
	private String path;
	public String getPath() {
		return path;
	}
	public void setPath(String Path) {
		this.path = Path;
	}
	
	private String target;
	public String getTarget() {
		return target;
	}
	public void setTarget(String Target) {
		this.target = Target;
	}
	
	private Integer hide;
	public Integer getHide() {
		return hide;
	}
	public void setHide(Integer Hide) {
		this.hide = Hide;
	}
	
	private Integer sortNumber;
	public Integer getSortNumber() {
		return sortNumber;
	}
	public void setSortNumber(Integer SortNumber) {
		this.sortNumber = SortNumber;
	}
	
	private String authority;
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String Authority) {
		this.authority = Authority;
	}
	
	private Integer menuType;
	public Integer getMenuType() {
		return menuType;
	}
	public void setMenuType(Integer MenuType) {
		this.menuType = MenuType;
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
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
