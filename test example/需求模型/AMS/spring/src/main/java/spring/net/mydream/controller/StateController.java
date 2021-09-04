package spring.net.mydream.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.net.mydream.entity.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import spring.net.mydream.utils.DaoManage;

@RestController
@RequestMapping("/state")
	public class StateController {
		@Autowired 
		private DaoManage DM;
		@RequestMapping(value="/WorkReportTable",method=RequestMethod.GET)	
		public String WorkReportTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<WorkReport>list=DM.getWorkReportDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/WorkTaskTable",method=RequestMethod.GET)	
		public String WorkTaskTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<WorkTask>list=DM.getWorkTaskDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/TerminalEquipmentTable",method=RequestMethod.GET)	
		public String TerminalEquipmentTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<TerminalEquipment>list=DM.getTerminalEquipmentDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/OperationStatusTable",method=RequestMethod.GET)	
		public String OperationStatusTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<OperationStatus>list=DM.getOperationStatusDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/UserTable",method=RequestMethod.GET)	
		public String UserTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<User>list=DM.getUserDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/RoleTable",method=RequestMethod.GET)	
		public String RoleTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Role>list=DM.getRoleDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/DepartmentTable",method=RequestMethod.GET)	
		public String DepartmentTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Department>list=DM.getDepartmentDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/TbRepairTable",method=RequestMethod.GET)	
		public String TbRepairTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<TbRepair>list=DM.getTbRepairDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/TbRepairExtraTable",method=RequestMethod.GET)	
		public String TbRepairExtraTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<TbRepairExtra>list=DM.getTbRepairExtraDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/ProcessingFeesTable",method=RequestMethod.GET)	
		public String ProcessingFeesTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<ProcessingFees>list=DM.getProcessingFeesDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/DeviceInfoTable",method=RequestMethod.GET)	
		public String DeviceInfoTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<DeviceInfo>list=DM.getDeviceInfoDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/DeviceLocationGroupTable",method=RequestMethod.GET)	
		public String DeviceLocationGroupTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<DeviceLocationGroup>list=DM.getDeviceLocationGroupDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/EquipmentFailureTypeTable",method=RequestMethod.GET)	
		public String EquipmentFailureTypeTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<EquipmentFailureType>list=DM.getEquipmentFailureTypeDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/DeviceStatusTable",method=RequestMethod.GET)	
		public String DeviceStatusTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<DeviceStatus>list=DM.getDeviceStatusDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/DeviceAssociationGroupTable",method=RequestMethod.GET)	
		public String DeviceAssociationGroupTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<DeviceAssociationGroup>list=DM.getDeviceAssociationGroupDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
	}
	