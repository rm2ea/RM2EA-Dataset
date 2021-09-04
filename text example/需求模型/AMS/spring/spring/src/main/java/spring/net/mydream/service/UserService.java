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
public class UserService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

//	public Boolean selectRoleAndAuth() throws PreconditionException{
//		
//		if(true)
//		{
//			;
//		}else{
//		
//		 	 throw new PreconditionException();
//		
//		}
//		
//	}
//	public Boolean getFullById() throws PreconditionException{
//		
//		if(true)
//		{
//			;
//		}else{
//		
//		 	 throw new PreconditionException();
//		
//		}
//		
//	}
//	public Boolean getRoleIds() throws PreconditionException{
//		
//		if(true)
//		{
//			;
//		}else{
//		
//		 	 throw new PreconditionException();
//		
//		}
//		
//	}
//	public Boolean getByUsername() throws PreconditionException{
//		
//		if(true)
//		{
//			;
//		}else{
//		
//		 	 throw new PreconditionException();
//		
//		}
//		
//	}
	
	public Boolean addUser(String username,String pwd) throws PreconditionException{

		
		if(true)
		{
			User user = new User();
			user.setState(0);
			user.setUsername(username);
			user.setPassword(pwd);
			DM.getUserDao().save(user);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean freezeA(Integer id,Integer state) throws PreconditionException{
		User user = (User)GetData(DM.getUserDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(user).equals(false) && StandardOPs.oclIsUndefined(state).equals(false))
		{
			user.setId(id);
			user.setState(state);
			DM.getUserDao().save(user);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean resetPsw(Integer id,String newpwd,String oldpwd) throws PreconditionException{
		User user = (User)GetData(DM.getUserDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(id).equals(false) && user.getPassword().equals(oldpwd))
		{
			user.setId(id);
			user.setPassword(newpwd);
			DM.getUserDao().save(user);
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
