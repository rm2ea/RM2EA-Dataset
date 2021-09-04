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
public class EatSystem{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createOrdering(Integer id) throws PreconditionException{
		Ordering ordering = (Ordering)GetData(DM.getOrderingDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(ordering).equals(true))
		{
			Ordering o = new Ordering();
			o.setId(id);
			DM.getOrderingDao().save(o);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Ordering queryOrdering(Integer id) throws PreconditionException{
		Ordering ordering = (Ordering)GetData(DM.getOrderingDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(ordering).equals(false))
		{
			return ordering;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyOrdering(Integer id,String address) throws PreconditionException{
		Ordering ordering = (Ordering)GetData(DM.getOrderingDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(ordering).equals(false))
		{
			ordering.setId(id);
			ordering.setAddress(address);
			DM.getOrderingDao().save(ordering);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteOrdering(Integer id) throws PreconditionException{
		Ordering ordering = (Ordering)GetData(DM.getOrderingDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(ordering).equals(false))
		{
			DM.getOrderingDao().delete(ordering);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createStore(Integer id) throws PreconditionException{
		Store store = (Store)GetData(DM.getStoreDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(store).equals(true))
		{
			Store s = new Store();
			s.setId(id);
			DM.getStoreDao().save(s);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Store queryStore(Integer id) throws PreconditionException{
		Store store = (Store)GetData(DM.getStoreDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(store).equals(false))
		{
			return store;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyStore(Integer id,String address,String name) throws PreconditionException{
		Store store = (Store)GetData(DM.getStoreDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(store).equals(false))
		{
			store.setId(id);
			store.setAddress(address);
			store.setName(name);
			DM.getStoreDao().save(store);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteStore(Integer id) throws PreconditionException{
		Store store = (Store)GetData(DM.getStoreDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(store).equals(false))
		{
			DM.getStoreDao().delete(store);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createDishes(Integer id) throws PreconditionException{
		Dishes dishes = (Dishes)GetData(DM.getDishesDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dishes).equals(true))
		{
			Dishes d = new Dishes();
			d.setId(id);
			DM.getDishesDao().save(d);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Dishes queryDishes(Integer id) throws PreconditionException{
		Dishes dishes = (Dishes)GetData(DM.getDishesDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dishes).equals(false))
		{
			return dishes;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyDishes(Integer id,String name) throws PreconditionException{
		Dishes dishes = (Dishes)GetData(DM.getDishesDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dishes).equals(false))
		{
			dishes.setId(id);
			dishes.setName(name);
			DM.getDishesDao().save(dishes);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteDishes(Integer id) throws PreconditionException{
		Dishes dishes = (Dishes)GetData(DM.getDishesDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dishes).equals(false))
		{
			DM.getDishesDao().delete(dishes);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createCustomer(Integer id) throws PreconditionException{
		Customer customer = (Customer)GetData(DM.getCustomerDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(customer).equals(true))
		{
			Customer c = new Customer();
			c.setId(id);
			DM.getCustomerDao().save(c);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Customer queryCustomer(Integer id) throws PreconditionException{
		Customer customer = (Customer)GetData(DM.getCustomerDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(customer).equals(false))
		{
			return customer;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyCustomer(Integer id,String address) throws PreconditionException{
		Customer customer = (Customer)GetData(DM.getCustomerDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(customer).equals(false))
		{
			customer.setId(id);
			customer.setAddress(address);
			DM.getCustomerDao().save(customer);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteCustomer(Integer id) throws PreconditionException{
		Customer customer = (Customer)GetData(DM.getCustomerDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(customer).equals(false))
		{
			DM.getCustomerDao().delete(customer);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createEvaluation(Integer id) throws PreconditionException{
		Evaluation evaluation = (Evaluation)GetData(DM.getEvaluationDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(evaluation).equals(true))
		{
			Evaluation e = new Evaluation();
			e.setId(id);
			DM.getEvaluationDao().save(e);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Evaluation queryEvaluation(Integer id) throws PreconditionException{
		Evaluation evaluation = (Evaluation)GetData(DM.getEvaluationDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(evaluation).equals(false))
		{
			return evaluation;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyEvaluation(Integer id,String anonymity) throws PreconditionException{
		Evaluation evaluation = (Evaluation)GetData(DM.getEvaluationDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(evaluation).equals(false))
		{
			evaluation.setId(id);
			evaluation.setAnonymity(anonymity);
			DM.getEvaluationDao().save(evaluation);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteEvaluation(Integer id) throws PreconditionException{
		Evaluation evaluation = (Evaluation)GetData(DM.getEvaluationDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(evaluation).equals(false))
		{
			DM.getEvaluationDao().delete(evaluation);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createOrderingDishes(Integer id) throws PreconditionException{
		OrderingDishes orderingdishes = (OrderingDishes)GetData(DM.getOrderingDishesDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(orderingdishes).equals(true))
		{
			OrderingDishes o = new OrderingDishes();
			o.setId(id);
			DM.getOrderingDishesDao().save(o);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public OrderingDishes queryOrderingDishes(Integer id) throws PreconditionException{
		OrderingDishes orderingdishes = (OrderingDishes)GetData(DM.getOrderingDishesDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(orderingdishes).equals(false))
		{
			return orderingdishes;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyOrderingDishes(Integer id,String dishesName) throws PreconditionException{
		OrderingDishes orderingdishes = (OrderingDishes)GetData(DM.getOrderingDishesDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(orderingdishes).equals(false))
		{
			orderingdishes.setId(id);
			orderingdishes.setDishesName(dishesName);
			DM.getOrderingDishesDao().save(orderingdishes);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteOrderingDishes(Integer id) throws PreconditionException{
		OrderingDishes orderingdishes = (OrderingDishes)GetData(DM.getOrderingDishesDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(orderingdishes).equals(false))
		{
			DM.getOrderingDishesDao().delete(orderingdishes);
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
