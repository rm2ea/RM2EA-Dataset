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
public class MaintainService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean receiveTb(Integer tbId) throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		TbRepairExtra tre = (TbRepairExtra)GetData(DM.getTbRepairExtraDao().findById(tbId));
		Role role = (Role)GetData(DM.getRoleDao().findById(3));
		
		if(StandardOPs.oclIsUndefined(currentUser).equals(false) && StandardOPs.oclIsUndefined(tre).equals(false) && currentUser.getBelongedRole().equals(role))
		{
			tre.setIsAccept(true);
			tre.getBelongedTbRepair().setStatus(1);
			DM.getTbRepairExtraDao().save(tre);
			DM.getTbRepairDao().save(tre.getBelongedTbRepair());
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean completeTb(Integer tbId,String cause,String resolvent) throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		TbRepairExtra tre = (TbRepairExtra)GetData(DM.getTbRepairExtraDao().findById(tbId));
		Role role = (Role)GetData(DM.getRoleDao().findById(3));
		
		if(StandardOPs.oclIsUndefined(currentUser).equals(false) && StandardOPs.oclIsUndefined(tre).equals(false) && currentUser.getBelongedRole().equals(role))
		{
			tre.setIsComplete(true);
			tre.setCause(cause);
			tre.setResolvent(resolvent);
			tre.getBelongedTbRepair().setStatus(2);
			DM.getTbRepairExtraDao().save(tre);
			DM.getTbRepairDao().save(tre.getBelongedTbRepair());
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean rocessingFees(Integer tbId,String projectName,Double price,Integer number,String remake) throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		TbRepairExtra tre = (TbRepairExtra)GetData(DM.getTbRepairExtraDao().findById(tbId));
		Role role = (Role)GetData(DM.getRoleDao().findById(3));
		
		if(StandardOPs.oclIsUndefined(currentUser).equals(false) && StandardOPs.oclIsUndefined(tre).equals(false) && currentUser.getBelongedRole().equals(role))
		{
			ProcessingFees pf = new ProcessingFees();
			pf.setProjectName(projectName);
			pf.setPrice(price);
			pf.setNumber(number);
			pf.setTotalPrice(price * number);
			pf.setRemake(remake);
			pf.setBelongedTbRepair(tre.getBelongedTbRepair());
			DM.getProcessingFeesDao().save(pf);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean setOperationStatus(String name,String value,String valueUnit,String status,String remark,Integer equipmentId) throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		TerminalEquipment te = (TerminalEquipment)GetData(DM.getTerminalEquipmentDao().findById(equipmentId));
		
		if(StandardOPs.oclIsUndefined(currentUser).equals(false) && StandardOPs.oclIsUndefined(name).equals(false) && StandardOPs.oclIsUndefined(value).equals(false) && StandardOPs.oclIsUndefined(valueUnit).equals(false) && StandardOPs.oclIsUndefined(te).equals(false))
		{
			OperationStatus os = new OperationStatus();
			os.setName(name);
			os.setValue(value);
			os.setValueUnit(valueUnit);
			os.setStatus(status);
			os.setRemark(remark);
			os.setTime(new Date());
			os.setBelongedEquipment(te);
			DM.getOperationStatusDao().save(os);
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
