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
public class ParkSystem{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createUser(Integer id) throws PreconditionException{
		SysUser user = (SysUser)GetData(DM.getSysUserDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(user).equals(true))
		{
			SysUser u = new SysUser();
			u.setId(id);
			DM.getSysUserDao().save(u);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public SysUser queryUser(Integer id) throws PreconditionException{
		SysUser user = (SysUser)GetData(DM.getSysUserDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(user).equals(false))
		{
			return user;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyUser(Integer id,String name) throws PreconditionException{
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
	public Boolean deleteUser(Integer id) throws PreconditionException{
		SysUser user = (SysUser)GetData(DM.getSysUserDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(user).equals(false))
		{
			DM.getSysUserDao().delete(user);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createSysMenu(Integer id) throws PreconditionException{
		SysMenu menu = (SysMenu)GetData(DM.getSysMenuDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(menu).equals(true))
		{
			SysMenu m = new SysMenu();
			m.setId(id);
			DM.getSysMenuDao().save(m);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public SysMenu querySysMenu(Integer id) throws PreconditionException{
		SysMenu menu = (SysMenu)GetData(DM.getSysMenuDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(menu).equals(false))
		{
			return menu;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifySysMenu(Integer id,String name) throws PreconditionException{
		SysMenu menu = (SysMenu)GetData(DM.getSysMenuDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(menu).equals(false))
		{
			menu.setId(id);
			menu.setName(name);
			DM.getSysMenuDao().save(menu);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteSysMenu(Integer id) throws PreconditionException{
		SysMenu menu = (SysMenu)GetData(DM.getSysMenuDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(menu).equals(false))
		{
			DM.getSysMenuDao().delete(menu);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createSysOrg(Integer id) throws PreconditionException{
		SysOrg org = (SysOrg)GetData(DM.getSysOrgDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(org).equals(true))
		{
			SysOrg o = new SysOrg();
			o.setId(id);
			DM.getSysOrgDao().save(o);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public SysOrg querySysOrg(Integer id) throws PreconditionException{
		SysOrg org = (SysOrg)GetData(DM.getSysOrgDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(org).equals(false))
		{
			return org;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifySysOrg(Integer id,String name) throws PreconditionException{
		SysOrg org = (SysOrg)GetData(DM.getSysOrgDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(org).equals(false))
		{
			org.setId(id);
			org.setName(name);
			DM.getSysOrgDao().save(org);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteSysOrg(Integer id) throws PreconditionException{
		SysOrg org = (SysOrg)GetData(DM.getSysOrgDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(org).equals(false))
		{
			DM.getSysOrgDao().delete(org);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createSysRole(Integer id) throws PreconditionException{
		SysRole role = (SysRole)GetData(DM.getSysRoleDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(role).equals(true))
		{
			SysRole r = new SysRole();
			r.setId(id);
			DM.getSysRoleDao().save(r);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public SysRole querySysRole(Integer id) throws PreconditionException{
		SysRole role = (SysRole)GetData(DM.getSysRoleDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(role).equals(false))
		{
			return role;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifySysRole(Integer id,String name) throws PreconditionException{
		SysRole role = (SysRole)GetData(DM.getSysRoleDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(role).equals(false))
		{
			role.setId(id);
			DM.getSysRoleDao().save(role);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteSysRole(Integer id) throws PreconditionException{
		SysRole role = (SysRole)GetData(DM.getSysRoleDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(role).equals(false))
		{
			DM.getSysRoleDao().delete(role);
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
