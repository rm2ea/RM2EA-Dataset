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

	public User getFullById(Integer userId) throws PreconditionException{
		User user = (User)GetData(DM.getUserDao().findById(userId));
		
		if(StandardOPs.oclIsUndefined(user).equals(false))
		{
			return user;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public User selectRoleAndAuth(Integer userId) throws PreconditionException{
		User user = (User)GetData(DM.getUserDao().findById(userId));
		List<String> auths = new ArrayList<String>();
		List<Menu> menus = new ArrayList<Menu>();
		
		if(StandardOPs.oclIsUndefined(menus).equals(false))
		{
			return user;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Integer> getRoleIds(Integer userid) throws PreconditionException{
		User user = (User)GetData(DM.getUserDao().findById(userid));
		List<Integer> rolds = new ArrayList<Integer>();
		Integer id = 0;
		
		if(StandardOPs.oclIsUndefined(user).equals(false))
		{
			for(Role role : user.getUsertoRole()){
				
			}return rolds;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public User getByUsername(String username) throws PreconditionException{
		User user = DM.getUserDao().findByUsername(username);
		
		if(StandardOPs.oclIsUndefined(user).equals(false))
		{
			return user;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean freezeA(Integer id,Integer state) throws PreconditionException{
		
		if(StandardOPs.oclIsUndefined(id).equals(false) && StandardOPs.oclIsUndefined(state).equals(false) && state != 1)
		{
			User user = new User();
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
			User u = new User();
			u.setId(id);
			u.setPassword(newpwd);
			DM.getUserDao().save(u);
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
