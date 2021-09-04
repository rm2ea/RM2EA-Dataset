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
public class ManageService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean arbitration(Integer tbId,Integer departmentid) throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		TbRepairExtra tbRepairExtra = (TbRepairExtra)GetData(DM.getTbRepairExtraDao().findById(tbId));
		Department dp = (Department)GetData(DM.getDepartmentDao().findById(departmentid));
		Role role = (Role)GetData(DM.getRoleDao().findById(1));
		
		if(StandardOPs.oclIsUndefined(currentUser).equals(false) && StandardOPs.oclIsUndefined(tbRepairExtra).equals(false) && tbRepairExtra.getRelayNum() > 3 && StandardOPs.oclIsUndefined(dp).equals(false) && currentUser.getBelongedRole().equals(role))
		{
			tbRepairExtra.setArbitrate(true);
			tbRepairExtra.setBelongedAssignDepart(dp);
			DM.getTbRepairExtraDao().save(tbRepairExtra);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean approval(Integer tbId,Boolean isApproved) throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		TbRepair tbRepair = (TbRepair)GetData(DM.getTbRepairDao().findById(tbId));
		TbRepairExtra tre = (TbRepairExtra)GetData(DM.getTbRepairExtraDao().findById(tbId));
		Role role = (Role)GetData(DM.getRoleDao().findById(1));
		
		if(StandardOPs.oclIsUndefined(currentUser).equals(false) && currentUser.getBelongedRole().equals(role) && StandardOPs.oclIsUndefined(tbRepair).equals(false) && StandardOPs.oclIsUndefined(tre).equals(false) && tbRepair.getPlace().equals("候机楼"))
		{
			if(isApproved.equals(true)){
				tre.setIsReject(false);
			tre.setAdmin(true);
			DM.getTbRepairExtraDao().save(tre);
			return true;
			
			}else{
				tre.setIsReject(true);
			tre.setAdmin(false);
			DM.getTbRepairExtraDao().save(tre);
			return true;
			
			}
			
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
