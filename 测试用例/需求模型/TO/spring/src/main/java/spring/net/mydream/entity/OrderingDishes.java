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
public class OrderingDishes implements Serializable {
	
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
	private Integer orderingId;
	public Integer getOrderingId() {
		return orderingId;
	}
	public void setOrderingId(Integer OrderingId) {
		this.orderingId = OrderingId;
	}
	
	private Integer dishesId;
	public Integer getDishesId() {
		return dishesId;
	}
	public void setDishesId(Integer DishesId) {
		this.dishesId = DishesId;
	}
	
	private String dishesName;
	public String getDishesName() {
		return dishesName;
	}
	public void setDishesName(String DishesName) {
		this.dishesName = DishesName;
	}
	
	private Integer dishesCount;
	public Integer getDishesCount() {
		return dishesCount;
	}
	public void setDishesCount(Integer DishesCount) {
		this.dishesCount = DishesCount;
	}
	
	private Integer dishesPrice;
	public Integer getDishesPrice() {
		return dishesPrice;
	}
	public void setDishesPrice(Integer DishesPrice) {
		this.dishesPrice = DishesPrice;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderingDishes other = (OrderingDishes) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
