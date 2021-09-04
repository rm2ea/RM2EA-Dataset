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
public class Customer implements Serializable {
	
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
	private String image;
	public String getImage() {
		return image;
	}
	public void setImage(String Image) {
		this.image = Image;
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
	
	private String redpaper;
	public String getRedpaper() {
		return redpaper;
	}
	public void setRedpaper(String Redpaper) {
		this.redpaper = Redpaper;
	}
	
	private String regMember;
	public String getRegMember() {
		return regMember;
	}
	public void setRegMember(String RegMember) {
		this.regMember = RegMember;
	}
	
	private String pastMember;
	public String getPastMember() {
		return pastMember;
	}
	public void setPastMember(String PastMember) {
		this.pastMember = PastMember;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
