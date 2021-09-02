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
	@RequestMapping("/thirdPartyCardPaymentService")
	public String thirdPartyCardPaymentService() {
		return "views/thirdPartyCardPaymentService";
	}
	@RequestMapping("/userLogin")
	public String userLogin() {
		return "views/userLogin";
	}
	@RequestMapping("/workReportSubmit")
	public String workReportSubmit() {
		return "views/workReportSubmit";
	}
	@RequestMapping("/submitRepair")
	public String submitRepair() {
		return "views/submitRepair";
	}
	@RequestMapping("/notAcceptAa")
	public String notAcceptAa() {
		return "views/notAcceptAa";
	}
	@RequestMapping("/acceptedAa")
	public String acceptedAa() {
		return "views/acceptedAa";
	}
	@RequestMapping("/completedAa")
	public String completedAa() {
		return "views/completedAa";
	}
	@RequestMapping("/scoring")
	public String scoring() {
		return "views/scoring";
	}
	@RequestMapping("/tbInfo")
	public String tbInfo() {
		return "views/tbInfo";
	}
	@RequestMapping("/notAcceptBa")
	public String notAcceptBa() {
		return "views/notAcceptBa";
	}
	@RequestMapping("/acceptedBa")
	public String acceptedBa() {
		return "views/acceptedBa";
	}
	@RequestMapping("/completedBa")
	public String completedBa() {
		return "views/completedBa";
	}
	@RequestMapping("/allocation")
	public String allocation() {
		return "views/allocation";
	}
	@RequestMapping("/transmit")
	public String transmit() {
		return "views/transmit";
	}
	@RequestMapping("/backtransmit")
	public String backtransmit() {
		return "views/backtransmit";
	}
	@RequestMapping("/setWorkTask")
	public String setWorkTask() {
		return "views/setWorkTask";
	}
	@RequestMapping("/setTerminalEquipment")
	public String setTerminalEquipment() {
		return "views/setTerminalEquipment";
	}
	@RequestMapping("/arbitration")
	public String arbitration() {
		return "views/arbitration";
	}
	@RequestMapping("/approval")
	public String approval() {
		return "views/approval";
	}
	@RequestMapping("/receiveTb")
	public String receiveTb() {
		return "views/receiveTb";
	}
	@RequestMapping("/completeTb")
	public String completeTb() {
		return "views/completeTb";
	}
	@RequestMapping("/rocessingFees")
	public String rocessingFees() {
		return "views/rocessingFees";
	}
	@RequestMapping("/setOperationStatus")
	public String setOperationStatus() {
		return "views/setOperationStatus";
	}
	@RequestMapping("/createUser")
	public String createUser() {
		return "views/createUser";
	}
	@RequestMapping("/queryUser")
	public String queryUser() {
		return "views/queryUser";
	}
	@RequestMapping("/modifyUser")
	public String modifyUser() {
		return "views/modifyUser";
	}
	@RequestMapping("/deleteUser")
	public String deleteUser() {
		return "views/deleteUser";
	}
	@RequestMapping("/createRole")
	public String createRole() {
		return "views/createRole";
	}
	@RequestMapping("/queryRole")
	public String queryRole() {
		return "views/queryRole";
	}
	@RequestMapping("/modifyRole")
	public String modifyRole() {
		return "views/modifyRole";
	}
	@RequestMapping("/deleteRole")
	public String deleteRole() {
		return "views/deleteRole";
	}
	@RequestMapping("/createDepartment")
	public String createDepartment() {
		return "views/createDepartment";
	}
	@RequestMapping("/queryDepartment")
	public String queryDepartment() {
		return "views/queryDepartment";
	}
	@RequestMapping("/modifyDepartment")
	public String modifyDepartment() {
		return "views/modifyDepartment";
	}
	@RequestMapping("/deleteDepartment")
	public String deleteDepartment() {
		return "views/deleteDepartment";
	}
	@RequestMapping("/createDeviceInfo")
	public String createDeviceInfo() {
		return "views/createDeviceInfo";
	}
	@RequestMapping("/queryDeviceInfo")
	public String queryDeviceInfo() {
		return "views/queryDeviceInfo";
	}
	@RequestMapping("/modifyDeviceInfo")
	public String modifyDeviceInfo() {
		return "views/modifyDeviceInfo";
	}
	@RequestMapping("/deleteDeviceInfo")
	public String deleteDeviceInfo() {
		return "views/deleteDeviceInfo";
	}
	@RequestMapping("/createDeviceLocationGroup")
	public String createDeviceLocationGroup() {
		return "views/createDeviceLocationGroup";
	}
	@RequestMapping("/queryDeviceLocationGroup")
	public String queryDeviceLocationGroup() {
		return "views/queryDeviceLocationGroup";
	}
	@RequestMapping("/modifyDeviceLocationGroup")
	public String modifyDeviceLocationGroup() {
		return "views/modifyDeviceLocationGroup";
	}
	@RequestMapping("/deleteDeviceLocationGroup")
	public String deleteDeviceLocationGroup() {
		return "views/deleteDeviceLocationGroup";
	}
	@RequestMapping("/createEquipmentFailureType")
	public String createEquipmentFailureType() {
		return "views/createEquipmentFailureType";
	}
	@RequestMapping("/queryEquipmentFailureType")
	public String queryEquipmentFailureType() {
		return "views/queryEquipmentFailureType";
	}
	@RequestMapping("/modifyEquipmentFailureType")
	public String modifyEquipmentFailureType() {
		return "views/modifyEquipmentFailureType";
	}
	@RequestMapping("/deleteEquipmentFailureType")
	public String deleteEquipmentFailureType() {
		return "views/deleteEquipmentFailureType";
	}
	@RequestMapping("/createDeviceStatus")
	public String createDeviceStatus() {
		return "views/createDeviceStatus";
	}
	@RequestMapping("/queryDeviceStatus")
	public String queryDeviceStatus() {
		return "views/queryDeviceStatus";
	}
	@RequestMapping("/modifyDeviceStatus")
	public String modifyDeviceStatus() {
		return "views/modifyDeviceStatus";
	}
	@RequestMapping("/deleteDeviceStatus")
	public String deleteDeviceStatus() {
		return "views/deleteDeviceStatus";
	}
	@RequestMapping("/createDeviceAssociationGroup")
	public String createDeviceAssociationGroup() {
		return "views/createDeviceAssociationGroup";
	}
	@RequestMapping("/queryDeviceAssociationGroup")
	public String queryDeviceAssociationGroup() {
		return "views/queryDeviceAssociationGroup";
	}
	@RequestMapping("/modifyDeviceAssociationGroup")
	public String modifyDeviceAssociationGroup() {
		return "views/modifyDeviceAssociationGroup";
	}
	@RequestMapping("/deleteDeviceAssociationGroup")
	public String deleteDeviceAssociationGroup() {
		return "views/deleteDeviceAssociationGroup";
	}
	@RequestMapping("/sendVoice")
	public String sendVoice() {
		return "views/sendVoice";
	}
	@RequestMapping("/pushInfo")
	public String pushInfo() {
		return "views/pushInfo";
	}
	@RequestMapping("/savePwd")
	public String savePwd() {
		return "views/savePwd";
	}
	}