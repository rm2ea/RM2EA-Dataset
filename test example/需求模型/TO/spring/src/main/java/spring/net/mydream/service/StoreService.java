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
public class StoreService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public List<Store> search(String name) throws PreconditionException{
		
		if(StandardOPs.oclIsUndefined(name).equals(false))
		{
			return DM.getStoreDao().findByNameLike(name);
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Store> suggestByStr(String str) throws PreconditionException{
		
		if(StandardOPs.oclIsUndefined(str).equals(false))
		{
			if(StandardOPs.oclIsUndefined(str).equals(false)){
				return null;
			
			}else{
				return DM.getStoreDao().findByNameLike(str);
			
			}
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Evaluation> enterStoreBystoreId(Integer storeId) throws PreconditionException{
		
		if(true)
		{
			return DM.getEvaluationDao().findByStoreId(storeId);
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Dishes> enterStoreBystoreId2(Integer storeId) throws PreconditionException{
		
		if(true)
		{
			return DM.getDishesDao().findByStoreId(storeId);
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<Store> toStreet() throws PreconditionException{
		
		if(true)
		{
			return DM.getStoreDao().findAll();
			
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
