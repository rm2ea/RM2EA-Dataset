package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class RocessingFeesMessage{
	public Integer tbId;
	public Integer getTbId() {
		return tbId;
	}
					
	public void setTbId(Integer tbId) {
		this.tbId = tbId;
	}
	public String projectName;
	public String getProjectName() {
		return projectName;
	}
					
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Double price;
	public Double getPrice() {
		return price;
	}
					
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer number;
	public Integer getNumber() {
		return number;
	}
					
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String remake;
	public String getRemake() {
		return remake;
	}
					
	public void setRemake(String remake) {
		this.remake = remake;
	}
}
