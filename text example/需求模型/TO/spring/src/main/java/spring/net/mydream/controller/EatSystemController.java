package spring.net.mydream.controller;
import spring.net.mydream.service.*;
import spring.net.mydream.Message.*;
import java.util.Date;
import spring.net.mydream.utils.PreconditionException;
import spring.net.mydream.utils.StandardOPs;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/EatSystem")
public class EatSystemController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private EatSystem eatSystem;
	
	@RequestMapping(value="/createOrdering",method=RequestMethod.POST)	
	public String createOrdering(CreateOrderingMessage createOrderingMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.createOrdering(createOrderingMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/queryOrdering",method=RequestMethod.GET)	
	public String queryOrdering(QueryOrderingMessage queryOrderingMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.queryOrdering(queryOrderingMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/modifyOrdering",method=RequestMethod.PUT)	
	public String modifyOrdering(ModifyOrderingMessage modifyOrderingMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.modifyOrdering(modifyOrderingMsg.id,modifyOrderingMsg.address));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/deleteOrdering",method=RequestMethod.DELETE)	
	public String deleteOrdering(DeleteOrderingMessage deleteOrderingMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.deleteOrdering(deleteOrderingMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/createStore",method=RequestMethod.POST)	
	public String createStore(CreateStoreMessage createStoreMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.createStore(createStoreMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/queryStore",method=RequestMethod.GET)	
	public String queryStore(QueryStoreMessage queryStoreMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.queryStore(queryStoreMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/modifyStore",method=RequestMethod.PUT)	
	public String modifyStore(ModifyStoreMessage modifyStoreMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.modifyStore(modifyStoreMsg.id,modifyStoreMsg.address,modifyStoreMsg.name));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/deleteStore",method=RequestMethod.DELETE)	
	public String deleteStore(DeleteStoreMessage deleteStoreMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.deleteStore(deleteStoreMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/createDishes",method=RequestMethod.POST)	
	public String createDishes(CreateDishesMessage createDishesMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.createDishes(createDishesMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/queryDishes",method=RequestMethod.GET)	
	public String queryDishes(QueryDishesMessage queryDishesMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.queryDishes(queryDishesMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/modifyDishes",method=RequestMethod.PUT)	
	public String modifyDishes(ModifyDishesMessage modifyDishesMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.modifyDishes(modifyDishesMsg.id,modifyDishesMsg.name));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/deleteDishes",method=RequestMethod.DELETE)	
	public String deleteDishes(DeleteDishesMessage deleteDishesMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.deleteDishes(deleteDishesMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/createCustomer",method=RequestMethod.POST)	
	public String createCustomer(CreateCustomerMessage createCustomerMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.createCustomer(createCustomerMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/queryCustomer",method=RequestMethod.GET)	
	public String queryCustomer(QueryCustomerMessage queryCustomerMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.queryCustomer(queryCustomerMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/modifyCustomer",method=RequestMethod.PUT)	
	public String modifyCustomer(ModifyCustomerMessage modifyCustomerMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.modifyCustomer(modifyCustomerMsg.id,modifyCustomerMsg.address));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/deleteCustomer",method=RequestMethod.DELETE)	
	public String deleteCustomer(DeleteCustomerMessage deleteCustomerMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.deleteCustomer(deleteCustomerMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/createEvaluation",method=RequestMethod.POST)	
	public String createEvaluation(CreateEvaluationMessage createEvaluationMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.createEvaluation(createEvaluationMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/queryEvaluation",method=RequestMethod.GET)	
	public String queryEvaluation(QueryEvaluationMessage queryEvaluationMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.queryEvaluation(queryEvaluationMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/modifyEvaluation",method=RequestMethod.PUT)	
	public String modifyEvaluation(ModifyEvaluationMessage modifyEvaluationMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.modifyEvaluation(modifyEvaluationMsg.id,modifyEvaluationMsg.anonymity));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/deleteEvaluation",method=RequestMethod.DELETE)	
	public String deleteEvaluation(DeleteEvaluationMessage deleteEvaluationMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.deleteEvaluation(deleteEvaluationMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/createOrderingDishes",method=RequestMethod.POST)	
	public String createOrderingDishes(CreateOrderingDishesMessage createOrderingDishesMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.createOrderingDishes(createOrderingDishesMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/queryOrderingDishes",method=RequestMethod.GET)	
	public String queryOrderingDishes(QueryOrderingDishesMessage queryOrderingDishesMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.queryOrderingDishes(queryOrderingDishesMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/modifyOrderingDishes",method=RequestMethod.PUT)	
	public String modifyOrderingDishes(ModifyOrderingDishesMessage modifyOrderingDishesMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.modifyOrderingDishes(modifyOrderingDishesMsg.id,modifyOrderingDishesMsg.dishesName));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/deleteOrderingDishes",method=RequestMethod.DELETE)	
	public String deleteOrderingDishes(DeleteOrderingDishesMessage deleteOrderingDishesMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", eatSystem.deleteOrderingDishes(deleteOrderingDishesMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	
}
