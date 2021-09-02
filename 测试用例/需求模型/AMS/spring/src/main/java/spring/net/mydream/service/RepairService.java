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
public class RepairService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean submitRepair(Integer departmentid,Integer assignDepartId,String repairName,String phone,String place,Integer repairsStatus,String deviceId,String describeContent,Integer failureTypeId) throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		Department dp = (Department)GetData(DM.getDepartmentDao().findById(departmentid));
		Department a_dp = (Department)GetData(DM.getDepartmentDao().findById(assignDepartId));
		EquipmentFailureType eft = (EquipmentFailureType)GetData(DM.getEquipmentFailureTypeDao().findById(failureTypeId));
		
		if(StandardOPs.oclIsUndefined(currentUser).equals(false) && StandardOPs.oclIsUndefined(repairName).equals(false) && StandardOPs.oclIsUndefined(phone).equals(false) && StandardOPs.oclIsUndefined(place).equals(false) && StandardOPs.oclIsUndefined(repairsStatus).equals(false) && StandardOPs.oclIsUndefined(dp).equals(false) && StandardOPs.oclIsUndefined(a_dp).equals(false) && StandardOPs.oclIsUndefined(deviceId).equals(false) && StandardOPs.oclIsUndefined(eft).equals(false))
		{
			TbRepair tr = new TbRepair();
			tr.setBelongedDepartment(dp);
			tr.setRepairName(repairName);
			tr.setPhone(phone);
			tr.setPlace(place);
			tr.setRepairsStatus(repairsStatus);
			tr.setDeviceId(deviceId);
			tr.setDescribeContent(describeContent);
			tr.setTime(new Date());
			tr.setStatus(0);
			tr.setBelongedEFT(eft);
			tr.setBelongedUser(currentUser);
			DM.getTbRepairDao().save(tr);
			currentUtils.setAttribute("currentTbRepair" , tr.getId()+"",tr);
			if(StandardOPs.oclIsUndefined(tr.getId()).equals(false)){
				TbRepairExtra tre = new TbRepairExtra();
			tre.setId(tr.getId());
			if(tr.getPlace().equals("候机楼")){
				tre.setAdmin(false);
			
			}else{
				tre.setAdmin(true);
			
			}
			tre.setIsReject(false);
			tre.setIsAccept(false);
			tre.setIsComplete(false);
			tre.setArbitrate(false);
			tre.setRelayNum(0);
			tre.setBelongedTbRepair(tr);
			tre.setBelongedAssignDepart(a_dp);
			DM.getTbRepairExtraDao().save(tre);
			return true;
			
			}else{
				return false;
			
			}
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<TbRepair> notAcceptAa() throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		
		if(StandardOPs.oclIsUndefined(currentUser).equals(false))
		{
			return DM.getTbRepairDao().findByStatusAndBelongedUser(0,currentUser);
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<TbRepair> acceptedAa() throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		
		if(StandardOPs.oclIsUndefined(currentUser).equals(false))
		{
			return DM.getTbRepairDao().findByStatusAndBelongedUser(1,currentUser);
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<TbRepair> completedAa() throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		
		if(StandardOPs.oclIsUndefined(currentUser).equals(false))
		{
			return DM.getTbRepairDao().findByStatusAndBelongedUser(2,currentUser);
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean scoring(Integer tbid,Integer score,String remark) throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		TbRepair tr = (TbRepair)GetData(DM.getTbRepairDao().findById(tbid));
		
		if(StandardOPs.oclIsUndefined(currentUser).equals(false) && StandardOPs.oclIsUndefined(tr).equals(false) && tr.getBelongedUser().equals(currentUser))
		{
			tr.setScore(score);
			tr.setRemark(remark);
			DM.getTbRepairDao().save(tr);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public TbRepair tbInfo(Integer id) throws PreconditionException{
		User currentUser=(User)currentUtils.getAttribute("currentUser");
		TbRepair tr = (TbRepair)GetData(DM.getTbRepairDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(tr).equals(false) && StandardOPs.oclIsUndefined(currentUser).equals(false))
		{
			return tr;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean sendVoice() throws PreconditionException{
		
		if(true)
		{
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean pushInfo() throws PreconditionException{
		
		if(true)
		{
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean savePwd() throws PreconditionException{
		
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
