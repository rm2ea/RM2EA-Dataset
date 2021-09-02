package spring.net.mydream.utils;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Component;
	import spring.net.mydream.service.*;
	@Component
	public class ServiceManage {
	@Autowired
	private ParkSystem parkSystem;
	@Autowired
	private ThirdPartyServices thirdPartyServices;
	@Autowired
	private CarManageService carManageService;
	@Autowired
	private CarParkingRecordService carParkingRecordService;
	@Autowired
	private PayManageService payManageService;
	@Autowired
	private FinanceManageService financeManageService;
	@Autowired
	private ParkManageService parkManageService;
	@Autowired
	private MenueService menueService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private UserManageService userManageService;
	public Object getService(String name) {
		if("ParkSystem".equals(name)) {
			return parkSystem;
		}
		else if("ThirdPartyServices".equals(name)) {
			return thirdPartyServices;
		}
		else if("CarManageService".equals(name)) {
			return carManageService;
		}
		else if("CarParkingRecordService".equals(name)) {
			return carParkingRecordService;
		}
		else if("PayManageService".equals(name)) {
			return payManageService;
		}
		else if("FinanceManageService".equals(name)) {
			return financeManageService;
		}
		else if("ParkManageService".equals(name)) {
			return parkManageService;
		}
		else if("MenueService".equals(name)) {
			return menueService;
		}
		else if("RoleService".equals(name)) {
			return roleService;
		}
		else if("UserManageService".equals(name)) {
			return userManageService;
		}
		return null;
	}
	}
	