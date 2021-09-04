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
public class HandleService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public List<TbRepairExtra> notAcceptBa() throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		Department depart1 = (Department)GetData(DM.getDepartmentDao().findById(1));
		Department depart2 = (Department)GetData(DM.getDepartmentDao().findById(2));
		Department depart3 = (Department)GetData(DM.getDepartmentDao().findById(3));
		Department depart4 = (Department)GetData(DM.getDepartmentDao().findById(4));
		
		if(StandardOPs.oclIsUndefined(currentUser).equals(false) && StandardOPs.oclIsUndefined(depart1).equals(false) && StandardOPs.oclIsUndefined(depart2).equals(false) && StandardOPs.oclIsUndefined(depart3).equals(false) && StandardOPs.oclIsUndefined(depart4).equals(false))
		{
			if(currentUser.getBelongedDepartment().equals(depart1)){
				return DM.getTbRepairExtraDao().findByIsAcceptAndAdminAndBelongedAssignDepart(false,true,depart1);
			
			}else{
				if(currentUser.getBelongedDepartment().equals(depart2)){
				return DM.getTbRepairExtraDao().findByIsAcceptAndAdminAndBelongedAssignDepart(false,true,depart2);
			
			}else{
				if(currentUser.getBelongedDepartment().equals(depart3)){
				return DM.getTbRepairExtraDao().findByIsAcceptAndAdminAndBelongedAssignDepart(false,true,depart3);
			
			}else{
				return DM.getTbRepairExtraDao().findByIsAcceptAndAdminAndBelongedAssignDepart(false,true,depart4);
			
			}
			
			}
			
			}
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<TbRepairExtra> acceptedBa() throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		Department depart1 = (Department)GetData(DM.getDepartmentDao().findById(1));
		Department depart2 = (Department)GetData(DM.getDepartmentDao().findById(2));
		Department depart3 = (Department)GetData(DM.getDepartmentDao().findById(3));
		Department depart4 = (Department)GetData(DM.getDepartmentDao().findById(4));
		
		if(StandardOPs.oclIsUndefined(currentUser).equals(false) && StandardOPs.oclIsUndefined(depart1).equals(false) && StandardOPs.oclIsUndefined(depart2).equals(false) && StandardOPs.oclIsUndefined(depart3).equals(false) && StandardOPs.oclIsUndefined(depart4).equals(false))
		{
			if(depart1.equals(currentUser.getBelongedDepartment())){
				return DM.getTbRepairExtraDao().findByIsAcceptAndIsCompleteAndBelongedAssignDepart(true,false,depart1);
			
			}else{
				if(currentUser.getBelongedDepartment().equals(depart2)){
				return DM.getTbRepairExtraDao().findByIsAcceptAndIsCompleteAndBelongedAssignDepart(true,false,depart2);
			
			}else{
				if(currentUser.getBelongedDepartment().equals(depart3)){
				return DM.getTbRepairExtraDao().findByIsAcceptAndIsCompleteAndBelongedAssignDepart(true,false,depart3);
			
			}else{
				return DM.getTbRepairExtraDao().findByIsAcceptAndIsCompleteAndBelongedAssignDepart(true,false,depart4);
			
			}
			
			}
			
			}
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<TbRepairExtra> completedBa() throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		Department depart1 = (Department)GetData(DM.getDepartmentDao().findById(1));
		Department depart2 = (Department)GetData(DM.getDepartmentDao().findById(2));
		Department depart3 = (Department)GetData(DM.getDepartmentDao().findById(3));
		Department depart4 = (Department)GetData(DM.getDepartmentDao().findById(4));
		
		if(StandardOPs.oclIsUndefined(currentUser).equals(false) && StandardOPs.oclIsUndefined(depart1).equals(false) && StandardOPs.oclIsUndefined(depart2).equals(false) && StandardOPs.oclIsUndefined(depart3).equals(false) && StandardOPs.oclIsUndefined(depart4).equals(false))
		{
			if(currentUser.getBelongedDepartment().equals(depart1)){
				return DM.getTbRepairExtraDao().findByIsCompleteAndBelongedAssignDepart(true,depart1);
			
			}else{
				if(currentUser.getBelongedDepartment().equals(depart2)){
				return DM.getTbRepairExtraDao().findByIsCompleteAndBelongedAssignDepart(true,depart2);
			
			}else{
				if(currentUser.getBelongedDepartment().equals(depart3)){
				return DM.getTbRepairExtraDao().findByIsCompleteAndBelongedAssignDepart(true,depart3);
			
			}else{
				return DM.getTbRepairExtraDao().findByIsCompleteAndBelongedAssignDepart(true,depart4);
			
			}
			
			}
			
			}
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean allocation(Integer userId,Integer tbId) throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		User user = (User)GetData(DM.getUserDao().findById(userId));
		TbRepairExtra tbRepairExtra = (TbRepairExtra)GetData(DM.getTbRepairExtraDao().findById(tbId));
		
		if(StandardOPs.oclIsUndefined(currentUser).equals(false) && StandardOPs.oclIsUndefined(user).equals(false) && StandardOPs.oclIsUndefined(tbRepairExtra).equals(false))
		{
			tbRepairExtra.setBelongedDistribution(user);
			DM.getTbRepairExtraDao().save(tbRepairExtra);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean transmit(Integer departId,Integer tbId) throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		Department dp = (Department)GetData(DM.getDepartmentDao().findById(departId));
		TbRepairExtra tbRepairExtra = (TbRepairExtra)GetData(DM.getTbRepairExtraDao().findById(tbId));
		
		if(StandardOPs.oclIsUndefined(currentUser).equals(false) && StandardOPs.oclIsUndefined(dp).equals(false) && StandardOPs.oclIsUndefined(tbRepairExtra).equals(false) && tbRepairExtra.getArbitrate().equals(false) && currentUser.getBelongedDepartment().equals(tbRepairExtra.getBelongedAssignDepart()))
		{
			tbRepairExtra.setRelayNum(tbRepairExtra.getRelayNum() + 1);
			tbRepairExtra.setBelongedAssignDepart(dp);
			DM.getTbRepairExtraDao().save(tbRepairExtra);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean backtransmit(Integer tbId,String rejectCause) throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		TbRepairExtra tbRepairExtra = (TbRepairExtra)GetData(DM.getTbRepairExtraDao().findById(tbId));
		
		if(StandardOPs.oclIsUndefined(currentUser).equals(false) && StandardOPs.oclIsUndefined(tbRepairExtra).equals(false) && currentUser.getBelongedDepartment().equals(tbRepairExtra.getBelongedAssignDepart()))
		{
			tbRepairExtra.setIsReject(true);
			tbRepairExtra.setRejectCause(rejectCause);
			DM.getTbRepairExtraDao().save(tbRepairExtra);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean setWorkTask(String staffName,String adminName,String phone,String section,String remark) throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		
		if(StandardOPs.oclIsUndefined(currentUser).equals(false) && StandardOPs.oclIsUndefined(staffName).equals(false) && StandardOPs.oclIsUndefined(adminName).equals(false))
		{
			WorkTask wt = new WorkTask();
			wt.setStaffName(staffName);
			wt.setAdminName(adminName);
			wt.setPhone(phone);
			wt.setSection(section);
			wt.setRemark(remark);
			DM.getWorkTaskDao().save(wt);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean setTerminalEquipment(String name,String address,String description,Integer type,String remark,Integer deviceInfoId) throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		DeviceInfo d = (DeviceInfo)GetData(DM.getDeviceInfoDao().findById(deviceInfoId));
		
		if(StandardOPs.oclIsUndefined(currentUser).equals(false) && StandardOPs.oclIsUndefined(name).equals(false) && StandardOPs.oclIsUndefined(address).equals(false) && StandardOPs.oclIsUndefined(d).equals(false))
		{
			TerminalEquipment te = new TerminalEquipment();
			te.setName(name);
			te.setAddress(address);
			te.setDescription(description);
			te.setType(type);
			te.setRemark(remark);
			te.setBelongedDeviceInfo(d);
			DM.getTerminalEquipmentDao().save(te);
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
