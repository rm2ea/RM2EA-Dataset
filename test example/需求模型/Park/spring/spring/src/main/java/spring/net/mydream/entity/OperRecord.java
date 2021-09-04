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
public class OperRecord implements Serializable {
	
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
	
	private String model;
	public String getModel() {
		return model;
	}
	public void setModel(String Model) {
		this.model = Model;
	}
	
	private String description;
	public String getDescription() {
		return description;
	}
	public void setDescription(String Description) {
		this.description = Description;
	}
	
	private String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String Url) {
		this.url = Url;
	}
	
	private String requestMethod;
	public String getRequestMethod() {
		return requestMethod;
	}
	public void setRequestMethod(String RequestMethod) {
		this.requestMethod = RequestMethod;
	}
	
	private String operMethod;
	public String getOperMethod() {
		return operMethod;
	}
	public void setOperMethod(String OperMethod) {
		this.operMethod = OperMethod;
	}
	
	private String param;
	public String getParam() {
		return param;
	}
	public void setParam(String Param) {
		this.param = Param;
	}
	
	private String resultS;
	public String getResultS() {
		return resultS;
	}
	public void setResultS(String ResultS) {
		this.resultS = ResultS;
	}
	
	private String ip;
	public String getIp() {
		return ip;
	}
	public void setIp(String Ip) {
		this.ip = Ip;
	}
	
	private String spendTime;
	public String getSpendTime() {
		return spendTime;
	}
	public void setSpendTime(String SpendTime) {
		this.spendTime = SpendTime;
	}
	
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String State) {
		this.state = State;
	}
	
	private String comments;
	public String getComments() {
		return comments;
	}
	public void setComments(String Comments) {
		this.comments = Comments;
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
		OperRecord other = (OperRecord) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
