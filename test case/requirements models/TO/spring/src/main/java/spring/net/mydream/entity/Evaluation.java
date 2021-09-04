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
public class Evaluation implements Serializable {
	
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
	private String anonymity;
	public String getAnonymity() {
		return anonymity;
	}
	public void setAnonymity(String Anonymity) {
		this.anonymity = Anonymity;
	}
	
	private Integer customerId;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer CustomerId) {
		this.customerId = CustomerId;
	}
	
	private String customerImage;
	public String getCustomerImage() {
		return customerImage;
	}
	public void setCustomerImage(String CustomerImage) {
		this.customerImage = CustomerImage;
	}
	
	private String customerName;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String CustomerName) {
		this.customerName = CustomerName;
	}
	
	private Date timeDate;
	public Date getTimeDate() {
		return timeDate;
	}
	public void setTimeDate(Date TimeDate) {
		this.timeDate = TimeDate;
	}
	
	private Integer orderingId;
	public Integer getOrderingId() {
		return orderingId;
	}
	public void setOrderingId(Integer OrderingId) {
		this.orderingId = OrderingId;
	}
	
	private String storeId;
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String StoreId) {
		this.storeId = StoreId;
	}
	
	private String score;
	public String getScore() {
		return score;
	}
	public void setScore(String Score) {
		this.score = Score;
	}
	
	private String evaluation;
	public String getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(String Evaluation) {
		this.evaluation = Evaluation;
	}
	
	private String image1;
	public String getImage1() {
		return image1;
	}
	public void setImage1(String Image1) {
		this.image1 = Image1;
	}
	
	private String image2;
	public String getImage2() {
		return image2;
	}
	public void setImage2(String Image2) {
		this.image2 = Image2;
	}
	
	private String image3;
	public String getImage3() {
		return image3;
	}
	public void setImage3(String Image3) {
		this.image3 = Image3;
	}
	
	private String image4;
	public String getImage4() {
		return image4;
	}
	public void setImage4(String Image4) {
		this.image4 = Image4;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evaluation other = (Evaluation) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
