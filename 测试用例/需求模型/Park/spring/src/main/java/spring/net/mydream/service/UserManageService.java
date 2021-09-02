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
public class UserManageService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean updateInfo(Integer id,String name) throws PreconditionException{
		SysUser user = (SysUser)GetData(DM.getSysUserDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(user).equals(false))
		{
			user.setId(id);
			user.setUsername(name);
			DM.getSysUserDao().save(user);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public SysUser info(Integer id) throws PreconditionException{
		SysUser u = (SysUser)GetData(DM.getSysUserDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(u).equals(true))
		{
			return u;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean updatePwd(Integer id,String pwd) throws PreconditionException{
		SysUser user = (SysUser)GetData(DM.getSysUserDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(user).equals(false))
		{
			user.setId(id);
			user.setPassword(pwd);
			DM.getSysUserDao().save(user);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<SysUser> listUserByRole(Integer roleId) throws PreconditionException{
		SysRole role = (SysRole)GetData(DM.getSysRoleDao().findById(roleId));
		List<SysUser> sus = new ArrayList<SysUser>();
		
		if(StandardOPs.oclIsUndefined(sus).equals(false))
		{
			return sus;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<String> listUserRoles(Integer userid) throws PreconditionException{
		SysUser su = (SysUser)GetData(DM.getSysUserDao().findById(userid));
		List<String> ss = new ArrayList<String>();
		List<SysRole> roles = new ArrayList<SysRole>();
		String s = null;
		
		if(StandardOPs.oclIsUndefined(su).equals(false))
		{
			return ss;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean listUserPerms() throws PreconditionException{
		
		if(true)
		{
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
