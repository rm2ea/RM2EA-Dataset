package spring.net.mydream.utils;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Component;
	import spring.net.mydream.service.*;
	@Component
	public class ServiceManage {
	@Autowired
	private AirportSystem airportSystem;
	@Autowired
	private ThirdPartyServices thirdPartyServices;
	@Autowired
	private RoutineService routineService;
	@Autowired
	private RepairService repairService;
	@Autowired
	private HandleService handleService;
	@Autowired
	private MaintainService maintainService;
	@Autowired
	private ManageService manageService;
	public Object getService(String name) {
		if("AirportSystem".equals(name)) {
			return airportSystem;
		}
		else if("ThirdPartyServices".equals(name)) {
			return thirdPartyServices;
		}
		else if("RoutineService".equals(name)) {
			return routineService;
		}
		else if("RepairService".equals(name)) {
			return repairService;
		}
		else if("HandleService".equals(name)) {
			return handleService;
		}
		else if("MaintainService".equals(name)) {
			return maintainService;
		}
		else if("ManageService".equals(name)) {
			return manageService;
		}
		return null;
	}
	}
	