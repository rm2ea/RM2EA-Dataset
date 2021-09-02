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
		@RequestMapping(value="/DictionaryTable",method=RequestMethod.GET)	
		public String DictionaryTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Dictionary>list=DM.getDictionaryDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/DictionaryDataTable",method=RequestMethod.GET)	
		public String DictionaryDataTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<DictionaryData>list=DM.getDictionaryDataDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/LoginRecordTable",method=RequestMethod.GET)	
		public String LoginRecordTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<LoginRecord>list=DM.getLoginRecordDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/MenuTable",method=RequestMethod.GET)	
		public String MenuTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Menu>list=DM.getMenuDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/OperRecordTable",method=RequestMethod.GET)	
		public String OperRecordTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<OperRecord>list=DM.getOperRecordDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/OrganizationTable",method=RequestMethod.GET)	
		public String OrganizationTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Organization>list=DM.getOrganizationDao().findAll();
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
		@RequestMapping(value="/UserTwoTable",method=RequestMethod.GET)	
		public String UserTwoTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<UserTwo>list=DM.getUserTwoDao().findAll();
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
	}
	