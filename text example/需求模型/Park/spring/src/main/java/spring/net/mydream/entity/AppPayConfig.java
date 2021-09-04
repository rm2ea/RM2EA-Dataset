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
public class AppPayConfig implements Serializable {
	
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
	private Integer carParkId;
	public Integer getCarParkId() {
		return carParkId;
	}
	public void setCarParkId(Integer CarParkId) {
		this.carParkId = CarParkId;
	}
	
	private String mchId;
	public String getMchId() {
		return mchId;
	}
	public void setMchId(String MchId) {
		this.mchId = MchId;
	}
	
	private String secretKey;
	public String getSecretKey() {
		return secretKey;
	}
	public void setSecretKey(String SecretKey) {
		this.secretKey = SecretKey;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AppPayConfig other = (AppPayConfig) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
