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
public class Dishes implements Serializable {
	
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
	private String storeId;
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String StoreId) {
		this.storeId = StoreId;
	}
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = Name;
	}
	
	private String price;
	public String getPrice() {
		return price;
	}
	public void setPrice(String Price) {
		this.price = Price;
	}
	
	private String describe_S;
	public String getDescribe_S() {
		return describe_S;
	}
	public void setDescribe_S(String Describe_S) {
		this.describe_S = Describe_S;
	}
	
	private String image;
	public String getImage() {
		return image;
	}
	public void setImage(String Image) {
		this.image = Image;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dishes other = (Dishes) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
