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
public class OrderService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Ordering selectOne(Integer id) throws PreconditionException{
		Ordering o = (Ordering)GetData(DM.getOrderingDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(o).equals(false))
		{
			return o;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean submitOrdering(Integer storeId,Integer customerid,Integer dishesid) throws PreconditionException{
		Customer c = (Customer)GetData(DM.getCustomerDao().findById(customerid));
		Integer dishesNum = 0;
		Double dishesPrice = 0.0;
		Double priceSum = 0.0;
		
		if(StandardOPs.oclIsUndefined(c).equals(false))
		{
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deliveryConfirmine(Integer customerId) throws PreconditionException{
		Ordering o = (Ordering)GetData(DM.getOrderingDao().findById(customerId));
		
		if(StandardOPs.oclIsUndefined(o).equals(false))
		{
			o.setEndTime(new Date());
			o.setOrderingState(2);
			DM.getOrderingDao().save(o);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean toOrderingCheck() throws PreconditionException{
		
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
