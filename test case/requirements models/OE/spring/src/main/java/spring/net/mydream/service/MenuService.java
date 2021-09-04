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
public class MenuService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public List<Menu> getUserMenu(Integer userId,Integer menuType) throws PreconditionException{
		User user = (User)GetData(DM.getUserDao().findById(userId));
		List<Menu> ms = new ArrayList<Menu>();
		
		if(StandardOPs.oclIsUndefined(ms).equals(false))
		{
			return ms;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Menu> toMenuTree(List ms,Integer parentId) throws PreconditionException{
		List<Menu> ms2 = new ArrayList<Menu>();
		
		if(StandardOPs.oclIsUndefined(ms).equals(false) && StandardOPs.oclIsUndefined(parentId).equals(false))
		{
			return ms;
			
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
