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
public class UserTwoService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public String encodePsw(String psw) throws PreconditionException{
		
		if(StandardOPs.oclIsUndefined(psw).equals(false))
		{
			return psw;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean comparePsw(String dbPsw,String inputPsw) throws PreconditionException{
		
		if(dbPsw.equals(inputPsw))
		{
			if(dbPsw.equals(inputPsw)){
				return true;
			
			}else{
				return false;
			
			}
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public UserTwo getByUserTwoname(String usertwoname) throws PreconditionException{
		UserTwo ut = DM.getUserTwoDao().findByUsername(usertwoname);
		
		if(StandardOPs.oclIsUndefined(ut).equals(false))
		{
			return ut;
			
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
