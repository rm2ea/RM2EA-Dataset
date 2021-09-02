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
public class PayManageService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public AppPayConfig getByCarParkId(Integer id) throws PreconditionException{
		AppPayConfig apc = (AppPayConfig)GetData(DM.getAppPayConfigDao().findById(id));
		
		if(true)
		{
			return apc;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteP(Integer id) throws PreconditionException{
		AppPayConfig apf = (AppPayConfig)GetData(DM.getAppPayConfigDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(apf).equals(false))
		{
			DM.getAppPayConfigDao().delete(apf);
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
