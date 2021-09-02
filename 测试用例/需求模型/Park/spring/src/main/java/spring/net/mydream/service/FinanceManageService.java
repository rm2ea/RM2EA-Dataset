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
public class FinanceManageService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean exportDataOM(String orgId,String parkManageId) throws PreconditionException{
		
		if(true)
		{
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Order_S> listOM(Order_S order) throws PreconditionException{
		
		if(true)
		{
			return DM.getOrder_SDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean saveOM(Integer id) throws PreconditionException{
		Order_S o = (Order_S)GetData(DM.getOrder_SDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(o).equals(true))
		{
			DM.getOrder_SDao().save(o);
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
