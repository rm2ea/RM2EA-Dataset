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
public class CarParkingRecordService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean saveCR(CarParkingRecord entity) throws PreconditionException{
		
		if(true)
		{
			if(StandardOPs.oclIsUndefined(entity.getId()).equals(false) && entity.getType() != 2){
				Order_S order = new Order_S();
			order.setOrgId(entity.getOrgId());
			order.setParkManageId(entity.getParkManageId());
			order.setBody("临时车辆");
			order.setStatus(0);
			DM.getOrder_SDao().save(order);
			DM.getCarParkingRecordDao().save(entity);
			return true;
			
			}else{
				DM.getCarParkingRecordDao().save(entity);
			return true;
			
			}
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<CarParkingRecord> listCR(String orgId,String parkManageId) throws PreconditionException{
		
		if(StandardOPs.oclIsUndefined(orgId).equals(false) && StandardOPs.oclIsUndefined(parkManageId).equals(false))
		{
			return DM.getCarParkingRecordDao().findByOrgIdAndParkManageId(orgId,parkManageId);
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public CarManage getByPlateNumberCR(Integer plate_number,Integer park_manage_id) throws PreconditionException{
		CarManage cm = DM.getCarManageDao().findByPlateNumberAndParkManageId(plate_number,park_manage_id);
		
		if(true)
		{
			return cm;
			
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
