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
public class Ordering implements Serializable {
	
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
	private Integer userId;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer UserId) {
		this.userId = UserId;
	}
	
	private Integer delivererId;
	public Integer getDelivererId() {
		return delivererId;
	}
	public void setDelivererId(Integer DelivererId) {
		this.delivererId = DelivererId;
	}
	
	private Integer storeId;
	public Integer getStoreId() {
		return storeId;
	}
	public void setStoreId(Integer StoreId) {
		this.storeId = StoreId;
	}
	
	private String startTime;
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String StartTime) {
		this.startTime = StartTime;
	}
	
	private String address;
	public String getAddress() {
		return address;
	}
	public void setAddress(String Address) {
		this.address = Address;
	}
	
	private Integer orderingState;
	public Integer getOrderingState() {
		return orderingState;
	}
	public void setOrderingState(Integer OrderingState) {
		this.orderingState = OrderingState;
	}
	
	private Date endTime;
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date EndTime) {
		this.endTime = EndTime;
	}
	
	private String priceSum;
	public String getPriceSum() {
		return priceSum;
	}
	public void setPriceSum(String PriceSum) {
		this.priceSum = PriceSum;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ordering other = (Ordering) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
