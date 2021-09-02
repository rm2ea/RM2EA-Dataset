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
public class ParkManageService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public CarParkManage selectPM(Integer id,Integer org_id) throws PreconditionException{
		CarParkManage cpm = DM.getCarParkManageDao().findByIdAndOrgId(id,org_id);
		
		if(StandardOPs.oclIsUndefined(cpm).equals(false))
		{
			return cpm;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<CarParkManage> listPM() throws PreconditionException{
		
		if(true)
		{
			return DM.getCarParkManageDao().findAll();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean savePM(CarParkManage entity) throws PreconditionException{
		
		if(StandardOPs.oclIsUndefined(entity).equals(false))
		{
			DM.getCarParkManageDao().save(entity);
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
