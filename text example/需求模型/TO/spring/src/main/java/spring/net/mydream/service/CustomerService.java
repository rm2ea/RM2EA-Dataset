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
public class CustomerService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Customer getByPhone(String phone) throws PreconditionException{
		Customer customer = DM.getCustomerDao().findByPhone(phone);
		
		if(StandardOPs.oclIsUndefined(customer).equals(false))
		{
			return customer;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Customer getByName(String name) throws PreconditionException{
		Customer customer = DM.getCustomerDao().findByName(name);
		
		if(StandardOPs.oclIsUndefined(customer).equals(false))
		{
			return customer;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean loginByPhone(String phone,String password) throws PreconditionException{
		Customer customer = DM.getCustomerDao().findByPhoneAndPassword(phone,password);
		
		if(StandardOPs.oclIsUndefined(customer).equals(false))
		{
			currentUtils.setAttribute("currentCustomer" , customer.getId()+"",customer);
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
