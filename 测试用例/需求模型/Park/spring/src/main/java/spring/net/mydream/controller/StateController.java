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
		@RequestMapping(value="/CarManageTable",method=RequestMethod.GET)	
		public String CarManageTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<CarManage>list=DM.getCarManageDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/Order_STable",method=RequestMethod.GET)	
		public String Order_STables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Order_S>list=DM.getOrder_SDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/CarParkingRecordTable",method=RequestMethod.GET)	
		public String CarParkingRecordTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<CarParkingRecord>list=DM.getCarParkingRecordDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/CarParkManageTable",method=RequestMethod.GET)	
		public String CarParkManageTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<CarParkManage>list=DM.getCarParkManageDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/AppPayConfigTable",method=RequestMethod.GET)	
		public String AppPayConfigTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<AppPayConfig>list=DM.getAppPayConfigDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/SysUserTable",method=RequestMethod.GET)	
		public String SysUserTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<SysUser>list=DM.getSysUserDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/SysMenuTable",method=RequestMethod.GET)	
		public String SysMenuTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<SysMenu>list=DM.getSysMenuDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/SysOrgTable",method=RequestMethod.GET)	
		public String SysOrgTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<SysOrg>list=DM.getSysOrgDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/SysRoleTable",method=RequestMethod.GET)	
		public String SysRoleTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<SysRole>list=DM.getSysRoleDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
	}
	