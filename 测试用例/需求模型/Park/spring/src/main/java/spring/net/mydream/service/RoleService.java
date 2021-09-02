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
public class RoleService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public List<SysMenu> selectByUser(Integer id) throws PreconditionException{
		SysMenu sm = (SysMenu)GetData(DM.getSysMenuDao().findById(id));
		
		if(true)
		{
			return DM.getSysMenuDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public SysMenu getMenuByRole(Integer roleId) throws PreconditionException{
		SysRole role = (SysRole)GetData(DM.getSysRoleDao().findById(roleId));
		SysMenu sm = DM.getSysMenuDao().findByBelongedRole(role);
		
		if(StandardOPs.oclIsUndefined(sm).equals(false))
		{
			return sm;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean saveMenuByRole(Integer roleId) throws PreconditionException{
		SysRole role = (SysRole)GetData(DM.getSysRoleDao().findById(roleId));
		
		if(StandardOPs.oclIsUndefined(role).equals(false))
		{
			SysMenu sm = new SysMenu();
			sm.setBelongedRole(role);
			DM.getSysMenuDao().save(sm);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public SysOrg getOrgByRole(Integer roleId) throws PreconditionException{
		SysRole role = (SysRole)GetData(DM.getSysRoleDao().findById(roleId));
		SysOrg so = DM.getSysOrgDao().findByBelongedRole(role);
		
		if(StandardOPs.oclIsUndefined(so).equals(false))
		{
			return so;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean saveOrgByRole(Integer roleId) throws PreconditionException{
		SysRole role = (SysRole)GetData(DM.getSysRoleDao().findById(roleId));
		
		if(StandardOPs.oclIsUndefined(role).equals(false))
		{
			SysOrg so = new SysOrg();
			so.setBelongedRole(role);
			DM.getSysOrgDao().save(so);
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
