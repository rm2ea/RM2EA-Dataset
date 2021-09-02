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
public class ProcessingFees implements Serializable {
	
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
	private String projectName;
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String ProjectName) {
		this.projectName = ProjectName;
	}
	
	private Double price;
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double Price) {
		this.price = Price;
	}
	
	private Integer number;
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer Number) {
		this.number = Number;
	}
	
	private Double totalPrice;
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double TotalPrice) {
		this.totalPrice = TotalPrice;
	}
	
	private String remake;
	public String getRemake() {
		return remake;
	}
	public void setRemake(String Remake) {
		this.remake = Remake;
	}
	
		
	
	@ManyToOne(targetEntity=TbRepair.class)
	@JoinColumn(name="belongedtbrepair_id",referencedColumnName="id")
	private TbRepair belongedTbRepair;
			
	public TbRepair getBelongedTbRepair() {
		return belongedTbRepair;
	}
			
	public void setBelongedTbRepair(TbRepair BelongedTbRepair) {
		this.belongedTbRepair = BelongedTbRepair;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProcessingFees other = (ProcessingFees) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
