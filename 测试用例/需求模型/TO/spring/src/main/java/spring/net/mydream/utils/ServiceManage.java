package spring.net.mydream.utils;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Component;
	import spring.net.mydream.service.*;
	@Component
	public class ServiceManage {
	@Autowired
	private EatSystem eatSystem;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private EvaluationService evaluationService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private StoreService storeService;
	@Autowired
	private ThirdPartyServices thirdPartyServices;
	public Object getService(String name) {
		if("EatSystem".equals(name)) {
			return eatSystem;
		}
		else if("CustomerService".equals(name)) {
			return customerService;
		}
		else if("EvaluationService".equals(name)) {
			return evaluationService;
		}
		else if("OrderService".equals(name)) {
			return orderService;
		}
		else if("StoreService".equals(name)) {
			return storeService;
		}
		else if("ThirdPartyServices".equals(name)) {
			return thirdPartyServices;
		}
		return null;
	}
	}
	