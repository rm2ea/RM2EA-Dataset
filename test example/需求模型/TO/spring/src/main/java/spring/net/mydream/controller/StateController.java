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
		@RequestMapping(value="/CustomerTable",method=RequestMethod.GET)	
		public String CustomerTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Customer>list=DM.getCustomerDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/DishesTable",method=RequestMethod.GET)	
		public String DishesTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Dishes>list=DM.getDishesDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/EvaluationTable",method=RequestMethod.GET)	
		public String EvaluationTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Evaluation>list=DM.getEvaluationDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/OrderingTable",method=RequestMethod.GET)	
		public String OrderingTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Ordering>list=DM.getOrderingDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/OrderingDishesTable",method=RequestMethod.GET)	
		public String OrderingDishesTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<OrderingDishes>list=DM.getOrderingDishesDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
		@RequestMapping(value="/StoreTable",method=RequestMethod.GET)	
		public String StoreTables() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		List<Store>list=DM.getStoreDao().findAll();
		String s = mapper.writeValueAsString(list);
			return s;
		}
	}
	