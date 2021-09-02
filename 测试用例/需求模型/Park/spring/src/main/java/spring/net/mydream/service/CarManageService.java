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
public class CarManageService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean saveCM(String description,String name,Integer org_id,Integer park_manage_id) throws PreconditionException{
		
		if(StandardOPs.oclIsUndefined(name).equals(false) && StandardOPs.oclIsUndefined(org_id).equals(false) && StandardOPs.oclIsUndefined(park_manage_id).equals(false))
		{
			CarManage entity = new CarManage();
			entity.setName(name);
			entity.setParkManageId(park_manage_id);
			entity.setOrgId(org_id);
			DM.getCarManageDao().save(entity);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<CarManage> listCM(String description,String name,Integer org_id,Integer park_manage_id) throws PreconditionException{
		List<CarManage> cms = new ArrayList<CarManage>();
		
		if(StandardOPs.oclIsUndefined(cms).equals(false))
		{
			return cms;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean renewCM(Integer oId,Integer carId,Integer userid) throws PreconditionException{
		SysUser user = (SysUser)GetData(DM.getSysUserDao().findById(userid));
		Order_S o = (Order_S)GetData(DM.getOrder_SDao().findById(oId));
		CarManage cm = (CarManage)GetData(DM.getCarManageDao().findById(carId));
		
		if(StandardOPs.oclIsUndefined(user).equals(false) && StandardOPs.oclIsUndefined(cm).equals(false))
		{
			o.setOrgId(user.getOrgId());
			o.setUserCreate(user.getId());
			o.setBody("车位续租");
			o.setStatus(1);
			DM.getOrder_SDao().save(o);
			cm.setValidityTime(new Date());
			DM.getCarManageDao().save(cm);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public CarManage getByPlateNumberCM(String plateNumber,Integer parkManageId) throws PreconditionException{
		CarManage cm = DM.getCarManageDao().findByPlateNumberAndParkManageId(plateNumber,parkManageId);
		
		if(StandardOPs.oclIsUndefined(cm).equals(false))
		{
			return cm;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean exportDataCM(Double orgId,Double parkManageId) throws PreconditionException{
		
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
