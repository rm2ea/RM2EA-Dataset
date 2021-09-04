package spring.net.mydream.service;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.net.mydream.entity.*;
import spring.net.mydream.utils.DaoManage;
import spring.net.mydream.utils.PreconditionException;
import spring.net.mydream.utils.ServiceManage;
import spring.net.mydream.utils.StandardOPs;
import spring.net.mydream.redis.CurrentUtils;

@Service
public class RoutineService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean userLogin(String name,String password) throws PreconditionException{
		User user = DM.getUserDao().findByNameAndPassword(name,password);
		
		if(StandardOPs.oclIsUndefined(user).equals(false))
		{
			currentUtils.setAttribute("currentUser" , user.getId()+"",user);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean workReportSubmit(String name,String content,String section,String remark) throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		
		if(StandardOPs.oclIsUndefined(currentUser).equals(false))
		{
			WorkReport wr = new WorkReport();
			wr.setName(name);
			wr.setTime(new Date());
			wr.setContent(content);
			DM.getWorkReportDao().save(wr);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				
	public static Object GetData(Optional<?> op) {
		if (op.isPresent())
			return op.get();
		else 
			return null;
	}
}
