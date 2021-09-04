package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class WorkReportSubmitMessage{
	public String name;
	public String getName() {
		return name;
	}
					
	public void setName(String name) {
		this.name = name;
	}
	public String content;
	public String getContent() {
		return content;
	}
					
	public void setContent(String content) {
		this.content = content;
	}
	public String section;
	public String getSection() {
		return section;
	}
					
	public void setSection(String section) {
		this.section = section;
	}
	public String remark;
	public String getRemark() {
		return remark;
	}
					
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
