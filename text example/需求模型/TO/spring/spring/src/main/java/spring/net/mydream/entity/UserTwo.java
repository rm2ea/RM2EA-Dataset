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
public class UserTwo implements Serializable {
	
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
	
	private String nickName;
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String NickName) {
		this.nickName = NickName;
	}
	
	private String avatar;
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String Avatar) {
		this.avatar = Avatar;
	}
	
	private Integer sex;
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer Sex) {
		this.sex = Sex;
	}
	
	private String phone;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String Phone) {
		this.phone = Phone;
	}
	
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String Email) {
		this.email = Email;
	}
	
	private Integer emailVerified;
	public Integer getEmailVerified() {
		return emailVerified;
	}
	public void setEmailVerified(Integer EmailVerified) {
		this.emailVerified = EmailVerified;
	}
	
	private String trueName;
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String TrueName) {
		this.trueName = TrueName;
	}
	
	private String idCard;
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String IdCard) {
		this.idCard = IdCard;
	}
	
	private String birthday;
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String Birthday) {
		this.birthday = Birthday;
	}
	
	private String introduction;
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String Introduction) {
		this.introduction = Introduction;
	}
	
	private Integer present;
	public Integer getPresent() {
		return present;
	}
	public void setPresent(Integer Present) {
		this.present = Present;
	}
	
	private Integer state;
	public Integer getState() {
		return state;
	}
	public void setState(Integer State) {
		this.state = State;
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
		UserTwo other = (UserTwo) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
