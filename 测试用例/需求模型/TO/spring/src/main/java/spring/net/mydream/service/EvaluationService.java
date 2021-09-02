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
public class EvaluationService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public List<Evaluation> toEvaluationCheck() throws PreconditionException{
		Customer currentCustomer=(Customer)currentUtils.getAttribute("currentCustomer");
		Integer aid = 0;
		
		if(StandardOPs.oclIsUndefined(currentCustomer).equals(false))
		{
			return DM.getEvaluationDao().findByCustomerId(aid);
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean submitEvaluation2(Integer orderingId,Integer uid,String evluation) throws PreconditionException{
		Customer currentCustomer=(Customer)currentUtils.getAttribute("currentCustomer");
		Ordering o = (Ordering)GetData(DM.getOrderingDao().findById(orderingId));
		Customer customer = (Customer)GetData(DM.getCustomerDao().findById(uid));
		
		if(StandardOPs.oclIsUndefined(customer).equals(false) && StandardOPs.oclIsUndefined(o).equals(false) && StandardOPs.oclIsUndefined(evluation).equals(false))
		{
			Evaluation e = new Evaluation();
			e.setCustomerId(currentCustomer.getId());
			e.setCustomerImage(currentCustomer.getImage());
			e.setCustomerName(currentCustomer.getName());
			e.setEvaluation(evluation);
			e.setTimeDate(new Date());
			o.setOrderingState(3);
			DM.getEvaluationDao().save(e);
			DM.getOrderingDao().save(o);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Ordering toEvaluateOrdering(Integer orderingId) throws PreconditionException{
		Ordering o = (Ordering)GetData(DM.getOrderingDao().findById(orderingId));
		
		if(StandardOPs.oclIsUndefined(o).equals(false))
		{
			return o;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Store toEvaluateStore(Integer orderingId) throws PreconditionException{
		Store store = (Store)GetData(DM.getStoreDao().findById(orderingId));
		
		if(StandardOPs.oclIsUndefined(store).equals(false))
		{
			return store;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean submitEvaluation1() throws PreconditionException{
		
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
