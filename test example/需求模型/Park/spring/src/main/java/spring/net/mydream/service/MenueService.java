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
public class MenueService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public SysUser getByUser(String username) throws PreconditionException{
		SysUser su = DM.getSysUserDao().findByUsername(username);
		
		if(StandardOPs.oclIsUndefined(su).equals(false))
		{
			return su;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean drop(Integer id,Integer parentId,Integer menuId) throws PreconditionException{
		SysMenu sm = (SysMenu)GetData(DM.getSysMenuDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(sm).equals(false) && StandardOPs.oclIsUndefined(parentId).equals(false) && StandardOPs.oclIsUndefined(menuId).equals(false))
		{
			sm.setParentId(parentId);
			sm.setId(menuId);
			DM.getSysMenuDao().save(sm);
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
