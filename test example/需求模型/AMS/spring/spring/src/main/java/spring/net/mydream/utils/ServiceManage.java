package spring.net.mydream.utils;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Component;
	import spring.net.mydream.service.*;
	@Component
	public class ServiceManage {
	@Autowired
	private UserTwoService userTwoService;
	@Autowired
	private UserService userService;
	@Autowired
	private MenuService menuService;
	@Autowired
	private EmailService emailService;
	@Autowired
	private DictionaryDataService dictionaryDataService;
	public Object getService(String name) {
		if("UserTwoService".equals(name)) {
			return userTwoService;
		}
		else if("UserService".equals(name)) {
			return userService;
		}
		else if("MenuService".equals(name)) {
			return menuService;
		}
		else if("EmailService".equals(name)) {
			return emailService;
		}
		else if("DictionaryDataService".equals(name)) {
			return dictionaryDataService;
		}
		return null;
	}
	}
	