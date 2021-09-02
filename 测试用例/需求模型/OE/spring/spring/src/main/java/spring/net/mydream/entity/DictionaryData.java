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
public class DictionaryData implements Serializable {
	
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
	private Integer dictId;
	public Integer getDictId() {
		return dictId;
	}
	public void setDictId(Integer DictId) {
		this.dictId = DictId;
	}
	
	private String dictDataCode;
	public String getDictDataCode() {
		return dictDataCode;
	}
	public void setDictDataCode(String DictDataCode) {
		this.dictDataCode = DictDataCode;
	}
	
	private String dictDataName;
	public String getDictDataName() {
		return dictDataName;
	}
	public void setDictDataName(String DictDataName) {
		this.dictDataName = DictDataName;
	}
	
	private Integer sortNumber;
	public Integer getSortNumber() {
		return sortNumber;
	}
	public void setSortNumber(Integer SortNumber) {
		this.sortNumber = SortNumber;
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
		DictionaryData other = (DictionaryData) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
