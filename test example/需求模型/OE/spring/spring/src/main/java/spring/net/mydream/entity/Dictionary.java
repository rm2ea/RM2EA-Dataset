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
public class Dictionary implements Serializable {
	
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
	private String dictcode;
	public String getDictcode() {
		return dictcode;
	}
	public void setDictcode(String Dictcode) {
		this.dictcode = Dictcode;
	}
	
	private String dictname;
	public String getDictname() {
		return dictname;
	}
	public void setDictname(String Dictname) {
		this.dictname = Dictname;
	}
	
	private String sortnumber;
	public String getSortnumber() {
		return sortnumber;
	}
	public void setSortnumber(String Sortnumber) {
		this.sortnumber = Sortnumber;
	}
	
	private String comments;
	public String getComments() {
		return comments;
	}
	public void setComments(String Comments) {
		this.comments = Comments;
	}
	
	private String createtime;
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String Createtime) {
		this.createtime = Createtime;
	}
	
	private String updatetime;
	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String Updatetime) {
		this.updatetime = Updatetime;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dictionary other = (Dictionary) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
