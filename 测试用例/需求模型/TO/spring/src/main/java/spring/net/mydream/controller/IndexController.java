package spring.net.mydream.controller;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
@Controller
@RequestMapping("/main")
public class IndexController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/index2")
	public String index2() {
		return "index2";
	}
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	@RequestMapping("/createOrdering")
	public String createOrdering() {
		return "views/createOrdering";
	}
	@RequestMapping("/queryOrdering")
	public String queryOrdering() {
		return "views/queryOrdering";
	}
	@RequestMapping("/modifyOrdering")
	public String modifyOrdering() {
		return "views/modifyOrdering";
	}
	@RequestMapping("/deleteOrdering")
	public String deleteOrdering() {
		return "views/deleteOrdering";
	}
	@RequestMapping("/createStore")
	public String createStore() {
		return "views/createStore";
	}
	@RequestMapping("/queryStore")
	public String queryStore() {
		return "views/queryStore";
	}
	@RequestMapping("/modifyStore")
	public String modifyStore() {
		return "views/modifyStore";
	}
	@RequestMapping("/deleteStore")
	public String deleteStore() {
		return "views/deleteStore";
	}
	@RequestMapping("/createDishes")
	public String createDishes() {
		return "views/createDishes";
	}
	@RequestMapping("/queryDishes")
	public String queryDishes() {
		return "views/queryDishes";
	}
	@RequestMapping("/modifyDishes")
	public String modifyDishes() {
		return "views/modifyDishes";
	}
	@RequestMapping("/deleteDishes")
	public String deleteDishes() {
		return "views/deleteDishes";
	}
	@RequestMapping("/createCustomer")
	public String createCustomer() {
		return "views/createCustomer";
	}
	@RequestMapping("/queryCustomer")
	public String queryCustomer() {
		return "views/queryCustomer";
	}
	@RequestMapping("/modifyCustomer")
	public String modifyCustomer() {
		return "views/modifyCustomer";
	}
	@RequestMapping("/deleteCustomer")
	public String deleteCustomer() {
		return "views/deleteCustomer";
	}
	@RequestMapping("/createEvaluation")
	public String createEvaluation() {
		return "views/createEvaluation";
	}
	@RequestMapping("/queryEvaluation")
	public String queryEvaluation() {
		return "views/queryEvaluation";
	}
	@RequestMapping("/modifyEvaluation")
	public String modifyEvaluation() {
		return "views/modifyEvaluation";
	}
	@RequestMapping("/deleteEvaluation")
	public String deleteEvaluation() {
		return "views/deleteEvaluation";
	}
	@RequestMapping("/createOrderingDishes")
	public String createOrderingDishes() {
		return "views/createOrderingDishes";
	}
	@RequestMapping("/queryOrderingDishes")
	public String queryOrderingDishes() {
		return "views/queryOrderingDishes";
	}
	@RequestMapping("/modifyOrderingDishes")
	public String modifyOrderingDishes() {
		return "views/modifyOrderingDishes";
	}
	@RequestMapping("/deleteOrderingDishes")
	public String deleteOrderingDishes() {
		return "views/deleteOrderingDishes";
	}
	@RequestMapping("/getByPhone")
	public String getByPhone() {
		return "views/getByPhone";
	}
	@RequestMapping("/getByName")
	public String getByName() {
		return "views/getByName";
	}
	@RequestMapping("/loginByPhone")
	public String loginByPhone() {
		return "views/loginByPhone";
	}
	@RequestMapping("/toEvaluationCheck")
	public String toEvaluationCheck() {
		return "views/toEvaluationCheck";
	}
	@RequestMapping("/submitEvaluation2")
	public String submitEvaluation2() {
		return "views/submitEvaluation2";
	}
	@RequestMapping("/toEvaluateOrdering")
	public String toEvaluateOrdering() {
		return "views/toEvaluateOrdering";
	}
	@RequestMapping("/toEvaluateStore")
	public String toEvaluateStore() {
		return "views/toEvaluateStore";
	}
	@RequestMapping("/selectOne")
	public String selectOne() {
		return "views/selectOne";
	}
	@RequestMapping("/submitOrdering")
	public String submitOrdering() {
		return "views/submitOrdering";
	}
	@RequestMapping("/deliveryConfirmine")
	public String deliveryConfirmine() {
		return "views/deliveryConfirmine";
	}
	@RequestMapping("/search")
	public String search() {
		return "views/search";
	}
	@RequestMapping("/suggestByStr")
	public String suggestByStr() {
		return "views/suggestByStr";
	}
	@RequestMapping("/enterStoreBystoreId")
	public String enterStoreBystoreId() {
		return "views/enterStoreBystoreId";
	}
	@RequestMapping("/enterStoreBystoreId2")
	public String enterStoreBystoreId2() {
		return "views/enterStoreBystoreId2";
	}
	@RequestMapping("/toStreet")
	public String toStreet() {
		return "views/toStreet";
	}
	@RequestMapping("/submitEvaluation1")
	public String submitEvaluation1() {
		return "views/submitEvaluation1";
	}
	@RequestMapping("/toOrderingCheck")
	public String toOrderingCheck() {
		return "views/toOrderingCheck";
	}
	@RequestMapping("/thirdPartyServices")
	public String thirdPartyServices() {
		return "views/thirdPartyServices";
	}
	}