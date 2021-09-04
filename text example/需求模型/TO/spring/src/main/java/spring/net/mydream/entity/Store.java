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
public class Store implements Serializable {
	
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
	
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String Password) {
		this.password = Password;
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
	
	private String regDate;
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String RegDate) {
		this.regDate = RegDate;
	}
	
	private String lastLoginDate;
	public String getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(String LastLoginDate) {
		this.lastLoginDate = LastLoginDate;
	}
	
	private String ssuper;
	public String getSsuper() {
		return ssuper;
	}
	public void setSsuper(String Ssuper) {
		this.ssuper = Ssuper;
	}
	
	private String monthlySales;
	public String getMonthlySales() {
		return monthlySales;
	}
	public void setMonthlySales(String MonthlySales) {
		this.monthlySales = MonthlySales;
	}
	
	private String storeMark;
	public String getStoreMark() {
		return storeMark;
	}
	public void setStoreMark(String StoreMark) {
		this.storeMark = StoreMark;
	}
	
	private String storeState;
	public String getStoreState() {
		return storeState;
	}
	public void setStoreState(String StoreState) {
		this.storeState = StoreState;
	}
	
	private String describe_S;
	public String getDescribe_S() {
		return describe_S;
	}
	public void setDescribe_S(String Describe_S) {
		this.describe_S = Describe_S;
	}
	
	private String logo;
	public String getLogo() {
		return logo;
	}
	public void setLogo(String Logo) {
		this.logo = Logo;
	}
	
	private String storefront;
	public String getStorefront() {
		return storefront;
	}
	public void setStorefront(String Storefront) {
		this.storefront = Storefront;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Store other = (Store) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
