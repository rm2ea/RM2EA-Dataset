package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ScoringMessage{
	public Integer tbid;
	public Integer getTbid() {
		return tbid;
	}
					
	public void setTbid(Integer tbid) {
		this.tbid = tbid;
	}
	public Integer score;
	public Integer getScore() {
		return score;
	}
					
	public void setScore(Integer score) {
		this.score = score;
	}
	public String remark;
	public String getRemark() {
		return remark;
	}
					
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
